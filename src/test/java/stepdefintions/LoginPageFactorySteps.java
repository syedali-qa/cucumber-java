//package stepdefintions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageobjects.HomePageFactory;
//import pageobjects.LoginPageFactory;
//
//public class LoginPageFactorySteps {
//
//	WebDriver driver;
//	LoginPageFactory lf;
//	HomePageFactory hf;
//
//	@Given("User open chrome browser")
//	public void user_open_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", "C:/Drivers2/chromedriver-win64/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@Given("User navigate to orangehrm app")
//	public void user_navigate_to_orangehrm_app() throws InterruptedException {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//	}
//
//	@When("User enter valid id and pwd")
//	public void user_enter_valid_id_and_pwd() throws InterruptedException {
//		lf = new LoginPageFactory(driver);
//		lf.setUserName();
//		lf.setPwd();
//		Thread.sleep(2000);
//
//	}
//
//	@When("User click on login")
//	public void user_click_on_login() throws InterruptedException {
//		lf.clickLogin();
//		Thread.sleep(2000);
//
//	}
//
//	@Then("User should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() throws InterruptedException {
//		hf = new HomePageFactory(driver);
//		hf.verifyadminModule();
//		Thread.sleep(2000);
//
//	}
//
//	@Then("User close the browser")
//	public void user_close_the_browser() {
//		driver.quit();
//	}
//
//}
