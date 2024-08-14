//package stepdefintions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageobjects.LoginPageObjects;
//
//public class Orangehrmsteps {
//	WebDriver driver;
//	LoginPageObjects lo;
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
//	Thread.sleep(3000);
//	}
//
//	@When("User enter valid id and pwd")
//	public void user_enter_valid_id_and_pwd() throws InterruptedException {
//		lo = new LoginPageObjects(driver);
//		lo.setUsername();
//		lo.setPwd();
//		Thread.sleep(3000);
//
//	}
//
//	@When("User click on login")
//	public void user_click_on_login() throws InterruptedException {
//		lo.clickLogin();
//		Thread.sleep(3000);
//
//	}
//
//	@Then("User should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() {
//		System.out.println("User navigated to home page");
//	}
//
//	@Then("User logout of app")
//	public void user_logout_of_app() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
//	}
//
//	@Then("User close the browser")
//	public void user_close_the_browser() throws InterruptedException {
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
//
//}
