package io.cucumber.jessica;

public class Quote extends BaseTest{

	public void preencherEmail() {

		acharElemento().get(46).click();
		acharElemento().get(46).sendKeys("teste@gmail.com");
		

	}
	
	public void preencherUsername() {

		acharElemento().get(47).click();
		acharElemento().get(47).sendKeys("ajdhheeu155");
		

	}
	
	public void preencherPassword() {

		acharElemento().get(48).click();
		acharElemento().get(48).sendKeys("Teste1234");
		

	}
	
	
	public void preencherConfirm() {

		acharElemento().get(49).click();
		acharElemento().get(49).sendKeys("Teste1234");
		

	}
	
	
	public void preencherSend() {

		acharElemento().get(50).click();
	
		

	}
	
	
}
