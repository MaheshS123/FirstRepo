package demo01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/");
		
		driver.manage().window().maximize();
		
		WebElement dragAble = driver.findElement(By.id("draggable"));
		WebElement dropAble = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		//drag&Drop
		
		Thread.sleep(500);

		act.clickAndHold(dragAble).moveToElement(dropAble).release().build().perform();
		
		Thread.sleep(500);
		
		WebElement DoubleClickButton = driver.findElement(By.name("dblClick"));

		act.doubleClick(DoubleClickButton).perform();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(500);
		
		alt.accept();
		
		
	}

}
