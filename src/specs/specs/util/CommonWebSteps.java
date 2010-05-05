package specs.util;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Named;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class CommonWebSteps extends PtSteps {

	public CommonWebSteps() {
		super();
	}
	
	String serverUrl = "http://localhost:8080";
	WebDriver driver = new HtmlUnitDriver();
	
	
	@Given("estou na página \"$pagina\"")
	public void navegarPara(@Named("pagina") String pagina) {
		driver.get(serverUrl + pagina);
	}
	
	@Given("que não estou logado")
	public void naoEstouLogado() {
		navegarPara("/logout");
	}

	@Given("que estou na home")
	@When("estou na home")
	public void estouNaHome() {
		navegarPara("/home");
	}
	
	@Given("que estou logado como $login com a senha \"$senha\"")
	public void logar(@Named("login") String login, @Named("senha") String senha) {
		naoEstouLogado();
		navegarPara("/login");
		digitoNoCampo(login, "login");
		digitoNoCampo(senha, "senha");
		clicoNoBotao("login");
	}
		
	@When("digito \"$chars\" no campo $input_text_name")
	public void digitoNoCampo(@Named("chars") String chars, @Named("input_text_name") String inputTextName) {
		driver.findElement(By.name(inputTextName)).sendKeys(chars);

	}
	
	@When("clico no botão $button_id")
	public void clicoNoBotao(@Named("button_id") String buttonId) {
		driver.findElement(By.id(buttonId)).click();
	}
	
	@Then("eu vejo \"$message\"")
	public void checkMessage(@Named("message") String message) {
		Assert.assertTrue(driver.getPageSource().contains(message));
	}

}
