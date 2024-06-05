package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.BasicFileReporter;


public class Utility {
	
	public static String captureWebScreenShot(WebDriver driver, String fileName) throws IOException {
		String destinationPath = null;
		String filePath = null;
		try {

			BasicFileReporter reporter = (BasicFileReporter) ExtentTestManager.getTest().getExtent().getStartedReporters().get(0);
			File report = reporter.getFileFile();
			String folder = report.getParent();
			filePath = "screenshot/" + fileName+".png";
			destinationPath = folder + File.separator +  "screenshot/";
			File destination = new File(destinationPath);
			destinationPath = destination.getAbsolutePath();
			Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName(fileName).save(destinationPath);
		} catch (Exception e) {
			LogUtil.getLoggerInstance().error(e.getMessage(), e);
		}
		return filePath;
	}
	
	public static void attachWebScreenShotToReport( String fileName) {
		try {
			String imagePath = captureWebScreenShot(WebSetup.getInstance().getDriver(), fileName);
			ExtentTestManager.getTest().info("Screen Capture", MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build());
		} catch (Exception e) {
			LogUtil.getLoggerInstance().error("Error while capturing screen", e);
		}

	}
		
	public static String getInformationTable(ArrayList<String> label, ArrayList<String> value) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table class='custom-table-localization'>");
		builder.append("<tr>");
		builder.append("<td style='width: 50%;'>Label</td>");
		builder.append("<td style='width: 22%;'>Information</td>");
		builder.append("</tr>");
		for(int i = 0; i < value.size(); i++) {
			builder.append("<tr>");
			builder.append(String.format("<td>%s</td>", label.get(i)));
			builder.append(String.format("<td>%s</td>", value.get(i)));
			builder.append("</tr>");
			
		}
		builder.append("</table>");
		return builder.toString();
	}
	
	public static String getLoggingTable(ArrayList<ArrayList<String>> content) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table class='custom-table'>");
		builder.append("<tr><td>Parameter Name</td><td>Actual Values</td><td>Expected Values</td><td>Results (Pass / Fail)</td><td>Comments</td></tr>");
		for (ArrayList<String> rowContent : content) {
			builder.append("<tr>");
			for (String cellContent : rowContent) {
				builder.append(String.format("<td>%s</td>", cellContent));
			}
			builder.append("</tr>");
		}

		builder.append("</table>");
		return builder.toString();
	}
	
	public static String getLoggingTable(ArrayList<ArrayList<String>> content, String title, String title_2) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table class='custom-table'>");
		builder.append("<tr><td>Parameter Name</td><td>"+title+"</td><td>"+title_2+"</td><td>Results (Pass / Fail)</td><td>Comments</td></tr>");
		for (ArrayList<String> rowContent : content) {
			builder.append("<tr>");
			for (String cellContent : rowContent) {
				builder.append(String.format("<td>%s</td>", cellContent));
			}
			builder.append("</tr>");
		}

		builder.append("</table>");
		return builder.toString();
	}
	
	
	public static String getValue(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("data.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String GenerateRandomNumber() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999999
		int rand_num = rand.nextInt(999999);

		return String.valueOf(rand_num);
	}
	public static String GenerateRandomDate() {
		Random rand = new Random();

		// Generate random integers in range 0 to 999999
		int rand_num = rand.nextInt(30);

		return String.valueOf(rand_num);
	}

	public static String getDate_TestCase2A(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2A.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2B(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2B.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static void scrollToElement(WebElement element, WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static String getFromTextProperties(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("text.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2D(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2_D.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2E(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2_E.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2F(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2F.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase2G(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase2G.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1L(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_L.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1O(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1O.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_G(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_G.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_H(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_H.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_A(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_A.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_K(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_K.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_M(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_M.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_N(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_N.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_I(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_I.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase39(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_39.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase18(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_18.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase20(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_20.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase21(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_21.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase22(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_22.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase23(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_23.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase29(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_29.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase38(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_38.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase180(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_180.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase179(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_179.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_F(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_F.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_E(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_E.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_C(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_C.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase176(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_176.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase177(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_177.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase182(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_182.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase77(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_77.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase87(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_87.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase151(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_151.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase162(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_162.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase173(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_173.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase1_A(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_A.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_B(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_B.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_GATestCase1_B(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("GAtestcase1_B2.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase1_C(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_C.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase1_D(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_D.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_E(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_E.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase1_F(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase1_F.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase3_D(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase3_D.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_98(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_98.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_96(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_96.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_97(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_97.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_99(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_99.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_34(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_34.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_171(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_171.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getData_TestCase_F004(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("testcase_F004.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_48(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_48.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_19(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_19.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_44(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_44.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_43(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_43.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_60(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_60.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_61(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_61.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_62(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_62.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_63(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_63.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_64(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_64.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_65(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_65.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_66(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_66.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_67(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_67.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_68(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_68.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_69(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_69.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_70(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_70.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_71(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_71.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_72(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_72.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_73(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_73.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_75(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_75.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_76(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_76.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_78(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_78.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_79(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_79.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_80(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_80.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_81(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_81.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_82(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_82.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_83(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_83.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_84(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_84.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_85(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_85.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_86(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_86.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_88(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_88.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_89(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_89.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_90(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_90.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_91(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_91.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_92(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_92.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_93(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_93.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_94(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_94.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_102(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_102.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_103(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_103.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_113(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_113.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_114(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_114.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_115(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_115.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_120(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_120.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_129(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_129.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_135(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_135.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_46(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_46.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase_56(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_56.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_Mini_Audit(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("mini_audit.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}

	public static String getDate_CR58_TestCase_01(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_01.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_02(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_02.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_03(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_03.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_04(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_04.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_05(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_05.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_06(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_06.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_07(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_07.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_08(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_08.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_09(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_09.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_10(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_10.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_11(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_11.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_12(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_12.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	
	public static String getDate_CR58_TestCase_13(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("CR58_TestCase_13.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase183(String value) throws IOException {
        Properties prop = new Properties();
        FileReader reader=new FileReader("partner_183.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	public static String getDate_TestCase184(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_184.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase185(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_185.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase186(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_186.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase187(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_187.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase188(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_188.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase189(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_189.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase190(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_190.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase45(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_45.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase47(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_47.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase49(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_49.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase50(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_50.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase51(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_51.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase52(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_52.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase53(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_53.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase54(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_54.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase55(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_55.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase57(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_57.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase58(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_58.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase59(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_59.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase_161(String value) throws IOException {
        Properties prop = new Properties();
        FileReader reader=new FileReader("partner_161.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	public static String getDate_TestCase_162(String value) throws IOException {
        Properties prop = new Properties();  
        FileReader reader=new FileReader("partner_162.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	public static String getDate_TestCase_163(String value) throws IOException {
        Properties prop = new Properties();
        FileReader reader=new FileReader("partner_163.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	public static String getDate_TestCase_164(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_164.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase_165(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_165.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase_166(String value) throws IOException {
        Properties prop = new Properties();
        FileReader reader=new FileReader("partner_166.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	public static String getDate_TestCase167(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("partner_167.properties");  
		prop.load(reader);
		return prop.getProperty(value);
	}
	public static String getDate_TestCase168(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_168.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase169(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_169.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase170(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_170.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase181(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_181.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	public static String getDate_TestCase_207(String value) throws IOException {
        Properties prop = new Properties();
        FileReader reader=new FileReader("partner_207.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	public static String getDate_TestCase_208(String value) throws IOException {
	    Properties prop = new Properties();
	    FileReader reader=new FileReader("partner_208.properties");  
	    prop.load(reader);
	    return prop.getProperty(value);
	}
	public static String getDate_TestCase_209(String value) throws IOException {
		Properties prop = new Properties();
	    FileReader reader=new FileReader("partner_209.properties");  
	    prop.load(reader);
	    return prop.getProperty(value);
	}
	public static String getDate_TestCase_200(String value) throws IOException {
        Properties prop = new Properties();
        FileReader reader=new FileReader("partner_200.properties");  
        prop.load(reader);
        return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_201(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_201.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_202(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_202.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_203(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_203.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_204(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_204.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_205(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_205.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}
	
	public static String getDate_TestCase_206(String value) throws IOException {
	        Properties prop = new Properties();
	        FileReader reader=new FileReader("partner_206.properties");  
	        prop.load(reader);
	        return prop.getProperty(value);
	}

	
// **************** Amjad *********************************************************************
	public static String getData_TestCase(String tcTestDataFile, String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader(tcTestDataFile);  
		prop.load(reader);
		return prop.getProperty(value);
	}	
}
