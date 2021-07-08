package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodo {

	WebDriver driver;

	public void abrirNavegador(String site) {
		try {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		} catch (Exception e) {
			System.out.println(".....error ao abrir navegador....." + e.getMessage());
		}

	}

	/**
	 * clicar no elemento
	 * 
	 * @author Paula Negri
	 * @param elemento
	 */
	public void clicar(By elemento) {

		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println(".....erro ao clicar no elemento....." + e.getStackTrace());
		}
	}

	public void validarCadastro(By elemento, String nomeInserido) throws InterruptedException {
		Thread.sleep(3000);
		String nomeCadastrado = driver.findElement(elemento).getText();
		assertEquals(nomeCadastrado, nomeInserido);

	}


	/**
	 * Preencher um texto no elemento
	 * 
	 * @author Paula Negri
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {

		try {
			Thread.sleep(2000);
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println(".....erro ao escrever no elemento....." + e.getStackTrace());
		}
	}

	/**
	 * Print Screen de Erros
	 * 
	 * @author Paula Negri
	 * @param nomePrint
	 * @throws IOException
	 */

	public void printScreenErros(String descricaoPasso) throws IOException {

		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Evidencias/Erros/" + descricaoPasso + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void printScreen(String descricaoPasso) throws IOException {

		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Evidencias/" + descricaoPasso + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	/**
	 * Esperar ser clicavel
	 * 
	 * @author Paula Negri
	 * @param elemento
	 * @param descricaoPasso
	 * @throws IOException
	 */

	public void esperarClicavel(By elemento, String descricaoPasso) throws IOException {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement el = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			printScreenErros("Erro ao tentar -- " + descricaoPasso);

		}
	}

	/**
	 * Clicar
	 * 
	 * @author Paula Negri
	 * @param elemento
	 * @param descricaoPasso
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void clicarTempo(By elemento, String descricaoPasso) throws IOException, InterruptedException {
		Thread.sleep(7000);
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {

		}

	}

	public void fechar() {
		driver.quit();

	}

}
