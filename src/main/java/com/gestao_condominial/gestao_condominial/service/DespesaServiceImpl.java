package com.gestao_condominial.gestao_condominial.service;

import com.gestao_condominial.gestao_condominial.converter.DespesaConverter;
import com.gestao_condominial.gestao_condominial.domain.Despesa;
import com.gestao_condominial.gestao_condominial.domain.enums.StatusDespesa;
import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;
import com.gestao_condominial.gestao_condominial.repository.DespesaRepository;
import jdk.jshell.Snippet;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


@Service
public class DespesaServiceImpl implements DespesaService {

    @Autowired
   private DespesaConverter converter;

    @Autowired
    private DespesaRepository repository;

    @Override
    public void cadastrar(DespesaRequest request) {
        // todo - transformar DespesaResquest -> Despesa
        var despesa = converter.convert(request);
        repository.save(despesa);
    }


}
