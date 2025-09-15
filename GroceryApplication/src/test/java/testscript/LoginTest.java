package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
@Test
public void validusernamevalidpassword() throws IOException {
	String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
}
@Test
public void validusernameinvalidpassword() throws IOException{
	String usernameValue =ExcelUtility.getStringData(2, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(2, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
}
@Test
public void invalidusernamevalidpassword() throws IOException{
	String usernameValue =ExcelUtility.getStringData(3, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(3, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
}
@Test
public void invalidusernameinvalidpassword() throws IOException{
	String usernameValue =ExcelUtility.getStringData(4, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(4, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
}}