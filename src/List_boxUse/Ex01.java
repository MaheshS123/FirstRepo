package List_boxUse;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		
		
		
		WebElement LN = driver.findElement(By.name("lastname"));
		
		act.click(LN).keyDown(Keys.SHIFT).sendKeys("suyog").keyUp(Keys.SHIFT).sendKeys(" v").build().perform();
		
		
		
		
		
	}

}
