package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
public WebDriver driver;
public NewsPage(WebDriver driver) {
	this.driver = driver;
}
public void manageNewsMoreInfo() {
	WebElement newsmoreinfo = driver.findElement(By.xpath("//a[@class='small-box-footer'and @href ='https://groceryapp.uniqassosiates.com/admin/list-news']"));
	newsmoreinfo.click();
}
public void clickHome() {
	WebElement homeclick =driver.findElement(By.xpath("//a[text()='Home']"));
	homeclick.click();
}
public void textarea() {
	WebElement textarea = driver.findElement(By.xpath("//textarea[@id='news']"));
	textarea.sendKeys("This is a sample news");
}
public void clickSave() {
	WebElement savemanage = driver.findElement(By.xpath("//button[@name='create']"));
	savemanage.click();
}
public boolean newsAlert() {
	WebElement newsalert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
	return newsalert.isDisplayed();
}
}
