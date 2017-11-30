package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("^Open firefox browser and navigate to url$")
	public void open_firefox_browser_and_navigate_to_url() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver.exe");
	    
		driver=new FirefoxDriver();
		
		driver.get("https://testing1.tk20.com/campustoolshighered/start.do");
		
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable {
	 
		driver.findElement(By.id("user")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='content']/form/div/div/div[1]/button")).click();
	}

	@Then("^Home page should appear$")
	public void home_page_should_appear() throws Throwable {
	    
		String ActualUrl= driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl,"https://testing1.tk20.com/campustoolshighered/klogin_body.do");
		System.out.println("Matched");
	}


}
