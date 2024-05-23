package pages;

import org.openqa.selenium.WebElement;

import webelements.LoginElements;

public class LoginPage extends BasePage{
	
	public void enterUserName(String userName) {
		WebElement element=waitForElementToBeClickable(LoginElements.txtUserName,60);
		sendKeysToElement(element, userName, "user name");
	}
	public void enterPassword(String password) {
		WebElement element=waitForElementToBeClickable(LoginElements.txtPassword,60);
		sendKeysToElement(element, password, "password");
	}
	public void clickSignInButton() {
		WebElement element=waitForElementToBeClickable(LoginElements.btnSignIn,60);
		clickElement(element, "sign in button");
	}
	public void clickSignInLnk() {
		WebElement element=waitForElementToBeClickable(LoginElements.lnkSignIn,60);
		clickElement(element, "Sign into Marketplace");
	}
	public void enterEmailEDE(String userName) {
		WebElement element=waitForElementToBePresent(LoginElements.enterEmailEDE,60);
		sendKeysToElement(element, userName, "Email EDE");
	}
	public void enterPasswordEDE(String password) {
		WebElement element=waitForElementToBePresent(LoginElements.enterPasswordEDE,60);
		sendKeysToElement(element, password, "password EDE");
	}
	public void clickSignInButtonEDE() {
		WebElement element=waitForElementToBeClickable(LoginElements.signInButtonEDE,60);
		clickElement(element, "sign in button EDE");
	}
	
}
