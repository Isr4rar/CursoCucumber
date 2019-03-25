package br.ce.israel.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.ce.israel.entidades.Filme;
import br.ce.israel.entidades.NotaAluguel;
import br.ce.israel.servicos.AluguelService;
import br.ce.israel.utils.DateUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlugarFilmeSteps {

	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private String tipoAluguel;

	@Given("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
		Assert.assertEquals(arg1, filme.getEstoque());
	}

	@Given("^que o preço de aluguel seja R\\$ (\\d+)$")
	public void queOPreçoDeAluguelSejaR$(int arg1) throws Throwable {
		filme.setValorAluguel(arg1);
		Assert.assertEquals(arg1 ,filme.getValorAluguel());
	}

	@When("^alugar$")
	public void alugar() throws Throwable {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		} catch (RuntimeException e) {
			erro = e.getMessage();
		}
	}

	@Then("^o preço do aluguel será R\\$ (\\d+)$")
	public void oPreçoDoAluguelSeráR$(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPreco() );
	}

	
	@Then("^o estoque do filme será (\\d+) unidade$")
	public void oEstoqueDoFilmeSeráUnidade(int arg1) throws Throwable {
		Assert.assertEquals(arg1 ,filme.getEstoque() );

	}

	@Then("^não será possivel por falta de estoque$")
	public void nãoSeráPossivelPorFaltaDeEstoque() throws Throwable {
		Assert.assertEquals("Filme sem estoque", erro);
	}

	@Given("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendido(String tipo) throws Throwable {
		tipoAluguel = tipo;
	}

	@Then("^a data de entrega será em (\\d+) dias?$")
	public void aDataDeEntregaSeráEmQtdDiasDias(int arg1) throws Throwable {
		Date dataEsperada = DateUtils.obterDataDiferencaDias(arg1);
		Date dataReal = nota.getDataEntrega();
		
		DateFormat format  = new SimpleDateFormat("dd/MM/yyyy");
		
		Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
		
	}
	@Then("^a pontuação será de (\\d+) pontos$")
	public void aPontuaçãoSeráDePontos(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPotuacao());
	}
	
}
