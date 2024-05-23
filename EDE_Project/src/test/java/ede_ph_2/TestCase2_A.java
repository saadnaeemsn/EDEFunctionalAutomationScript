package ede_ph_2;

import java.util.ArrayList;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase2_A extends BaseTest {

	@Test
	public void testCase2_A() throws Exception {

		ExtentTestManager.createTest("Test case 2.A", "Test case 2.A");
		//Get data from data.properties
		String url = Utility.getValue("url");
		String lnkSignInEDE = Utility.getValue("lnkSignIntoEDE");
		String userName = Utility.getValue("edeEmail");
		String password = Utility.getValue("edePassword");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String noticeMedium = Utility.getValue("noticeMedium");
		
		//Get data from testcase2A.properties
		String state = Utility.getDate_TestCase2A("state");
		String firstName = Utility.getDate_TestCase2A("firstName");
		String lastName = Utility.getDate_TestCase2A("lastName");
		String fullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase2A("age");		
		String streetAddress = Utility.getDate_TestCase2A("streetAddress");
		String city = Utility.getDate_TestCase2A("city");
		String zipCode = Utility.getDate_TestCase2A("zipCode");
		String county = Utility.getDate_TestCase2A("county");
		String phoneNumber = Utility.getDate_TestCase2A("phoneNumber");
		String phoneType = Utility.getDate_TestCase2A("phoneType");
		String document = Utility.getDate_TestCase2A("document");
		String SSN = Utility.getDate_TestCase2A("SSN");
		String alienNumber = Utility.getDate_TestCase2A("alienNumber");
		String naturalizeNumber = Utility.getDate_TestCase2A("naturalizeNumber");
		
		
		//Get data from text.properties
		String mailingDrawerHeading = Utility.getFromTextProperties("mailingDrawerHeading");
		String linkMailingDrawer = Utility.getFromTextProperties("linkMailingDrawer");
		String s003Question = Utility.getFromTextProperties("s003Question");
		String s001Question = Utility.getFromTextProperties("s001Question");
		String s002Question = Utility.getFromTextProperties("s002Question");
		String s004Question = Utility.getFromTextProperties("s004Question");
		String s005Question = Utility.getFromTextProperties("s005Question");
		String questionExplaination = Utility.getFromTextProperties("questionExplaination");
		String s005DrawerHeading = Utility.getFromTextProperties("s005DrawerHeading");
		String s006Question = Utility.getFromTextProperties("s006Question");
		String s007Question = Utility.getFromTextProperties("s007Question");
		String s007DrawerHeading = Utility.getFromTextProperties("s007DrawerHeading");
		String s008Question = Utility.getFromTextProperties("s008Question");
		String medicaidDrawerHeading = Utility.getFromTextProperties("medicaidDrawerHeading");
		String notToIncludeDrawerHeading = Utility.getFromTextProperties("notToIncludeDrawerHeading");
		String removeSomeOneDrawerHeading = Utility.getFromTextProperties("removeSomeOneDrawerHeading");
		String drawerContent = Utility.getFromTextProperties("drawerContent");
		String s005DrawerContent = Utility.getFromTextProperties("s005DrawerContent");
		String s007DrawerContent = Utility.getFromTextProperties("s007DrawerContent");
		String medicaidDrawerContent = Utility.getFromTextProperties("medicaidDrawerContent");
		String notIncludeDrawerContent = Utility.getFromTextProperties("notIncludeDrawerContent");
		String removeSomeOneDrawerContent = Utility.getFromTextProperties("removeSomeOneDrawerContent");
		String s012Question = "What is " + fullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + fullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s014Question = "Is " + fullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s017Question = "Is " + fullName + " " + Utility.getFromTextProperties("s017Question");
		String s017DrawerHeading = Utility.getFromTextProperties("s017DrawerHeading");
		String s017DrawerContent = Utility.getFromTextProperties("s017DrawerContent");
		String s017DocumentQuestion = "Does "+fullName+" "+Utility.getFromTextProperties("s017DocumentQuestion");
		String s017DocumentDrawerHeading = Utility.getFromTextProperties("s017DocumentDrawerHeading");
		String s017DocumentDrawerContent = Utility.getFromTextProperties("s017DocumentDrawerContent");
		String s017DocumentSubQuestion = fullName + "'s " + Utility.getFromTextProperties("s017DocumentSubQuestion");
		String s017DocumentSubDrawerHeading = Utility.getFromTextProperties("s017DocumentSubDrawerHeading");
		String s017DocumentSubDrawerContent = Utility.getFromTextProperties("s017DocumentSubDrawerContent");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String minus60DaysDate = ESTTimeZone.getPreviousDate("60", "MMM d, yyyy");
		String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and "
				+ plus60DaysDate + "?";
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s083Question = Utility.getFromTextProperties("s083Question") + " " + minus60DaysDate + " and "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy") + "?";
		String s083DrawerHeading = Utility.getFromTextProperties("s083DrawerHeading");
		String date=" "+minus60DaysDate+" - "+ESTTimeZone.getCurrentDate("MMM d, yyyy");
		String s83ContentA = Utility.getFromTextProperties("s83DrawerContentA");
		String s83ContentB = Utility.getFromTextProperties("s83ContentB");
		String s83ContentC = Utility.getFromTextProperties("s83ContentC");
		String s83ContentD = Utility.getFromTextProperties("s83ContentD");
		String s83ContentE = Utility.getFromTextProperties("s83ContentE");
		String s83ContentF = Utility.getFromTextProperties("s83ContentF");
		String s83ContentG = Utility.getFromTextProperties("s83ContentG");
		String s83ContentH = Utility.getFromTextProperties("s83ContentH");
		String s83ContentI = Utility.getFromTextProperties("s83ContentI");
		String s83ContentJ = Utility.getFromTextProperties("s83ContentJ");
		String s83DrawerContent=s83ContentA+date+s83ContentB+date+" "+s83ContentC+date+" "+s83ContentD+date+s83ContentE+date+s83ContentF+date+" "+s83ContentG+date+" "+s83ContentH+date+" "+s83ContentI+date+s83ContentJ;
		String s085Question = Utility.getFromTextProperties("s085Question")+" "+minus60DaysDate+"?";
		String s084Question = Utility.getFromTextProperties("s084Question")+" "+ESTTimeZone.getCurrentDate("MMM d, yyyy")+" and "+plus60DaysDate+"?";
		String s084DrawerHeading = Utility.getFromTextProperties("s084DrawerHeading");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		
		
		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		commonMethodPage.clickAgreeConntinueBtn();
		commonMethodPage.selectYear(ESTTimeZone.getCurrentYear());
		commonMethodPage.selectState(state);
		commonMethodPage.clickApplyOrRenew();
		commonMethodPage.clickNext();
		commonMethodPage.clickIAgreeCheckBox();
		commonMethodPage.clickIUnderstandCheckBox();
		commonMethodPage.clickIAllowCheckBox();
		boolean executeNext = commonMethodPage.clickSaveAndContinueButton();

		if(executeNext) {
		ExtentTestManager.getTest().info("---------------------SCREEN S001----------------------------");
		commonMethodPage.needCoverage(yes,"1");
		commonMethodPage.verifyS001(s001Question);
		commonMethodPage.enterFirstName(firstName);
		commonMethodPage.enterDob(age);
		commonMethodPage.enterMiddleName("");
		commonMethodPage.enterLastName(lastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.clickSaveAndContinueButton();

		// Address
		ExtentTestManager.getTest().info("---------------------SCREEN S002----------------------------");
		commonMethodPage.enterStreetAddress(streetAddress);
		commonMethodPage.verifyS002(s002Question);
		commonMethodPage.selectStateInContactInfo(state);
		commonMethodPage.enterCity(city);
		commonMethodPage.enterZipCode(zipCode);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(county);
		commonMethodPage.clickSaveAndContinueButton();
		if(!state.equals("WI")) {
//			commonMethodPage.selectAddress();
			}

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
		Wait.wait3Second();
		commonMethodPage.selectMailingAddress(yes);
		commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Phone and email
		ExtentTestManager.getTest().info("---------------------SCREEN S004----------------------------");
		commonMethodPage.enterPhoneNumber_S004(phoneNumber);
		commonMethodPage.verifyS004(s004Question);
		commonMethodPage.selectPhoneType(phoneType);
		commonMethodPage.clickSaveAndContinueButton();

		// Spoken and written language
		ExtentTestManager.getTest().info("---------------------SCREEN S005----------------------------");
		commonMethodPage.verifyS005(s005Question, questionExplaination, s005DrawerHeading, s005DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// notice medium
		ExtentTestManager.getTest().info("---------------------SCREEN S006----------------------------");
		commonMethodPage.verifyS006(s006Question);
		commonMethodPage.selectNoticeMedium(noticeMedium);
		commonMethodPage.clickSaveAndContinueButton();

		// professional help
		ExtentTestManager.getTest().info("---------------------SCREEN S007----------------------------");
		commonMethodPage.selectIsProfessnalHelping(no);
		commonMethodPage.verifyS007(s007Question, s007DrawerHeading, s007DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Financial coverage
		ExtentTestManager.getTest().info("---------------------SCREEN S008----------------------------");
		commonMethodPage.selectHelpPayingForCoverage(no);
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant detail
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS010(medicaidDrawerHeading, notToIncludeDrawerHeading, removeSomeOneDrawerHeading,
				//medicaidDrawerContent, notIncludeDrawerContent, removeSomeOneDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();
//		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.enterSSN(SSN, s012SameNameQuestion);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// dreived or naturalize
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.refreshPage();
		// commonMethodPage.verifyS017(s017Question, s017DrawerHeading, s017DrawerContent);
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(yes, s017DocumentQuestion, s017DocumentDrawerHeading, s017DocumentDrawerContent);
		Wait.wait2Second();
		commonMethodPage.selectDocumentType(document, s017DocumentSubQuestion, s017DocumentSubDrawerHeading, s017DocumentSubDrawerContent);
		commonMethodPage.enterAlienNumber(alienNumber);
		commonMethodPage.enterNaturalizedNumber(naturalizeNumber);
		commonMethodPage.clickSaveAndContinueButton();

//		commonMethodPage.clickContinueBtn();
		
		// optional
//		commonMethodPage.clickSaveAndContinueButton();
//		commonMethodPage.refreshPage();
		commonMethodPage.clickSaveAndContinueButton();

		// S050A
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.selectSitutionHouseHold_S050A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		Wait.wait3Second();
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
	//	commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
	//	commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(noneOfThese);
	//	commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(noneOfThese);
	//	commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.agreeTwo();
		commonMethodPage.clickSaveAndContinueButton();

		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
		commonMethodPage.agreeFive();
		commonMethodPage.agreeFive();
		commonMethodPage.enterSignature(fullName);
		commonMethodPage.clickSaveAndContinueButton();
		
		
		commonMethodPage.downloadEligibilityReport();
		commonMethodPage.clickLogoutDropDown();
		
//		Wait.wait5Second();
		}
	}

}
