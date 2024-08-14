package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}

	By userNameTxtBox = By.xpath("//input[@name=\"username\"]");
	By pwdTxtBox = By.xpath("//input[@name=\"password\"]");
	By loginButton = By.xpath("//button[@type='submit']");
	
	public void setUsername() {
		driver.findElement(userNameTxtBox).sendKeys("Admin");
	}
	public void setPwd() {
		driver.findElement(pwdTxtBox).sendKeys("admin123");
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	
}
