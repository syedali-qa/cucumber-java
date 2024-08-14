package stepdefintions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageFactory;
import pageobjects.LoginPageFactory;
import utilities.BaseClass1;

public class TestCaseSteps {
	WebDriver driver;
	LoginPageFactory lf;
	HomePageFactory hf;
	BaseClass1 bc;

//Hooks --  Before, After, BeforeStep, AfterStep

	@BeforeStep
	public void dummyMsg() {
		System.out.println("I will run b4 every step");
	}

	@AfterStep
	public void dummyMsg2() {
		System.out.println("I will run after every step");
	}

//	@Before(order =1 )
	public void dummy1() {
		System.out.println("I will run before every scenario");
	}

	@Before(order = 2)
	public void dummy3() {
		System.out.println("I will run before every scenario");
	}

	@After
	public void dummy2() {
		System.out.println("I will run after every scenario");
	}

	@Given("User open chrome browser")
	public void user_open_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", "C:/Drivers2/chromedriver-win64/chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver = BaseClass1.driverSetup();
		lf = new LoginPageFactory(driver);
		hf = new HomePageFactory(driver);

	}

	@Given("User navigate to orangehrm app")
	public void user_navigate_to_orangehrm_app() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^User enter valid (.*) and (.*)$")
	public void user_enter_valid_admin_and_admin123(String id, String pwd) throws InterruptedException {
		Thread.sleep(3000);
		lf.setUserName(id);
		lf.setPwd(pwd);
	}

	@When("User click on login")
	public void user_click_on_login() throws InterruptedException {
		Thread.sleep(3000);

		lf.clickLogin();
	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() throws InterruptedException, IOException {
		Thread.sleep(3000);
		try {
			hf.verifyadminModule();
		} catch (Exception e) {
			e.printStackTrace();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("./ScreenShots/ss.png");
			FileUtils.copyFile(src, des);
		}
	}

	@Then("User click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(hf.profile));

		hf.clickProfile();
		Thread.sleep(2000);
		hf.clickLogout();

	}

	@Then("User should be navigated to login page")
	public void user_should_be_navigated_to_login_page() throws InterruptedException {
		Thread.sleep(3000);
		lf.verifyLoginButton();
	}

//	@After
	@Then("User close the browser")
	public void user_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass1.driverTearDown();
	}

}
