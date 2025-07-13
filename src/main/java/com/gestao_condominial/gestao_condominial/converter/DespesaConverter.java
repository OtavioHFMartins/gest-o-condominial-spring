package com.gestao_condominial.gestao_condominial.converter;


import com.gestao_condominial.gestao_condominial.domain.Despesa;
import com.gestao_condominial.gestao_condominial.domain.enums.StatusDespesa;
import com.gestao_condominial.gestao_condominial.dto.DespesaRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Component
public class DespesaConverter {

    private static String FORMATO_DATA_PADRAO = "dd/MM/yy";

    public Despesa convert(DespesaRequest request){

        Despesa despesa = new Despesa();
        despesa.setCategoria(request.categoria());
        despesa.setDescricao(request.descricao());
        despesa.setValorOriginal(request.valorOriginal());
        despesa.setValorPago(request.valorPago());
        despesa.setDataVencimento(stringToLocalDate(request.dataVencimento()));
        despesa.setDataPagamento(stringToLocalDate(request.dataPagamento()));
        despesa.setDataCriacao(LocalDateTime.now());
        despesa.setStatus(obterStatusDespesa(despesa));
        return despesa;
    }

    private LocalDate stringToLocalDate(String date){
        if (StringUtils.isBlank(date)) return null;
        var dateFormater = DateTimeFormatter.ofPattern(FORMATO_DATA_PADRAO);
        return  LocalDate.parse(date, dateFormater);

    }

    private StatusDespesa obterStatusDespesa(Despesa despesa) {
        if (Objects.nonNull(despesa.getDataPagamento()))
            return StatusDespesa.PAGO;

        if (despesa.getDataVencimento().isBefore(LocalDate.now()))
            return StatusDespesa.ATRASADO;

        return StatusDespesa.NAO_PAGO;
    }



}
