

package testWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/jasdeepkaur/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
		
		System.out.println("hello");
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println("bye");
		//driver.findElement(By.id("Email")).sendKeys("jasdeepg21@gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("jasdeepg21@gmail.com");
		
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("asasas");
		
		//driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("asas");
		//driver.findElement(By.id("next")).click();
		System.out.println("signin");
		driver.findElement(By.id("signIn")).click();
		
	
	
	
	
	
	
				}

}
