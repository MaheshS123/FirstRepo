package HolePractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(500,500);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p=new Point(1230, 050);
		
		driver.manage().window().setPosition(p);
	
	}

}
