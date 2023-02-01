package demo01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("9156892856");
		
		driver.findElement(By.id("pass")).sendKeys("Suhas@123");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
//		Alert alr = driver.switchTo().alert();
//		
//		System.out.println(alr.getText());
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[contains(@class,'x6s0dn4 x9f619')])[4]")).click();
//
//		driver.findElement(By.xpath("(//div[contains(@class,'x6s0dn4 x9f619')])[4]")).click();

	}

}
