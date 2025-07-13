package com.gestao_condominial.gestao_condominial.controller;


import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;
import com.gestao_condominial.gestao_condominial.service.DespesaService;
import com.gestao_condominial.gestao_condominial.service.DespesaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/despesas")
public class DespesaController {

    // http://localhost:8081/api/despesas

    @Autowired
    public DespesaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarDespesa(@RequestBody DespesaRequest request) {
        service.cadastrar(request);

    }



}
