package utils;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;

public class Wait {
	public static int totalWait = 0;

	public static void wait1Second() throws InterruptedException {
		Thread.sleep(1000);
		totalWait += 1;
	}

	public static void wait2Second() throws InterruptedException {
		Thread.sleep(2000);
		totalWait += 2;
	}

	public static void wait3Second() throws InterruptedException {
		Thread.sleep(3000);
		totalWait += 3;
	}

	public static void wait5Second() throws InterruptedException {
		Thread.sleep(5000);
		totalWait += 5;
	}
	public static void wait8Second() throws InterruptedException {
		Thread.sleep(8000);
	}

	public static void wait10Second() throws InterruptedException {
		Thread.sleep(10000);
		totalWait += 10;
	}

	public static void wait15Second() throws InterruptedException {
		Thread.sleep(16000);
		totalWait += 15;
	}

	public static void wait25Second() throws InterruptedException {
		Thread.sleep(26000);
		totalWait += 25;
	}

	public static void wait40Second() throws InterruptedException {
		Thread.sleep(41000);
		totalWait += 40;
	}

	public static void wait30Second() throws InterruptedException {
		Thread.sleep(31000);
		totalWait += 30;
	}

	public static void wait60Second() throws InterruptedException {
		Thread.sleep(60000);
		totalWait += 60;
	}

	public static void explicit_wait_xpath(String Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Element)));
	}

	public static void waitUntilPresenceOfElementLocated(String Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element)));
	}

	public static void waitUntilPresenceOfElementLocatedByClassName(String Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(Element)));
	}

	public static void explicit_wait_absenceofelement(String Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Element)));
	}

	public static void explicit_wait_visibilityof_webelement(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void explicit_wait_10sec(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void timeCal() {
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	public static void waitforloadpage(long startTime, long endTime, double waittime) {

		double totalTime = (endTime - startTime);
		// System.out.println(totalTime + " in Millsecs");
		double TotalTimeinsecs = totalTime / 1000;
		double ActualTime = TotalTimeinsecs - waittime;
		// System.out.println(ActualTime + " in secs");
	}

	public static void explicit_wait_elementToBeClickable(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(Element));

	}

	public static void explicit_wait_visibilityof_webelement_120(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void explicit_wait_visibilityof_webelement_150(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void explicit_wait_visibilityof_webelement_200(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void explicit_wait_visibilityof_webelement_350(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 350);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void explicit_wait_visibilityof_webelement_600(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void waitForElements(final WebDriver driver, final String locator) {
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>((RemoteWebDriver) driver);

		new FluentWait<WebDriver>(driver).withTimeout(200, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(ElementNotVisibleException.class);

		wait.withTimeout(200, TimeUnit.SECONDS);
		wait.pollingEvery(3, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(WebDriverException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(ElementNotVisibleException.class);
		List<WebElement> targetElements = wait.until(new Function<RemoteWebDriver, List<WebElement>>() {
			int count = driver.findElements(By.xpath(locator)).size();

			public List<WebElement> apply(RemoteWebDriver driver) {

				List<WebElement> elements = driver.findElements(By.xpath(locator));
				int length = elements.size();

				if (length >= 1 || count > 0) {

					try {
						Thread.sleep(750);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return elements;

				}
				return null;
			}

		});
	}

	public static void waitForElement_ID(final WebDriver driver, final String locator) {
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>((RemoteWebDriver) driver);

		new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(ElementNotVisibleException.class);

		wait.withTimeout(200, TimeUnit.SECONDS);
		wait.pollingEvery(3, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(WebDriverException.class);
		wait.ignoring(StaleElementReferenceException.class);
		List<WebElement> targetElements = wait.until(new Function<RemoteWebDriver, List<WebElement>>() {
			int count = driver.findElements(By.id(locator)).size();

			public List<WebElement> apply(RemoteWebDriver driver) {

				List<WebElement> elements = driver.findElements(By.id(locator));
				int length = elements.size();

				if (length >= 1 || count > 0) {

					try {
						Thread.sleep(750);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return elements;

				}
				return null;
			}

		});
	}

	public static void waitForElementUsingClassName(final WebDriver driver, final String locator) {

		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>((RemoteWebDriver) driver);

		new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(ElementNotVisibleException.class);

		wait.withTimeout(200, TimeUnit.SECONDS);
		wait.pollingEvery(3, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(WebDriverException.class);
		wait.ignoring(StaleElementReferenceException.class);
		List<WebElement> targetElements = wait.until(new Function<RemoteWebDriver, List<WebElement>>() {
			int count = driver.findElements(By.className(locator)).size();

			public List<WebElement> apply(RemoteWebDriver driver) {

				List<WebElement> elements = driver.findElements(By.className(locator));
				int length = elements.size();

				if (length >= 1 || count > 0) {

					try {
						Thread.sleep(750);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return elements;

				}
				return null;
			}

		});
	}

	public static void waitForElementToBeGone(WebDriver driver, WebElement element, int timeout) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));

	}

	public static boolean isElementDisplayed(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static void explicit_wait_xpath(WebDriver driver, String Element) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Element)));
	}

	public static void waitUntilPresenceOfElementLocated(WebDriver driver, String Element) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element)));
	}

//	Checks for the page load, if page is not loaded even after 5 minutes it will come out of the loop
	public static void waitUntilPageIsLoaded(WebDriver d) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) d;
		int count = 0;
		while (true) {
			Thread.sleep(500);
			count++;
			if (jse.executeScript("return document.readyState;").toString().equalsIgnoreCase("complete")) {
				break;
			} else if (count == 600)
				break;
		}
	}

	public static void scrollUntilTheElementIsVisible(WebDriver d, WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor) d;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		new WebDriverWait(d, 100).until(ExpectedConditions.visibilityOf(element));

	}

	public static void waitForElementToBeInvisible(WebDriver driver, WebElement element, int timeout) {

		try {

			new WebDriverWait(driver, timeout).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));

		} catch (Exception e) {

			new WebDriverWait(driver, timeout).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
		}
	}

	public static void loadingImage(WebDriver driver) {
		try {
			String path = "//*[@id='InnerFreezePane']/img";
			Wait.waitForElementToBeGone(driver, driver.findElement(By.xpath(path)), 180);
		} catch (Exception e) {
			System.out.println("No Loading");
		}
	}

	public static void explicit_wait_visibilityof_webelement_3(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}

	public static void waitForElementToBeVisibile(By xpath, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));

	}

	public static void waitForElementToBeClickableUsingClass(By xpath, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(xpath));

	}

	public static void waitForElement(WebDriver driver, WebElement element) throws InterruptedException {
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (element.isDisplayed())
					break;
			} catch (Exception e) {
			}
//			Thread.sleep(1000);
			Thread.sleep(500);
		}
	}
	public static void waitForListElement(WebDriver driver, By locator) throws InterruptedException {
		List<WebElement> element=driver.findElements(locator);
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (element.get(0).isDisplayed())
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
	}

}
