package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
  @FindBy(xpath ="//input[@class='form-control' and @name='username']")WebElement username;
	public void enterusername(String usernameValue ) {
	//	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernameValue);
	}
	public void enterpassword(String passwordValue) {
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
		password.sendKeys(passwordValue);
	}
	public void clicksignin() {
		WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		signin.click();
	}
	
	
}