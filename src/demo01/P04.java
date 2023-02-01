package demo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");

		Thread.sleep(1000);
		
		//driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		
		Thread.sleep(1000);
		
		WebElement GetOtp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		Thread.sleep(1000);
		
		
		
		if(GetOtp.isEnabled()) {
			boolean otp=GetOtp.isEnabled();
			
			System.out.println("Otp button status is "+otp);
		}
		else {
			boolean otp=GetOtp.isEnabled();
			
			System.out.println("Otp button status is "+otp+" now going to enable");
		
			driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		}
	}

}
