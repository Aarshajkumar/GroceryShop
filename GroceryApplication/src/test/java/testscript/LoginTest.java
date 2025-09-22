package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
@Test(priority = 1,description = "verify login with valid credentials",retryAnalyzer = retry.Retry.class )
//retry mechnaisn run avan helpcheyunu
public void verifyvalidusernamevalidpassword() throws IOException {
	String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
	String expected = "https://groceryapp.uniqassosiates.com/admin";
	String actual = driver.getCurrentUrl();
	Assert.assertEquals(actual, expected,"Login is not successfull with valid credentials");
}
@Test(priority = 2, description = "verify login with validusername and invalidpw")
public void verifyvalidusernameinvalidpassword() throws IOException{
	String usernameValue =ExcelUtility.getStringData(2, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(2, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	String actual = driver.getCurrentUrl();
	Assert.assertEquals(actual, expected,"Login was successfull with validusername and invalidpassword");
}
@Test(priority = 3, description = "verify login with invalid usename and valid pw")
public void verifyinvalidusernamevalidpassword() throws IOException{
	String usernameValue =ExcelUtility.getStringData(3, 0, "LoginPage");
	String passwordValue =ExcelUtility.getStringData(3, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	String actual = driver.getCurrentUrl();
	Assert.assertEquals(actual, expected,"Login was successfull with invalidusername validpassword");
}
@Test(priority = 4,description = "verify login with invalid credentials",dataProvider = "loginProvider")
public void verifyinvalidusernameinvalidpassword(String usernameValue,String passwordValue ) throws IOException{
//	String usernameValue =ExcelUtility.getStringData(4, 0, "LoginPage");
//	String passwordValue =ExcelUtility.getStringData(4, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
	password.sendKeys(passwordValue);
	WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
	signin.click();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	String actual = driver.getCurrentUrl();
	Assert.assertEquals(actual, expected,"Login was successfull with invalidusername invalidpassword");
}
@DataProvider(name="loginProvider")//to test 3 set of data, set ana name for dataprovided
public Object[][] getDataFromDataProvider() throws IOException
{
	return new Object[][] {//2 dimentional adday anu return cheyune
		new Object[] {"user","password"},//2 dimentional adday anu return cheyune
		new Object[] {"username","pass"},
		new Object[] {"user1","password1"}
	};
}
}
