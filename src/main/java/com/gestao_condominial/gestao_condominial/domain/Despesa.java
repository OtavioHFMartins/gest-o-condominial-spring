package com.gestao_condominial.gestao_condominial.domain;

import com.gestao_condominial.gestao_condominial.domain.enums.StatusDespesa;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Despesa {

    private Integer id;
    private String categoria;
    private String discricao;
    private Double valorOriginal;
    private Double valorPago;
    private LocalDate dataCriacao;
    private LocalDate dataPagamento;
    private LocalDate dataVencimento;
    private StatusDespesa status;
}
