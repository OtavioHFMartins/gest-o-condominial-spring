package com.gestao_condominial.gestao_condominial.service;

import com.gestao_condominial.gestao_condominial.converter.DespesaConverter;
import com.gestao_condominial.gestao_condominial.domain.Despesa;
import com.gestao_condominial.gestao_condominial.domain.enums.StatusDespesa;
import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;
import com.gestao_condominial.gestao_condominial.repository.DespesaRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DespesaServiceImpl implements DespesaService {


   private final DespesaConverter converter;
   private final DespesaRepository repository;

    @Override
    public void cadastrar(DespesaRequest request) {
        var despesa = converter.convert(request);
        repository.save(despesa);
    }

    @Override
    public List<Despesa> listar() {
        return repository.findAll();
    }

    @Override
    public Despesa buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Despesa> listar(String status) {
        if (StringUtils.isBlank(status))
            return listar();

        var statusDesp = StatusDespesa.valueOf(status);

        return repository.findAllByStatus(statusDesp);
    }
}
