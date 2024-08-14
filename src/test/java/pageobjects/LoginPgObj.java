//package pageobjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class LoginPgObj {
//	
//	//constructor
//	public LoginPgObj(WebDriver sddriver) {
//		this.driver = sddriver;
//	}
//
//	//calling webdriver
//	WebDriver driver;
//	
//	//saving the webelements
//	By userTxtBox = By.xpath("//input[@placeholder='Username']");
//	By pwdTxtBox = By.xpath("//input[@placeholder='Password']");
//	By loginButton = By.xpath("//button[@type='submit']");
//	
//	//interactions with webelements
//	public void setUserName() {
//		driver.findElement(userTxtBox).sendKeys("Admin");
//	}
//	public void setPwd() {
//		driver.findElement(pwdTxtBox).sendKeys("admin123");
//	}
//	public void clickLogin() {
//		driver.findElement(loginButton).click();
//	}
//	
//	
//}
