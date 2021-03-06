package br.ce.israel.steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.ce.israel.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprenderCucumberSteps {
	
	@Given("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
	}

	@When("^executá-lo$")
	public void executáLo() throws Throwable {
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
	}
	
	private int contador = 0;
	@Given("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@When("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador += arg1;
	}

	@Then("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
	}

	
	Date entrega = new Date();

	@Given("^que a entrega é dia (.*)$")
	public void queOPrazoÉDia(@Transform(DateConverter.class)Date data) throws Throwable {
		entrega = data;
	}

	@When("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrsarEmDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")){
		cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if(tempo.equals("meses")){
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Then("^a entra será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntraSeráEfetuadaEm(String data ) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
		
	}
	
	@Given("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) throws Throwable {
		
	}

	@Given("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
		System.out.println(numero);
	}

	@Given("^que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
	}

	@Given("^que o telefone do passageiro é ([8-9]{4})-([8-9]{4})$")
	public void queOTelefoneDoPassageiroÉ(int arg1, int arg2) throws Throwable {
	}

	@When("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	}

	@Then("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	}
	
}
