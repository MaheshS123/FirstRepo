package HolePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(500);
		Actions act=new Actions(driver);
		
		Thread.sleep(500);
		 WebElement ClickButton = driver.findElement(By.xpath("//button[@name='click']")) ;
		act.click(ClickButton).perform();
		
		Thread.sleep(500);
		
		Alert ale = driver.switchTo().alert();
        ale.accept();
		
        Thread.sleep(500);
		WebElement doubleClick = driver.findElement(By.xpath("//button[@name='dblClick']")) ;
	    act.doubleClick(doubleClick).perform();
	
	    Thread.sleep(500);
	    ale.accept();
	
	    WebElement Drag= driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    
	    //act.dragAndDrop(Drag, drop).perform();
	    act.moveToElement(Drag).clickAndHold().release(drop).build().perform();
	    
	}

}
