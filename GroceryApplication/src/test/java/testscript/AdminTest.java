package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class AdminTest extends TestNGBase {
@Test
	public void verifyadduser() throws IOException {
	String usernameValue =ExcelUtility.getStringData(2, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(2, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
	
}
}
