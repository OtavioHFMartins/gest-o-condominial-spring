package com.gestao_condominial.gestao_condominial.service;

import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class DespesaServiceImpl implements DespesaService {

    @Override
    public void cadastrar(DespesaRequest request) {
        System.out.println("falta implementar");
    }
}
