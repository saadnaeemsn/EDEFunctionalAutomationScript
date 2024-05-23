package pages;

import java.security.SecureRandom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;
import utils.WebSetup;

public class BasePage {
	
	public static WebDriver getWebDriver() {
		return WebSetup.getInstance().initDriver();
	}
	
	public static void loadPage(String base_url) {
		ExtentTestManager.getTest().info("Opening URL: " + base_url );
		getWebDriver().get(base_url);
	}
	
	public void refreshPage() {
		getWebDriver().navigate().refresh();
	}
	
	public WebElement waitForElementToBePresent(By webElement, int timeOutInSeconds) {
		//ExtentTestManager.getTest().info("Waiting for elements to be present " + webElement.toString());
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(webElement));
	}
	
	public List<WebElement> waitForElementsToBePresent(By webElement, int timeOutInSeconds) {
		//ExtentTestManager.getTest().info("Waiting for elements to be present " + webElement.toString());
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		return (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(webElement));
	}
	
	public WebElement waitForElementToBeClickable(By webElement, int timeOutInSeconds) {
		//ExtentTestManager.getTest().info("Waiting for element to be clickable " + webElement.toString());
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		return (WebElement) wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public WebElement waitForElementToBeVisible(By webElement, int timeOutInSeconds) {
		//ExtentTestManager.getTest().info("Waiting for elements to be present " + webElement.toString());
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
	}
	
	public void waitForElementToBeInvisible(By webElement, int timeOutInSeconds) {
		//ExtentTestManager.getTest().info("Waiting for elements to be present " + webElement.toString());
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(webElement));
	}
	
	public void clickElement(WebElement element, String elementLabel) {
		//ExtentTestManager.getTest().info("Clicking " + elementLabel);
		//element.click();
		WebSetup webSetup = new WebSetup();
//		((JavascriptExecutor) webSetup.driver).executeScript("arguments[0].click();", element);	
		((JavascriptExecutor) webSetup.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	public void clickElementMethod2(WebElement element, String elementLabel) {
		ExtentTestManager.getTest().info("Clicking " + elementLabel);
		element.click();
	}
	
	public WebElement findElement(By locator) {
		return (WebElement) getWebDriver().findElement(locator);
		
	}
	
	public WebElement findElements(By locator) {
		return (WebElement) getWebDriver().findElements(locator);
		
	}

	public void sendKeysToElement(WebElement element, String value, String elementLabel) {
		ExtentTestManager.getTest().info("Entering "+ elementLabel + ": " + value);
		element.clear();
//		element.sendKeys(keys);
		element.sendKeys(value + "" + Keys.TAB);
	}
	
	public String getElementText(WebElement element, String elementLabel) {
		ExtentTestManager.getTest().info("Getting "+elementLabel+ " text: "+  element.getText());
		return element.getText();
	}
	
	public String getElementValueAttribute(WebElement element, String elementLabel) {
		ExtentTestManager.getTest().info("Getting "+elementLabel+ " value" );
		return element.getAttribute("value");
	}
	
	public void scrollTillEnd() {
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void scrollToElement(WebElement element, String elementLabel) {
		ExtentTestManager.getTest().info("Scroll to  "+elementLabel);
		((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void mouseOverElement(WebElement element, String elementLabel) {
		ExtentTestManager.getTest().info("Mouse over "+ elementLabel);
		Actions action = new Actions(getWebDriver());
		action.moveToElement(element).perform();
	}

	public String randomString( int len ){
		String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ ) 
	      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		return sb.toString();
	}


	public String randomNumber( int len ){
		String AB = "0123456789";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ )
			sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		return sb.toString();
	}

	public boolean htmlRequiredField(WebElement element, String elementLabel){
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;",element);
		ExtentTestManager.getTest().info("Is " + elementLabel + " field  is required");
		if(isRequired )
		{
			return true;
		}else {
			return false;
		}
	}
}
