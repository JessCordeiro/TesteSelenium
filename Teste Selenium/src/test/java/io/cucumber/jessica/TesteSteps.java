package io.cucumber.jessica;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class TesteSteps extends BaseTest {

	public TesteSteps() {
		super();

	}

	private Vehicle vehicle = new Vehicle();
	private Insurant insurant = new Insurant();
	private Product product = new Product();
	private Price price = new Price();
	private Quote quote = new Quote();

	@Dado("que eu estou no site")
	public void que_eu_estou_no_site() {
		inicializar();
		carregarPagina();
	}

	@Dado("preencho o formulario Enter Vehicle Data")
	public void preencho_o_formulario_Enter_Vehicle_Data() throws InterruptedException {
		vehicle.preencherMarca();
		vehicle.preencherModelo();
		vehicle.preencherCapacidade();
		vehicle.preencherPerformance();
		vehicle.preencherDataManufacture();
		vehicle.preencherNumberOfSeats1();
		vehicle.preencherHandDrive();
		vehicle.preencherNumberOfSeats2();
		vehicle.preencherFuelType();
		vehicle.preencherPayload();
		vehicle.preencherWeight();
		vehicle.preencherPrice();
		vehicle.preencherPlate();
		vehicle. preencherMileage();
		vehicle.apertarNext();
	}
	@Dado("preencho o formulario Enter Insurant Data")
	public void preencho_o_formulario_Enter_Insurant_Data() throws InterruptedException {
		insurant.preencherNome();
		insurant.preencherSobrenome();
		insurant.preencherAniversario();
		insurant.preencherGenero();
		insurant.preencherEndereco();
		insurant.preencherPais();
		insurant.preencherZip();
		insurant.preencherCidade();
		insurant.preencherOcupacao();
		insurant.preencherHobbies();
		insurant.apertarNext();	
}
	@Dado("preencho o formulario Enter Product Data")
	public void preencho_o_formulario_Enter_Product_Data() throws InterruptedException {
		product.preencherData();
		product.preencherSeguro();
		product. preencherMeritrating();
		product.preencherDamage();
		product.preencherOptional();
		product.preencherCourtesy();
		product.apertarNext();
		
	}
	
	@Dado("preencho o formulario Enter Price option")
	public void preencho_o_formulario_Enter_Price_option() throws InterruptedException {
		price.preencherPreco();
		price.apertarNext();
	
	}
	
	@Dado("preencho o formulario Send Quote")
	public void preencho_o_formulario_Send_Quote() throws InterruptedException {
		quote.preencherEmail();
		quote.preencherUsername();
		quote.preencherPassword();
		quote.preencherConfirm();
		quote.preencherSend();
		

	}
	
	@Entao("devo ver a mensagem {string}")
	public void devo_ver_a_mensagem (String string) throws InterruptedException {
	Thread.sleep(10000);
	WebElement success = browser.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"));
	assertEquals(string, success.getText());
		
	}
}