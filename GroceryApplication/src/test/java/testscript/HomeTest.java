package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase {
@Test(description = "verify Logout")
	public void verifyLogout() throws IOException {
	
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
		password.sendKeys(passwordValue);
		WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		signin.click();
		WebElement loginclick= driver.findElement(By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']"));
		loginclick.click();
		WebElement logoutclick = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		logoutclick.click();
		String expected = "https://groceryapp.uniqassosiates.com/admin/login";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected,"Logout is not successfull");
		
		
	}
	}

