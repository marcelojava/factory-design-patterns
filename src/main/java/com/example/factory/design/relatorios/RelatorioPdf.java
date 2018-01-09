package com.example.factory.design.relatorios;

import com.example.factory.design.interfa.IRelatorio;

public class RelatorioPdf implements IRelatorio {

    @Override
    public String gerar() {
        return "GERANDO RELATORIO EM PDF";
    }
}
