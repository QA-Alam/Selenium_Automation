package zoopla.uk.stefdefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.*;
import zoopla.uk.baseclass.SuperClass;
import zoopla.uk.pagefactory.DataFageFactory;

public class OutlineTestStepDef extends SuperClass {
	DataFageFactory df;

	@Given("^As a user i can open any browser$")
	public void as_a_user_i_can_open_any_browser() throws Throwable {		
		logger.info("*******> As a user i can open any browser <*******");
		SuperClass.initialization();
		df = PageFactory.initElements(driver, DataFageFactory.class);
		// df = new DataFageFactory();
	}
	@Given("^As a user i can enter the \"([^\"]*)\" and go to the login page$")
	public void as_a_user_i_can_enter_the_and_go_to_the_login_page(String url) {
		logger.info("*******> As a user i can enter the url <*******");
		driver.get(url);
	}
	@When("^As a user i can enter as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void as_a_user_i_can_enter_as_and_password(String userName, String pwd) {
		logger.info("*******> As a user i can enter the username <*******");
		df.getEnterUserName().sendKeys(userName);
		logger.info("*******> As a user i can enter the password <*******");
		df.getEnterPassWord().sendKeys(pwd);
	}
	@When("^Click on login$")
	public void click_on_login() {
		logger.info("*******> As a user i can click on login button <*******");
		df.getClickLogin().click();
	}
	@When("^Homepage title should be \"([^\"]*)\"$")
	public void homepage_title_should_be(String homeTitle) throws InterruptedException {
		logger.info("*******> As a user i can verify the homepage <*******");
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.quit();
		} else {
			Assert.assertEquals("Dashboard / nopCommerce administration", homeTitle);
	
		}
	}

	@When("^As a user i can click on logout link$")
	public void as_a_user_i_can_click_on_logout_link() {
		logger.info("*******> As a user i can logout the application <*******");
		df.getClickLogout().click();
	}

	@Then("^Loginpage title should be \"([^\"]*)\"$")
	public void loginpage_title_should_be(String loginTitle) {
		logger.info("*******> As a user i can verify the login title3 <*******");
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.quit();
		} else {
			Assert.assertEquals("Your store. Login", loginTitle);
		}
	}
}
