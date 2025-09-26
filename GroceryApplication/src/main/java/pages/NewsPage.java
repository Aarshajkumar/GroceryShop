package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class NewsPage {
public WebDriver driver;
PageUtility page = new PageUtility();
WaitUtility wait = new WaitUtility();
public NewsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//a[@class='small-box-footer'and @href ='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement newsmoreinfo;
public void manageNewsMoreInfo() {
//	WebElement newsmoreinfo = driver.findElement(By.xpath("//a[@class='small-box-footer'and @href ='https://groceryapp.uniqassosiates.com/admin/list-news']"));
	//newsmoreinfo.click();
	page.clickOnElement(newsmoreinfo);
}
@FindBy(xpath ="//a[text()='Home']")WebElement homeclick;
public void clickHome() {
//	WebElement homeclick =driver.findElement(By.xpath("//a[text()='Home']"));
	//homeclick.click();
	wait.waitUntilClickable(driver, homeclick);
	page.clickOnElement(homeclick);
}
@FindBy(xpath ="//textarea[@id='news']")WebElement textarea;
public void textareafield() {
	//WebElement textarea = driver.findElement(By.xpath("//textarea[@id='news']"));
	//textarea.sendKeys("This is a sample news");
	page.sendDataToElement(textarea, "This is a sample news");
}
@FindBy(xpath ="//button[@name='create']")WebElement savemanage;
public void clickSave() {
	//WebElement savemanage = driver.findElement(By.xpath("//button[@name='create']"));
	//savemanage.click();
	page.clickOnElement(savemanage);
}
@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")WebElement newsalert;
public boolean newsAlert() {
	//WebElement newsalert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
	return newsalert.isDisplayed();
}
}
