package br.ce.israel.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.ce.israel.pages.SeuBarrigaPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InserirContasSteps {

	static WebDriver driver;
	private SeuBarrigaPage page;

	public static WebDriver getDriver() {
		return driver;
	}

	@Given("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() throws Throwable {
		driver = new ChromeDriver();
		page = new SeuBarrigaPage();
		driver.get("http://srbarriga.herokuapp.com");
	}
	@When("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String arg1) throws Throwable {
		page.setEmail(arg1);

	}
	@When("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) throws Throwable {
		page.setSenha(arg1);
	}
	@When("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {
		page.clickEntrar();
	}
	@Then("^visualizo a página inicial$")
	public void visualizoAPáginaInicial() throws Throwable {
		page.validarAlerta("Bem vindo, Israel!");
		page.clickReset();
		page.validarAlerta("Dados resetados com sucesso!");
	}
	@When("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
		page.clickContas();
	}
	@When("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
		page.clickAdd();
	}
	@When("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
		page.setNomeConta(arg1);
	}
	@When("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
		page.clickEntrar();
	}
	@Then("^a conta é inserida com sucesso$")
	public void aContaÉInseridaComSucesso() throws Throwable {
		page.validarAlerta("Conta adicionada com sucesso!");
	}
	@Then("^sou notificar que o nome da conta é obrigatório$")
	public void souNotificarQueONomeDaContaÉObrigatório() throws Throwable {
		page.validarAlerta("Informe o nome da conta");
	}
	@Then("^sou notificado que já existe uma conta com esse nome$")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() throws Throwable {
		page.validarAlerta("Já existe uma conta com esse nome!");
	}

	@Then("^recebo a mensagem \"([^\"]*)\"$")
	public void receboAMensagem(String arg1) throws Throwable {
		page.validarAlerta(arg1);
	}
	@After(order = 1)
	public void screenshot(Scenario cenario ) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/+"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@After(order = 0)
	public void finish() {
		driver.quit();
	}

}
