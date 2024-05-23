package webelements;

import org.openqa.selenium.By;

public interface LoginElements {
	By txtUserName = By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtUserName");
	By txtPassword = By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_txtPassword");
	By btnSignIn = By.id("ctl00_ctl00_ContentPlaceHolderBody_PlaceHolderBodyMain_ctrlMembershipSignIn_btnSignIn");
	By lnkSignIn = By.xpath("//a[text()='Sign in to your marketplace account']");
	By enterEmailEDE=By.xpath("//input[contains(@placeholder,'Username')]");
	By enterPasswordEDE=By.xpath("//input[contains(@placeholder,'Password')]");
	By signInButtonEDE=By.xpath("//input[@value='SIGN IN']");
}
