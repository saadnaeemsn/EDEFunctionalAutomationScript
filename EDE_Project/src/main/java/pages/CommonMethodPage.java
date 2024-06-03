package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;
import webelements.OR;
import static javax.swing.JOptionPane.showMessageDialog;

public class CommonMethodPage extends BasePage {
	public void clickToCancelSessionOutBtn() throws InterruptedException {
		WebElement element1 = null;
		WebElement element2 = null;
		try{
			element1 = waitForElementToBeClickable(OR.sessionOutText, 5);
			element2 = waitForElementToBeClickable(OR.sessionOutYesBtn, 5);
		}
		catch(Exception exp){
		}
		if(element1!=null) {
			if(element1.isDisplayed()) {
				clickElement(element2, "Session YES Btn");
			}
		}
	}

	public void removeApplication() throws InterruptedException {
		WebElement element1 = null;
		WebElement element2 = null;
		try{
			element1 = waitForElementToBeClickable(OR.removeBtn, 5);
		}
		catch(Exception exp){
		}
		if(element1!=null) {
			if(element1.isDisplayed()) {
				clickElement(element1, "Remove Btn");
				element2 = waitForElementToBeClickable(OR.confirmBtn, 5);
				Wait.waitForElement(getWebDriver(), element2);
				clickElement(element2, "continue button");
			}
		}
	}
	
	public void clickContinueBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.ContinueBtn2, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue button");
	}
	
	public void clickConsumerLoginBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.consumerLoginBtn, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Utility.attachWebScreenShotToReport(
			//	ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "Consumer login screen link");
	}
	public void clickAgreeConntinueBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickAgreeContinueBtn, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "Agree & continue button");
	}

	public void selectState(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectState, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.selectState, getWebDriver());
		
		Select select = new Select(element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		select.selectByVisibleText(state);
//		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void selectStateAgent(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectStateAgent, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectStateAgent, getWebDriver());
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void clickApplyOrRenew() throws InterruptedException {
		removeApplication();
		WebElement element = waitForElementToBeClickable(OR.clickApplyOrRenew, 30);
//		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "apply or renew button");
	}

	public void clickApplyOrRenewAgent() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickApplyOrRenewAgent, 30);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "apply or renew button");
	}

	public void clickNext() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickNext, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.clickNext, getWebDriver());
//		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "next button");
	}

	public void clickIAgreeCheckBox() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.iAgreeCheckBox, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.iAgreeCheckBox, getWebDriver());
		clickElement(element,
				" I agree to have my information used and retrieved from data sources for this application. I have consent for all people I'll list on the application for their information to be retrieved and used from data sources.");
	}

	public void clickIAllowCheckBox() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.iAllowCheckBox, 30);
//		Wait.waitForElement(getWebDriver(), element);
		clickElement(element,
				"I allow Jet Health Solutions to access my application to help me apply for health coverage.");
	}

	public void clickIUnderstandCheckBox() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.iUnderstandCheckBox, 30);
//		Wait.waitForElement(getWebDriver(), element);
		clickElement(element,
				"I understand that I�m required to provide true answers and that I may be asked to provide additional information, including proof of my eligibility for a Special Enrollment Period, if I qualify. If I don�t, I may face penalties, including the risk of losing my eligibility for coverage.");
	}

	public String enterDOB_S010(String age, String count)throws InterruptedException {
		WebElement element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Date of birth')]/../..//following-sibling::div//input)[2]"),60);
		
		String dob = ESTTimeZone.getDobFromAge(age);
		//Wait.waitForElement(getWebDriver(), element);
		//sendKeysToElement(element, dob, " Date of birth");
		ExtentTestManager.getTest().info("Second Person Age Selected: " + age);
		
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Date of birth')]/../..//following-sibling::div//input)[4]"),60);
			Wait.waitForElement(getWebDriver(), element);
			sendKeysToElement(element, dob, " Date of birth");
			ExtentTestManager.getTest().info("Third Person Age Selected: " + age );
		}
		
		if (count.contains("3")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Date of birth')]/../..//following-sibling::div//input)[6]"),60);
			Wait.waitForElement(getWebDriver(), element);
			sendKeysToElement(element, dob, " Date of birth");
			ExtentTestManager.getTest().info("Fourth Person Age Selected: " + age );
		}
		
		if (count.contains("4")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Date of birth')]/../..//following-sibling::div//input)[8]"),60);
			Wait.waitForElement(getWebDriver(), element);
			sendKeysToElement(element, dob, " Date of birth");
			ExtentTestManager.getTest().info("Fifth Person Age Selected: " + age );
		}
		
		if (count.contains("5")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Date of birth')]/../..//following-sibling::div//input)[10]"),60);
			Wait.waitForElement(getWebDriver(), element);
			sendKeysToElement(element, dob, " Date of birth");
			ExtentTestManager.getTest().info("Fifth Person Age Selected: " + age );
		}
		
		if (count.contains("6")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Date of birth')]/../..//following-sibling::div//input)[12]"),60);
			Wait.waitForElement(getWebDriver(), element);
			sendKeysToElement(element, dob, " Date of birth");
			ExtentTestManager.getTest().info("Sixth Person Age Selected: " + age );
		}	
		return dob;
	}
	/*
	public boolean clickSaveAndContinueButton() throws InterruptedException {
//		Wait.wait3Second();
		WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 30);
		if(element != null) {
			Wait.waitUntilPageIsLoaded(getWebDriver());
			Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
			Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
			Utility.scrollToElement(element, getWebDriver());
			clickElement(element, "save and continue button");
			return true;
		}else{
			return false;
		}
	}
	*/
	public boolean clickSaveAndContinueButton() throws InterruptedException {
//		Wait.wait3Second();
		try {
			WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 30);
			//Wait.waitUntilPageIsLoaded(getWebDriver());
			//Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
			//Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
			Utility.scrollToElement(element, getWebDriver());
			clickElement(element, "save and continue button");
			Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
			return true;
		} catch(Exception e) {
			System.out.println("Save and Continue button Exception: " + e.getMessage());
		} finally {
			Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
//			System.out.println("Unable to press Save and Continue button");
		}
		return false;
	}
	
	/*
	public void clickSaveAndContinueButton() throws InterruptedException {
//      Wait.wait3Second();
      try {
              WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 30);
	      WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 60);
	      Wait.waitForElement(getWebDriver(), element);
	              //Wait.waitUntilPageIsLoaded(getWebDriver());
	      Wait.waitUntilPageIsLoaded(getWebDriver());
	              //Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
	      Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
	      Wait.wait2Second();
	              //Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
	      //Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
	      Wait.wait2Second();
	      //Wait.waitUntilPageIsLoaded(getWebDriver());
	              Utility.scrollToElement(element, getWebDriver());
	      Utility.scrollToElement(element, getWebDriver());
	              clickElement(element, "save and continue button");
	      clickElement(element, "save and continue button");
      }
	}
	*/
	
	public void clickContinueAgent() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickContinueAgent, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickContinueAgent, getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, "continue button");
	}

	public void needCoverage(String decision, String personCount) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span[contains(text(),'" + decision + "')])[" + personCount + "]"), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			//ExtentTestManager.getTest().info("click " + decision + " for lose qulifying health coverage Recent");
		} catch (Exception e) {
			getWebDriver().navigate().refresh();
//			Wait.wait2Second();
			clickElement(element, decision + " for lose qulifying health coverage Recent");
		}
	}

	public void refreshPage() {
		getWebDriver().navigate().refresh();
	}
	
	public void selectGender(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		element.click();
		clickElement(element, "on " + decision + " for gender");
	}

	public String enterDob(String age) {
		WebElement element = waitForElementToBePresent(OR.enterDOB, 30);
		String dob = ESTTimeZone.getDobFromAge(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}
	
	public String enterDobS035(String age) {
        WebElement element = waitForElementToBePresent(OR.enterDOBS035, 60);
        String dob = ESTTimeZone.getDobFromAge(age);
        sendKeysToElement(element, dob, " Date of birth");
        return dob;
	}
	
	
	
	public String enterDob(String age, int applNumber) {
		WebElement element;
		element = waitForElementToBePresent(OR.enterDOB, 30);
		if(applNumber == 1) {
			element = waitForElementToBePresent(OR.enterDOB, 30);	
		} else if(applNumber == 2) {
			element = waitForElementToBePresent(OR.enterDOB2, 30);
		} else if(applNumber == 3) {
			element = waitForElementToBePresent(OR.enterDOB3, 30);
		} else if(applNumber == 4) {
			element = waitForElementToBePresent(OR.enterDOB4, 30);
		} else if(applNumber == 5) {
			element = waitForElementToBePresent(OR.enterDOB5, 30);
		} else if(applNumber == 6) {
			element = waitForElementToBePresent(OR.enterDOB6, 30);
		} else if(applNumber == 7) {
			element = waitForElementToBePresent(OR.enterDOB7, 30);
		}
		String dob = ESTTimeZone.getDobFromAge(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}
	
	public String enterDobLow(String age) {
		WebElement element = waitForElementToBePresent(OR.enterDOB, 30);
		String dob = ESTTimeZone.getDobFromAgeLow(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}

	public void enterFirstNameAgent(String firstName) {
		WebElement element = waitForElementToBePresent(OR.enterFirstNameAgent, 30);
		sendKeysToElement(element, firstName, " first name");
	}

	public void enterFirstName(String firstName) {
		WebElement element = waitForElementToBePresent(OR.enterFirstName, 30);
		sendKeysToElement(element, firstName, " first name");
	}

	public void enterMiddleName(String middleName) {
		WebElement element = waitForElementToBePresent(OR.enterMiddleName, 30);
		sendKeysToElement(element, middleName, " middle name");
	}

	public void enterLastNameAgent(String lastName) {
		WebElement element = waitForElementToBePresent(OR.enterLastNameAgent, 30);
		sendKeysToElement(element, lastName, " last name");
	}

	public void enterLastName(String lastName) {
		WebElement element = waitForElementToBePresent(OR.enterLastName, 30);
		sendKeysToElement(element, lastName, " last name");
	}

	public void enterStreetAddress(String streetAddress) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterStreetAddress, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, streetAddress, " street address");
	}

	public void selectStateInContactInfo(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectStateInContactInfo, 30);
		//Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void selectStateInContactInfoOnSamePage(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectStateInContactInfoOnSamePage, 30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void enterCity(String city) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterCity, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, city, " city");
	}

	public void enterOtherRace(String race) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterOtherRace, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, race, " race");
	}

	public void enterZipCode(String zipCode) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterZipCode, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, "25456", " zipCode");
		//Wait.wait2Second();
		element.sendKeys(Keys.TAB);
		//Wait.wait2Second();
		sendKeysToElement(element, zipCode, "zip code");
		element.sendKeys("" + Keys.TAB);
		//Wait.wait2Second();
	}
	
	public void enterMovedZipCode1(String zipCode) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterMovedZipCode1, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, "25456", " zipCode");
		Wait.wait2Second();
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
		sendKeysToElement(element, zipCode, "zip code");
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
	}

	public void enterZipCode2OnSamePage(String zipCode) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterZipCode2OnSamePage, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, "25456", " zipCode");
		Wait.wait2Second();
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
		sendKeysToElement(element, zipCode, "zip code");
		element.sendKeys(Keys.TAB);
		Wait.wait2Second();
	}

	public void selectAddress() throws InterruptedException {
		try {
//			Wait.wait2Second();
			// select address
			WebElement element = waitForElementToBeClickable(OR.addressRadiobtn3, 5);
			//Wait.waitForElement(getWebDriver(), element);
			clickElement(element, "address radio button");

			// click Continue
			WebElement elementContinue = waitForElementToBeClickable(OR.continueAddressBtn, 5);
			//Wait.waitForElement(getWebDriver(), elementContinue);
			Utility.attachWebScreenShotToReport(
					ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
			clickElement(elementContinue, "continue button");
		} catch (Exception e) {
		}
	}
	public void selectAddress2() throws InterruptedException {
		try {
//			Wait.wait2Second();
			// select address
			WebElement element = waitForElementToBeClickable(OR.addressRadiobtn3, 5);
			//Wait.waitForElement(getWebDriver(), element);
			clickElement(element, "address radio button");

			// click Continue
			WebElement elementContinue = waitForElementToBeClickable(OR.continueAddressBtn, 5);
			//Wait.waitForElement(getWebDriver(), elementContinue);
			Utility.attachWebScreenShotToReport(
					ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
			clickElement(elementContinue, "continue button");
			clickElement(elementContinue, "continue button");
		} catch (Exception e) {
		}
	}

	public void selectMailingAddress(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 10);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for mailing address");
	}
	public void enterPhoneNumber_S004(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumber_S004, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
		element.sendKeys(Keys.TAB);
	}

	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumberJobB2, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
		element.sendKeys(Keys.TAB);
	}
	
	public void enterPhoneNumber2(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumber2, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
		element.sendKeys(Keys.TAB);
	}
	public void enterPhoneNumber3(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumber3, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
		element.sendKeys(Keys.TAB);
	}

	public void enterPhoneNumberJobB(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumberJobB, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
	}
	
	public void enterPhoneNumberJobB2(String phoneNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPhoneNumberJobB2, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " phone number");
	}

	public void enterPhoneNumber4(String phoneNumber) throws InterruptedException {
		By path = By.xpath("//input[contains(@aria-label,'s phone number')]");
		WebElement element = waitForElementToBeClickable(path, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " Employer phone number");
	}
	
	public void ptc151Enter2PhonesNumber(String name, String phoneNumber) throws InterruptedException {
		By path = By.xpath("//span[contains(text(),'Tell us more about "+name+"')]//following::input[6]");
		WebElement element = waitForElementToBeClickable(path, 30);
		sendKeysToElement(element, phoneNumber, " Employer phone number");
	}

	public void enterPhoneNumber_S69E(String phoneNumber) throws InterruptedException {
		By path = By.xpath("(//input[@class='form-control'])[2]");
		WebElement element = waitForElementToBePresent(path, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, phoneNumber, " Employer phone number");
		Wait.wait2Second();
	}
	
	public void enterPhoneNumber_S69E2(String phoneNumber) throws InterruptedException {
        By path = By.xpath("(//input[@class='form-control'])[13]");
        WebElement element = waitForElementToBePresent(path, 60);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitForElement(getWebDriver(), element);
        sendKeysToElement(element, phoneNumber, " Employer phone number");
        sendKeysToElement(element, phoneNumber, " Employer phone number");
        Wait.wait2Second();
        Wait.wait2Second();
	}
	
	public void selectPhoneType(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("//span[contains(text(),'" + decision + "')]//parent::span//parent::label"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.wait2Second();
		clickElement(element, "on " + decision + " for phone type");
	}

	public void selectWrittenLanguage(String language) throws Exception {
		WebElement element = waitForElementToBePresent(OR.selectWrittenLanguage, 30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(language);
		ExtentTestManager.getTest().info("Written language selected: " + language);
	}

	public void selectSpokenLanguage(String language) throws Exception {
		WebElement element = waitForElementToBePresent(OR.selectSpokenLanguage, 30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(language);
		ExtentTestManager.getTest().info("Spoken language selected: " + language);
	}

	public void selectNoticeMedium(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for notice medium");
	}
	
	public void selectNoticeMediumEmail(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for notice medium as Email");
	}
	
	public void selectNoticeMediumEmailAt(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for notice medium as Email at address");
	}
	

	public void selectIsProfessnalHelping(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]//parent::span//parent::label"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " for professional helping");
	}

	public void selectHelpPayingForCoverage(String decision) throws InterruptedException {
		if (decision.equals("No")) {
			//Wait.wait2Second();
			String path = "//span//span[contains(text(),'" + decision + "')]";
			WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
			//Wait.waitForElement(getWebDriver(), element);
			//Wait.waitUntilPageIsLoaded(getWebDriver());
			//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
			clickElement(element, "on " + decision + " No for seeking coverage");
			
		} else if (decision.equals("Yes")) {
			Wait.wait2Second();
			String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
			WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
			//Wait.waitForElement(getWebDriver(), element);
			//Wait.waitUntilPageIsLoaded(getWebDriver());
			//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
			//Wait.wait2Second();
			clickElement(element, "on " + decision + " for seeking coverage");
	
		}
		/*
		 * String path = "//span//span[contains(text(),'" + decision + "')]"; WebElement
		 * element = waitForElementToBeClickable(By.xpath(path), 30);
		 * Wait.waitForElement(getWebDriver(), element);
		 * Wait.waitUntilPageIsLoaded(getWebDriver());
		 * Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		 * Wait.wait2Second(); clickElement(element, "on " + decision +
		 * " for seeking coverage");
		 */
	}

	public void clickAddPerson() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickAddPerson, 30);
		//Wait.waitForElement(getWebDriver(), element);
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, " add a person");
	}
	
	public void clickAddPerson2() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickAddPerson2, 30);
		//Wait.waitForElement(getWebDriver(), element);
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, " add a person");
	}

	public void clickWithOutSSN() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.withOutSSN, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(OR.withOutSSN, getWebDriver());
		clickElement(element, " with out SSN");
	}

	public void clickContinueWithoutSsnBtn() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.continueWithoutSsnButton, 30);
		//Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue button");
	}

	public void enterSSN(String ssn, String sameNameQuestion) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterSSN, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, ssn, " SSN number");
		element.sendKeys(Keys.TAB);
		//Wait.wait2Second();
		String question = getS012SameNameQuestion();
		ExtentTestManager.getTest().info("Expected: " + sameNameQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, sameNameQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S012");
		verifyMasking(element, ssn);
	}
	
	public void verifyMasking(WebElement element, String ssnValue) throws InterruptedException {
		String ssn = element.getAttribute("value");
//		System.out.println("594: " + element.getAttribute("value"));
		int count = 0;
		for(int i = 0; i < ssn.length(); i++) {    
            if(ssn.charAt(i) == '*')    
                count++;
        }
		if(count < 5) {
//			showMessageDialog(null, "Masking is Not working fine for SSN [" + ssnValue + "]");
			System.out.println("Masking is Not working fine for SSN [" + ssnValue + "]");
		}
	}

	public void selectWithSameName(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for same name");
	}

	public void selectUSCitizenOrNot(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for US Citizen");
	}

	public String getS017DocumentQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s017 document question");
		return question;
	}

	public String getS017DocumentDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s017 document drawer heading");
		return heading;
	}

	public String getS017DocumentDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s017 drawer content");
		return content;
	}

	public void clickS017DocumentOpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s017DocumentOpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s017 document drawer");
	}

	public void selectNaturalizedOrDrived(String decision, String expectedDocumentQuestion, String drawerHeading,
			String drawerContent) throws InterruptedException {
		//Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(By.xpath("//span[contains(text(),'" + decision + "')]"), getWebDriver());
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		clickElement(element, decision + " for naturalized or drived");
		clickElement(element, decision + " a naturalized or drived");
		//Wait.wait2Second();
		if (decision.equals("Yes")) {
			String questionFound = getS017DocumentQuestion();
			String question = questionFound.replace("\n", " ");
			ExtentTestManager.getTest().info("Expected: " + expectedDocumentQuestion);
			ExtentTestManager.getTest().info("Found: " + question);
			Assert.assertEquals(question, expectedDocumentQuestion, "Failed to verify: " + question);
			ExtentTestManager.getTest().info("Verified: " + question + " on document drawer S017");

//			clickS017DocumentOpenDrawerLink();
//			clickS017DocumentOpenDrawerLink();
//
//			String actualDrawerHeading = getS017DocumentDrawerHeading();
//			ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//			Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on document drawer S017");
//
//			String drawerContentFound = getS017DocumentDrawerContent();
//			String actualDrawerContent = drawerContentFound.replace("\n", "");
//			ExtentTestManager.getTest().info("Expected: " + drawerContent);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//			Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on document drawer S017");

		} else {

		}

	}

	public String getS017DocumentSubQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentSubQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s017 document sub question");
		return question;
	}

	public String getS017DocumentSubDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentSubDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s017 sub document drawer heading");
		return heading;
	}

	public String getS017DocumentSubDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DocumentSubDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s017 sub drawer content");
		return content;
	}

	public void clicks017DocumentSubOpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s017DocumentSubOpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s017 sub document drawer");
	}

	public void selectDocumentType(String decision, String expectedDocumentQuestion, String drawerHeading,
			String drawerContent) throws InterruptedException {
		Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]//parent::span//parent::label//parent::div"), 30);
//		WebElement element = waitForElementToBeClickable(By.xpath("//input[@value='CERTIFICATE_OF_NATURALIZATION']"), 30);
//		WebElement element = waitForElementToBeVisible(By.xpath("//input[@value='CERTIFICATE_OF_NATURALIZATION']"), 15);
		WebElement element = waitForElementToBeVisible(By.xpath("//a[text()='Learn more about these documents.']//following::label[1]"), 15);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for document");

		if (decision.equals("Naturalization certificate") || decision.equals("Certificate of citizenship")) {
			String questionFound = getS017DocumentSubQuestion();
			String question = questionFound.replace("\n", " ");
			ExtentTestManager.getTest().info("Expected: " + expectedDocumentQuestion);
			ExtentTestManager.getTest().info("Found: " + question);
			Assert.assertEquals(question, expectedDocumentQuestion, "Failed to verify: " + question);
			ExtentTestManager.getTest().info("Verified: " + question + " on document drawer S017");

//			clicks017DocumentSubOpenDrawerLink();
//			clicks017DocumentSubOpenDrawerLink();
//
//			String actualDrawerHeading = getS017DocumentSubDrawerHeading();
//			ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//			Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on document drawer S017");
//
//			String drawerContentFound = getS017DocumentSubDrawerContent();
//			String actualDrawerContent = drawerContentFound.replace("\n", "");
//			ExtentTestManager.getTest().info("Expected: " + drawerContent);
//			ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//			Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//			ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on document drawer S017");

		} else {

		}
	}

	public void enterAlienNumber(String alienNumber) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBePresent(OR.enterAlienNumber, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, alienNumber, "Alien Number");
	}

	public void enterNaturalizedNumber(String alienNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterNaturalizeNumber, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, alienNumber, "Naturalize Number");
	}

	public void clickSaveAndContinueScrolled() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.saveAndContinueButton, 90);
		Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(OR.saveAndContinueButton, getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "next button");
	}

	public void selectSitutionHouseHold_S050A(String situation) throws InterruptedException {
		//Wait.wait2Second();
		String path = "//span[contains(text(),'" + situation + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, situation + " for situation in house hold");
	}

	public void haveICHRAandQSEHRA_S069D(String decision) throws InterruptedException {
		String path = "//span[contains(text(),'" + decision + "')]";
//		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		WebElement element = waitForElementToBeVisible(By.xpath(path), 30);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for ICHRA and QSEHRA");
	}

	public void haveICHRAandQSEHRA_PTC162S069D(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and text()='"+decision+"']";
		WebElement element = waitForElementToBeVisible(By.xpath(path), 30);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for ICHRA and QSEHRA");
	}
	
	public void texasBenefitPlanThruJob_S082(String decision) throws InterruptedException {
		String path = "//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path), 30);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " Texas Benefit Plan Through Job");
	}

	public void loseQualifyingHealthCovRecent_S083(String decision) throws InterruptedException {
//		String path = "//span[@style='position: static;' and text()='" + decision + "']";
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	/*
	// Faizan
	public void loseQualifyingHealthCovRecent_S083(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]//parent::span";
		WebElement element = waitForElementToBeClickable(By.xpath(path),60);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait5Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	*/
	public void loseQualifyingHealthCovRecent_PTC043S083(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	
	public void loseQualifyingHealthCovRecent_PTC044S083(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and contains(text(),'"+decision+"')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	
	public void loseQualifyingHealthCovRecent_PTC048S083(String decision) throws InterruptedException {
		String path = "//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	public void loseQualifyingHealthCovRecent_PTC077S083(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	public void loseQualifyingHealthCovRecent_PTC087S083(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	
	public void loseQualifyingHealthCovRecent_3AS083(String decision) throws InterruptedException {
//		String path = "//span//span[contains(text(),'" + decision + "')]//parent::span";
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
//		WebElement element = waitForElementToBeClickable(By.xpath(path),30);
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}
	
	public void loseQualifyingHealthCovRecent_2FS083(String decision) throws InterruptedException {
//		String path = "//span//span[contains(text(),'" + decision + "')]//parent::span";
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
//		WebElement element = waitForElementToBeClickable(By.xpath(path),30);
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}

	public void loseQualifyingHealthCovUpcoming_S084(String decision) throws InterruptedException {
//		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]//parent::span";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Upcoming");
		}
	}
	public void loseQualifyingHealthCovUpcoming_3AS084(String decision) throws InterruptedException {
//		String path = "//span//span[contains(text(),'" + decision + "')]//parent::span";
		String path = "//span[@style='position: static;' and contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeVisible(By.xpath(path),30);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for lose qualifying health coverage Recent");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for lose qualifying health coverage Recent");
		}
	}

	public void recentChanges_S085(String decision) throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
//		Wait.waitForElement(getWebDriver(), element);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " for Recent coverage");
		} catch (Exception e) {
			//Wait.wait2Second();
			clickElementMethod2(element, decision + " for Recent coverage");
		}
	}

	public void agreeOne() throws InterruptedException {
		WebElement element = waitForElementToBeVisible(OR.agreeOne, 30);
		clickElement(element, " agree statement");
	}
	/*
	 // Faizan
	public void agreeOne() throws InterruptedException {
//		Wait.wait5Second();
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.agreeOne, 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.agreeOne, getWebDriver());
		clickElement(element, " agree statement");
	}
	 */
	public void agreeOne1() throws InterruptedException {
		WebElement element = waitForElementToBeVisible(OR.agreeOne1, 30);
		clickElement(element, " agree statement");
	}

	public void agreeTwo() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.agreeTwo, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.agreeTwo, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeTwoNew() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.agreeTwoNew, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.agreeTwoNew, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeThree() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.agreeThree, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.agreeThree, getWebDriver());
		clickElement(element, " agree statement");
	}

	public void agreeFour() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.agreeFour, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.agreeFour, getWebDriver());
		clickElement(element, " agree statement");
	}
	
	public void agreeFive() throws InterruptedException {
		WebElement element = waitForElementToBeVisible(OR.agreeFive, 30);
		clickElement(element, " agree statement");
	}

	public void enterSignature(String signature) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.signature, 30);
		//Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, signature, "Signature field");
	}

//	public void selectCounty(String county) throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(By.xpath("//option[contains(text(),'" + county + "')]"), 30);
//		//Wait.waitForElement(getWebDriver(), element);
//		clickElement(element, " county");
//	}
	
	public void selectCounty(String county) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//option[contains(text(),'" + county + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElementMethod2(element, " county");
	}

	public void selectCountyOnSamePage(String county) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("(//option[contains(text(),'" + county + "')])[2]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county");
	}

//	public void clickCountyDropDown() throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(OR.county, 30);
//		//Wait.waitForElement(getWebDriver(), element);
//		clickElement(element, " county drop down");
//	}
	
	public void clickCountyDropDown() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.county, 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElementMethod2(element, " county drop down");
	}
	public void clickCountyDropDown2() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.county2, 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElementMethod2(element, " county drop down");
	}

	public void clickCountyDropDownOnSamePage() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.countyOnSamePage, 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county drop down");
	}

	public void downloadEligibilityReport() throws InterruptedException {
//		Wait.wait10Second();
		WebElement element = waitForElementToBeClickable(OR.eligibilityNoticeButton, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitForElementToBeVisibile(OR.eligibilityNoticeButton, getWebDriver());
//		Wait.wait15Second();
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.wait10Second();
		Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " download eligibility notice");
//		Wait.wait2Second();
//		Wait.wait10Second();
		String currentTab = getWebDriver().getWindowHandle();
		ArrayList<String> tabs2 = new ArrayList<String>(getWebDriver().getWindowHandles());
		for (String handles : tabs2) {
			if (!currentTab.equalsIgnoreCase(handles)) {
				getWebDriver().switchTo().window(tabs2.get(1));
				//Wait.wait10Second();
				getWebDriver().close();
			}
			getWebDriver().switchTo().window(tabs2.get(0));
		}
		Wait.wait3Second();
	}

	public void selectRelation3G_S28(String relation, String secondRelation, String thirdRelation, String forthRelation,
			String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'')]//..//..//..//select[@class='form-control'])[1]"),
				60);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.wait5Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'')]//..//..//..//select[@class='form-control'])[2]"), 60);
			//Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'')]//..//..//..//select[@class='form-control'])[2]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 60);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}
	
	public void doYouClaimDependent_S027_4thIndex(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[4]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for dependent");
	}
	
	public void selectBabyCountP2(String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectBabyCount2, 60);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.selectBabyCount, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(count);
		ExtentTestManager.getTest().info("Baby count selected: " + count);
	}
	
	public void clickOpenMailingDrawer_S003() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.mailingDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of mailing drawer");
	}

	public String getMailingDrawerHeadingText() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.mailingDrawerHeader, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "mailing drawer heading");
		return heading;
	}

	public String getS003Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s003Question, 10);
		//Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s003 question");
		return question;
	}

	public String getS003Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s003Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s003 question");
		return question;
	}

	public String getDrawerLinkText() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.mailingDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		String link = getElementText(element, "mailing drawer link");
		return link;
	}

	public String getMailingDrawerContentText() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s003DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "mailing drawer content");
		return content;
	}

	public void verifyScreen_s003(String mailingLink, String mailingDrawerHeading, String s003Question, String drawerContent) throws InterruptedException {
		// Verifying Question: Is this also your mailing address?
		String question = getS003Question();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + s003Question);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], s003Question, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S003");
//		// Verifying Link Text: Learn how mailing address affects coverage.
//		String linkText = getDrawerLinkText();
//		ExtentTestManager.getTest().info("Expected: " + mailingLink);
//		ExtentTestManager.getTest().info("Found: " + linkText);
//		Assert.assertEquals(linkText, mailingLink, "Failed to verify: " + linkText);
//		ExtentTestManager.getTest().info("Verified: " + linkText + " on S003");
//
//		clickOpenMailingDrawer_S003();
//
		// Verifying mail address Drawer Heading: Learn how mailing address affects
		// coverage
//		String heading = getMailingDrawerHeadingText();
//		ExtentTestManager.getTest().info("Expected: " + mailingDrawerHeading);
//		ExtentTestManager.getTest().info("Found: " + heading);
//		Assert.assertEquals(heading, mailingDrawerHeading, "Failed to verify: " + heading);
//		ExtentTestManager.getTest().info("Verified: " + heading + " on S003");
//
//		String drawerContentFound = getMailingDrawerContentText();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S003");
	}

	public void verifyScreen_s003_question2(String s003Question) throws InterruptedException {

		// Verifying Question: Is this also your mailing address?
		String question = getS003Question2();
		ExtentTestManager.getTest().info("Expected: " + s003Question);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, s003Question, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S003");
	}

	public String getS001Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s001Question, 30);
		//Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s001 question");
		return question;
	}

	public void verifyS001(String expectedQuestion) throws InterruptedException {
		String question = getS001Question();
//		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
//		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		//ExtentTestManager.getTest().info("Verified: " + question + " on S001");
	}

	public String getS002Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s002Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s002 question");
		return question;
	}

	public void verifyS002(String expectedQuestion) throws InterruptedException {
		String question = getS002Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S002");
	}

	public String getS004Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s004Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s004 question");
		return question;
	}

	public void verifyS004(String expectedQuestion) throws InterruptedException {
		String question = getS004Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S004");
	}

	public String getS005Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s005 question");
		return question;
	}

	public String gets005QuestionExplaination() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005QuestionExplaination, 30);
		Wait.waitForElement(getWebDriver(), element);
		String explaination = getElementText(element, "s005 question Explaination");
		return explaination;
	}

	public void clickS005OpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s005OpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s005 drawer");
	}

	public String getS005DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s005 drawer heading");
		return heading;
	}

	public String getS005DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s005DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s005 drawer Content");
		return content;
	}

	public void verifyS005(String expectedQuestion, String expectedExplaination, String drawerHeading,
			String drawerContent) throws InterruptedException {
		String question = getS005Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S005");

//		String getExplaination = gets005QuestionExplaination();
//		String explaination = getExplaination.replace("\n", " ");
//		ExtentTestManager.getTest().info("Expected: " + expectedExplaination);
//		ExtentTestManager.getTest().info("Found: " + explaination);
//		Assert.assertEquals(explaination, expectedExplaination, "Failed to verify: " + explaination);
//		ExtentTestManager.getTest().info("Verified: " + explaination + " on S005");
//
//		clickS005OpenDrawer();
//
//		String actualDrawerHeading = getS005DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S005");
//
//		String drawerContentFound = getS005DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S005");

	}

	public String getS006Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s006Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s006 question");
		return question;
	}

	public void verifyS006(String expectedQuestion) throws InterruptedException {
		String question = getS006Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S006");
	}

	public String getS007Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s007Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s007 question");
		return question;
	}

	public void clickS007OpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s007OpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s007 drawer");
	}

	public String getS007DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s007DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s007 drawer heading");
		return heading;
	}

	public String getS007DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s007DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s007 drawer content");
		return content;
	}

	public void verifyS007(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String getQuestion = getS007Question();
		String question = getQuestion.replace("\n", " ");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S007");

//		clickS007OpenDrawer();
//
//		String actualDrawerHeading = getS007DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S007");
//
//		String drawerContentFound = getS007DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S007");
	}

	public String getS008Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s008Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s008Question, getWebDriver());
		String question = getElementText(element, "s008 question");
		return question;
	}

	public void verifyS008(String expectedQuestion) throws InterruptedException {
		String question = getS008Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S008");
	}

	public void clickS010MedicaidOpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010MedicareDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 medicaid drawer");
	}

	public void clickS010NotToIncludeOpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010NotIncludeDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 Not include drawer");
	}

	public void clickS010RemoveSomeOneOpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010EditOrRemoveDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 remove someone drawer");
	}

	public String getS010MedicaidDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010MedicareDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 medicaid drawer heading");
		return heading;
	}

	public String getS010NotIncludeDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010NotIncludeDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 not include drawer heading");
		return heading;
	}

	public String getS010RemoveSomeOneDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010EditOrRemoveDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 remove someone drawer heading");
		return heading;
	}

	public String getS010MedicaidDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010MedicareDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 medicaid drawer content");
		return heading;
	}

	public String getS010NotIncludeDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010NotIncludeDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 not include drawer content");
		return heading;
	}

	public String getS010RemoveSomeOneDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010EditOrRemoveDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010 remove someone drawer content");
		return heading;
	}

	public String getS010AppId() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.appID, 30);
		Wait.waitForElement(getWebDriver(), element);
		String id = getElementText(element, "Application Id: ");
		String[] idFound = id.split(" ");
		return idFound[2].trim();
	}

	public void verifyS010(String expectedMedicaidDrawerHeading, String expectedNotIncludeDrawerHeading,
			String expectedRemoveSomeOneDrawerHeading, String medicaidDrawerContent, String notIncludeDrawerContent,
			String RemoveSomeOneDrawerContent) throws InterruptedException {
		clickS010MedicaidOpenDrawer();
		String actualMedicaidDrawerHeading = getS010MedicaidDrawerHeading();
		ExtentTestManager.getTest().info("Expected: " + expectedMedicaidDrawerHeading);
		ExtentTestManager.getTest().info("Found: " + actualMedicaidDrawerHeading);
		Assert.assertEquals(actualMedicaidDrawerHeading, expectedMedicaidDrawerHeading,
				"Failed to verify: " + actualMedicaidDrawerHeading);
		ExtentTestManager.getTest().info("Verified: " + actualMedicaidDrawerHeading + " on S010");

		String drawerContentFound = getS010MedicaidDrawerContent();
		String actualDrawerContent = drawerContentFound.replace("\n", "");
		ExtentTestManager.getTest().info("Expected: " + medicaidDrawerContent);
		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
		Assert.assertEquals(actualDrawerContent, medicaidDrawerContent, "Failed to verify: " + actualDrawerContent);
		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S010");
		clickS010MedicaidOpenDrawer();

		clickS010NotToIncludeOpenDrawer();
		String actualNotIncludeDrawerHeading = getS010NotIncludeDrawerHeading();
		ExtentTestManager.getTest().info("Expected: " + expectedNotIncludeDrawerHeading);
		ExtentTestManager.getTest().info("Found: " + actualNotIncludeDrawerHeading);
		Assert.assertEquals(actualNotIncludeDrawerHeading, expectedNotIncludeDrawerHeading,
				"Failed to verify: " + actualNotIncludeDrawerHeading);
		ExtentTestManager.getTest().info("Verified: " + actualNotIncludeDrawerHeading + " on S010");

		drawerContentFound = getS010NotIncludeDrawerContent();
		actualDrawerContent = drawerContentFound.replace("\n", "");
		ExtentTestManager.getTest().info("Expected: " + notIncludeDrawerContent);
		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
		Assert.assertEquals(actualDrawerContent, notIncludeDrawerContent, "Failed to verify: " + actualDrawerContent);
		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S010");

		clickS010NotToIncludeOpenDrawer();

		clickS010RemoveSomeOneOpenDrawer();
		String actualRemoveSomeOneDrawerHeading = getS010RemoveSomeOneDrawerHeading();
		ExtentTestManager.getTest().info("Expected: " + expectedRemoveSomeOneDrawerHeading);
		ExtentTestManager.getTest().info("Found: " + actualRemoveSomeOneDrawerHeading);
		Assert.assertEquals(actualRemoveSomeOneDrawerHeading, expectedRemoveSomeOneDrawerHeading,
				"Failed to verify: " + actualRemoveSomeOneDrawerHeading);
		ExtentTestManager.getTest().info("Verified: " + actualRemoveSomeOneDrawerHeading + " on S010");

		drawerContentFound = getS010RemoveSomeOneDrawerContent();
		actualDrawerContent = drawerContentFound.replace("\n", "");
		ExtentTestManager.getTest().info("Expected: " + RemoveSomeOneDrawerContent);
		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
		Assert.assertEquals(actualDrawerContent, RemoveSomeOneDrawerContent,
				"Failed to verify: " + actualDrawerContent);
		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S007");
		clickS010RemoveSomeOneOpenDrawer();

		String appId = getS010AppId();
		System.out.println(appId);
		ExtentTestManager.getTest().info(appId);
	}

	public String getS012Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.so12Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s012 question");
		return question;
	}

	public String getS012SameNameQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s012SameNameQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s012 same name question");
		return question;
	}

	public void verifyS012(String expectedQuestion) throws InterruptedException {
		String question = getS012Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S012");
	}

	public void verifyS012Optional(String expectedQuestion) throws InterruptedException {
		String questionFound = getS012Question();
		String[] question = questionFound.split("");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S012");
	}

	public String getS014Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s014Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s014 question");
		return question;
	}

	public void clickS014OpenDrawer() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s014OpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s014 drawer");
	}

	public String getS014DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s014DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s014 heading");
		return heading;
	}

	public String getS014DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s014DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s014 drawer content");
		return content;
	}

	public void verifyS014(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
		String question = getS014Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S014");

//		clickS014OpenDrawer();
//
//		String actualDrawerHeading = getS014DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S014");
//
//		String drawerContentFound = getS014DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S014");
	}
	
	public boolean verifyS015(String expectedQuestion) throws InterruptedException {
//		WebElement element = waitForElementToBePresent(By.xpath("//b[contains(text(), 'Does this match the name and date of birth on "+expectedQuestion+"'s Social Security card?')]"), 30);
		try {
			WebElement element = waitForElementToBePresent(By.xpath("//b[contains(text(), 'Please confirm the information below is correct and try again')]"), 10);
			Wait.waitForElement(getWebDriver(), element);
			Wait.waitUntilPageIsLoaded(getWebDriver());
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public String getS017Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s017Question, getWebDriver());
		String question = getElementText(element, "s017 question");
		return question;
	}

	public void clickS017OpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s017OpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010 medicaid drawer");
	}

	public String getS017DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s017 heading");
		return heading;
	}

	public String getS017DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s017DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s017 drawer content");
		return content;
	}

	public void verifyS017(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
		String question = getS017Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S017");

//		clickS017OpenDrawerLink();
//
//		String actualDrawerHeading = getS017DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S017");
//
//		String drawerContentFound = getS017DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S017");
	}

	public String getS050AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s050AQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s050A question");
		return question;
	}

	public void verifyS050A(String expectedQuestion) throws InterruptedException {
		String question = getS050AQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S050A");
	}
	
	public String getS094Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s094Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "S094 question");
		return question;
	}
	
	public void verifyS094(String expectedQuestion) throws InterruptedException {
		String question = getS094Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S094");
	}

	public String getS069DQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069DQuestion, 30);
//		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.s069DQuestion, getWebDriver());
		String question = getElementText(element, "s069D question");
		return question;
	}

	public String getS069DDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069DDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s069D heading");
		return heading;
	}

	public String getS069DDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069DDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s069D drawer content");
		return content;
	}
	
	public void verifyS069D(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
//		Wait.wait2Second();
		String questionFound = getS069DQuestion();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S069D");

//		clickS069DOpenDrawerLink();
//
//		String actualDrawerHeading = getS069DDrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S069D");
//
	}

	public String getS082Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s082Question, 30);
//		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.s069DQuestion, getWebDriver());
		String question = getElementText(element, "s082 Question");
		return question;
	}
	
//	public void verifyS082(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
	public void verifyS082(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String questionFound = getS082Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S082D");
	}

	public String getS083Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s083Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s083Question, getWebDriver());
		String question = getElementText(element, "s083 question");
		return question;
	}

	public void clickS083OpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s083OpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s083 drawer");
	}

	public String getS083DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s083DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s083 drawer heading");
		return heading;
	}

	public String getS083DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s083DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s083 drawer content");
		return content;
	}

	public void verifyS083(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		Wait.wait2Second();
		String question = getS083Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S083");
//
//		clickS083OpenDrawerLink();
//
//		String actualDrawerHeading = getS083DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S083");
//
//		String drawerContentFound = getS083DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S083");
	}

	public String getS085Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s085Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s085 question");
		return question;
	}
	public String getPTC079S085Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s085Question1, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s085 question");
		return question;
	}

	public void verifyS085(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String questionFound = getS085Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S085");
	}
	
	public String getS087Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s087Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s087 question");
		return question;
	}
	public void verifyS087(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String questionFound = getS085Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S087");
	}
	public void verifyPTC079S085(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String questionFound = getS085Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S085");
	}

	public String getS084Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s084Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s084 question");
		return question;
	}

	public void clickS084OpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s084OpenDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s084 drawer");
	}

	public String getS084DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s084DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s084 drawer heading");
		return heading;
	}

	public void verifyS084(String expectedQuestion, String drawerHeading) throws InterruptedException {
		Wait.wait2Second();
		String question = getS084Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S084");

//		clickS084OpenDrawerLink();
//
//		String actualDrawerHeading = getS084DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S083");
	}
	
	public void verifyS089(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String question = getS089Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S089");
	}
	
	public String getS089Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s089Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s084 question");
		return question;
	}
	

	public void clickReviewOpenDrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.reviewDrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of review drawer");
	}

	public String getReviewDrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.reviewDrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "review drawer heading");
		return heading;
	}

	public String getReviewDrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.reviewDrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s083 drawer content");
		return content;
	}

	public void verifyReviewScreen(String drawerHeading, String drawerContent) throws InterruptedException {
//		Wait.wait2Second();
//		clickReviewOpenDrawerLink();
//
//		String actualDrawerHeading = getReviewDrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on review");
//
//		String drawerContentFound = getReviewDrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on review screen");
	}

	public void selectRelation_RelationShip(String relation, String secondRelation, String thirdRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}

	}

	public void selectRelation1_L_Relationship(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation3G_S27_Relationship(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation1_O_Relationship(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String fifthRelation, String sixthRelation, String seventhRelation,
			String eighthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
		if (count.contains("5")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);
		}
		if (count.contains("6")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);
		}
		if (count.contains("7")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[7]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);
		}
		if (count.contains("8")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[7]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'Relationship ')]//..//..//..//select[@class='form-control'])[8]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(eighthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + eighthRelation);
		}
	}

	public void selectRelation(String relation, String secondRelation, String thirdRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			//Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		/*
		// Faizan
		if (count.contains("3")) {
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 60);
			//Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		*/
		if (count.contains("4")) {
			/*
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			*/
			element = waitForElementToBePresent(By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
	}

	public void selectRelation1_L(String relation, String secondRelation, String thirdRelation, String forthRelation, String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation3G_S27(String relation, String secondRelation, String thirdRelation, String forthRelation,
			String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
	}

	public void selectRelation1_O(String relation, String secondRelation, String thirdRelation, String forthRelation,
			String fifthRelation, String sixthRelation, String seventhRelation, String eighthRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
		if (count.contains("5")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);
		}
		if (count.contains("6")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[6]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);
		}
		if (count.contains("7")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[6]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[7]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);
		}
		if (count.contains("8")) {

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[2]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[3]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[4]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[5]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[6]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[7]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(seventhRelation);
			ExtentTestManager.getTest().info("Relation selected: " + seventhRelation);

			element = waitForElementToBePresent(By.xpath(
					"(//span[contains(text(),'This person is ')]//..//..//..//select[@class='form-control'])[8]"), 30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(eighthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + eighthRelation);
		}
	}

	public void selectRelation3H_S038(String relation, String secondRelation, String thirdRelation,
			String forthRelation, String fifthRelation, String sixthRelation, String count)
			throws InterruptedException {
		WebElement element = waitForElementToBePresent(
				By.xpath("(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[1]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(relation);
		ExtentTestManager.getTest().info("Relation selected: " + relation);
		if (count.contains("2")) {
			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);
		}
		if (count.contains("3")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);
		}
		if (count.contains("4")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);
		}
		if (count.contains("5")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);
		}
		if (count.contains("6")) {

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[2]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(secondRelation);
			ExtentTestManager.getTest().info("Relation selected: " + secondRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[3]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(thirdRelation);
			ExtentTestManager.getTest().info("Relation selected: " + thirdRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[4]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(forthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + forthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[5]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(fifthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + fifthRelation);

			element = waitForElementToBePresent(
					By.xpath(
							"(//span[contains(text(),'relationship ')]//..//..//..//select[@class='form-control'])[6]"),
					30);
			Wait.waitForElement(getWebDriver(), element);
			select = new Select(element);
			select.selectByVisibleText(sixthRelation);
			ExtentTestManager.getTest().info("Relation selected: " + sixthRelation);
		}
	}

	public void selectToRemovePerson(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
	//	Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for remove person");
	}

	public String getS010AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010AQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s010A question");
		return question;
	}

	public void clickS010ADrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s010ADrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s010A drawer");
	}

	public String getS010ADrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010ADrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s010A drawer heading");
		return heading;
	}

	public String getS010ADrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010ADrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s010A drawer content");
		return content;
	}

	public void verifyS010A(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String question = getS010AQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S010A");

//		clickS010ADrawerLink();
//
//		String actualDrawerHeading = getS010ADrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on S010A");
//
//		String drawerContentFound = getS010ADrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on S010A");
	}

	public void selectMaritalStatus(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for marital status");
	}

	public String getS026Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s026 question");
		return question;
	}
	public String getS026Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s026 question2");
		return question;
	}

	public void clickS026DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s026DrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s026 drawer");
	}

	public String getS026DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s026 drawer heading");
		return heading;
	}

	public String getS026DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s026DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s026 drawer content");
		return content;
	}

	public void verifyS026(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
		String question = getS026Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s026");

//		clickS026DrawerLink();
//
//		String actualDrawerHeading = getS026DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s026");
//
//		String drawerContentFound = getS026DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s026");
	}
	public void verifyS026Q2(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
		String question = getS026Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s026");
	}

	public void selectIsFilingTax(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for filling jointly");
	}

	public void selectIsFilingTaxMarriedNotFillingJointlyQuestion2_S027(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for filling jointly");
	}

	public void selectIsAnyDependent(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " for is there any dependent");
	}

	public void selectIsAnyDependentMarriedButFillingSeprate_027(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " for is there any dependent");
	}

	public void areYouHeadOfHouseHold_027_4thIndex(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[5]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " live on this address");
	}

	public void doesApplicantAndSpouseLiveTogather_027(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[4]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " applicant and spouse live togather");
	}

	public void doesApplicantFileAsHouseHold_027(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[5]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "on " + decision + " applicant filling tax as house hold");
	}

	public void selectDependent(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for dependent");
	}

	public void doYouClaimDependent_S027_3rdIndex(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[3]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " for dependent");
	}

	public String getS027Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 question");
		return question;
	}

	public String getS027QuestionSingle2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionSingle2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 question");
		return question;
	}

	public void verifyS027Single2(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS027QuestionSingle2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s027");
	}

	public void clickS027DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s027DrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s027 drawer");
	}

	public String getS027DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s027 drawer heading");
		return heading;
	}

	public String getS027DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s027 drawer content");
		return content;
	}

	public void verifyS027(String expectedQuestion, String drawerHeading, String drawerContent) throws InterruptedException {
		String questionFound = getS027Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s027");

//		clickS027DrawerLink();
//
//		String actualDrawerHeading = getS027DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s027");
//
//		String drawerContentFound = getS027DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s027");
//		clickS027DrawerLink();
	}

	public String getS027QuestionDependent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionDependent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 Dependent question");
		return question;
	}

	public void clickS027DrawerLinkDependent() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s027DrawerLinkDependent, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s027 Dependent drawer");
	}

	public String getS027DrawerHeadingDependent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerHeadingDependent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s027 Dependent drawer heading");
		return heading;
	}

	public String getS027DrawerContentDependent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027DrawerContentDependent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s027 Dependent drawer content");
		return content;
	}

	public void verifyS027Dependent(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String questionFound = getS027QuestionDependent();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s027 Dependent");

//		clickS027DrawerLinkDependent();
//
//		String actualDrawerHeading = getS027DrawerHeadingDependent();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s027 Dependent");
//
//		String drawerContentFound = getS027DrawerContentDependent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s027 Dependent");
	}

	public String getS027QuestionDependent3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionDependent3, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 Dependent question");
		return question;
	}

	public void verifyS027Dependent3(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String questionFound = getS027QuestionDependent3();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s027 Dependent");
	}

	public void selectDoTheyLiveTogather(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " living togather");
	}
	public void selectEveryOneWhoLiveAtThisAddress_S041A(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "on " + decision + " Living at the address");
	}

	public String getS041AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041AQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s041A question");
		return question;
	}

	public void clickS041ADrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s041ADrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s041A drawer");
	}

	public String getS041ADrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041ADrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s041A drawer heading");
		return heading;
	}

	public String getS041ADrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041ADrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s041A drawer content");
		return content;
	}

	public void verifyS041A(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		//Wait.wait2Second();
		String questionFound = getS041AQuestion();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s041A");

//		clickS041ADrawerLink();
//
//		String actualDrawerHeading = getS041ADrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s041A");
//
//		String drawerContentFound = getS041ADrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s041A");
	}

	public String getS041AQuestion2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s041AQuestion2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s041A question2");
		return question;
	}

	public void verifyS041AQuestion2(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS041AQuestion2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s041A");
	}

	public void applicantTakeCareOfChildrenFirst_S038(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and contains(text(),'" + decision + "')]"), 30);
		Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElementMethod2(element, decision + " for recent changes");
		
		/*
		// Faizan
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElementMethod2(element, decision + " for recent changes");
		*/
	}
	
	public void applicantMainPersontakingCare_S038(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, decision + " for recent changes");
	}
	

	public void applicantTakeCareOfChildrenOther_S038(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, decision + " for recent changes");
	}

	public void applicantTakeCareOfChildren_S038Question2(String decision) throws InterruptedException {
		Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 30);
//		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		WebElement element = waitForElementToBeClickable(By.xpath("//span[text()='" + decision + "']"), 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for recent changes");
		
		/*
		 // Faizan
		Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 60);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for recent changes");
		*/
	}

	public void applicantMainPersonTakeCareOfChildren_S038Question3(String decision) throws InterruptedException {
		Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[3]"), 30);
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for recent changes");
	}

	public String getS038Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s038Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s038 question");
		return question;
	}
	public String getPTC171S038Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s038Question1, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s038 question");
		return question;
	}	

	public void verifyS038(String expectedQuestion) throws InterruptedException {
		String question = getS038Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S038");
	}
	public void verifyPTC171S038(String expectedQuestion) throws InterruptedException {
		String question = getPTC171S038Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S038");
	}
	
	public void foundNotEligibleMedicaidOrCHIP_S046(String decision) throws InterruptedException {
		//Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and contains(text(),'"+decision+"')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public String getS046Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s046Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s046 question");
		return question;
	}

	public void clickS046DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s046DrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s046 drawer");
	}

	public String getS046DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s046DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s046 drawer heading");
		return heading;
	}

	public String getS046DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s046DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s046 drawer content");
		return content;
	}

	public void verifyS046(String expectedQuestionMedicaid, String expectedQuestionCHIP, String drawerHeading, String drawerContent) throws InterruptedException {
		String question = getS046Question();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s046");

//		clickS046DrawerLink();
//
//		String actualDrawerHeading = getS046DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s046");
//
//		String drawerContentFound = getS046DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		Assert.assertTrue(actualDrawerContent.contains(drawerContent), "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s046");
	}
	public void verifyPTC107S046(String expectedQuestionMedicaid) throws InterruptedException {
		String question = getS046Question();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s046");
	}

	public void s046EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 30);
		sendKeysToElement(element, date, " Date");
//		element.sendKeys(Keys.TAB);
	}
	public void s046EnterDateNew(String date, String aaplName) {
		String path = "//span[text()='When was "+aaplName+" denied Medicaid or CHIP coverage?']//following::input[2]";
//		WebElement element = waitForElementToBePresent(OR.enterDate, 30);
		WebElement element = waitForElementToBeVisible(By.xpath(path), 30);
		sendKeysToElement(element, date, " Date");
//		element.sendKeys(Keys.TAB);
	}
	
	public void s046EnterDate2(String date) {
		WebElement element = waitForElementToBePresent(OR.enterRecentMoveDate, 30);
		sendKeysToElement(element, date, " Date");
	}
	public void s046EnterDate2New(String date, String childName) {
		String path = "//span[text()='When was "+childName+" denied Medicaid or CHIP coverage?']//following::input[2]";
//		WebElement element = waitForElementToBePresent(OR.enterRecentMoveDate, 30);
		WebElement element = waitForElementToBeVisible(By.xpath(path), 30);
		sendKeysToElement(element, date, " Date");
//		element.sendKeys(Keys.TAB);
	}
	
	public String getS047Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s047Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s047 question");
		return question;
	}
	
	public void verifyS047(String expectedQuestion) throws InterruptedException {
		String question = getS047Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S047");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P1(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P2(String decision) throws InterruptedException {
		//Wait.wait2Second();
		String path = "(//span//span[text()='" + decision + "'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P3(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[3]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P4(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[4]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P5(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[5]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P6(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[6]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P7(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[7]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void haveMedicaidOrChipEndedOrEndedSoon_S049_P8(String decision) throws InterruptedException {
		String path =  "(//span//span[text()='" + decision + "'])[8]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void hasHouseHoldIncomChanged_S049_P5(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath( "(//span//span[text()='" + decision + "'])[6]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public void s049EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}
	
	public String getS049Question1() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question1, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}
	
	public String getS049Question11() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question11, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}
	
	public String getS049Question12() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question12, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}
	
	public String getS049Question13() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question13, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}

	public String getS049Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s049Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s049 question");
		return question;
	}

	public void verifyS049ForOneQuestion(String expectedQuestionMedicaid, String expectedQuestionCHIP) throws InterruptedException {
		//Wait.wait2Second();
		String question = getS049Question1();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}

	public void verifyS049(String expectedQuestionMedicaid, String expectedQuestionCHIP) throws InterruptedException {
		//Wait.wait2Second();
		String question = getS049Question1();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");

		question = getS049Question2();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}
	
	public void verifyPTC085S049(String expectedQuestionMedicaid, String expectedQuestionCHIP) throws InterruptedException {
		//Wait.wait2Second();
		String question = getS049Question1();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}
	
	public void verifyPTC091S049(String expectedQuestionMedicaid) throws InterruptedException {
		//Wait.wait2Second();
		String question = getS049Question11();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}
	
	public void verifyPTC090S049(String expectedQuestionMedicaid) throws InterruptedException {
		//Wait.wait2Second();
		String question = getS049Question12();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}
	
	public void verifyPTC089S049(String expectedQuestionMedicaid) throws InterruptedException {
		//Wait.wait2Second();
		String question = getS049Question13();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s049");
	}

	public void whoIsPregnant_S053(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for not eligible for medicaid or CHIP");
	}

	public String getS053Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s053 question");
		return question;
	}

	public String getS053Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s053 question2");
		return question;
	}

	public void clicks053DrawerLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.s053DrawerLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " link of s053 drawer");
	}

	public String getS053DrawerHeading() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053DrawerHeading, 30);
		Wait.waitForElement(getWebDriver(), element);
		String heading = getElementText(element, "s053 drawer heading");
		return heading;
	}

	public String gets053DrawerContent() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s053DrawerContent, 30);
		Wait.waitForElement(getWebDriver(), element);
		String content = getElementText(element, "s053 drawer content");
		return content;
	}

	public void verifyS053(String expectedQuestion, String drawerHeading, String drawerContent)
			throws InterruptedException {
		String questionFound = getS053Question();
		String question = questionFound.replace("\n", " ");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s053");

//		clicks053DrawerLink();
//
//		String actualDrawerHeading = getS053DrawerHeading();
//		ExtentTestManager.getTest().info("Expected: " + drawerHeading);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerHeading);
//		Assert.assertEquals(actualDrawerHeading, drawerHeading, "Failed to verify: " + actualDrawerHeading);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerHeading + " on s053");
//
//		String drawerContentFound = gets053DrawerContent();
//		String actualDrawerContent = drawerContentFound.replace("\n", "");
//		ExtentTestManager.getTest().info("Expected: " + drawerContent);
//		ExtentTestManager.getTest().info("Found: " + actualDrawerContent);
//		Assert.assertEquals(actualDrawerContent, drawerContent, "Failed to verify: " + actualDrawerContent);
//		ExtentTestManager.getTest().info("Verified: " + actualDrawerContent + " on s053");

	}

	public void verifyS053Question2(String expectedQuestion2) throws InterruptedException {
		String question = getS053Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion2);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion2, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s053");
	}

	public void selectBabyCount(String count) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectBabyCount, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.selectBabyCount, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(count);
		ExtentTestManager.getTest().info("Baby count selected: " + count);
	}

	public void incomeThisMonth_S057(String decision) throws InterruptedException {
		//Wait.wait2Second();
		String path = "//span//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for S057");
	}

	public String getS057Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question");
		return question;
	}

	public String getS057Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question2");
		return question;
	}

	public String getS057Question3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question3, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question3");
		return question;
	}

	public String getS057Question4() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question4, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question3");
		return question;
	}
	
	public String getS057Question5() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s057Question5, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s057 question3");
		return question;
	}

	public void verifyS057QuestionHaveIncomeThisMonth(String expectedQuestion) throws InterruptedException {
		String question = getS057Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void verifyS057Question2IncomeType(String expectedQuestion2) throws InterruptedException {
		String question = getS057Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion2);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion2, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void verifyS057Question3IncomeDuration(String expectedQuestion3) throws InterruptedException {
		String question = getS057Question3();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion3);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion3, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void verifyS057Question4EnterIncome(String expectedQuestion4) throws InterruptedException {
		String question = getS057Question4();
		Assert.assertTrue(question.contains(expectedQuestion4), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}
	
	public void verifyS057Question5EducationExpense(String expectedQuestion4) throws InterruptedException {
		String question = getS057Question5();
		Assert.assertTrue(question.contains(expectedQuestion4), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s057");
	}

	public void selectIncomeType(String type) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectJobType, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(type);
		ExtentTestManager.getTest().info("Job type selected: " + type);
	}

	public void enterEmployerName(String employerName) {
		WebElement element = waitForElementToBePresent(OR.enterEmployerName, 30);
		sendKeysToElement(element, employerName, " first name");
	}

	public void incomePeriod_S057(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		clickElement(element, decision + " for S057");
	}

	public void enterIncomeAmount(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	public void enterAmount(WebElement element, String amount) {
//		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	
	public void enterEducationExpenses(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterEducationExpenses, 30);
		element.clear();
		for(int i =0; i<5; i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	
	public void enterEducationExpensesAmount_S057(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterEducationExpensesAmount_S057, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void enterIncomeAmountWithOutTab(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 30);
		// element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void enterIncomeAmountWithOutArrowRight(String amount) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 30);
		element.clear();
		Wait.wait2Second();
		element.sendKeys(Keys.ARROW_RIGHT);
		Wait.wait2Second();
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void expensePeriod_S058(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S058");
	}

	public void expenseType_S058(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S058");
	}

	public void expenseDecision_S058(String decision) throws InterruptedException {
		Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[text()='" + decision + "']"), 30);
		WebElement element = waitForElementToBeClickable(By.xpath("//span[text()='" + decision + "']"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElementMethod2(element, decision + " for S058");
	}
	

	public void enterExpenseAmount_S058(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterExpenseAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount + Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	
	public void enterFewWords_S058(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterFewWords_S058, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		ExtentTestManager.getTest().info("Few Words About Expense: " + amount);
	}

	public String getS058Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s058Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s058 question");
		return question;
	}

	public void verifyS058(String expectedQuestion) throws InterruptedException {
		String question = getS058Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S058");
	}

	public String getMonthlyIncome() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.monthlyIncome, 30);
		Wait.waitForElement(getWebDriver(), element);
		String income = getElementText(element, "monthly income");
		return income;
	}

	public String getYearlyIncome() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.yearlyIncome, 30);
		Wait.waitForElement(getWebDriver(), element);
		String income = getElementText(element, "yearly income");
		return income;
	}

	public void incomeVerification_S059(String decision) throws InterruptedException {
//		Wait.wait10Second();
		String path = "//span[contains(text(),'" + decision + "')]";
//		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		WebElement element = waitForElementToBeVisible(By.xpath(path), 30);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		clickElementMethod2(element, decision + " for S059");
	}

	public void incomePredict_S059(String decision) throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"),
				30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElementMethod2(element, decision + " for S059");
	}

	public void enterAnuualPreditedAmount(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterAnualPerditedAmount, 30);
		element.click();
//		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(Keys.END);
		for (int i=0;i<4;i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
		element.sendKeys(amount + Keys.BACK_SPACE + Keys.TAB);
//		element.sendKeys(amount + "" + Keys.TAB);
//		element.sendKeys(Keys.ARROW_RIGHT);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public String getS068Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s068Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s068Question, getWebDriver());
		String question = getElementText(element, "s068 question");
		return question;
	}

	public void verifyS068(String expectedQuestion) throws InterruptedException {
		String question = getS068Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S068");
	}

	public void currentlyEnrolled_S068(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
//		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S068");
	}

	public void stateBenifitPlanThroughJob_S082(String decision) throws InterruptedException {
//		Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),30);
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		clickElement(element, decision + " for S082");
	}
	public void stateBenifitPlanThroughJob_PTC167S082(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[@style='position: static;' and text()='"+decision+"']"), 30);
		clickElement(element, decision + " for S082");
	}

	public String getS069Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069Question, 30);
		String question = getElementText(element, "s069 question");
		return question;
	}
	
	public void verifyS069(String expectedQuestion) throws InterruptedException {
		String question = getS069Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069A");
	}
	
	public String getS069AQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069AQuestion, 30);
//		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s069A question");
		return question;
	}

	public void verifyS069A(String expectedQuestion) throws InterruptedException {
		String question = getS069AQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069A");
	}

	public void throughJobICHRA_S069A(String decision) throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S069A");
	}

	public String getS069BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069BQuestion, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		String question = getElementText(element, "s069B question");
		return question;
	}

	public void verifyS069B(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String question = getS069BQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069B");
	}

	public void throughJobICHRAHaveNotAccept_S069B(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
//		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S069A");
		Wait.wait2Second();
	}

	public String getS070Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s070Question, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		String question = getElementText(element, "s070 question");
		return question;
	}
	
	public String getS077Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s077Question, 30);
		String question = getElementText(element, "s070 question");
		return question;
	}

	public void verifyS070(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String question = getS070Question();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s070");
	}
	
	public void verifyS077(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String question = getS077Question();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s070");
	}

	public void CoverageThroughJobStartingNextMonth_S070(String decision) throws InterruptedException {
//		Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30); // Faizan
		WebElement element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
//		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and text()='"+decision+"']"), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S070");
	}
	
	public void CoverageThroughJobStartingNextMonth_PTC151S070(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and text()='"+decision+"']"), 30);
		clickElement(element, decision + " for S070");
	}

	public String getS074Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s074Question, 30);
//		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s074 question");
		return question;
	}

	public void verifyS074(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String question = getS074Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s074");
	}

	public String getS090Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s090Question, 30);
//		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s090 question");
		return question;
	}

	public void verifyS090(String expectedQuestion) throws InterruptedException {
		String question = getS090Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s090");
	}

	public void whoGetMarried_S090(String decision) throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S090");
	}

	public void enterDate(String tag, String attribute, String attrContents, String date) {
		WebElement element = waitForElementToBePresent(By.xpath("//"+tag+"[@"+attribute+"="+attrContents+"]"), 30);
		sendKeysToElement(element, date, " Date");
	}
	
	public void s090EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 30);
		sendKeysToElement(element, date, " Date");
	}

	public void s088EnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterRecentMoveDate, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s088EnterDateOnSamePage(String date) {
		WebElement element = waitForElementToBePresent(OR.enterRecenetMoveDate2, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}
	
	public void s089EnterDate(String name, String date) {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[text()='When did "+name+" become a dependent?']//following::input[2]"), 30);
		element.clear();
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s088enterDateToFilledField(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateToFilledField, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s088enterDateToFilledFieldOnSamePage(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateToFilledFieldOnSamePage, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public String getS090Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s090Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s090 question2");
		return question;
	}

	public void verifyS090Question2(String expectedQuestion) throws InterruptedException {
		String question = getS090Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s090");
	}

	public String getS090Question3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s090Question3, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s090 question3");
		return question;
	}

	public void verifyS090Question3(String expectedQuestion) throws InterruptedException {
		String question = getS090Question3();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s090");
	}

	public void qualifyForHealthCoverageIn60Days_S090(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for S090");
	}

	public void clickLogoutDropDown() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickLogoutDropDown, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " logout drop down");
	}

	public void clickLogout() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickLogout, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " for logout");
	}

	public void clickHome() throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickHome, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " for Home");
	}

	public void enterAgainDob(String dob) {
		WebElement element = waitForElementToBeClickable(OR.enterDOB, 30);
		sendKeysToElement(element, dob, dob);
	}

	public String enterDobAgent(String age) {
		WebElement element = waitForElementToBePresent(OR.enterDobAgent, 30);
		String dob = ESTTimeZone.getDobFromAge(age);
		sendKeysToElement(element, dob, " Date of birth");
		return dob;
	}

	public void clickApplication() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickApplication, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " for Application");
	}

	public void clickReportLifeChangeLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickReportLifeChangeLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " for report a life change");
	}

	public void mainPersonTakingCare_S041A(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " for main person taking care");
	}

	public void clickReportLifeChangeButton() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickReportLifeChangeButton, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " for report a life change");
	}

	public void clickContinueToEnrollmentBtn() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.continueToEnrollmentBtn, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, " continue to enrollment");
	}

	public void howMuchFromYourLowerPremium(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " how much from your lower premium");
	}

	public void selectPlan(String plan) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//label[contains(text(),'" + plan + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, plan + " how much from your lower premium");
	}

	public void clickEnrol(String selectedPlan) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath(
				"//label[contains(text(),'" + selectedPlan + "')]//parent::div//following-sibling::div//button"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, selectedPlan + " enroll button");
	}

	public void continueButtonAfterEligibility() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.continueButton, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, " continue button");
	}

	public void clickViewPlans() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickViewPlans, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();
		clickElement(element, " view plan button");
	}

	public void selectIAgreeCheckBox() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.agreeCheckBox, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " i agree");
	}

	public void goBackToHomeButton() throws InterruptedException {
		Wait.wait10Second();
		WebElement element = waitForElementToBeClickable(OR.goBackToHomeButton, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(OR.goBackToHomeButton, getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.wait10Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		Wait.wait2Second();

	}

	public void backNavigation() throws InterruptedException {
		WebElement element = getWebDriver().findElement(OR.backNavigation);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, " back navigation");
	}

	public void clickCreateSearchLink() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.createSearchLink, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " create search application link");
	}

	public void clickSearchForApplicationBtn() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = getWebDriver().findElement(OR.searchForApplicationBtn);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " search for application button");
	}

	public void clickCheckBoxForSearch() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = getWebDriver().findElement(OR.checkBoxForSearch);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element,
				" check box : Check here to indicate you've gotten permission from this person to search for his or her application.");
	}

	public void enterFirstNameForSearch(String firstName) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.firstNameForSearch, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, firstName, "first name");
	}

	public void enterLastNameForSearch(String firstName) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.lastNameForSearch, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, firstName, "last name");
	}

	public void enterDobForSearch(String dob) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.dobForSearch, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, dob, "date of birth for search");
	}

	public void clickSearchButton() throws InterruptedException {
		WebElement element = getWebDriver().findElement(OR.clickSearchButton);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " search button");
	}

	public void clickApplicationToupdate(String applicationId) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = getWebDriver().findElement(By.xpath(
				"//td[contains(text(),'" + applicationId + "')]//..//..//..//..//..//..//a[@id='collapseOneHeading']"));
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "drop down for update button");
	}

	public void clickUpdateApplication(String appId) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = getWebDriver().findElement(By.xpath("//td[contains(text(),'" + appId
				+ "')]//..//..//..//..//..//..//div[@class='accordion-body collapse show']//button//span[contains(text(),' UPDATE APPLICATION')]"));
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, " update application button");
	}

	public void selectIdentityProofing(String identity) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBePresent(OR.selectIdentityProofing, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(identity);
		ExtentTestManager.getTest().info("Identity selected: " + identity);
	}

	public void clickContinueIdentityProofing() throws InterruptedException {
		WebElement element = getWebDriver().findElement(OR.continueIdentityProofing);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, "drop down for update button");
	}

	public String getS030Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s030Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s030 question");
		return question;
	}

	public void verifyS030Question(String expectedQuestion) throws InterruptedException {
		String question = getS030Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s030");
	}

	public void liveWithAnotherParent_S030(String decision) throws InterruptedException {
		//Wait.wait2Second();
//		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'"+ decision + "')]"),30);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and text()='"+decision+"']"),30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " live with another parent");
	}

	public void liveWithAnotherParent2_S030(String decision) throws InterruptedException {
		//Wait.wait5Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span[contains(text(),'"+ decision + "')])[2]"),60);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " live with another parent");
	}
	
	public void incarceratedPendingDisposition_S094_P3(String decision) throws InterruptedException {
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"), 60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[4]"), 60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " incarcerated pending disposition");
	}
	
	public void incarceratedPendingDisposition_S094_P4(String decision) throws InterruptedException {
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[4]"), 60);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[5]"), 60);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " incarcerated pending disposition");
	}
	
	public void canYouProvideMoreInfo2_S034(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[3]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " can you provide more information");
	}
	
	public void selectGender_S027(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 60);
		//*[@id="sq_418"]/div[2]/fieldset/div[1]/label/span[3]/span
		Wait.waitForElement(getWebDriver(), element);
		element.click();
		
		clickElement(element, "on " + decision + " for gender");
	}
	
	public void whoWorksForEmployerHRA_S069C(String decision) throws InterruptedException {
        String path = "//span//span[contains(text(),'" + decision + "')]";
        WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitForElements(getWebDriver(), path);
        Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
        clickElement(element, decision + " who Works");
	}
	
	public void selectIchraAmountPeriodJobB(String period) throws InterruptedException {
        WebElement element = waitForElementToBePresent(OR.selectIchraAmountPeriodJobB, 60);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitForElementToBeVisibile(OR.selectIchraAmountPeriodJobB, getWebDriver());
        Select select = new Select(element);
        select.selectByVisibleText(period);
        ExtentTestManager.getTest().info("Period of ICHRA amount selected: " + period);
	}
	
	public void liveWithOtherParent_S031(String decision) throws InterruptedException {
        String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
//        String path = "//span//span[contains(text(),'" + decision + "')]"; // Faizan
        WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
        //Wait.waitForElement(getWebDriver(), element);
        //Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitForElements(getWebDriver(), path);
        Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
        clickElement(element, decision + "live with who is claming");
	}
		
	public void canYouProvideMoreInfo_S028(String decision) throws InterruptedException {
		Wait.wait5Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " can you provide more information");
	}
	
	public String getS045Question1() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s045Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s045 question");
		return question;
	}

	public String getS045Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s045Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s045 question");
		return question;
	}

	public void verifyS045Question(String expectedQuestion1, String expectedQuestion2) throws InterruptedException {
		String question = getS045Question1();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion1);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion1, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s045");

		question = getS045Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion2);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion2, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s045");
	}

	public void physicalDisability_S045(String decision) throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[1]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " physical disability");
	}

	public void helpWithDailyActivities_S045(String decision) throws InterruptedException {
//		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " help with daily activities");
	}

	public String getS051Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s051Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s051 question");
		return question;
	}

	public void verifyS051Question(String expectedQuestion) throws InterruptedException {
		String question = getS051Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s051");
	}

	public void whoIsFullTimeStudent_S051(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span//span[contains(text(),'" + decision + "')]";
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		WebElement element = waitForElementToBeClickable(By.xpath(path),30);
		Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
			jse.executeScript("arguments[0].click();", element);
			ExtentTestManager.getTest().info("click " + decision + " who is full time student");
		} catch (Exception e) {
			getWebDriver().navigate().refresh();
			Wait.wait2Second();
			clickElement(element, decision + " who is full time student");
		}
		
	}

	public String getS051Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s051Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s051 question2");
		return question;
	}

	public void verifyS051Question2(String expectedQuestion) throws InterruptedException {
		String questionFound = getS051Question2();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s051");
	}

	public void isThereAnyGardianInAppState_S051(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is full time student");
	}

	public void enterLoseCoverageDate_S083(String date) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.loseCoverageDate, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		sendKeysToElement(element, date, "lose coverage date");
		Wait.wait2Second();
		WebElement elements = waitForElementToBeClickable(OR.enterPlanName, 30);
		elements.click();

	}

	public String getS019Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s019Question, 30);
		//Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s019 question");
		return question;
	}

	public void verifyS019(String expectedQuestion) throws InterruptedException {
		String question = getS019Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S019");
	}

	public void immigrationStatus_S019(String decision) throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'" + decision + "')]"), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " eligible immigration status");
	}

	public String getS019Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s019Question2, 30);
		//Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s019 question2");
		return question;
	}

	public void verifyS019Question2(String expectedQuestion) throws InterruptedException {
		String questionFound = getS019Question2();
		String question = questionFound.replace("\n", " ");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S019");
	}

	public void selectDocument_S019(String document) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectDocument, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(document);
		ExtentTestManager.getTest().info("Document selected: " + document);
	}

	public void selectDocumentType_S019(String documentType) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectDocumentType, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(documentType);
		ExtentTestManager.getTest().info("Document type selected: " + documentType);
	}

	public void enterAlienNumber_S019(String alienNumber) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBePresent(OR.enterAlienNumberS019, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, alienNumber, "Alien Number");
	}

	public void clickContinueWithoutAddingMore() throws InterruptedException {
		//Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.continueWithoutAddingMore, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, " continue without adding more");
	}

	public String getS027QuestionSomeOneElseTaxReturn() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s027QuestionSomeOneElseTaxReturn, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s027 question");
		return question;
	}

	public void verifyS027QuestionSomeOneElseTaxReturn(String expectedQuestion) throws InterruptedException {
		String questionFound = getS027QuestionSomeOneElseTaxReturn();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on S027");
	}

	public void questionSomeOneElseTaxReturn_S027(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " eligible immigration status");
	}

	public String getS050Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s050Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s050 question");
		return question;
	}

	public void verifyS050(String expectedQuestionMedicaid, String expectedQuestionCHIP, String expectedImigration)
			throws InterruptedException {
		//Wait.wait2Second();
		String question = getS050Question();
		Assert.assertTrue(question.contains(expectedQuestionMedicaid), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedQuestionCHIP), "Failed to verify: " + question);
		Assert.assertTrue(question.contains(expectedImigration), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s050");
	}

	public void deniedMedicaidCHIPBecauseOfImmigrationStatus_S050(String decision) throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and text()='"+decision+"']"), 30);
		clickElement(element, decision + " denied eligibile because of immigration status");
	}
	
	public void deniedMedicaidCHIPBecauseOfImmigrationStatus_PTC135S050(String decision) throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and contains(text(),'"+decision+"')]"), 30);
		clickElement(element, decision + " denied eligibile because of immigration status");
	}
	
	public void deniedMedicaidCHIPBecauseOfImmigrationStatus_PTC077S050(String decision) throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[@style='position: static;' and contains(text(),'"+decision+"')]"), 30);
		clickElement(element, decision + " denied eligibile because of immigration status");
	}

	public void hadCurrentImmigrationStatusSinceFiveYear_S050(String decision) throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 30);
		WebElement element = waitForElementToBeClickable(By.xpath("//span[text()='"+decision+"'][1]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " immigration status since 5 years");
	}

	public void changeimmigrationStatusDueToNonEligibleForMedicaidCHIP_S050(String decision) throws InterruptedException {
//		WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"), 30);
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(),'Program (CHIP)?')]//following::span[7]"), 30);
		// WebElement element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"), 60); // Faizan
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " change in immigration status due to not eligible for Medicaid and CHIP");
	}
	public void changeimmigrationStatusDueToNonEligibleForMedicaidCHIP_PTC176S050(String decision) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(By.xpath("//span[contains(text(), 'Human Service (Medicaid) or Michigan MIChild (CHIP)?')]//following::span[7]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " change in immigration status due to not eligible for Medicaid and CHIP");
	}
	
	public boolean verifyQuestion1_S044() throws InterruptedException {
		List<WebElement> element = getWebDriver().findElements(OR.s044Question1);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		return element.size() > 0;
	}

	public boolean verifyQuestion2_S044() throws InterruptedException {
		List<WebElement> element = getWebDriver().findElements(OR.s044Question2);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		return element.size() > 0;
	}

	public void verifyS044() throws InterruptedException {
		Wait.wait2Second();
		boolean question1Found = verifyQuestion1_S044();
		Assert.assertEquals(question1Found, true,
				"Failed to verify: Are any of these people an honorable discharged veteran or active duty member of the military? ");
		ExtentTestManager.getTest().info(
				"Verified: Are any of these people an honorable discharged veteran or active duty member of the military?  on S044");

		boolean question2Found = verifyQuestion2_S044();
		Assert.assertEquals(question2Found, true,
				"Failed to verify: Do any of these people have a deceased spouse who was an honorable discharged veteran or active duty member of the military? ");
		ExtentTestManager.getTest().info(
				"Verified : Do any of these people have a deceased spouse who was an honorable discharged veteran or active duty member of the military?  om S044");

	}

	public void isAnyOneVetran_S044(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[1]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " any one vetran");
	}

	public void isAnyOneSpouseOfVetran_S044(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(
				By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " any one spouse of vetran");
	}

	public boolean verifyQuestion_S094() throws InterruptedException {
		Wait.wait3Second();
		List<WebElement> element = getWebDriver().findElements(OR.s094Question);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		return element.size() > 0;
	}

	public void verifyS094() throws InterruptedException {
		Wait.wait2Second();
		boolean question1Found = verifyQuestion_S094();
		Assert.assertEquals(question1Found, true, "Failed to verify: Which of these people are incarcerated?");
		ExtentTestManager.getTest().info("Verified: Which of these people are incarcerated?  on S044");
	}

	public void incarceratedPendingDisposition_S094_P1(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[1]"), 30);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 30);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " incarcerated pending disposition");
	}

	public void incarceratedPendingDisposition_S094_P2(String decision) throws InterruptedException {
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[2]"), 30);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span[contains(text(),'" + decision + "')])[3]"), 30);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " incarcerated pending disposition");
	}

	public void whoIsIncarcerated_S094(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is incarcerated");
	}

	public String getS088Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s088Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s088 question");
		return question;
	}

	public void verifyS088(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS088Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s088");
	}

	public void whoRecentlyMoved_S088(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is recently moved");
	}

	public String getS088DateErrorMessage() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s088DateErrorMessage, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s088 question");
		return question;
	}

	public void verifyErrorOnDate(String expectedError) throws InterruptedException {
		Wait.wait2Second();
		String error = getS088DateErrorMessage();
		ExtentTestManager.getTest().info("Expected: " + expectedError);
		ExtentTestManager.getTest().info("Found: " + error);
		Assert.assertEquals(error, expectedError, "Failed to verify: " + error);
		ExtentTestManager.getTest().info("Verified: " + error + " on s088");
	}

	public void priorCoverageQuestion_S088(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"),
					30);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " prior coverage");
	}

	public void priorCoverageQuestion_S088OnSamePage(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"),
					30);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[3]"),
					30);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " prior coverage");
	}

	public String getS054Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s054Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s054 question");
		return question;
	}

	public void verifyS054(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS054Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s054");
	}

	public void whoIsInFosterCare_S054(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"),
				30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " who is recently moved");
	}

	public void selectFosterCareState(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectFosterCareState, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void receivingMedicaidWhileFosterCare_S054(String decision) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = null;
		if (decision.equals("Yes")) {
			element = waitForElementToBeClickable(By.xpath("//span//span[contains(text(),'" + decision + "')]"), 30);
		} else if (decision.equals("No")) {
			element = waitForElementToBeClickable(By.xpath("(//span//span[contains(text(),'" + decision + "')])[2]"),
					30);
		}
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " receiving Medicaid while in foster care");
	}

	public void enterAgeFosterCareLeft(String age) {
		WebElement element = waitForElementToBePresent(OR.enterAgeFosterCareLeft, 30);
		sendKeysToElement(element, age, " age when left foster care");
		element.sendKeys(Keys.TAB);
	}

	public void applyForHealthCoverage_S047(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " apply for health coverage");
	}

	public void applyAfterQualifyingLifeEvent_S048(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " apply after qualifying life event");
	}

	public void whatTypeCoverageHave_S069(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for S069");
	}

	public void s083EnterDate(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterDate, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.enterDate, getWebDriver());

		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void selectToAddNonAplicantSpouse_S026(String selection) throws InterruptedException {
		String path = "//select[@class='form-control']";
		WebElement element = waitForElementToBePresent(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		element.click();
		Select select = new Select(element);
		select.selectByVisibleText(selection);
		ExtentTestManager.getTest().info("State selected: " + selection);
	}

	public void doAnyOtherFamilyMemberLiveOnThisAddress_S034(String decision) throws InterruptedException {
		//Wait.wait2Second();
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		//Wait.wait2Second();
		String path = "//span//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElements(getWebDriver(), path);
		//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do any other family member live on this address");
	}

	public void canYouProvideMoreInfo_S034(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " can you provide more information");
	}

	public void liveWithParentOrStepParent_S035(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with parent or step parent");
	}

	public void liveWithBrotherSisterUnderAge_S036(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision + " do live with brother sister who are under age");
	}

	public void liveWithSonDaughterStepSonStepDaughter_S037(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with son, daughter, stepson, stepdaughter");
	}

	public void liveWithHusband_S037(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with son, daughter, stepson, stepdaughter");
	}

	public void liveWithSonDaughterStepSonStepDaughter2_S037(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " do live with son, daughter, stepson, stepdaughter");
	}

	public void whatIsHomeAddress_S041(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " what is home address");
	}

	public void selectGender_S038(String gender) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectGender_S038, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.wait2Second();
		Select select = new Select(element);
		select.selectByVisibleText(gender);
		ExtentTestManager.getTest().info("Gender selected: " + gender);
	}

	public String getS052Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s052Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s052 question");
		return question;
	}

	public void verifyS052(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS052Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s052");
	}

	public void whoIsAmericanAlaskan_S052(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who is american alaskan");
	}

	public String getS075Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s075Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s075 question");
		return question;
	}

	public void verifyS075(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS075Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s075");
	}

	public void whoFederallyRecognizedTribe_S075(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who federally recognized tribe");
	}

	public String getS075Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s075Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s075 question2");
		return question;
	}

	public void verifyS075Question2(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS075Question2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s075");
	}

	public void selectState_S075(String state) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectState_S075, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectState_S075, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(state);
		ExtentTestManager.getTest().info("State selected: " + state);
	}

	public void selectTribe_S075(String tribe) throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBePresent(OR.selectTribe, 30);
		Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(OR.selectTribe, getWebDriver());
		clickElement(element, " which federally recognized tribe");
		Select select = new Select(element);
		select.selectByVisibleText(tribe);
		ExtentTestManager.getTest().info("Baby count selected: " + tribe);
	}

	public void isTribeSourceIncome_S057(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who federally recognized tribe");
	}

	public void enterTribeIncomeAmount(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterTribeIncomeAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount + "" + Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: ");
	}

	public void haveHealthCoverageNow_S078(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " have health coverage now");
	}

	public String getS064Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s064Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s064 question");
		return question;
	}

	public void verifyS064(String expectedQuestion) throws InterruptedException {
		String questionFound = getS064Question();
		String question = questionFound.replace("/n", "");
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s064");
	}

	public void incomeDiscripancy_S064(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
//		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElements(getWebDriver(), path);
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " income discripancy question");
	}

	public void clickAddNewIncomeSource() throws InterruptedException {
		Wait.wait2Second();
		WebElement element = waitForElementToBeClickable(OR.clickAddNewIncomeSource, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickAddNewIncomeSource, getWebDriver());
		clickElement(element, " add new income");
	}

	public void enterCoverageName(String coverageName) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterCoverageName, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.enterCoverageName, getWebDriver());
		sendKeysToElement(element, coverageName, " coverage name");
	}

	public void enterPolicyNumber(String policyNumber) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterPolicyNumber, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.enterPolicyNumber, getWebDriver());
		sendKeysToElement(element, policyNumber, " policy number");
	}

	public void describeExpense(String expenseDescription) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.describeExpense, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.describeExpense, getWebDriver());
		sendKeysToElement(element, expenseDescription, " expense description");
	}

	public String getS081Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s081Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s081Question, getWebDriver());
		String question = getElementText(element, "s081 question");
		return question;
	}

	public void verifyS081Question(String expectedQuestion) throws InterruptedException {
		String question = getS081Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s081");
	}

	public void coverageThroughJobEndedInLast3Months_S081(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " has coverage through job that ended in last three months");
	}

	public void whyCoverageEnd_S081(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " reason of coverage end");
	}

	public void whyCoverageEnd_S081_2(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " reason of coverage end");
	}

	public String getS069CQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069CQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069CQuestion, getWebDriver());
		String question = getElementText(element, "s069C question");
		return question;
	}

	public void verifyS069C(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS069CQuestion();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069C");
	}

	public void ableToUseHRA_S069C(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " able to use HRA");
	}

	public String getS069CQuestion2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069CQuestion2, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069CQuestion2, getWebDriver());
		String question = getElementText(element, "s069C question2");
		return question;
	}

	public void verifyS069CQuestion2(String expectedQuestion) throws InterruptedException {
		String question = getS069CQuestion2();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069C");
	}

	public void whichEmployerOfferHRA_S069C(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public String getS069EQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s069EQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s069EQuestion, getWebDriver());
		String question = getElementText(element, "s069E question");
		return question;
	}

	public void verifyS069E(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String question = getS069EQuestion();
		Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s069E");
	}

	public void enterStartDateJobA(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.startDateJobA, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(OR.startDateJobA, getWebDriver());
		sendKeysToElement(element, date, " start date");
	}

	public void enterEndDateJobA(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.endDateJobA, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(OR.endDateJobA, getWebDriver());
		sendKeysToElement(element, date, " end date");
	}
	public void enterEndDateJobS057(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.endDateJobA, 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElementToBeVisibile(OR.endDateJobA, getWebDriver());
		sendKeysToElement(element, date, " end date");
	}

	public void enterIchraAmountOffered(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIchraAmountOffered, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Maximum self-only amount of reimbursement offered: " + amount);
	}

	public void enterStartDateJobB(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.startDateJobB, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.startDateJobB, getWebDriver());
		sendKeysToElement(element, date, " start date");
	}

	public void enterEndDateJobB(String date) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.endDateJobB, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.endDateJobB, getWebDriver());
		sendKeysToElement(element, date, " end date");
	}

	public void enterIchraAmountOfferedJobB(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIchraAmountOfferedJobB, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Maximum self-only amount of reimbursement offered: " + amount);
	}

	public void selectIchraAmountPeriod(String period) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectIchraAmountPeriod, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.selectIchraAmountPeriod, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(period);
		ExtentTestManager.getTest().info("Period of ICHRA amount selected: " + period);
	}

	public void selectCoverageTypeApplicant_S069D(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void selectCoverageTypeApplicantSpouse1_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[5]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void selectCoverageTypeApplicantSpouse2_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void individualStartDate_S069D(String date) throws InterruptedException {
		String path = "(//div[@class='flatpickr dp-block-ruby'])[1]//input";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " start date");
		element.sendKeys(Keys.TAB);
	}

	public void individualNoticeDate_S069D(String date) throws InterruptedException {
		String path = "(//div[@class='flatpickr dp-block-ruby'])[2]//input";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " Notice date");
		element.sendKeys(Keys.TAB);
	}

	public void individualStartDate2_S069D(String date) throws InterruptedException {
		String path = "(//div[@class='sv_q sv_qstn']//input[@class='form-control'])[3]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " start date");
		element.sendKeys(Keys.TAB);
	}

	public void individualNoticeDate2_S069D(String date) throws InterruptedException {
		String path = "(//div[@class='sv_q sv_qstn']//input[@class='form-control'])[4]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " Notice date");
		element.sendKeys(Keys.TAB);
	}

	public void qsehraStartDate_S069D(String date) throws InterruptedException {
		String path = "(//div[@class='flatpickr dp-block-ruby'])[3]//input";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " start date");
		element.sendKeys(Keys.TAB);
	}

	public void qsehraNoticeDate_S069D(String date) throws InterruptedException {
		String path = "(//div[@class='flatpickr dp-block-ruby'])[4]//input";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		sendKeysToElement(element, date, " Notice date");
		element.sendKeys(Keys.TAB);
	}

	public void isCurrentlyEnrolledThroughEmployer_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[3]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}
	
	public void isCurrentlyEnrolledThroughEmployer_PTC162S069D(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and text()='"+decision+"']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void isCurrentlyEnrolledThroughEmployer2_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[4]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}
	
	public void isCurrentlyEnrolledThroughEmployer2_PTC162S069D(String decision) throws InterruptedException {
		String path = "//span[contains(text(),'currently enrolled in an Qualified Small Employer HRA (QSEHRA) through this employer?')]//following::span[8]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void qsehraThroughEmployer_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[4]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void qsehraThroughEmployer2_S069D(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[5]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}

	public void selectWhoLiveOnThisAddress_S041A(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " lives on same address");
	}

	public void whoIsSonDaughterOrStepSonDaughter_S037(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who lives on same address");
	}

	public void whoIsTaxFilerWhoClaims_S028(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who is claming");
	}

	public void liveWithTaxFilerParentWhoClaims_S031(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "live with who is claming");
	}
	public void liveWithTaxFilerParentWhoClaims_S032(String decision) throws InterruptedException {
		String path = "//span(text()='" + decision + "')";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "live with who is claming");
	}

	public void liveWithOtherParent_S031(String decision, String index) throws InterruptedException {
		String path = "";
		if (index.equals("2")) {
			path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		} else if (index.equals("1")) {
			path = "//span//span[contains(text(),'" + decision + "')]";
		}
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "live with who is claming");
	}

	public void isClaimingAnyOtherInTaxReturn_S033(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "claim any other one under tax return as dependent");
	}

	public void whoIsBrotherSisterStepSister_S036(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " is brother, step brother, sister, step sister");
	}

	public void selectParentOrStepParent_S035(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " who lives on same address");
	}

	public void doYouWantToGiveMoreInfoAboutTaxFilerWhoClaims_S031A(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " i want to give information about tax filer who claims");
	}

	public String getS086Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s086Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s086 question");
		return question;
	}

	public void verifyS086(String expectedQuestion) throws InterruptedException {
//		Wait.wait2Second();
		String questionFound = getS086Question();
		String[] question = questionFound.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question[0]);
		Assert.assertEquals(question[0], expectedQuestion, "Failed to verify: " + question[0]);
		ExtentTestManager.getTest().info("Verified: " + question[0] + " on s086");
	}

	public void whoRecentlyGainEligibleImigrationStatus_S086(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " recently gain eligible imigration status");
	}

	public void s086EnterDateP1(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateP1, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s086EnterDateP2(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateP2, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void s086EnterDateP3(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDateP3, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public String getS010BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s010BQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s010B question");
		return question;
	}

	public void verifyS010B(String expectedQuestion) throws InterruptedException {
		Wait.wait2Second();
		String question = getS010BQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on s010B");
	}

	public void removeOrKeepHimInApplicationWithoutCoverage_S010B(String decision) throws InterruptedException {
		String path = "//label//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " recently gain eligible imigration status");
	}

	public void reasonOfRemove_S010B(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void s010BEnterDate(String date) {
		WebElement element = waitForElementToBePresent(OR.enterDate, 30);
		sendKeysToElement(element, date, " Date");
		element.sendKeys(Keys.TAB);
	}

	public void selectCoverage_S010(String applicantFirstName, String decision) throws InterruptedException {
		String path = "//span[text()='" + applicantFirstName
				+ "']/../../../../following-sibling::div/div/div/div/div/div/following-sibling::div/fieldset/div/label/span/span[text()='"
				+ decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterHours(String hours) {
		WebElement element = waitForElementToBePresent(OR.enterHours, 30);
		element.clear();
		element.sendKeys(hours);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Hours enter: " + hours);
	}

	public String getS042Question1() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s003 question");
		return question;
	}

	public String getS042Question2() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042Question2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s042 question2");
		return question;
	}

	public String getS042Question3() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042Question3, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s042 question3");
		return question;
	}

	public void verifyScreen_s042_Question1(String expectedQuestion) throws InterruptedException {
		String question = getS042Question1();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S042");
	}

	public void verifyScreen_s042_Question2(String expectedQuestion) throws InterruptedException {
		String question = getS042Question2();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S042");
	}

	public void verifyScreen_s042_Question3(String expectedQuestion) throws InterruptedException {
		String question = getS042Question3();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S042");
	}

	public void livingOutSideStateTemporarily_S042(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void applicantHomeAddress_S042(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterStreetAddress_S042(String streetAddress) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s042StreetAddress, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, streetAddress, " street address");
	}

	public void clickCountyDropDown_S042() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.selectCounty, 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, " county drop down");
	}

	public String getS024Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s024Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s024 question");
		return question;
	}

	public void verifyScreen_s024_Question(String expectedQuestion) throws InterruptedException {
		String question = getS024Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S024");
	}

	public void isUS_CitizenFrom1996_S024(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		//Wait.waitForElement(getWebDriver(), element);
		//Wait.waitUntilPageIsLoaded(getWebDriver());
		//Wait.waitForElements(getWebDriver(), path);
		//Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public String getS071Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s071Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s071 question");
		return question;
	}
	
	public String getS071BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s071BQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s071 question");
		return question;
	}
	
	public String getS072BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s072BQuestion, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s071 question");
		return question;
	}

	public void verifyScreen_s071_Question(String expectedQuestion) throws InterruptedException {
		String question = getS071Question();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S071");
	}
	
	public void verifyScreen_s071B_Question(String expectedQuestion) throws InterruptedException {
		String question = getS071BQuestion();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S071");
	}
	
	public void verifyScreen_s072B_Question(String expectedQuestion) throws InterruptedException {
		String question = getS072BQuestion();
		String[] splitQuestion = question.split("\n");
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + splitQuestion[0]);
		Assert.assertEquals(splitQuestion[0], expectedQuestion, "Failed to verify: " + splitQuestion[0]);
		ExtentTestManager.getTest().info("Verified: " + splitQuestion[0] + " on S071");
	}

	public void whichEmployerOfferThisCoverage_S071(String decision) throws InterruptedException {
//		String path = "//span//span[contains(text(),'" + decision + "')]";
		String path = "//span[@style='position: static;' and text()='"+decision+"']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}
	
	public void whichEmployerOfferThisCoverage_S071B(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and text()='"+decision+"']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}
	
	public void enterEmployerName_S071B(String ques, String employerName) {
		WebElement element = waitForElementToBeVisible(By.xpath("//input[@aria-label='"+ques+"']"), 10);
		sendKeysToElement(element, employerName, " Employer Name");
	}
	
	public void whichEmployerOfferThisCoverage_PTC151S071(String decision) throws InterruptedException {
		String path = "//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void employerOfferextendsTo_S072(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}
	
	public void employerOfferextendsTo_PTC151S072(String decision) throws InterruptedException {
		String path = "//span[@style='position: static;' and text()='"+decision+"']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public String getS072Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s072Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s072 question");
		return question;
	}
	
	public void verifyScreen_s072_Question(String expectedQuestion) throws InterruptedException {
		String question = getS072Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S072");
	}

	public void verifyScreen_s071AB_Question(String expectedQuestion) throws InterruptedException {
		String question = getS072Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S071AB");
	}

	public void doYouWantToAddAnOtherEmployer_S072(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}
	
	public void addAnotherIncomeSource_S059() throws InterruptedException {
		String path = "(//a[@class='btn theme-btn-secondary'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, "Add another income Source");
	}
	
	public void addAnotherIncomeSource_S059B() throws InterruptedException {
		String path = "(//a[@class='btn theme-btn-secondary'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		element.click();
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElements(getWebDriver(), path);
//		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
//		clickElement(element, "Add another income Source");
	}
	
	public void addAnotherExpense_S059() throws InterruptedException {
		String path = "(//a[@class='btn theme-btn-secondary'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, "Add another Expense ");
	}

	public String getS073Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s073Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s073 question");
		return question;
	}

	public void verifyScreen_s073_Question(String expectedQuestion) throws InterruptedException {
		String question = getS073Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S073");
	}
	
	public String getS073BQuestion() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s073BQuestion2, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s073 question");
		return question;
	}
	
	public void verifyScreen_s073B_Question(String expectedQuestion) throws InterruptedException {
		String question = getS073BQuestion();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S073");
	}

	public void doesEmployerCoverageMeetMinimumValueStandard_S073(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}
	
	public void doesAnyPlanMeetTheMinimumValueStandard_S073() throws InterruptedException {
		String path = "(//span[contains(text(),'A plan for Mark Wood')])";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, path);
	}
	
	public void doesAnyPlanMeetTheMinimumValueStandard_S073B() throws InterruptedException {
        String path = "(//span[contains(text(),'None of the plans meet the minimum value standard')])";
        WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitForElements(getWebDriver(), path);
        Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
        clickElement(element, path);
	}
	
	public void enterSelfPremiumAmount_S073(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterSelfPremiumAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	
	public void enterSelfPremiumAmount2_S073(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterSelfPremiumAmount2, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount + "" + Keys.TAB);
//		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	
	public void enterFamilyPremiumAmount_S073(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterFamilyPremiumAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount + "" + Keys.TAB);
//		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}
	
	public void enterFamilyPremiumAmount2_S073(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterFamilyPremiumAmount2, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount + "" + Keys.TAB);
//		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void enterAmount_S073(String amount) {
		WebElement element = waitForElementToBePresent(OR.enterIncomeAmount, 30);
		element.clear();
		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(amount);
		element.sendKeys(Keys.TAB);
		ExtentTestManager.getTest().info("Amount enter: " + amount);
	}

	public void selectSelfPremiumPeriod_s073(String period) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s073SelfPremiumPeriod, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s073SelfPremiumPeriod, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(period);
		ExtentTestManager.getTest().info("Self Period selected: " + period);
	}
	
	public void selectFamilyPremiumPeriod_s073(String period) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s073FamilyPremiumPeriod, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s073FamilyPremiumPeriod, getWebDriver());
		Select select = new Select(element);
		select.selectByVisibleText(period);
		ExtentTestManager.getTest().info("Family Period selected: " + period);
	}

	public String getS079Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s079Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		String question = getElementText(element, "s079 question");
		return question;
	}

	public void verifyScreen_s079_Question(String expectedQuestion) throws InterruptedException {
		String question = getS079Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S079");
	}

	public void isParentLiveOutSideHome_S079(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void selectEmailAddress_S005(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void selectRace_S043(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		Wait.waitUntilPageIsLoaded(getWebDriver());
		clickElement(element, decision);
	}

	public String getS067Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s067Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s067Question, getWebDriver());
		String question = getElementText(element, "s067 question");
		return question;
	}

	public void verifyScreen_s067_Question(String expectedQuestion) throws InterruptedException {
		String question = getS067Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S067");
	}

	public void isAnyOneGetApprovedForUnEmploymentCompensation_S067(String decision) throws InterruptedException {
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterReasonToDiffrenceIncome_S063(String reason) throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.reasonToDiffrenceIncome, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, reason, " reason of income difference");
	}

	public String getS063Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s063Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s063Question, getWebDriver());
		String question = getElementText(element, "s063 question");
		return question;
	}

	public void verifyScreen_s063_Question(String expectedQuestion) throws InterruptedException {
		String question = getS063Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + question);
		Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
		ExtentTestManager.getTest().info("Verified: " + question + " on S063");
	}

	public void homeAddress_S002(String decision) throws InterruptedException {
		Wait.wait2Second();
		String path = "//span//span[contains(text(),'" + decision + "')]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision);
	}

	public void enterEmployerNameS069(String employerName) {
		WebElement element = waitForElementToBePresent(OR.enterEmployerNameS069, 30);
		sendKeysToElement(element, employerName, " employer name");
	}

	public void clickContinueApplication() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickContinueApplication, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickContinueApplication, getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue application");
	}

	public void clickContinueApplicationAgent() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickContinueApplicationAgent, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.clickContinueApplicationAgent, getWebDriver());
		Utility.attachWebScreenShotToReport(
				ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		clickElement(element, "continue application");
	}

	public void enterAptcAmount(String aptc) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterAptcAmount, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitForElementToBeVisibile(OR.enterAptcAmount, getWebDriver());
		sendKeysToElement(element, aptc, " APTC amount");
	}

	public String getSsnError() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.invalidSsnError, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.invalidSsnError, getWebDriver());
		String question = getElementText(element, "ssn error");
		return question;
	}

	public void verifySsnError(String expectedError) throws InterruptedException {
		String errorFound = getSsnError();
		ExtentTestManager.getTest().info("Expected: " + expectedError);
		ExtentTestManager.getTest().info("Found: " + errorFound);
		Assert.assertEquals(errorFound, expectedError, "Failed to verify: " + errorFound);
		ExtentTestManager.getTest().info("Verified: " + errorFound + " on S063");
	}

	public void enterInvalidSSN(String ssn) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.enterSSN, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, ssn, " SSN number");
		element.sendKeys(Keys.TAB);
	}
	public void enterI94Number(String number) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.i94Number, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, number, " I-94 number");
	}
	public void enterHoursForP1(String hours) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.hoursForP1, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, hours, " hours for p1");
	}
	public void enterHoursForP2(String hours) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.hoursForP2, 30);
		Wait.waitForElement(getWebDriver(), element);
		sendKeysToElement(element, hours, " hours for p2");
	}
	public String getS80Question() throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.s80Question, 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.s80Question, getWebDriver());
		String question = getElementText(element, "s80 question");
		return question;
	}

	public void verifyS80Question(String expectedQuestion) throws InterruptedException {
		String questionFound = getS80Question();
		ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
		ExtentTestManager.getTest().info("Found: " + questionFound);
		Assert.assertEquals(questionFound, expectedQuestion, "Failed to verify: " + questionFound);
		ExtentTestManager.getTest().info("Verified: " + questionFound + " on S080");
	}
	public void selectYear(String year) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.applicationYear, 30);
//		Wait.waitForElement(getWebDriver(), element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
//		Wait.waitForElementToBeVisibile(OR.applicationYear, getWebDriver());

		
		Select select = new Select(element);
//		Wait.waitUntilPageIsLoaded(getWebDriver());
		select.selectByVisibleText(year);
		ExtentTestManager.getTest().info("year selected: " + year);
	}
	public ArrayList<String> getYears() throws InterruptedException{
		List<WebElement> elements=getWebDriver().findElements(OR.getYear);
		Wait.waitForElement(getWebDriver(), elements.get(0));
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(OR.getYear, getWebDriver());
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<elements.size();i++) {
			list.add(elements.get(i).getText());
		}
		return list;
	}
	public void healthServiceFromIHS_S076_P1(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[1]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for IHS");
	}

	public void healthServiceFromIHS_S076_P2(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for eligible to health service");
	}
	public void helpPayingBill_S077(String decision) throws InterruptedException {
		String path = "(//span//span[text()='" + decision + "'])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " help paying bill");
	}
	public void enterEmployerNameCobra_S069(String employerName) {
		WebElement element = waitForElementToBePresent(OR.employerNameCobra_S069, 30);
		sendKeysToElement(element, employerName, " employer name");
	}
	public void selectRelationS28_Item92(String selection) throws InterruptedException {
		WebElement element = waitForElementToBePresent(OR.selectRelationS28_Item92, 30);
		Wait.waitForElement(getWebDriver(), element);
		Select select = new Select(element);
		select.selectByVisibleText(selection);
		ExtentTestManager.getTest().info("Relation selected: " + selection);
	}
	public void selectRelationS28_ParentInfo(String decision) throws InterruptedException {
		String path = "//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + "claim any other one under tax return as dependent");
	}
	public void selectLiveWithParent_S028(String decision) throws InterruptedException {
		String path = "//span[text()='" + decision + "']";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 30);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " for IHS");
	}
	public void selectAnswer4PTC105S090Last2Questions() throws Exception {
		WebElement element = waitForElementToBePresent(OR.s090Question3NoOption, 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "Select No option");
		element = waitForElementToBePresent(OR.s090Question4YesOption, 30);
		Wait.waitForElement(getWebDriver(), element);
		clickElement(element, "Select Yes option");
	}
	public void enterIncarceratedDate(String applName, String incarcerateDate) {
//		WebElement element = waitForElementToBePresent(OR.enterDOB, 30);
//		String dob = ESTTimeZone.getDobFromAge(age);
		WebElement element = waitForElementToBeVisible(By.xpath("//span[text()='When was "+applName+" released from incarceration?']//following::input[2]"), 30);
		sendKeysToElement(element, incarcerateDate, " Incarcerated Date");
	}
	public void ptc151S069EFillForm(String startDate, String endDate, String amount, String period, String phoneNumber) {
		WebElement element = null; 
		element = waitForElementToBeVisible(By.xpath("//span[text()='Start date:']//following::input[2]"), 30);
		sendKeysToElement(element, startDate, " Start Date");
		element = waitForElementToBeVisible(By.xpath("//span[text()='End date:']//following::input[2]"), 30);
		sendKeysToElement(element, endDate, " End Date");
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'Amount')]//following::input[1]"), 30);
		sendKeysToElement(element, amount, " Amount");
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'How often would')]//following::select[1]"), 30);
//		sendKeysToElement(element, period, " Period");
		Select select = new Select(element);
		select.selectByVisibleText(period);
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'Phone number')]//following::input[1]"), 30);
		sendKeysToElement(element, phoneNumber, " Phone Number");
	}
	public void ptc151S069EFillForm(String startDate, String endDate, String amount, String period, String phoneNumber, String quesContents) {
		WebElement element = null; 
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::input[2]"), 30);
		sendKeysToElement(element, startDate, " Start Date");
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::input[4]"), 30);
		sendKeysToElement(element, endDate, " End Date");
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::input[5]"), 30);
		enterAmount(element, amount);
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::select[1]"), 30);
//		sendKeysToElement(element, period, " Period");
		Select select = new Select(element);
		select.selectByVisibleText(period);
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::input[6]"), 30);
		sendKeysToElement(element, phoneNumber, " Phone Number");
	}
	public void ptc151S073BFillForm(String amount, String period, String quesContents) {
		WebElement element = null; 
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::input[1]"), 30);
		sendKeysToElement(element, amount, " Amount");
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::select[1]"), 30);
//		sendKeysToElement(element, period, " Period");
		Select select = new Select(element);
		select.selectByVisibleText(period);
	}
	public void ptc152S075ChooseStateNTribe(String quesContents, String option) {
		WebElement element = null;
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(),'"+quesContents+"')]//following::select[1]"), 30);
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}
	public void ptc156S069DFillForm(String startDate, String offerDate) {
		WebElement element = null;
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(), 'Qualified Small Employer HRA (QSEHRA) will start.')]//following::input[2]"), 10);
		sendKeysToElement(element, startDate, " QSEHRA Start Date");
		element = waitForElementToBeVisible(By.xpath("//span[contains(text(), 'Qualified Small Employer HRA (QSEHRA) offer.')]//following::input[2]"), 10);
		sendKeysToElement(element, offerDate, " QSEHRA Offer Date");
	}
	public void enterEmployerNameS0692(String employerName) {
        WebElement element = waitForElementToBePresent(OR.enterEmployerNameS0692, 60);
        sendKeysToElement(element, employerName, " employer name");
	}
	public void enterOtherIncomeSourceS069(String employerName) {
	        WebElement element = waitForElementToBePresent(OR.enterOtherIncomeSourceS069, 60);
	        sendKeysToElement(element, employerName, " employer name");
	}
	
	public void healthServiceFromIHS_S076_P3(String decision) throws InterruptedException {
        String path = "(//span//span[text()='" + decision + "'])[3]";
        WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
        clickElement(element, decision + " for eligible to health service");
	}

	public void healthServiceFromIHS_S076_P4(String decision) throws InterruptedException {
        String path = "(//span//span[text()='" + decision + "'])[4]";
        WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitForElement(getWebDriver(), element);
        Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitUntilPageIsLoaded(getWebDriver());
        Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
        Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
        clickElement(element, decision + " for eligible to health service");
        clickElement(element, decision + " for eligible to health service");
	}
	
	/* Faizan */
	public void isCurrentlyEnrolledThroughEmployer_S069D2(String decision) throws InterruptedException {
		String path = "(//span//span[contains(text(),'" + decision + "')])[2]";
		WebElement element = waitForElementToBeClickable(By.xpath(path), 60);
		Wait.waitForElement(getWebDriver(), element);
		Wait.waitUntilPageIsLoaded(getWebDriver());
		Wait.waitForElements(getWebDriver(), path);
		Wait.waitForElementToBeVisibile(By.xpath(path), getWebDriver());
		clickElement(element, decision + " offers HRA");
	}
	public void clickAddPersonTwo() throws InterruptedException {
		WebElement element = waitForElementToBeClickable(OR.clickAddPersonTwo, 60);
		//Wait.waitForElement(getWebDriver(), element);
		Utility.scrollToElement(element, getWebDriver());
		clickElement(element, " add a person");
	}
	/* Faizan */
	
// **************** Amjad *********************************************************************
	public void clickAnElement(String matchingContents, int option, int index) {
		// option 1 for Equal
		// option 2, for Contains
		WebElement element = null;
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("(//a[text()='"+matchingContents+"'])["+index+"]"), 30);
		} else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//a[contains(text(),'"+matchingContents+"')])["+index+"]"), 30);
		}
		clickElement(element, option + " for not eligible for medicaid or CHIP");
	}
	public void clickAnElement(String tagName, String matchingContents, int option, int index) {
		// option 1 for Equal
		// option 2, for Contains
		WebElement element = null;
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("(//"+tagName+"[text()='"+matchingContents+"'])["+index+"]"), 30);
		} else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//"+tagName+"[contains(text(),'"+matchingContents+"')])["+index+"]"), 30);
		}
		clickElement(element, option + " for not eligible for medicaid or CHIP");
	}
	public void chooseAnOption(String matchingContents, int option, int index) {
		// option 1 for Equal
		// option 2, for Contains
		WebElement element = null;
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("(//span[@style='position: static;' and text()='"+matchingContents+"'])["+index+"]"), 30);
		} else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//span[@style='position: static;' and contains(text(),'"+matchingContents+"')])["+index+"]"), 30);
		}
		clickElement(element, option + " for not eligible for medicaid or CHIP");
	}
	/*
	public void chooseAnOption(String tagName, String matchingContents, int option, int index) {
		// option 1 for Equal
		// option 2, for Contains
		WebElement element = null;
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("(//"+tagName+"[@style='position: static;' and text()='"+matchingContents+"'])["+index+"]"), 30);
		} else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//span[@style='position: static;' and contains(text(),'"+matchingContents+"')])["+index+"]"), 30);
		}
		clickElement(element, option + " for not eligible for medicaid or CHIP");
	}
	*/
	/*
	public void selectOption(String option, int index) throws InterruptedException {
		WebElement element = waitForElementToBeVisible(By.xpath("(//span[@style='position: static;' and text()='"+option+"'])["+index+"]"), 30);
		clickElement(element, option + " for not eligible for medicaid or CHIP");
	}
	public void selectOptionWithContains(String option, int index) throws InterruptedException {
		WebElement element = waitForElementToBeVisible(By.xpath("(//span[@style='position: static;' and contains(text(),'"+option+"')])["+index+"]"), 30);
		clickElement(element, option + " for not eligible for medicaid or CHIP");
	}
	*/
	public void selectAnOption(String tagName, String attr, String attrValue, String value, int option, int index) throws InterruptedException {
		// For Drop Down's Value Selection
		// option 1 for Equal
		// option 2, for contains
		WebElement element = null;
//		WebElement element = waitForElementToBeVisible(By.xpath("(//span[contains(@aria-label,'"+attrValue+"')])["+index+"]"), 30);
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("//"+tagName+"[@"+attr+"='"+attrValue+"']["+index+"]"), 30);	
		} else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//"+tagName+"[contains(@"+attr+",'"+attrValue+"')])["+index+"]"), 30);	
		}
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
//	public void enterNSelectOptionWithContains(String tagName, String attr, String attrValue, int option, String value, int index) throws InterruptedException {
	public void enterNSelectOption(String tagName, String attr, String attrValue, int option, String value, int index) throws InterruptedException {
		// option 1 for Equal
		// option 2, for contains  
		WebElement element = null;
//		WebElement element = waitForElementToBeVisible(By.xpath("(//span[contains(@aria-label,'"+attrValue+"')])["+index+"]"), 30);
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("//"+tagName+"[@type='text' and @"+attr+"='"+attrValue+"']["+index+"]"), 30);	
		} else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//"+tagName+"[@type='text' and contains(@"+attr+",'"+attrValue+"')])["+index+"]"), 30);	
		}
//		clickElement(element, option + " for not eligible for medicaid or CHIP");
		sendKeysToElement(element, value, attrValue);
	}
	public void verifyQuestionContents(String tag, String matchingContents, String expectedQuestion, int option, int index) {
		// Note 1: option 1 for "=" and 2 for "contains()" in xpath
		// Note 2: Question Contents may be Complete / Partial
		// Note 3: For Complete (Question) use option "1" / "=" and for Partial (Question) use option "2" / "contains" 
		WebElement element = null;
		String question = null;
		if(option == 1) {
			element = waitForElementToBeVisible(By.xpath("(//"+tag+"[text() = '"+matchingContents+"'])["+index+"]"), 15);	
			question = getElementText(element, "Screen Questions");
			ExtentTestManager.getTest().info("Expected: " + expectedQuestion);
			ExtentTestManager.getTest().info("Found: " + question);
			Assert.assertEquals(question, expectedQuestion, "Failed to verify: " + question);
			ExtentTestManager.getTest().info("Verified: " + question + " on S0 Screen");
		}else if(option == 2) {
			element = waitForElementToBeVisible(By.xpath("(//"+tag+"[contains(text(), '"+matchingContents+"')])["+index+"]"), 15);
			question = getElementText(element, "Screen Questions");
			Assert.assertTrue(question.contains(expectedQuestion), "Failed to verify: " + question);
			ExtentTestManager.getTest().info("Verified: " + question + " on S0");
		}
	}
}
