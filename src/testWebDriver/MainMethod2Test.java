package testWebDriver;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethod2Test {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "src/chromedriver 2");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("jasdeep Kaur");
		//driver.findElement(By.className("btnK")).click();
	

	}
}
