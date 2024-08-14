package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

	WebDriver driver;
	
	//constructor
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	
	//element
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminModule;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	public
	WebElement profile;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logout;
	
	//interaction
	public void verifyadminModule() {
		if(adminModule.isDisplayed()) {
			System.out.println("User is on Home page");
		}else {
			System.out.println(driver.getTitle()+"==> User is on this page");
		}
	}
	
	public void clickProfile() {
		profile.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
}
