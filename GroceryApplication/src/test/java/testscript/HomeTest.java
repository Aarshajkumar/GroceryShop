package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase {
@Test(description = "verify Logout")
	public void verifyLogout() throws IOException {
	
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		HomePage home = new HomePage(driver);
		home.loginclick();
		home.logoutclick();
		String expected = "https://groceryapp.uniqassosiates.com/admin/login";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected,"Logout is not successfull");
		
		
	}
	}

