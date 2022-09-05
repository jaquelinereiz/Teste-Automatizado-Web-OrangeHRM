package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionsSteps {
	
	@Quando("acionar a opcao customField")
	public void acionarAOpcaoCustomField() {
	    Na(TelaInicialPage.class).acionarAOpcaoCustomField();
	}
	@Entao("o sistema apresenta a tela customField")
	public void oSistemaApresentaATelaCustomField() {
	    assertEquals("Remaining number of custom fields: 9", driver.findElement(By.id("fieldsleft")).getText());
	}

}
