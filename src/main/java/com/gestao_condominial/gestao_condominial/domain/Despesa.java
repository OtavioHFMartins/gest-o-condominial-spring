package com.gestao_condominial.gestao_condominial.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gestao_condominial.gestao_condominial.domain.enums.StatusDespesa;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

/*
    jakarta = JPA
    Vamos usar uma lib chamada Hibernate (mapeamento de banco de dados no java
*/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "despesas")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String descricao;

    @Column(name = "valor_original", nullable = false)
    private Double valorOriginal;

    @Column(name = "valor_pago")
    private Double valorPago;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    @Column(name = "data_vencimento", nullable = false)
    private LocalDate dataVencimento;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusDespesa status;

}