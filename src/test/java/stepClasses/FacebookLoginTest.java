package stepClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {

	public static WebDriver driver;

	@Given("user opens the browser and navigate to www.facebook.com")
	public void user_opens_the_browser_and_navigate_to_www_facebook_com() {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://facebook.com");

	}

	@When("user logs in with valid credentials and clicks the login button")
	public void user_logs_in_with_valid_credentials_and_clicks_the_login_button() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7035072826");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("HelloWorld");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();

	}

	@Then("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("facebook")) {
			System.out.println("test case is passed");
		} else {
			System.out.println("test case is failed");
		}

		driver.close();

//		@Given("user opens the browser and navigate to www.facebook.com")
//		public void user_opens_the_browser_and_navigate_to_www_facebook_com() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("user logs in with valid credentials and clicks the login button")
//		public void user_logs_in_with_valid_credentials_and_clicks_the_login_button() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user navigates to the home page")
//		public void user_navigates_to_the_home_page() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

	}

}
