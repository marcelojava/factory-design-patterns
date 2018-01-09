package com.example.factory.design;

import com.example.factory.design.factory.RelatorioFactory;
import com.example.factory.design.interfa.IRelatorio;
import com.example.factory.design.enums.RelatorioTipo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryApplicationTests {

	@Autowired
	private RelatorioFactory relatorioFactory;

	@Test
	public void criandoRelatorioPdf() {
		IRelatorio iRelatorio = this.relatorioFactory.createRelatorio(RelatorioTipo.PDF);
		String relatorio = iRelatorio.gerar();

		Assert.assertEquals("GERANDO RELATORIO EM PDF", relatorio);
	}

	@Test
	public void criandoRelatorioCSV() {
		IRelatorio iRelatorio = this.relatorioFactory.createRelatorio(RelatorioTipo.CSV);
		String relatorio = iRelatorio.gerar();

		Assert.assertEquals("GERANDO RELATORIO EM CVS", relatorio);
	}

	@Test
	public void criandoRelatorioHtml() {
		IRelatorio iRelatorio = this.relatorioFactory.createRelatorio(RelatorioTipo.HTML);
		String relatorio = iRelatorio.gerar();

		Assert.assertEquals("GERANDO RELATORIO EM HTML", relatorio);
	}

}
