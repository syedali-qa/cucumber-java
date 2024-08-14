//package stepdefintions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageobjects.LoginPgObj;
//
//public class LoginSteps {
//
//	WebDriver sddriver;
//	LoginPgObj lo;
//
//	@Given("User open chrome browser")
//	public void user_open_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", "C:/Drivers2/chromedriver-win64/chromedriver.exe");
//		sddriver = new ChromeDriver();
//		sddriver.manage().window().maximize();
//	}
//
//	@Given("User navigate to orangehrm app")
//	public void user_navigate_to_orangehrm_app() throws InterruptedException {
//		sddriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//	}
//
//	@When("User enter valid id and pwd")
//	public void user_enter_valid_id_and_pwd() {
//
////		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
////		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//
//		lo = new LoginPgObj(sddriver);
//		lo.setUserName();
//		lo.setPwd();
//	}
//
//	@When("User click on login")
//	public void user_click_on_login() {
//		lo.clickLogin();
//	}
//
//	@Then("User should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() throws InterruptedException {
//
//		Thread.sleep(3000);
//		WebElement admin = sddriver.findElement(By.xpath("//span[text()='Admin']"));
//		if (admin.isDisplayed()) {
//			System.out.println("User is on home page");
//		} else {
//			System.out.println("User is on this page " + sddriver.getTitle());
//		}
//	}
//
//	@Then("User close the browser")
//	public void user_close_the_browser() throws InterruptedException {
//		Thread.sleep(5000);
//		sddriver.quit();
//	}
//
//}
