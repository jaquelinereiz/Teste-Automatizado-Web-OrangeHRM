package stepsDefinitions;

import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.core.api.Scenario;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {
	
	@Before()
	public void setUp() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before(value = "@Login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@After()
	public void tearDown(Scenario cenario) {
		utils.Utils.capturarTela(cenario);
		driver.quit();
	}
	
}
