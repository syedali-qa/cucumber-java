package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

	// constructor
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	By userNameTxtBox = By.xpath("userNameTxtBox");

	// Saving the webelements
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userNameTxtBox;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwdTxtBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	// Interactions with webelements
	public void setUserName(String id) {
		userNameTxtBox.sendKeys(id);
	}

	public void setPwd(String pwd) {
		pwdTxtBox.sendKeys(pwd);
	}

	public void clickLogin() {
		loginButton.click();
	}
	
	public void verifyLoginButton() {
		if(loginButton.isDisplayed()) {
			System.out.println("User is on login page");
		}else {
			System.out.println(driver.getTitle()+"==>User is on this page");
		}
	}

}
