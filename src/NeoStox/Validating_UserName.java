package NeoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validating_UserName
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://neostox.com/");

		
		
		//clicking on sign in  button
		HomeToMobileNoField ClickSignIn=new HomeToMobileNoField(driver);
		ClickSignIn.ClickOnSignInButton();
		Thread.sleep(2000);
		EnterMobileNo_ClickSignIN EnterNo_ClickSignIn=new EnterMobileNo_ClickSignIN(driver);
		EnterNo_ClickSignIn.EnterNo_Click_Submit();

	}

}
class HomeToMobileNoField
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]")private WebElement Sign_button;
	
	public HomeToMobileNoField(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOnSignInButton() 
	{
		Sign_button.click();
	}
}

class EnterMobileNo_ClickSignIN 
{
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber")private WebElement MobileNo_Field;
	@FindBy(id = "lnk_signup1")private WebElement SignIn_Button;
	
	public EnterMobileNo_ClickSignIN(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void EnterNo_Click_Submit() {
		MobileNo_Field.sendKeys("9665915953");
		SignIn_Button.click();
	}
	
}















