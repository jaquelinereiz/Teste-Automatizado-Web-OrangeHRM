package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

	@Quando("acionar a aba admin")
	public void acionarAAbaAdmin() {
	    Na(TelaInicialPage.class).acionarAdaAdmin();
	}
	@Quando("acionar o botao Add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}
	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployerName(String employeeName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeeName);
	}
	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String userName) {
	    Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
	}
	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String senha) {
	    Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);
	}
	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String senha) {
	    Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
	}
	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar() throws Throwable {
		 Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}
	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String userName) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='" +userName+ "']")).isDisplayed());
	}



}
