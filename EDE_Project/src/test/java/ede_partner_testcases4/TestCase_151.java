package ede_partner_testcases4;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_151 extends BaseTest {
	@Test
	public void TestCase_151() throws Exception {

		ExtentTestManager.createTest("Test case 151", "Test case 151");
		String tcDataFile = "partner_151.properties";
		
		// Get data from data.properties
		String url = Utility.getValue("url");
		String userName = Utility.getValue("userName");
		String password = Utility.getValue("password");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String spanTag = Utility.getValue("spanTag");
		String noneOfThese = Utility.getValue("noneOfThese");
		String noneOfTheseChanges = Utility.getValue("noneOfTheseChanges");
		String noneOfTheseChildren = Utility.getValue("noneOfTheseChildren");
		String noneOfThesePeople = Utility.getValue("noneOfThesePeople");
		String single = Utility.getValue("single");
		String married = Utility.getValue("married");
		String noticeMedium = Utility.getValue("noticeMedium");
		String grandChildRelation = Utility.getValue("grandChildRelation");
		String noneOfThePlansMeet = Utility.getValue("noneOfThePlansMeet");

		// Get data from testcase43.properties
		String state = Utility.getData_TestCase(tcDataFile, "state");
		String firstName = Utility.getData_TestCase(tcDataFile, "firstName");
		String lastName = Utility.getData_TestCase(tcDataFile, "lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase(tcDataFile, "age");
		String spouseFirstName = Utility.getData_TestCase(tcDataFile, "spouseFirstName");
		String spouseLastName = Utility.getData_TestCase(tcDataFile, "spouseLastName");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String spouseAge = Utility.getData_TestCase(tcDataFile, "spouseAge");
		String streetAddress = Utility.getData_TestCase(tcDataFile, "streetAddress");
		String city = Utility.getData_TestCase(tcDataFile, "city");
		String zipCode = Utility.getData_TestCase(tcDataFile, "zipCode");
		String county = Utility.getData_TestCase(tcDataFile, "county");
		String phoneNumber = Utility.getData_TestCase(tcDataFile, "phoneNumber");
		String phoneType = Utility.getData_TestCase(tcDataFile, "phoneType");
		String relationship = Utility.getData_TestCase(tcDataFile, "relationship");
		String firstChildFirstName = Utility.getData_TestCase(tcDataFile, "firstChildFirstName");
		String firstChildLastName = Utility.getData_TestCase(tcDataFile, "firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String secondChildFirstName = Utility.getData_TestCase(tcDataFile, "secondChildFirstName");
		String secondChildLastName = Utility.getData_TestCase(tcDataFile, "secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String thirdChildFirstName = Utility.getData_TestCase(tcDataFile, "thirdChildFirstName");
		String thirdChildLastName = Utility.getData_TestCase(tcDataFile, "thirdChildLastName");
		String thirdChildFullName = thirdChildFirstName + " " + thirdChildLastName;
		String childRelationship = Utility.getData_TestCase(tcDataFile, "childRelationship");
		String brotherRelationship = Utility.getData_TestCase(tcDataFile, "brotherRelationship");
		String incomeAmount = Utility.getData_TestCase(tcDataFile, "incomeAmount");
		String incomeType = Utility.getData_TestCase(tcDataFile, "incomeType");
		String employerName = Utility.getData_TestCase(tcDataFile, "employerName");
		String incomePeriod = Utility.getData_TestCase(tcDataFile, "incomePeriod");
		String spouseIncomeAmount = Utility.getData_TestCase(tcDataFile, "spouseIncomeAmount");
		String spouseIncomeType = Utility.getData_TestCase(tcDataFile, "spouseIncomeType");
		String spouseEmployerName = Utility.getData_TestCase(tcDataFile, "spouseEmployerName");
		String spouseIncomePeriod = Utility.getData_TestCase(tcDataFile, "spouseIncomePeriod");
		String spouseReimbursementPeriod = Utility.getData_TestCase(tcDataFile, "spouseReimbursementPeriod");
		String spouseMaxReimbursementAmount = Utility.getData_TestCase(tcDataFile, "spouseMaxReimbursementAmount");
		String firstChildIncomeAmount = Utility.getData_TestCase(tcDataFile, "firstChildIncomeAmount");
		String firstChildIncomeType = Utility.getData_TestCase(tcDataFile, "firstChildIncomeType");
		String firstChildEmployerName = Utility.getData_TestCase(tcDataFile, "firstChildEmployerName");
		String firstChildIncomePeriod = Utility.getData_TestCase(tcDataFile, "firstChildIncomePeriod");
		String firstChildMaxReimbursementAmount = Utility.getData_TestCase(tcDataFile, "firstChildMaxReimbursementAmount");
		String employerPhone = Utility.getData_TestCase(tcDataFile, "employerPhone");
		String spouseEmployerPhone = Utility.getData_TestCase(tcDataFile, "spouseEmployerPhone");
		String firstChildEmployerPhone = Utility.getData_TestCase(tcDataFile, "firstChildEmployerPhone");
		String fullTimeStudent = Utility.getData_TestCase(tcDataFile, "fullTimeStudent");
		String grandChildFirstName = Utility.getData_TestCase(tcDataFile, "grandChildFirstName");
		String grandChildLastName = Utility.getData_TestCase(tcDataFile, "grandChildLastName");
		String grandChildFullName = grandChildFirstName + " " + grandChildLastName;
		String grandChiledAge = Utility.getData_TestCase(tcDataFile, "grandChildAge");
		String loseCoverageDate = ESTTimeZone.getPreviousDate("48", "MM/dd/yyyy");
		String firstChildAge = Utility.getData_TestCase(tcDataFile, "firstChildAge");
		String secondChildAge = Utility.getData_TestCase(tcDataFile, "secondChildAge");
		String thirdChildAge = Utility.getData_TestCase(tcDataFile, "thirdChildAge");
		String coverageThroughAJob = Utility.getData_TestCase(tcDataFile, "coverageThroughAJob");
		String lowestCostHealthPlan = Utility.getData_TestCase(tcDataFile, "lowestCostHealthPlan");
		String lowestCostHealthPlanPeriod = Utility.getData_TestCase(tcDataFile, "lowestCostHealthPlanPeriod");
		
		// Get data from text.properties
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
		String s012Question = "What is " + applicantFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012Questionspouse = "What is " + spouseFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionFirstChild = "What is " + firstChildFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionSecondChild = "What is " + secondChildFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionThirdChild = "What is " + thirdChildFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionGrandChild = "What is " + grandChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014Questionspouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionThirdChild = "Is " + thirdChildFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionGrandChild = "Is " + grandChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s026Question = "What’s" + " " + applicantFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionSpouse = "What’s" + " " + spouseFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionFirstChild = "What’s" + " " + firstChildFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionSecondChild = "What’s" + " " + secondChildFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionThirdChild = "What’s" + " " + thirdChildFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionGrandChild = "What�s" + " " + grandChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale2") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependent = "Will " + applicantFullName + " and " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependent") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingle = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + ESTTimeZone.getCurrentYear() + "?";

		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s038Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionFirstChild = "Is " + firstChildFullName + " " + Utility.getFromTextProperties("s038Question");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionMedicadTN = Utility.getFromTextProperties("s046QuestionMedicadTN");
		String s049QuestionMedicadTNApplicant = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTN");
		String s049QuestionMedicadTNSpouse = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTN");
		String s049QuestionMedicadTNFChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTN");
		String s049QuestionMedicadTNSChild = "Did " + secondChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTN");
		String s049QuestionMedicadTNTChild = "Did " + thirdChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTN");
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Spouse = "Select a type of income " + spouseFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3Spouse = "How often does " + spouseFullName + " " + Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s057QuestionFirstChild = "Will " + firstChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2FirstChild = "Select a type of income " + firstChildFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3FirstChild = "How often does " + firstChildFullName + " " + Utility.getFromTextProperties("s057Question3");
		String s057QuestionSecondChild = "Will " + secondChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionThirdChild = "Will " + thirdChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFirstChild = "Does " + firstChildFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSecondChild = "Does " + secondChildFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionThirdChild = "Does " + thirdChildFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s068Question = Utility.getFromTextProperties("s068Question");
		String s069Question = "What type of coverage does "+applicantFullName+" have?";
		String s069AQuestion = Utility.getFromTextProperties("s069AQuestion");
		String s069BQuestion = Utility.getFromTextProperties("s069BQuestion");
		String minus60DaysDate = ESTTimeZone.getPreviousDate("60", "MMM d, yyyy");
		String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
		String plus60DaysDate2 = ESTTimeZone.getAdvanceDate("60", "MM/d/yyyy");
		String plus65DaysDate = ESTTimeZone.getAdvanceDate("65", "MMM d, yyyy");
		String plus65DaysDate2 = ESTTimeZone.getAdvanceDate("65", "MM/d/yyyy");
		String s069CQuestion = "On " + ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy") + ", will " + spouseFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestion2 = "Which employers offer " + spouseFullName + " " + Utility.getFromTextProperties("s069CQuestion2");
		String s069CQuestionFirstChild = "On " + ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy") + ", will " + firstChildFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestion2FirstChild = "Which employers offer " + firstChildFullName + " " + Utility.getFromTextProperties("s069CQuestion2");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and " + plus60DaysDate + "?";
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s069EQuestion = "Tell us about the ICHRA offered by " + spouseEmployerName + " (" + spouseFullName + "'s job).";
		String s069EQuestion1 = "Tell us about the ICHRA offered by " + spouseEmployerName;
		String s069EQuestion2 = "Tell us about the ICHRA offered by " + firstChildEmployerName + " (" + firstChildFullName + "'s job).";
		String s069EQuestion22 = "Tell us about the ICHRA offered by " + firstChildEmployerName;
		String s070Question = Utility.getFromTextProperties("s070Question");
		String s071ABQuestion = Utility.getFromTextProperties("s071ABQuestion") + " " + spouseEmployerName + " " + Utility.getFromTextProperties("s071ABQuestion2");
		String s071BQuestion = "Which of "+applicantFullName+"'s employers offer "+applicantFullName+" " + Utility.getFromTextProperties("s071BQuestion");
		String s072BQuestion = "Does " + employerName + " " + Utility.getFromTextProperties("s072BQuestion");
		String s072BQuestionSpouse = "Does " + spouseEmployerName + " " + Utility.getFromTextProperties("s072BQuestion");
		String s073BQuestion = "Do the plans offered by " + employerName + " " + Utility.getFromTextProperties("s073BQuestion");
		String s073BQuestion1 = "How much would " + applicantFullName + " " + Utility.getFromTextProperties("s073BQuestion1") + " " + employerName + " just for themself?";
		String s073BQuestion2 = "How often would " + applicantFullName + " " + Utility.getFromTextProperties("s073BQuestion2");
		String s073BQuestion3 = Utility.getFromTextProperties("s073BQuestion3") + " " + employerName + " that covers " + applicantFullName + ", " + secondChildFullName + " ";
		String s073BQuestionSpouse = "Do the plans offered by " + spouseEmployerName + " " + Utility.getFromTextProperties("s073BQuestion");
		String s073BQuestion4 = Utility.getFromTextProperties("s073BQuestion4");
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName + " (" + applicantFullName + "'s job).";
		String s074QuestionSpouse = Utility.getFromTextProperties("s074Question") + " " + spouseEmployerName + " (" + spouseFullName + "'s job).";
		String s074QuestionFirstChild = Utility.getFromTextProperties("s074Question") + " " + firstChildEmployerName + " (" + firstChildFullName + "'s job).";
		String s083Question = Utility.getFromTextProperties("s083Question") + " " + minus60DaysDate + " and " + ESTTimeZone.getCurrentDate("MMM d, yyyy") + "?";
		String s083DrawerHeading = Utility.getFromTextProperties("s083DrawerHeading");
		String date = " " + minus60DaysDate + " - " + ESTTimeZone.getCurrentDate("MMM d, yyyy");
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
		String s83DrawerContent = s83ContentA + date + s83ContentB + date + " " + s83ContentC + date + " " + s83ContentD
				+ date + s83ContentE + date + s83ContentF + date + " " + s83ContentG + date + " " + s83ContentH + date
				+ " " + s83ContentI + date + s83ContentJ;
		String s084Question = Utility.getFromTextProperties("s084Question") + " "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy") + " and " + plus60DaysDate + "?";
		String s084DrawerHeading = Utility.getFromTextProperties("s084DrawerHeading");
		String s085Question = Utility.getFromTextProperties("s085Question") + " " + minus60DaysDate + "?";
		String s090Question = Utility.getFromTextProperties("s090Question");
		String marriedDate = ESTTimeZone.getPreviousDate("45", "MM/dd/yyyy");
		String s090Question2 = "When did " + applicantFullName + " and " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");

		String s030Question = "You told us " + firstChildFullName + " lives with " + applicantFullName + ". Does "
				+ firstChildFullName + " " + Utility.getFromTextProperties("s030Question");
		String s030QuestionGrandChild = "You told us " + grandChildFullName + " lives with " + applicantFullName
				+ ". Does " + grandChildFullName + " " + Utility.getFromTextProperties("s030Question");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s051Question = Utility.getFromTextProperties("s051Question");
		String s051Question2 = "Does one or more of " + firstChildFullName + "'s "
				+ Utility.getFromTextProperties("s051Question2") + " " + state + "?";
		String s067Question = Utility.getFromTextProperties("s067Question");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		commonMethodPage.clickAgreeConntinueBtn();
//		commonMethodPage.selectYear(ESTTimeZone.getCurrentYear());
		commonMethodPage.selectState(state);
		commonMethodPage.clickApplyOrRenew();
		commonMethodPage.clickNext();
		commonMethodPage.clickIAgreeCheckBox();
		commonMethodPage.clickIUnderstandCheckBox();
		commonMethodPage.clickIAllowCheckBox();
		commonMethodPage.clickSaveAndContinueButton();

		// Contact Info

		ExtentTestManager.getTest().info("---------------------SCREEN S001----------------------------");
		commonMethodPage.needCoverage(yes, "1");
		commonMethodPage.verifyS001(s001Question);
		commonMethodPage.enterFirstName(firstName);
		String dob = commonMethodPage.enterDob(age);
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
		if (!state.equals("WI")) {
			commonMethodPage.selectAddress();
		}

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
//		Wait.wait3Second();
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
		commonMethodPage.selectHelpPayingForCoverage(yes);
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant detail
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		// commonMethodPage.verifyS010(medicaidDrawerHeading, notToIncludeDrawerHeading,
		// removeSomeOneDrawerHeading,
		// medicaidDrawerContent, notIncludeDrawerContent, removeSomeOneDrawerContent);
		// Add Second person
		commonMethodPage.clickAddPerson2();
		//commonMethodPage.needCoverage(yes, "2");

		commonMethodPage.enterDob(spouseAge, 2);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(relationship, "No applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson2();
		commonMethodPage.enterDob(firstChildAge, 3);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "2");

		commonMethodPage.clickAddPerson2();
		commonMethodPage.enterDob(secondChildAge, 4);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "2");
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "2");
		commonMethodPage.selectRelation(childRelationship, childRelationship, brotherRelationship, "3");

		commonMethodPage.clickAddPerson2();
		commonMethodPage.enterDob(thirdChildAge, 5);
		commonMethodPage.enterFirstName(thirdChildFirstName);
		commonMethodPage.enterLastName(thirdChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "2");
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "2");
		commonMethodPage.selectRelation(childRelationship, childRelationship, brotherRelationship, "3");
		commonMethodPage.selectRelation(childRelationship, childRelationship, brotherRelationship, "4");
		
		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// CitizenShip - Immigration Status
		ExtentTestManager.getTest().info("---------------------SCREEN S019----------------------------");
		commonMethodPage.verifyS019(s019Question);
		commonMethodPage.chooseAnOptionWithContains("I would like to continue", 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
//		Wait.wait3Second();
		commonMethodPage.verifyS027(s027Question, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependent, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.chooseAnOption(firstChildFullName, 1, 1);
		commonMethodPage.chooseAnOption(secondChildFullName, 1, 1);
		commonMethodPage.chooseAnOption(thirdChildFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyPTC171S038(s038Question);
		commonMethodPage.chooseAnOption(secondChildFullName, 1, 1);
		commonMethodPage.chooseAnOption(thirdChildFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
//		Wait.wait2Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012Questionspouse);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Questionspouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();

		/*
		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionSpouse, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
//		Wait.wait3Second();
		commonMethodPage.verifyS027(s027QuestionSpouse, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependentSpouse, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(no);
		commonMethodPage.chooseAnOption(no, 3);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyPTC171S038(s038QuestionSpouse);
		commonMethodPage.chooseAnOption(secondChildFullName, 1, 1);
		commonMethodPage.chooseAnOption(thirdChildFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// live with another parent
		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
		commonMethodPage.verifyS030Question(s030Question);
		commonMethodPage.liveWithAnotherParent_S030(no);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for 1st Child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
//		commonMethodPage.verifyS027(s027QuestionSpouse, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
//		Wait.wait2Second();
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(no);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyPTC171S038(s038QuestionFirstChild);
		commonMethodPage.chooseAnOption(noneOfTheseChildren, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
//		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for 2nd Child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSecondChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionSecondChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for 3rd Child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionThirdChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionThirdChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
//				commonMethodPage.verifyS027(s027QuestionSpouse, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.verifyS045Question(s045Question1, s045Question2);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyPTC085S049(s049QuestionMedicadTNApplicant, s046QuestionCHIP);
		commonMethodPage.verifyQuestionContents(spanTag, "TennCare (Medicaid) or CoverKids (CHIP) that will end", s049QuestionMedicadTNApplicant, 0, 0);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
//		commonMethodPage.verifyPTC085S049(s049QuestionMedicadTNSpouse, s046QuestionCHIP);
		commonMethodPage.verifyQuestionContents(spanTag, "TennCare (Medicaid) or CoverKids (CHIP) that will end", s049QuestionMedicadTNSpouse, 0, 0);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
//		commonMethodPage.verifyPTC085S049(s049QuestionMedicadTNFChild, s046QuestionCHIP);
		commonMethodPage.verifyQuestionContents(spanTag, "TennCare (Medicaid) or CoverKids (CHIP) that will end", s049QuestionMedicadTNFChild, 0, 0);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P3(no);
//		commonMethodPage.verifyPTC085S049(s049QuestionMedicadTNSChild, s046QuestionCHIP);
		commonMethodPage.verifyQuestionContents(spanTag, "TennCare (Medicaid) or CoverKids (CHIP) that will end", s049QuestionMedicadTNSChild, 0, 0);
		commonMethodPage.chooseAnOption(no, 1, 4);
//		commonMethodPage.verifyPTC085S049(s049QuestionMedicadTNTChild, s046QuestionCHIP);
		commonMethodPage.verifyQuestionContents(spanTag, "TennCare (Medicaid) or CoverKids (CHIP) that will end", s049QuestionMedicadTNTChild, 0, 0);
		commonMethodPage.chooseAnOption(no, 1, 5);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046QuestionMedicadTN, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(noneOfThesePeople);
		commonMethodPage.clickSaveAndContinueButton();

		// S050A
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.selectSitutionHouseHold_S050A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2);
		commonMethodPage.selectIncomeType(incomeType);
		commonMethodPage.enterEmployerName(employerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSpouse);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Spouse);
		commonMethodPage.selectIncomeType(spouseIncomeType);
		commonMethodPage.enterEmployerName(spouseEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Spouse);
		commonMethodPage.incomePeriod_S057(spouseIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(spouseIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSpouse);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income for 1st Child
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionFirstChild);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2FirstChild);
		commonMethodPage.selectIncomeType(firstChildIncomeType);
		commonMethodPage.enterEmployerName(firstChildEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3FirstChild);
		commonMethodPage.incomePeriod_S057(firstChildIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(firstChildIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionFirstChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income for 2nd Child
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSecondChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSecondChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Income for 3rd Child
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionThirdChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionThirdChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		
		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
		commonMethodPage.verifyS069(s069Question);
		commonMethodPage.chooseAnOption(coverageThroughAJob, 2, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		commonMethodPage.verifyS069B(s069BQuestion);
//		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(noneOfThese);
		commonMethodPage.chooseAnOption(spouseFullName, 1, 1);
		commonMethodPage.chooseAnOption(firstChildFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S069C - Spouse - P2
		ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
		commonMethodPage.verifyS069C(s069CQuestion);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS069CQuestion2(s069CQuestion2);
		commonMethodPage.chooseAnOption(spouseEmployerName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069E - Spouse - P2
		ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
		commonMethodPage.verifyS069E(s069EQuestion);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, spouseMaxReimbursementAmount, spouseReimbursementPeriod, spouseEmployerPhone, s069EQuestion1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069C - 1st Child - P3
		ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
		commonMethodPage.verifyS069C(s069CQuestionFirstChild);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS069CQuestion2(s069CQuestion2FirstChild);
		commonMethodPage.chooseAnOption(spouseEmployerName, 1, 1);
		commonMethodPage.chooseAnOption(firstChildEmployerName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069E - 1st Child - P3
		ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
//		commonMethodPage.verifyS069E(s069EQuestion2);
//		commonMethodPage.verifyQuestionContents(spanTag, "offered by " + spouseEmployerName, s069EQuestion2, 2, 1);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, spouseMaxReimbursementAmount, spouseIncomePeriod, spouseEmployerPhone, s069EQuestion1);
//		commonMethodPage.verifyQuestionContents(spanTag, "offered by " + firstChildEmployerName, s069EQuestion2, 2, 1);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, firstChildMaxReimbursementAmount, firstChildIncomePeriod, firstChildEmployerPhone, s069EQuestion22);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 Covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		commonMethodPage.verifyS070(s070Question);
//		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
//		commonMethodPage.chooseAnOption(noneOfThesePeople, 1);
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.chooseAnOption(spouseFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S071B Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S071B----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s071BQuestion"), s071BQuestion, 2, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S072B Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S072B----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s072BQuestion"), s072BQuestion, 2, 1);
		commonMethodPage.chooseAnOption(secondChildFullName, 1, 1);
		commonMethodPage.chooseAnOption(thirdChildFullName, 1, 1);		
		commonMethodPage.clickSaveAndContinueButton();
		
		// S073B Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S073B----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s073BQuestion"), s073BQuestion, 2, 1);
		commonMethodPage.chooseAnOption(yes, 1, 1);
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s073BQuestion1"), s073BQuestion1, 1, 2);
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s073BQuestion2"), s073BQuestion2, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s073BQuestion1, s073BQuestion1, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s073BQuestion2, s073BQuestion2, 1, 1);
		commonMethodPage.ptc151S073BFillForm(lowestCostHealthPlan, lowestCostHealthPlanPeriod, s073BQuestion1);
		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s073BQuestion3"), s073BQuestion3, 2, 1);
		commonMethodPage.ptc151S073BFillForm(lowestCostHealthPlan, lowestCostHealthPlanPeriod, s073BQuestion3);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S071B Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S071B----------------------------");
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s071BQuestion"), s071BQuestion, 1, 2);
//		commonMethodPage.verifyQuestionContents(spanTag, applicantFullName+" " + Utility.getFromTextProperties("s071BQuestion"), applicantFullName+" " + Utility.getFromTextProperties("s071BQuestion"), 1, 2);
		commonMethodPage.chooseAnOption(spouseEmployerName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S072B Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S072B----------------------------");
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s072BQuestion"), s072BQuestion, 1, 2);
		commonMethodPage.verifyQuestionContents(spanTag, s072BQuestionSpouse, s072BQuestionSpouse, 1, 1);
		commonMethodPage.chooseAnOption(secondChildFullName, 1, 1);
		commonMethodPage.chooseAnOption(thirdChildFullName, 1, 1);		
		commonMethodPage.clickSaveAndContinueButton();
		
		// S071AB Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S071AB----------------------------");
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s071ABQuestion"), s071ABQuestion, 1, 2);
//		commonMethodPage.verifyQuestionContents(spanTag, s071ABQuestion, s071ABQuestion, 1, 1);
//		commonMethodPage.enterNSelectOption("input", "aria-label", "Phone Number", 1, spouseEmployerPhone, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S073B Additional Info - 
		ExtentTestManager.getTest().info("---------------------SCREEN S073B----------------------------");
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s073BQuestion"), s073BQuestionSpouse, 1, 2);
		commonMethodPage.verifyQuestionContents(spanTag, s073BQuestionSpouse, s073BQuestionSpouse, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
//		commonMethodPage.verifyQuestionContents(spanTag, Utility.getFromTextProperties("s073BQuestion4"), s073BQuestion4, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s073BQuestion4, s073BQuestion4, 1, 1);
		commonMethodPage.chooseAnOption(noneOfThePlansMeet, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// About Employer - Phone #
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question);
//		commonMethodPage.enterPhoneNumber4(employerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		// About Spouse - Phone #
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074QuestionSpouse);
//		commonMethodPage.enterPhoneNumber4(spouseEmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About First Child - Phone #
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074QuestionFirstChild);
//		commonMethodPage.enterPhoneNumber4(firstChildEmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.ptc151Enter2PhonesNumber(employerName, employerPhone);
//		commonMethodPage.ptc151Enter2PhonesNumber(spouseEmployerName, spouseEmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.ptc151Enter2PhonesNumber(employerName, employerPhone);
//		commonMethodPage.ptc151Enter2PhonesNumber(spouseEmployerName, spouseEmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		commonMethodPage.verifyS084(s084Question, "");
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.verifyS085(s085Question);
		commonMethodPage.chooseAnOption(noneOfTheseChanges, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		Wait.wait2Second();
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.chooseAnOption("I agree", 1, 1);
		commonMethodPage.chooseAnOption("I agree to allow the Marketplace to end the Marketplace coverage for anyone on my application who’s enrolled in both Marketplace and Medicare coverage.", 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait10Second();
//						commonMethodPage.downloadEligibilityReport();
		commonMethodPage.clickLogoutDropDown();
//						commonMethodPage.clickHome();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
//		commonMethodPage.clickLogoutDropDown();

	}
}
