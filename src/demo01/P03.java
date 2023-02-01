package demo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//sendkeys(),clear(),click()
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mahesh");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
