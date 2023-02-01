package HolePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		
		WebElement NameField = driver.findElement(By.name("firstname"));
		
		Actions act=new Actions(driver);
		
		//act.sendKeys(NameField, "Mahesh").perform();
		
		act.keyDown(NameField,Keys.SHIFT).sendKeys("m").keyUp(Keys.SHIFT).sendKeys("ahesh").build().perform();
		
		WebElement Day = driver.findElement(By.id("day"));
		
		act.click(Day).perform();
		Thread.sleep(100);
		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
//		for(int i=26;i>=10;i--) {
//			Thread.sleep(100);
//			act.sendKeys(Keys.ARROW_UP).perform();
//		}
		
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
