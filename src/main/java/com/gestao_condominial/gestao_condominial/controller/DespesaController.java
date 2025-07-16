package com.gestao_condominial.gestao_condominial.controller;


import com.gestao_condominial.gestao_condominial.domain.Despesa;
import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;
import com.gestao_condominial.gestao_condominial.service.DespesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/despesas")
public class DespesaController {

    // http://localhost:8081/api/despesas

    public final DespesaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarDespesa(@RequestBody DespesaRequest request) {
        service.cadastrar(request);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Despesa> listarDespesas(){
        return service.listar();

    }

    @GetMapping("filtro")
    @ResponseStatus(HttpStatus.OK)
    public List<Despesa> listarDespesasComFiltro(@RequestParam(value = "status", required = false) String status){
        return service.listar(status);

    }

    @GetMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Despesa getDespesaPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

}
