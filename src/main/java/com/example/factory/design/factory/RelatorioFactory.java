package com.example.factory.design.factory;


import com.example.factory.design.interfa.IRelatorio;
import com.example.factory.design.enums.RelatorioTipo;
import com.example.factory.design.relatorios.RelatorioCsv;
import com.example.factory.design.relatorios.RelatorioHtml;
import com.example.factory.design.relatorios.RelatorioPdf;
import org.springframework.stereotype.Service;

@Service
public class RelatorioFactory {

    public IRelatorio createRelatorio(RelatorioTipo relatorioTipo) {

        if (RelatorioTipo.PDF.equals(relatorioTipo))
            return new RelatorioPdf();
        else if (RelatorioTipo.HTML.equals(relatorioTipo))
            return new RelatorioHtml();
        return new RelatorioCsv();
    }
}
