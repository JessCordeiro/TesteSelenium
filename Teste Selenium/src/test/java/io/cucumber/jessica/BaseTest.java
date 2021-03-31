package io.cucumber.jessica;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Seletores {

	public BaseTest() {

	}

	protected static WebDriver browser;

	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		browser = new ChromeDriver();
	}

	public void carregarPagina() {
		browser.get("http://sampleapp.tricentis.com/101/app.php");
		browser.manage().window().maximize();

	}

	public static void finalizar() {
		browser.quit();
	}

	public static WebElement preencherCssSelector(String seletor) {
		return browser.findElement(By.cssSelector(seletor));
	}

	public List<WebElement> acharElemento() {
		List<WebElement> lista = new ArrayList();
		for (String e : seletores) {

			lista.add(preencherCssSelector(e));

		}

		return lista;

	}

}
