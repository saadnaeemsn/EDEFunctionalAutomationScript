package ede_partner_testcases;

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

public class TestCase_29 extends BaseTest {
	@Test
	public void testCase_29() throws Exception {

		ExtentTestManager.createTest("Test case 29", "Test case 29");

		// Get data from data.properties
		String url = Utility.getValue("url");
		String userName = Utility.getValue("userName");
		String password = Utility.getValue("password");
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
		String someOneElse = Utility.getValue("someOneElse");
		String nieceRelation = Utility.getValue("nieceRelation");
		String firstCousin = Utility.getValue("firstCousin");
		String gainEligibilityImigration = Utility.getValue("gainEligibilityImigration");

		// Get data from testcase29.properties
		String state = Utility.getDate_TestCase29("state");
		String firstName = Utility.getDate_TestCase29("firstName");
		String lastName = Utility.getDate_TestCase29("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase29("age");
		String streetAddress = Utility.getDate_TestCase29("streetAddress");
		String city = Utility.getDate_TestCase29("city");
		String zipCode = Utility.getDate_TestCase29("zipCode");
		String county = Utility.getDate_TestCase29("county");
		String phoneNumber = Utility.getDate_TestCase29("phoneNumber");
		String phoneType = Utility.getDate_TestCase29("phoneType");
		String relationShip = Utility.getDate_TestCase29("relationShip");
		String daughterFirstName = Utility.getDate_TestCase29("daughterFirstName");
		String daughterLastName = Utility.getDate_TestCase29("daughterLastName");
		String daughterFullName = daughterFirstName + " " + daughterLastName;
		String daughterAge = Utility.getDate_TestCase29("daughterAge");
		String incomeAmount = Utility.getDate_TestCase29("incomeAmount");
		String incomeType = Utility.getDate_TestCase29("incomeType");
		String employerName = Utility.getDate_TestCase29("employerName");
		String incomePeriod = Utility.getDate_TestCase29("incomePeriod");
		String daughterIncomeAmount = Utility.getDate_TestCase29("daughterIncomeAmount");
		String daughterIncomeType = Utility.getDate_TestCase29("daughterIncomeType");
		String daughterEmployerName = Utility.getDate_TestCase29("daughterEmployerName");
		String daughterIncomePeriod = Utility.getDate_TestCase29("daughterIncomePeriod");
		String firstChildIncomeAmount = Utility.getDate_TestCase29("firstChildIncomeAmount");
		String firstChildIncomeType = Utility.getDate_TestCase29("firstChildIncomeType");
		String firstChildEmployerName = Utility.getDate_TestCase29("firstChildEmployerName");
		String firstChildIncomePeriod = Utility.getDate_TestCase29("firstChildIncomePeriod");
		String secondChildIncomeAmount = Utility.getDate_TestCase29("secondChildIncomeAmount");
		String secondChildIncomeType = Utility.getDate_TestCase29("secondChildIncomeType");
		String secondChildEmployerName = Utility.getDate_TestCase29("secondChildEmployerName");
		String secondChildIncomePeriod = Utility.getDate_TestCase29("secondChildIncomePeriod");
		String nieceIncomeAmount = Utility.getDate_TestCase29("nieceIncomeAmount");
		String nieceIncomeType = Utility.getDate_TestCase29("nieceIncomeType");
		String nieceEmployerName = Utility.getDate_TestCase29("nieceEmployerName");
		String nieceIncomePeriod = Utility.getDate_TestCase29("nieceIncomePeriod");
		String EmployerPhone = Utility.getDate_TestCase29("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase29("gotMarried");
		String firstChildFirstName = Utility.getDate_TestCase29("firstChildFirstName");
		String firstChildLastName = Utility.getDate_TestCase29("firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getDate_TestCase29("firstChildAge");
		String secondChildFirstName = Utility.getDate_TestCase29("secondChildFirstName");
		String secondChildLastName = Utility.getDate_TestCase29("secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getDate_TestCase29("secondChildAge");
		String nieceFirstName = Utility.getDate_TestCase29("nieceFirstName");
		String nieceLastName = Utility.getDate_TestCase29("nieceLastName");
		String nieceFullName = nieceFirstName + " " + nieceLastName;
		String nieceAge = Utility.getDate_TestCase29("nieceAge");
		String childRelationShip = Utility.getDate_TestCase29("childRelationShip");
		String plan = Utility.getDate_TestCase29("plan");
		String brotherRelation = Utility.getDate_TestCase29("brotherRelation");
		String document = Utility.getDate_TestCase29("document");
		String documentType = Utility.getDate_TestCase29("documentType");

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
		String s012QuestionDaughter = "What is " + daughterFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionFirstChild = "What is " + firstChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionSecondChild = "What is " + secondChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionNiece = "What is " + nieceFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + daughterFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionNiece = "Is " + nieceFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionDaughter = "Is " + daughterFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionNiece = "Is " + nieceFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionFirstChild = "What�s" + " " + firstChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionSecondChild = "What�s" + " " + secondChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionDaughter = "What�s" + " " + daughterFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependent = "Will " + applicantFullName + " and " + daughterFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependent") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s038Question");
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
		String s057QuestionDaughter = "Will " + daughterFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Daughter = "Select a type of income " + daughterFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Daughter = "How often does " + daughterFullName + " "
				+ Utility.getFromTextProperties("s057Question3");

		String s057QuestionFirstChild = "Will " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2FirstChild = "Select a type of income " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3FirstChild = "How often does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question3");

		String s057QuestionSecondChild = "Will " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2SecondChild = "Select a type of income " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3SecondChild = "How often does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question3");

		String s057QuestionNiece = "Will " + nieceFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Niece = "Select a type of income " + nieceFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Niece = "How often does " + nieceFullName + " "
				+ Utility.getFromTextProperties("s057Question3");

		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";

		String s058QuestionFirstChild = "Does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSecondChild = "Does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionNiece = "Does " + nieceFullName + " " + Utility.getFromTextProperties("s058Question") + " "
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
		String s074QuestionDaughter = Utility.getFromTextProperties("s074Question") + " " + daughterEmployerName + " ("
				+ daughterFullName + "'s job).";
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
		String imigrationDate = ESTTimeZone.getPreviousDate("45", "MM/dd/yyyy");
		String s090Question2 = "When did " + applicantFullName + " and " + daughterFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + daughterFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingle = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s019QuestionFirstChild = "Does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s019Question");
		String s019Question2FirstChild = "Select the document type that corresponds with " + firstChildFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s019QuestionSecondChild = "Does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s019Question");
		String s019Question2SecondChild = "Select the document type that corresponds with " + secondChildFullName
				+ "'s " + Utility.getFromTextProperties("s019Question2");
		String s019QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s019Question");
		String s019Question2Daughter = "Select the document type that corresponds with " + daughterFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s030QuestionSecondChild = "You told us " + secondChildFullName + " lives with " + applicantFullName
				+ ". Does " + secondChildFullName + " " + Utility.getFromTextProperties("s030Question");
		String s030QuestionDaughter = "You told us " + daughterFullName + " lives with " + applicantFullName + ". Does "
				+ daughterFullName + " " + Utility.getFromTextProperties("s030Question");
		String s50Question = Utility.getFromTextProperties("s50Question");
		String s086Question = Utility.getFromTextProperties("s086Question");
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
		String applicationId = commonMethodPage.getS010AppId();
		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDob(firstChildAge);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, "No applicable", "not applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDob(secondChildAge);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, brotherRelation, "not applicable", "not applicable", "2");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "4");
		commonMethodPage.enterDob(daughterAge);
		commonMethodPage.enterFirstName(daughterFirstName);
		commonMethodPage.enterLastName(daughterLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_L(childRelationShip, brotherRelation, brotherRelation, "not applicable", "3");
		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
//		Wait.wait2Second();
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
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
//		Wait.wait3Second();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
//		Wait.wait3Second();
		//commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependentSingle, s027DependentDrawerHeading,
			//	s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(firstChildFirstName);
		commonMethodPage.selectDependent(secondChildFirstName);
		commonMethodPage.selectDependent(daughterFirstName);
		commonMethodPage.selectDependent(someOneElse);
		commonMethodPage.enterDob(nieceAge);
		commonMethodPage.enterFirstName(nieceFirstName);
		commonMethodPage.enterLastName(nieceLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation3G_S27(nieceRelation, firstCousin, firstCousin, firstCousin, "4");
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(daughterFullName);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S019----------------------------");
		commonMethodPage.verifyS019(s019QuestionFirstChild);
		commonMethodPage.immigrationStatus_S019(yes);
		commonMethodPage.verifyS019Question2(s019Question2FirstChild);
		commonMethodPage.selectDocument_S019(document);
		commonMethodPage.selectDocumentType_S019(documentType);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		ExtentTestManager.getTest().info("---------------------SCREEN S021----------------------------");
//		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSecondChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S019----------------------------");
		commonMethodPage.verifyS019(s019QuestionSecondChild);
		commonMethodPage.immigrationStatus_S019(yes);
		commonMethodPage.verifyS019Question2(s019Question2SecondChild);
		commonMethodPage.selectDocument_S019(document);
		commonMethodPage.selectDocumentType_S019(documentType);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		ExtentTestManager.getTest().info("---------------------SCREEN S021----------------------------");
//		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026QuestionSecondChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
//		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
//		commonMethodPage.verifyS030Question(s030QuestionSecondChild);
//		commonMethodPage.liveWithAnotherParent_S030(no);
//		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionDaughter);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionDaughter, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S019----------------------------");
		commonMethodPage.verifyS019(s019QuestionDaughter);
		commonMethodPage.immigrationStatus_S019(yes);
		commonMethodPage.verifyS019Question2(s019Question2Daughter);
		commonMethodPage.selectDocument_S019(document);
		commonMethodPage.selectDocumentType_S019(documentType);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		ExtentTestManager.getTest().info("---------------------SCREEN S021----------------------------");
//		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026QuestionDaughter, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
		commonMethodPage.verifyS030Question(s030QuestionDaughter);
		commonMethodPage.liveWithAnotherParent_S030(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
//		Wait.wait2Second();
		//commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

//		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// discharged vetrans or active duty
		ExtentTestManager.getTest().info("---------------------SCREEN S044----------------------------");
//		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
//		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P3(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P4(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046QuestionMedicad, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicad or CHIP effect due to immigration status
		ExtentTestManager.getTest().info("---------------------SCREEN S050----------------------------");
		commonMethodPage.verifyS050(s046QuestionMedicad, s046QuestionCHIP, s50Question);
		commonMethodPage.deniedMedicaidCHIPBecauseOfImmigrationStatus_S050(noneOfThese);
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
		// calculate monthly income
//														Float yearlyIncome = Float.parseFloat(incomeAmount);
//														Float income = yearlyIncome / 12;
//														String monthlyIncome = String.format("%.2f", income);
//														System.out.println(monthlyIncome);
		//
//														// format yearly income
//														String yearIncome =String.format("%.2f", yearlyIncome);
//														System.out.println(yearIncome);

//														String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//														ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//														ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//														Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//														ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//														String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//														ExtentTestManager.getTest().info("Expected: " + yearIncome);
//														ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//														Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//														ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();

		// Income Questions for firstChild
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
		commonMethodPage.verifyS058(s058QuestionFirstChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//										yearlyIncome = Float.parseFloat(incomeAmount);
//										income = yearlyIncome / 12;
//										monthlyIncome = String.format("%.2f", income);
//										System.out.println(monthlyIncome);
		//
//										// format yearly income
//										
//										yearIncome =  String.format("%.2f", yearlyIncome);
//										System.out.println(yearIncome);
		//
//										monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//										ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//										Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//										yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + yearIncome);
//										ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//										Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for secondChild
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
		commonMethodPage.verifyS058(s058QuestionSecondChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//										yearlyIncome = Float.parseFloat(incomeAmount);
//										income = yearlyIncome / 12;
//										monthlyIncome = String.format("%.2f", income);
//										System.out.println(monthlyIncome);
		//
//										// format yearly income
//										
//										yearIncome =  String.format("%.2f", yearlyIncome);
//										System.out.println(yearIncome);
		//
//										monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//										ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//										Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//										yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + yearIncome);
//										ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//										Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Daughter
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionDaughter);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Daughter);
		commonMethodPage.selectIncomeType(daughterIncomeType);
		commonMethodPage.enterEmployerName(daughterEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Daughter);
		commonMethodPage.incomePeriod_S057(daughterIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(daughterIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionDaughter);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//										yearlyIncome = Float.parseFloat(incomeAmount);
//										income = yearlyIncome / 12;
//										monthlyIncome = String.format("%.2f", income);
//										System.out.println(monthlyIncome);
		//
//										// format yearly income
//										
//										yearIncome =  String.format("%.2f", yearlyIncome);
//										System.out.println(yearIncome);
		//
//										monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//										ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//										Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//										yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + yearIncome);
//										ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//										Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for niece
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
		commonMethodPage.verifyS058(s058QuestionNiece);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//										yearlyIncome = Float.parseFloat(incomeAmount);
//										income = yearlyIncome / 12;
//										monthlyIncome = String.format("%.2f", income);
//										System.out.println(monthlyIncome);
		//
//										// format yearly income
//										
//										yearIncome =  String.format("%.2f", yearlyIncome);
//										System.out.println(yearIncome);
		//
//										monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//										ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//										Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//										yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//										ExtentTestManager.getTest().info("Expected: " + yearIncome);
//										ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//										Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//										ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
//		Wait.wait5Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		//commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
//		Wait.wait5Second();
		//commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
//		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
//		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
//		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
//		Wait.wait5Second();
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
//		Wait.wait5Second();
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
		//commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(gainEligibilityImigration);
		//commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S086----------------------------");
		commonMethodPage.verifyS086(s086Question);
		commonMethodPage.whoRecentlyGainEligibleImigrationStatus_S086(firstChildFullName);
		commonMethodPage.whoRecentlyGainEligibleImigrationStatus_S086(secondChildFullName);
		commonMethodPage.whoRecentlyGainEligibleImigrationStatus_S086(daughterFullName);
		commonMethodPage.s086EnterDateP1(imigrationDate);
		commonMethodPage.s086EnterDateP2(imigrationDate);
		commonMethodPage.s086EnterDateP3(imigrationDate);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		commonMethodPage.agreeTwo();
		commonMethodPage.agreeTwoNew();
		commonMethodPage.agreeThree();
		commonMethodPage.clickSaveAndContinueButton();

		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		commonMethodPage.downloadEligibilityReport();
//		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
//		commonMethodPage.clickLogoutDropDown();

	}
}
