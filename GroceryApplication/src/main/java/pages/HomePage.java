package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {
public WebDriver driver;
PageUtility page = new PageUtility();
WaitUtility wait = new WaitUtility();
public HomePage(WebDriver driver) {
	this.driver = driver;
}
@FindBy(xpath ="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement loginclick;
public void loginclick() {
	//WebElement loginclick= driver.findElement(By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']"));
	//loginclick.click();
	wait.waitUntilClickable(driver, loginclick);
	page.clickOnElement(loginclick);
}
@FindBy(xpath ="//i[@class='ace-icon fa fa-power-off']")WebElement logoutclick;

public void logoutclick() {
	//WebElement logoutclick = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
//	logoutclick.click();
	page.clickOnElement(logoutclick);
}
}
