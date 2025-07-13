package com.gestao_condominial.gestao_condominial.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


public record DespesaRequest (String categoria,
                              String descricao,
                              Double valorOriginal,
                              Double valorPago,
                              String dataPagamento,
                              String dataVencimento) {

}
