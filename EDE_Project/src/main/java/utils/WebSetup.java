package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebSetup {
    public static WebSetup instance;

    public static WebDriver driver;

    public static WebSetup getInstance() {
        if (instance == null)
            instance = new WebSetup();
        return instance;
    }

    public void nullDriver(){
        driver = null;
    }

    public WebDriver initDriver() {
        if (driver == null) {
   //     	WebDriverManager.chromedriver().setup();
//        	System.setProperty("webdriver.chrome.driver", "E:\\Amjad\\Automation Script\\Functional Test Scripts\\SK_EDE_Project\\chromedriver.exe");
        	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        	//WebDriver driver = new ChromeDriver();
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("incognito");
            chromeOptions.setExperimentalOption("prefs", prefs);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
//            ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='80%';");
            //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            
        }
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
