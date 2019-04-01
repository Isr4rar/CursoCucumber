package br.ce.israel.pages;

import static br.ce.israel.steps.InserirContasSteps.getDriver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.israel.steps.InserirContasSteps;

public class SeuBarrigaPage {
	
	
	public SeuBarrigaPage() {
		PageFactory.initElements(InserirContasSteps.getDriver(), this);
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "senha")
	private WebElement senha;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement buttonEntrar;
	
	@FindBy(xpath = "//div[starts-with(@class, 'alert alert-')]")
	private WebElement alertaSucesso;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement contas;
	
	@FindBy(xpath = "//a[contains(text(),'Adicionar')]")
	private WebElement adicionar;
	
	@FindBy(xpath = "//a[contains(text(),'reset')]")
	private WebElement reset;
	
	@FindBy(id = "nome")
	private WebElement nome;
	
	public void setEmail(String arg1) {
		email.sendKeys(arg1);
	}
	public void setSenha(String arg1) {
		senha.sendKeys(arg1);
	}
	public void clickEntrar() {
		buttonEntrar.click();
	}
	public void clickReset() {
		reset.click();
	}
	public void validarAlerta(String value) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(alertaSucesso));
		Assert.assertEquals(value, alertaSucesso.getText());
	}
	public void clickContas() {
		contas.click();
	}
	public void clickAdd() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(adicionar));
		adicionar.click();
	}
	public void setNomeConta(String value) {
		nome.sendKeys(value);
	}

}
