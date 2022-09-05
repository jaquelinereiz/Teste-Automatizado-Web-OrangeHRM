package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployee;
	
	@FindBy(name = "systemUser[userName]")
	public WebElement campoUsername;
	
	@FindBy(name = "systemUser[password]")
	public WebElement campoPassword;
	
	@FindBy(name = "systemUser[confirmPassword]")
	public WebElement campoConfirmarPassword;
	
	@FindBy(name = "btnSave")
	public WebElement botaoSalvar;
	
	public void informarCampoEmployeeName(String employeeName) {
		campoEmployee.clear();
		campoEmployee.sendKeys(employeeName);
	}
	
	public void informarCampoUserName(String userName) {
		campoUsername.sendKeys(userName);
	}
	
	public void informarCampoPassword(String senha) {
		campoPassword.sendKeys(senha);
	}
	
	public void informarCampoConfirmarPassword(String senha) {
		campoConfirmarPassword.sendKeys(senha);
	}
	
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}
	
}
