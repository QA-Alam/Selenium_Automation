package zoopla.uk.stefdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zoopla.uk.baseclass.SuperClass;
import zoopla.uk.pagefactory.MasterFageFactory;

public class LoginStefDefination extends SuperClass{

	
	MasterFageFactory pf;
	
	@Given("^As a user able to open any browser$")
	public void as_a_user_able_to_open_any_browser()  {	
		SuperClass.initalization();
	}

	@Given("^As a user able to enter URL$")
	public void as_a_user_able_to_enter_URL()  {
		
	  driver.get("https://www.zoopla.co.uk/");
	  driver.manage().window().maximize();
	}

	@When("^As a user i can click on signin button$")
	public void as_a_user_i_can_click_on_signin_button()  {	
		pf = PageFactory.initElements(driver, MasterFageFactory.class);
	    pf.getAccepetCookis().click();
	    pf.getclickOnsigninbutton().click();
	}

	@When("^As a user i can enter username & password$")
	public void as_a_user_i_can_enter_username_password()  {
	  driver.findElement(By.id("signin_email")).sendKeys("alammohammed79@gmail.com");
	  driver.findElement(By.id("signin_password")).sendKeys("SAYEDawan2008@");
	}

	@When("^As a user i can click on login button$")
	public void as_a_user_i_can_click_on_login_button()  {
	   driver.findElement(By.id("signin_submit")).click(); 
	}

	@Then("^As a user i can verify the homepage$")
	public void as_a_user_i_can_verify_the_homepage()  {
	  System.out.println("Page title is a: "+driver.getTitle());
	}
	@Then("^Close the browser$")
	public void close_the_browser() {
	  driver.quit();
	}
}
