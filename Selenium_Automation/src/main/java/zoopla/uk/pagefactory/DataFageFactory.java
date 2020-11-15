package zoopla.uk.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.baseclass.SuperClass;

public class DataFageFactory extends SuperClass {

	public DataFageFactory() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		enterUserName.clear();
		return enterUserName;
	}

	@FindBy(id = "Password")
	@CacheLookup
	private WebElement enterPassWord;

	public WebElement getEnterPassWord() {
		enterPassWord.clear();
		return enterPassWord;
	}
	
	@FindBy(xpath = "//*[@value='Log in']")
	@CacheLookup
	private WebElement ClickLogin;

	public WebElement getClickLogin() {
		return ClickLogin;
	}
	@FindBy(linkText = "Logout")
	@CacheLookup
	private WebElement ClickLogout;

	public WebElement getClickLogout() {
		return ClickLogout;
	}

}
