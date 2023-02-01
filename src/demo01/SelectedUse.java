package demo01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\.cromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
	}

}
