package ede_ph_3;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase3_G extends BaseTest {
	@Test
	public void testCase3_G() throws Exception {

		ExtentTestManager.createTest("Test case 3.G", "Test case 3.G");

		// Get data from data.properties
		String url = Utility.getValue("url");
		String lnkSignInEDE = Utility.getValue("lnkSignIntoEDE");
		String userName = Utility.getValue("edeEmail");
		String password = Utility.getValue("edePassword");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String married = Utility.getValue("married");
		String noticeMedium = Utility.getValue("noticeMedium");
		String agentUserName = Utility.getValue("agentUserName");
		String agentPassword = Utility.getValue("agentPassword");
		String identityProfing = Utility.getValue("identityProfing");
		String single = Utility.getValue("single");
		String alimony = Utility.getValue("alimony");
		String monthly = Utility.getValue("monthly");
		String marketPlaceCoverage = Utility.getValue("marketPlaceCoverage");
		String someOneElse = Utility.getValue("someOneElse");

		// Get data from testcase3G.properties
		String state = Utility.getDate_TestCase3_G("state");
		String firstName = Utility.getDate_TestCase3_G("firstName");
		String lastName = Utility.getDate_TestCase3_G("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase3_G("age");
		String streetAddress = Utility.getDate_TestCase3_G("streetAddress");
		String city = Utility.getDate_TestCase3_G("city");
		String zipCode = Utility.getDate_TestCase3_G("zipCode");
		String county = Utility.getDate_TestCase3_G("county");
		String phoneNumber = Utility.getDate_TestCase3_G("phoneNumber");
		String phoneType = Utility.getDate_TestCase3_G("phoneType");
		String relationShip = Utility.getDate_TestCase3_G("relationShip");
		String s050OptionPregnant = Utility.getDate_TestCase3_G("s050OptionPregnant");
		String babyCount = Utility.getDate_TestCase3_G("babyCount");
		String incomeAmount = Utility.getDate_TestCase3_G("incomeAmount");
		String incomeType = Utility.getDate_TestCase3_G("incomeType");
		String employerName = Utility.getDate_TestCase3_G("employerName");
		String incomePeriod = Utility.getDate_TestCase3_G("incomePeriod");
		String firstChildIncomeAmount = Utility.getDate_TestCase3_G("firstChildIncomeAmount");
		String firstChildIncomeType = Utility.getDate_TestCase3_G("firstChildIncomeType");
		String firstChildEmployerName = Utility.getDate_TestCase3_G("firstChildEmployerName");
		String firstChildIncomePeriod = Utility.getDate_TestCase3_G("firstChildIncomePeriod");

		String secondChildIncomeAmount = Utility.getDate_TestCase3_G("secondChildIncomeAmount");
		String secondChildIncomeType = Utility.getDate_TestCase3_G("secondChildIncomeType");
		String secondChildEmployerName = Utility.getDate_TestCase3_G("secondChildEmployerName");
		String secondChildIncomePeriod = Utility.getDate_TestCase3_G("secondChildIncomePeriod");
		String secondChildExpenseAmount = Utility.getDate_TestCase3_G("secondChildExpenseAmount");

		String thirdChildIncomeAmount = Utility.getDate_TestCase3_G("thirdChildIncomeAmount");
		String thirdChildIncomeType = Utility.getDate_TestCase3_G("thirdChildIncomeType");
		String thirdChildEmployerName = Utility.getDate_TestCase3_G("thirdChildEmployerName");
		String thirdChildIncomePeriod = Utility.getDate_TestCase3_G("thirdChildIncomePeriod");

		String nieceIncomeAmount = Utility.getDate_TestCase3_G("nieceIncomeAmount");
		String nieceIncomeType = Utility.getDate_TestCase3_G("nieceIncomeType");
		String nieceEmployerName = Utility.getDate_TestCase3_G("nieceEmployerName");
		String nieceIncomePeriod = Utility.getDate_TestCase3_G("nieceIncomePeriod");

		String EmployerPhone = Utility.getDate_TestCase3_G("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase3_G("gotMarried");
		String firstChildFirstName = Utility.getDate_TestCase3_G("firstChildFirstName");
		String firstChildLastName = Utility.getDate_TestCase3_G("firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getDate_TestCase3_G("firstChildAge");
		String secondChildFirstName = Utility.getDate_TestCase3_G("secondChildFirstName");
		String secondChildLastName = Utility.getDate_TestCase3_G("secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getDate_TestCase3_G("secondChildAge");
		String thirdChildFirstName = Utility.getDate_TestCase3_G("thirdChildFirstName");
		String thirdChildLastName = Utility.getDate_TestCase3_G("thirdChildLastName");
		String thirdChildFullName = thirdChildFirstName + " " + thirdChildLastName;
		String thirdChildAge = Utility.getDate_TestCase3_G("thirdChildAge");
		String childRelationShip = Utility.getDate_TestCase3_G("childRelationShip");
		String plan = Utility.getDate_TestCase1L("plan");
		String brotherRelation = Utility.getDate_TestCase3_G("brotherRelation");
		String nieceFirstName = Utility.getDate_TestCase3_G("nieceFirstName");
		String nieceLastName = Utility.getDate_TestCase3_G("nieceLastName");
		String nieceFullName = nieceFirstName + " " + nieceLastName;
		String nieceAge = Utility.getDate_TestCase3_G("nieceAge");
		String daughterInLawFirstName = Utility.getDate_TestCase3_G("daughterInLawFirstName");
		String daughterInLawLastName = Utility.getDate_TestCase3_G("daughterInLawLastName");
		String daughterInLawFullName = daughterInLawFirstName + " " + daughterInLawLastName;
		String daughterInLawAge = Utility.getDate_TestCase3_G("daughterInLawAge");
		String nieceRelation = Utility.getDate_TestCase3_G("nieceRelation");
		String firstCousin = Utility.getDate_TestCase3_G("firstCousin");
		String daughterInLawRelation = Utility.getDate_TestCase3_G("daughterInLawRelation");
		String otherUnRelatedRelation = Utility.getDate_TestCase3_G("otherUnRelatedRelation");
		String brotherSisterInLawRelation = Utility.getDate_TestCase3_G("brotherSisterInLawRelation");
		String otherAddress = Utility.getDate_TestCase3_G("otherAddress");
		String otherStreetAddress = Utility.getDate_TestCase3_G("otherStreetAddress");
		String otherCity = Utility.getDate_TestCase3_G("otherCity");
		String otherZipCode = Utility.getDate_TestCase3_G("otherZipCode");
		String otherCounty = Utility.getDate_TestCase3_G("otherCounty");
		String otherState = Utility.getDate_TestCase3_G("otherState");
		String recentlyMoved = Utility.getDate_TestCase3_G("recentlyMoved");
		String movedZipCode = Utility.getDate_TestCase3_G("movedZipCode");
		String movedState = Utility.getDate_TestCase3_G("movedState");
		String movedCounty = Utility.getDate_TestCase3_G("movedCounty");
		String movedDate = ESTTimeZone.getPreviousDate("40", "MM/dd/yyyy");

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
		String s030Question = "You told us " + secondChildFullName + " lives with " + applicantFullName + ". Does "
				+ secondChildFullName + " " + Utility.getFromTextProperties("s030Question");
		String medicaidDrawerContent = Utility.getFromTextProperties("medicaidDrawerContent");
		String notIncludeDrawerContent = Utility.getFromTextProperties("notIncludeDrawerContent");
		String removeSomeOneDrawerContent = Utility.getFromTextProperties("removeSomeOneDrawerContent");
		String s012Question = "What is " + applicantFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionFirstChild = "What is " + firstChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionSecondChild = "What is " + secondChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionNiece = "What is " + nieceFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionThirdChild = "What is " + thirdChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionThirdChild = "Is " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionNiece = "Is " + nieceFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionThirdChild = "Is " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionFirstChild = "What�s" + " " + firstChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionNiece = "What�s" + " " + nieceFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionSecondChild = "What�s" + " " + secondChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question");
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s053Question = Utility.getFromTextProperties("s053Question");
		String s053DrawerHeading = Utility.getFromTextProperties("s053DrawerHeading");
		String s053DrawerContnet = Utility.getFromTextProperties("s053DrawerContnet");
		String s053Question2 = "How many babies is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s053Question2");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s068Question = Utility.getFromTextProperties("s068Question");
		String s082Question = Utility.getFromTextProperties("s082Question");
		String s069AQuestion = Utility.getFromTextProperties("s069AQuestion");
		String s069BQuestion = Utility.getFromTextProperties("s069BQuestion");
		String minus60DaysDate = ESTTimeZone.getPreviousDate("60", "MMM d, yyyy");
		String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and "
				+ plus60DaysDate + "?";
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s070Question = Utility.getFromTextProperties("s070Question");
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName + " ("
				+ applicantFullName + "'s job).";
		String s083Question = Utility.getFromTextProperties("s083Question") + " " + minus60DaysDate + " and "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy") + "?";
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
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s017DocumentQuestion = "Does " + nieceFullName + " "
				+ Utility.getFromTextProperties("s017DocumentQuestion");
		String s057QuestionFirstChild = "Will " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2FirstChild = "Select a type of income " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3FirstChild = "How often does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s058QuestionFirstChild = "Does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";

		String s057QuestionSecondChild = "Will " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2SecondChild = "Select a type of income " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3SecondChild = "How often does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s058QuestionSecondChild = "Does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";

		String s057QuestionThirdChild = "Will " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2ThirdChild = "Select a type of income " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3ThirdChild = "How often does " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s058QuestionThirdChild = "Does " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";

		String s057QuestionNiece = "Will " + nieceFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Niece = "Select a type of income " + nieceFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Niece = "How often does " + nieceFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s058QuestionNiece = "Does " + nieceFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s088Question = Utility.getFromTextProperties("s088Question");
		String dateError = Utility.getFromTextProperties("dateError") + " "
				+ ESTTimeZone.getPreviousDate("60", "MMM d, yyyy") + " and "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy");
		String s090Question2 = "When did " + secondChildFullName + " and " + daughterInLawFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + secondChildFullName + " or " + daughterInLawFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String s067Question = Utility.getFromTextProperties("s067Question");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		//commonMethodPage.clickToCancelSessionOutBtn();
		commonMethodPage.clickAgreeConntinueBtn();
		//commonMethodPage.selectYear(ESTTimeZone.getCurrentYear());
		commonMethodPage.selectState(state);
		commonMethodPage.clickApplyOrRenew();
		commonMethodPage.clickNext();
		commonMethodPage.clickIAgreeCheckBox();
		commonMethodPage.clickIUnderstandCheckBox();
		commonMethodPage.clickIAllowCheckBox();
		commonMethodPage.clickSaveAndContinueButton();

		// Contact Info

		ExtentTestManager.getTest().info("---------------------SCREEN S001----------------------------");

		commonMethodPage.verifyS001(s001Question);
		commonMethodPage.enterFirstName(firstName);
		commonMethodPage.enterDob(age);
		commonMethodPage.enterMiddleName("");
		commonMethodPage.enterLastName(lastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.needCoverage(no, "1");
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
		//	commonMethodPage.selectAddress();
		}

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
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
		//String applicationId = commonMethodPage.getS010AppId();
		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDOB_S010(firstChildAge,"2");
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, "No applicable", "not applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDOB_S010(secondChildAge, "3");
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, brotherRelation, "not applicable", "not applicable", "2");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "4");
		commonMethodPage.enterDOB_S010(nieceAge,"4");
		commonMethodPage.enterFirstName(nieceFirstName);
		commonMethodPage.enterLastName(nieceLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_L(nieceRelation, firstCousin, firstCousin, "not applicable", "3");
		commonMethodPage.clickSaveAndContinueButton();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		Wait.wait2Second();
		// commonMethodPage.verifyS012(s012Question);
		//commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		Wait.wait2Second();		
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		//commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		Wait.wait2Second();
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependentSingleFemale, s027DependentDrawerHeading,
			//	s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(nieceFirstName);
		commonMethodPage.selectDependent(firstChildFullName);
		commonMethodPage.selectDependent(secondChildFullName);
		commonMethodPage.selectDependent(someOneElse);
		Wait.wait2Second();
		commonMethodPage.enterDob(thirdChildAge);
		commonMethodPage.enterFirstName(thirdChildFirstName);
		commonMethodPage.enterLastName(thirdChildLastName);
		commonMethodPage.selectGender(male);
		//commonMethodPage.selectRelation3G_S27(childRelationShip, brotherRelation, brotherRelation, firstCousin, "4");
		commonMethodPage.selectRelation3G_S27(brotherRelation, brotherRelation, firstCousin,"not applicable" ,"3");
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS014(s014QuestionSecondChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS026(s026QuestionSecondChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.selectToAddNonAplicantSpouse_S026("Someone else who isn't applying for coverage");
		commonMethodPage.enterDob(daughterInLawAge);
		commonMethodPage.enterFirstName(daughterInLawFirstName);
		commonMethodPage.enterLastName(daughterInLawLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_L(daughterInLawRelation, brotherSisterInLawRelation, otherUnRelatedRelation,
				brotherSisterInLawRelation, "4");
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS030Question(s030Question);
		commonMethodPage.liveWithAnotherParent_S030(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionNiece);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS014(s014QuestionNiece, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(yes, s017DocumentQuestion, "", "");
		Wait.wait2Second();
		commonMethodPage.selectDocumentType(noneOfThese, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		//commonMethodPage.clickContinueBtn();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS026(s026QuestionNiece, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(no);
		// commonMethodPage.canYouProvideMoreInfo_S034(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS012(s012QuestionNiece);
		//commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatIsHomeAddress_S041(otherAddress);
		commonMethodPage.enterStreetAddress(otherStreetAddress);
		commonMethodPage.selectStateInContactInfo(otherState);
		commonMethodPage.enterCity(otherCity);
		commonMethodPage.enterZipCode(otherZipCode);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(otherCounty);
		commonMethodPage.clickSaveAndContinueButton();
		if (!otherState.equals("WI")) {
		//	commonMethodPage.selectAddress();
		}
		Wait.wait2Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();

		// SSN Robert this has to restore
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		// commonMethodPage.verifyS012(s012QuestionNiece);
		//x	commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();
		Wait.wait2Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P3(no);
		commonMethodPage.clickSaveAndContinueButton();


		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046QuestionMedicad, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(noneOfThese);
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
		//commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//										Float yearlyIncome = Float.parseFloat(incomeAmount);
//										Float income = yearlyIncome / 12;
//										String monthlyIncome = String.format("%.2f", income);
//										System.out.println(monthlyIncome);
		//
//										// format yearly income
//										String yearIncome =String.format("%.2f", yearlyIncome);
//										System.out.println(yearIncome);

//										String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//										ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//										Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//										String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + yearIncome);
//										ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//										Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Spouse
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

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS058(s058QuestionFirstChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//						yearlyIncome = Float.parseFloat(incomeAmount);
//						income = yearlyIncome / 12;
//						monthlyIncome = String.format("%.2f", income);
//						System.out.println(monthlyIncome);
		//
//						// format yearly income
//						
//						yearIncome =  String.format("%.2f", yearlyIncome);
//						System.out.println(yearIncome);
		//
//						monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//						ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//						ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//						Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//						ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//						yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//						ExtentTestManager.getTest().info("Expected: " + yearIncome);
//						ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//						Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//						ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSecondChild);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2SecondChild);
		commonMethodPage.selectIncomeType(secondChildIncomeType);
		commonMethodPage.enterEmployerName(secondChildEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3SecondChild);
		commonMethodPage.incomePeriod_S057(secondChildIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(secondChildIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		//commonMethodPage.verifyS058(s058QuestionSecondChild);
		Wait.wait2Second();
		commonMethodPage.expenseDecision_S058(yes);
		commonMethodPage.expenseType_S058(alimony);
		commonMethodPage.expensePeriod_S058(monthly);
		commonMethodPage.enterExpenseAmount_S058(secondChildExpenseAmount);
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//								yearlyIncome = Float.parseFloat(incomeAmount);
//								income = yearlyIncome / 12;
//								monthlyIncome = String.format("%.2f", income);
//								System.out.println(monthlyIncome);
		//
//								// format yearly income
//								
//								yearIncome =  String.format("%.2f", yearlyIncome);
//								System.out.println(yearIncome);
		//
//								monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//								ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//								Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//								yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + yearIncome);
//								ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//								Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionNiece);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Niece);
		commonMethodPage.selectIncomeType(nieceIncomeType);
		commonMethodPage.enterEmployerName(nieceEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Niece);
		commonMethodPage.incomePeriod_S057(nieceIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(nieceIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		//commonMethodPage.verifyS058(s058QuestionNiece);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//								yearlyIncome = Float.parseFloat(incomeAmount);
//								income = yearlyIncome / 12;
//								monthlyIncome = String.format("%.2f", income);
//								System.out.println(monthlyIncome);
		//
//								// format yearly income
//								
//								yearIncome =  String.format("%.2f", yearlyIncome);
//								System.out.println(yearIncome);
		//
//								monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//								ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//								Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//								yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + yearIncome);
//								ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//								Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Third child
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionThirdChild);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2ThirdChild);
		commonMethodPage.selectIncomeType(thirdChildIncomeType);
		commonMethodPage.enterEmployerName(thirdChildEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3ThirdChild);
		commonMethodPage.incomePeriod_S057(thirdChildIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(thirdChildIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		//commonMethodPage.verifyS058(s058QuestionThirdChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//									yearlyIncome = Float.parseFloat(incomeAmount);
//									income = yearlyIncome / 12;
//									monthlyIncome = String.format("%.2f", income);
//									System.out.println(monthlyIncome);
		//
//									// format yearly income
//									
//									yearIncome =  String.format("%.2f", yearlyIncome);
//									System.out.println(yearIncome);
		//
//									monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//									ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//									ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//									Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//									ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//									yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//									ExtentTestManager.getTest().info("Expected: " + yearIncome);
//									ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//									Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//									ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(secondChildFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatTypeCoverageHave_S069(marketPlaceCoverage);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		Wait.wait5Second();
		Wait.wait2Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		Wait.wait5Second();
		//commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		//commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// help paying for medical bills
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		Wait.wait5Second();
		//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
			
		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		Wait.wait5Second();
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
		//commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		Wait.wait5Second();
		commonMethodPage.recentChanges_S085(gotMarried);
		commonMethodPage.recentChanges_S085(recentlyMoved);
		//commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S088
		ExtentTestManager.getTest().info("---------------------SCREEN S088----------------------------");
//		Wait.wait5Second();
//		commonMethodPage.verifyS088(s088Question);
//		commonMethodPage.whoRecentlyMoved_S088(firstChildFullName);
//		commonMethodPage.whoRecentlyMoved_S088(secondChildFullName);
//		commonMethodPage.enterZipCode(movedZipCode);
//		commonMethodPage.selectStateInContactInfo(movedState);
//		commonMethodPage.clickCountyDropDown();
//		Wait.wait2Second();
//		commonMethodPage.selectCounty(movedCounty);
//		commonMethodPage.s088EnterDate("02/02/2020");
//		commonMethodPage.verifyErrorOnDate(dateError);
//		commonMethodPage.s088enterDateToFilledField(movedDate);
//		commonMethodPage.priorCoverageQuestion_S088(no);
//		commonMethodPage.enterZipCode2OnSamePage(movedZipCode);
//		commonMethodPage.selectStateInContactInfoOnSamePage(movedState);
//		commonMethodPage.clickCountyDropDownOnSamePage();
//		commonMethodPage.selectCountyOnSamePage(movedCounty);
//		commonMethodPage.s088EnterDateOnSamePage("02/02/2020");
//		commonMethodPage.verifyErrorOnDate(dateError);
//		commonMethodPage.s088enterDateToFilledFieldOnSamePage(movedDate);
//		commonMethodPage.priorCoverageQuestion_S088OnSamePage(no);
//		commonMethodPage.clickSaveAndContinueButton();

		// There are changes in the xpaths, so  updating / commenting the previous work
		Wait.wait5Second();
	//	commonMethodPage.verifyS088(s088Question);
		commonMethodPage.whoRecentlyMoved_S088(firstChildFullName);
		commonMethodPage.whoRecentlyMoved_S088(secondChildFullName);
		commonMethodPage.enterMovedZipCode1(movedZipCode);
		commonMethodPage.selectStateInContactInfo(movedState);
		//commonMethodPage.clickCountyDropDown();
		Wait.wait3Second();
		commonMethodPage.selectCounty(movedCounty);
		commonMethodPage.s088EnterDate("02/02/2020");
		Wait.wait3Second();
		commonMethodPage.verifyErrorOnDate(dateError);
		Wait.wait3Second();
		commonMethodPage.s088enterDateToFilledField(movedDate);
		commonMethodPage.priorCoverageQuestion_S088(no);
		commonMethodPage.enterZipCode2OnSamePage(movedZipCode);
		commonMethodPage.selectStateInContactInfoOnSamePage(movedState);
		commonMethodPage.clickCountyDropDownOnSamePage();
		Wait.wait3Second();
		commonMethodPage.selectCountyOnSamePage(movedCounty);
		Wait.wait3Second();
		commonMethodPage.s088EnterDateOnSamePage("02/02/2020");
		Wait.wait3Second();
		commonMethodPage.verifyErrorOnDate(dateError);
		Wait.wait3Second();
		commonMethodPage.s088enterDateToFilledFieldOnSamePage(movedDate);
		commonMethodPage.priorCoverageQuestion_S088OnSamePage(no);
		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();

		// S090
		ExtentTestManager.getTest().info("---------------------SCREEN S090----------------------------");
		Wait.wait3Second();
		//commonMethodPage.verifyS090(s090Question);
		commonMethodPage.whoGetMarried_S090(secondChildFullName + " & " + daughterInLawFullName);
		commonMethodPage.verifyS090Question2(s090Question2);
		commonMethodPage.s090EnterDate(marriedDate);
		commonMethodPage.verifyS090Question3(s090Question3);
		commonMethodPage.qualifyForHealthCoverageIn60Days_S090(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.agreeTwoNew();
		commonMethodPage.agreeThree();
		commonMethodPage.agreeFour();
		commonMethodPage.clickSaveAndContinueButton();

		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait10Second();
		commonMethodPage.downloadEligibilityReport();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
		commonMethodPage.clickLogoutDropDown();
		Wait.wait10Second();
	}
}
