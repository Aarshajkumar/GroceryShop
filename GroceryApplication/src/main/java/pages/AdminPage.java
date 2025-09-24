package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
public WebDriver driver;
public AdminPage(WebDriver driver) {
this.driver = driver;
}

@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminmoreInfo;
public void clickMoreInfo() {
//	WebElement adminmoreInfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] "));
	adminmoreInfo.click();
}
@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']")WebElement newuser;
public void addnewuser() {
//	WebElement newuser =driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newuser.click();
}
public void addNewUsername(String randomname) {
	WebElement newusername = driver.findElement(By.xpath("//input[@id='username']"));
	newusername.sendKeys(randomname);
}
public void enterNewPassword(String randompassword) {
	WebElement newpassword = driver.findElement(By.xpath("//input[@id='password']"));
	newpassword.sendKeys(randompassword);
}
public void newUserType() {
	WebElement newusertype =driver.findElement(By.xpath("//select[@id='user_type']"));
	Select select = new Select(newusertype);
	select.selectByVisibleText("Admin");
}
public void userSave() {
	WebElement usersave = driver.findElement(By.xpath("//button[@name='Create']"));
	usersave.click();
}
public boolean newAlert() {
	WebElement newalert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
	return newalert.isDisplayed();
}
public void  userSearch() {
	WebElement usersearch = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	usersearch.click();
}
public void searchByName(String randomname) {
	WebElement searchusername = driver.findElement(By.xpath("//input[@id='un']"));
	searchusername.sendKeys(randomname);
}
public void searchUserType() {
	WebElement searchusertype = driver.findElement(By.xpath("//select[@name='ut']"));
	Select select = new Select(searchusertype);
	select.selectByVisibleText("Admin");
}
public void searchUser() {
	WebElement searchuser = driver.findElement(By.xpath("//button[@name='Search']"));
	searchuser.click();
}
public boolean searchAlert() {
	WebElement searchalert = driver.findElement(By.xpath("//button[@class='btn btn-block-sm btn-danger' and @name = 'Search']"));
	return searchalert.isDisplayed();
}
public void Reset() {
	WebElement reset = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
	reset.click();
}
public boolean resetAlert() {
	WebElement resetassert = driver.findElement(By.xpath("//h4[@class='card-title' and text() ='Admin Users']"));
	return resetassert.isDisplayed();
}
}
