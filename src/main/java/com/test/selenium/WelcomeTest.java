package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */

public class WelcomeTest 
{
	
	public static void main(String[] args) {
		
		Autologin();
	}
	static WebDriver driver;
	@Test
	public static void waitElement(String elemento, int tiempo){
		WebDriverWait esperar = new WebDriverWait(driver, tiempo);
		esperar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemento)));
	}
	@Test
		public static void Autologin() {
//			System.setProperty("webdriver.gecko.driver", "/Users/danial/Downloads/geckodriver-master/CONTRIBUTING.md");
			ChromeDriver driver = new ChromeDriver();
//			FirefoxDriver driver = new FirefoxDriver();
//			driver.get("https://www.instagram.com/accounts/login/");

			//WebDriver driver2 = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
			
			
			driver.get("https://www.instagram.com/accounts/login/");
//			waitElement("//*[@id=\"f2bfdf39c127ab4\"]/section/main/div/article/div/div[1]/div/form/div[1]/div/div[1]/input",20); 	//MODIFY XPATH HERE IN CASE INSTAGRAM CHANGE HIS STRUCTURE
//			waitElement("//*[@id='react-root']/section/main/div/article/div/div[1]/div/form/div[2]/div/div[1]/input",20);	//MODIFY XPATH HERE IN CASE INSTAGRAM CHANGE HIS STRUCTURE
//			driver.findElement(By.xpath("//*[@id=\"f2bfdf39c127ab4\"]/section/main/div/article/div/div[1]/div/form/div[1]/div/div[1]/input")).sendKeys("hi");	//MODIFY XPATH HERE IN CASE INSTAGRAM CHANGE HIS STRUCTURE
//			driver.findElement(By.xpath("//*[@id='react-root']/section/main/div/article/div/div[1]/div/form/div[2]/div/div[1]/input")).sendKeys("haaaa");	//MODIFY XPATH HER
			
			
//			WebDriverWait wait = new WebDriverWait(driver, 15);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			
			WebElement username = driver.findElement(By.name("username"));
			
			username.sendKeys("danial_k007");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Test");
				e.printStackTrace();
			}
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("danialhahaha");
			WebElement submit2 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/span/button"));
			submit2.click();
			
			WebElement submit3 = driver.findElement(By.xpath("//*[@id=\"slfErrorAlert\"]"));
			WebDriverWait wait = new WebDriverWait(driver, 15);
			
			System.out.println(submit3.getText());
			
		}
		
	}
