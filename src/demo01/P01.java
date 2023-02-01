package demo01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
	//	driver.get("https://facebook.com");
		
		Thread.sleep(2000);
		
	//	driver.close();
		
	   //driver.manage().window().maximize();
		
	//	Thread.sleep(2000);
		
	//	driver.manage().window().minimize();
		
		driver.navigate().to("https://paytm.com");
		
//		Thread.sleep(2000);
//
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//
//		driver.navigate().refresh();
//		
//		Thread.sleep(2000);
//
//		driver.navigate().forward();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		System.out.println("=======");
		System.out.println(driver.getCurrentUrl());
		System.out.println("==========");
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		System.out.println(driver.getTitle());

		System.out.println();

	}

}
