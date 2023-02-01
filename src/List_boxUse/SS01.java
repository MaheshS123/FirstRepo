package List_boxUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Google.com");

		Thread.sleep(1000);	
		
		File A = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		String random = RandomString.make(3);
		
		File path=new File("D:\\ScreenShot method\\SS"+random+".jpg");
		
		FileHandler.copy(A, path);
	}

}
