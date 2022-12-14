package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;



public class LoginSteps {
	
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}
	
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}
	
	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotaoLogin();
	}
	
	@Entao ("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMenssagemDeUsuarioInvalido() {
		assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}
	
	@Entao("o sistema exibe o usuario logado exibindo pagina contendo o Dashboard")
	public void oSistemaExibeOUsuarioLogadoExibindoPaginaContendoODashboard() {
		LoginPage lp = new LoginPage(driver);
		lp.validarDashboard();
//		assertEquals("Welcome Paul12345678912345678912345678", driver.findElement(By.id("welcome")).getText());
	}
}
