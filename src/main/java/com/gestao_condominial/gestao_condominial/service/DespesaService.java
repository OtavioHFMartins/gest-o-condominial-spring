package com.gestao_condominial.gestao_condominial.service;

import com.gestao_condominial.gestao_condominial.domain.Despesa;
import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;

import java.util.List;
import java.util.Optional;

public interface DespesaService {

    void cadastrar(DespesaRequest request);

    List<Despesa> listar();

    Despesa buscarPorId(Long id);

    List<Despesa> listar(String status);

}
