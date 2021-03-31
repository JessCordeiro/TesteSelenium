package io.cucumber.jessica;

public class Vehicle extends BaseTest {
	
	public void preencherMarca() {
		
		acharElemento().get(0).click();
		acharElemento().get(1).click();
		
	}
	
	public void preencherModelo() {
		
		acharElemento().get(2).click();
		acharElemento().get(3).click();
		
	}
	
	public void preencherCapacidade() {
		
		acharElemento().get(4).click();
		acharElemento().get(4).sendKeys("20");
		
	}
	
	public void preencherPerformance() {
		
		acharElemento().get(5).click();
		acharElemento().get(5).sendKeys("500");
		
	}
	
	public void preencherDataManufacture() {
		
		acharElemento().get(6).click();
		acharElemento().get(6).sendKeys("04/17/2020");
		
	}
	
	public void preencherNumberOfSeats1() {
		
		acharElemento().get(7).click();
		acharElemento().get(8).click();
		
	}
	
	public void preencherHandDrive() {
		
		acharElemento().get(9).click();
		
		
	}
	
	public void preencherNumberOfSeats2() {
		
		acharElemento().get(10).click();
		acharElemento().get(11).click();
	}
	
	public void preencherFuelType() {
		
		acharElemento().get(12).click();
		acharElemento().get(13).click();
		
	}
	
	public void preencherPayload() {
		
		acharElemento().get(14).click();
		acharElemento().get(14).sendKeys("20");
		
	}
	public void preencherWeight() {
		
		acharElemento().get(15).click();
		acharElemento().get(15).sendKeys("500");
		
	}
	
	public void preencherPrice() {
		
		acharElemento().get(16).click();
		acharElemento().get(16).sendKeys("25000");
		
	}
	public void preencherPlate() {
		
		acharElemento().get(17).click();
		acharElemento().get(17).sendKeys("2");
		
	}
	
	public void preencherMileage() {
		
		acharElemento().get(18).click();
		acharElemento().get(18).sendKeys("800");
		
	}
	
	public void apertarNext() {
		
		acharElemento().get(19).click();
		
		
	}
}
