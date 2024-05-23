package ede_ph_1;

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

public class TestCase1_N extends BaseTest {
	@Test
	public void testCase1_N() throws Exception {

		ExtentTestManager.createTest("Test case 1.N", "Test case 1.N");

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
		String yearly = Utility.getValue("yearly");
		String monthly = Utility.getValue("monthly");
		String medicare = Utility.getValue("medicare");
		String selfEmployement = Utility.getValue("selfEmployement");
		String oneOfThese = Utility.getValue("oneOfThese");
		String otherReason = Utility.getValue("otherReason");
		String tricare = Utility.getValue("tricare");

		// Get data from testcase1_N.properties
		String state = Utility.getDate_TestCase1_N("state");
		String firstName = Utility.getDate_TestCase1_N("firstName");
		String lastName = Utility.getDate_TestCase1_N("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase1_N("age");
		String streetAddress = Utility.getDate_TestCase1_N("streetAddress");
		String city = Utility.getDate_TestCase1_N("city");
		String zipCode = Utility.getDate_TestCase1_N("zipCode");
		String county = Utility.getDate_TestCase1_N("county");
		String phoneNumber = Utility.getDate_TestCase1_N("phoneNumber");
		String phoneType = Utility.getDate_TestCase1_N("phoneType");
		String SSN = Utility.getDate_TestCase1_N("SSN");
		String spouseSSN = Utility.getDate_TestCase1_N("spouseSSN");
		String relationShip = Utility.getDate_TestCase1_N("relationShip");
		String spouseFirstName = Utility.getDate_TestCase1_N("spouseFirstName");
		String spouseLastName = Utility.getDate_TestCase1_N("spouseLastName");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String s050OptionPregnant = Utility.getDate_TestCase1_N("s050OptionPregnant");
		String babyCount = Utility.getDate_TestCase1_N("babyCount");
		String incomeAmount = Utility.getDate_TestCase1_N("incomeAmount");
		String incomeType = Utility.getDate_TestCase1_N("incomeType");
		String employerName = Utility.getDate_TestCase1_N("employerName");
		String incomePeriod = Utility.getDate_TestCase1_N("incomePeriod");
		String spouseIncomeAmount = Utility.getDate_TestCase1_N("spouseIncomeAmount");
		String spouseIncomeType = Utility.getDate_TestCase1_N("spouseIncomeType");
		String spouseEmployerName = Utility.getDate_TestCase1_N("spouseEmployerName");
		String spouseIncomePeriod = Utility.getDate_TestCase1_N("spouseIncomePeriod");
		String EmployerPhone = Utility.getDate_TestCase1_N("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase1_N("gotMarried");
		String firstChildFirstName = Utility.getDate_TestCase1_N("firstChildFirstName");
		String firstChildLastName = Utility.getDate_TestCase1_N("firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getDate_TestCase1_N("firstChildAge");
		String secondChildFirstName = Utility.getDate_TestCase1_N("secondChildFirstName");
		String secondChildLastName = Utility.getDate_TestCase1_N("secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getDate_TestCase1_N("secondChildAge");
		String thirdChildFirstName = Utility.getDate_TestCase1_N("thirdChildFirstName");
		String thirdChildLastName = Utility.getDate_TestCase1_N("thirdChildLastName");
		String thirdChildFullName = thirdChildFirstName + " " + thirdChildLastName;
		String thirdChildAge = Utility.getDate_TestCase1_N("thirdChildAge");
		String childRelationShip = Utility.getDate_TestCase1_N("childRelationShip");
		String plan = Utility.getDate_TestCase1_N("plan");
		String brotherRelation = Utility.getDate_TestCase1_N("brotherRelation");
		String firstChildSSN = Utility.getDate_TestCase1_N("firstChildSSN");
		String secondChildSSN = Utility.getDate_TestCase1_N("secondChildSSN");
		String thirdChildSSN = Utility.getDate_TestCase1_N("thirdChildSSN");
		String expenseAmount = Utility.getDate_TestCase1_N("expenseAmount");
		String anualPredictedAmount = Utility.getDate_TestCase1_N("anualPredictedAmount");
		String spouseExpenseAmount = Utility.getDate_TestCase1_N("spouseExpenseAmount");
		String theodoreIncomeAmount = Utility.getDate_TestCase1_N("theodoreIncomeAmount");
		String theodoreAnualPredictedIncome = Utility.getDate_TestCase1_N("theodoreAnualPredictedIncome");
		String recentlyMoved = Utility.getDate_TestCase1_N("recentlyMoved");
		String movedZipCode = Utility.getDate_TestCase1_N("movedZipCode");
		String movedState = Utility.getDate_TestCase1_N("movedState");
		String movedCounty = Utility.getDate_TestCase1_N("movedCounty");
		String incomeAmount2 = Utility.getDate_TestCase1_N("incomeAmount2");
		String expenseDescription = Utility.getDate_TestCase1_N("expenseDescription");
		String coverageEndReason = Utility.getDate_TestCase1_N("coverageEndReason");

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
		String s012QuestionSpouse = "What is " + spouseFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionFirstChild = "What is " + firstChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionSecondChild = "What is " + secondChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionThirdChild = "What is " + thirdChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionThirdChild = "Is " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionFemale = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
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
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependent = "Will " + applicantFullName + " and " + spouseFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependent") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s038Question");
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
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionThirdChild = "Will " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionSecondChild = "Will " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionFirstChild = "Will " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2Spouse = "Select a type of income " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Spouse = "How often does " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFirstChild = "Does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSecondChild = "Does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionThirdChild = "Does " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
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
		String s074QuestionSpouse = Utility.getFromTextProperties("s074Question") + " " + spouseEmployerName + " ("
				+ spouseFullName + "'s job).";
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
		String s090Question2 = "When did " + applicantFullName + " and " + spouseFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + spouseFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String FoundNotEligibleDate = ESTTimeZone.getPreviousDate("38", "MM/dd/yyyy");
		String lastDateOfMedicaidCHIP = ESTTimeZone.getPreviousDate("50", "MM/dd/yyyy");
		String loseQualifyingCoverage = ESTTimeZone.getPreviousDate("40", "MM/dd/yyyy");
		String movedDate = ESTTimeZone.getPreviousDate("35", "MM/dd/yyyy");
		String s088Question = Utility.getFromTextProperties("s088Question");
		String dateError = Utility.getFromTextProperties("dateError");
		String s064Question = "income in " + ESTTimeZone.getCurrentYear() + " "
				+ Utility.getFromTextProperties("s064Question");
		String s081Question = Utility.getFromTextProperties("s081Question");
		String s067Question = Utility.getFromTextProperties("s067Question");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		Wait.wait2Second();
		commonMethodPage.clickAgreeConntinueBtn();
		Wait.wait2Second();
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
		commonMethodPage.enterDob(age);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(relationShip, "No applicable", "not applicable", "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDob(firstChildAge);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, "not applicable", "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "2");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "4");
		commonMethodPage.enterDob(secondChildAge);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, brotherRelation, "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "3");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "5");
		commonMethodPage.enterDob(thirdChildAge);
		commonMethodPage.enterFirstName(thirdChildFirstName);
		commonMethodPage.enterLastName(thirdChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, brotherRelation, brotherRelation,
				"not applicable", "not applicable", "not applicable", "not applicable", "4");
		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for male application filler
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

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependent, s027DependentDrawerHeading,
			//	s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(firstChildFirstName);
		commonMethodPage.selectDependent(secondChildFirstName);
		commonMethodPage.selectDependent(thirdChildFirstName);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(firstChildFirstName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(secondChildFirstName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(thirdChildFirstName);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSpouse);
		Wait.wait5Second();
		commonMethodPage.enterSSN(spouseSSN, s012SameNameQuestionFemale);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(firstChildFirstName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(secondChildFirstName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(thirdChildFirstName);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female first child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		Wait.wait5Second();
		commonMethodPage.enterSSN(firstChildSSN, s012SameNameQuestionFirstChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip first child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait15Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female Second child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		Wait.wait5Second();
		commonMethodPage.enterSSN(secondChildSSN, s012SameNameQuestionSecondChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip second child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSecondChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait15Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female third child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionThirdChild);
		Wait.wait5Second();
		commonMethodPage.enterSSN(thirdChildSSN, s012SameNameQuestionThirdChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip third child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionThirdChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait5Second();
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
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P4(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P5(no);
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
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(yes);
		commonMethodPage.expenseType_S058(oneOfThese);
		commonMethodPage.describeExpense(expenseDescription);
		commonMethodPage.expensePeriod_S058(yearly);
		commonMethodPage.enterExpenseAmount_S058(expenseAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Add new income
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.clickAddNewIncomeSource();
		Wait.wait2Second();

		// second income source
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057Question2IncomeType(s057Question2);
		commonMethodPage.selectIncomeType(selfEmployement);
		commonMethodPage.enterIncomeAmountWithOutArrowRight(incomeAmount2);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//				Float yearlyIncome = Float.parseFloat(incomeAmount);
//				Float income = yearlyIncome / 12;
//				String monthlyIncome = String.format("%.2f", income);
//				System.out.println(monthlyIncome);
		//
//				// format yearly income
//				String yearIncome =String.format("%.2f", yearlyIncome);
//				System.out.println(yearIncome);

//				String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//				ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//				ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//				Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//				ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//				String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//				ExtentTestManager.getTest().info("Expected: " + yearIncome);
//				ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//				Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//				ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait5Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		Wait.wait5Second();
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
		Wait.wait2Second();
		commonMethodPage.verifyS058(s058QuestionSpouse);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//				Float yearlyIncome = Float.parseFloat(incomeAmount);
//				Float income = yearlyIncome / 12;
//				String monthlyIncome = String.format("%.2f", income);
//				System.out.println(monthlyIncome);
		//
//				// format yearly income
//				String yearIncome =String.format("%.2f", yearlyIncome);
//				System.out.println(yearIncome);

//				String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//				ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//				ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//				Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//				ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//				String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//				ExtentTestManager.getTest().info("Expected: " + yearIncome);
//				ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//				Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//				ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait5Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionFirstChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionFirstChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSecondChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSecondChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionThirdChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionThirdChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		//Poped up error here
		
		// Item number 186 will appear after fix\
		
//		
//		
//		ExtentTestManager.getTest().info("---------------------SCREEN S064----------------------------");
//		////commonMethodPage.verifyS064(s064Question);
//		commonMethodPage.incomeDiscripancy_S064(otherReason);
//		commonMethodPage.clickSaveAndContinueButton();
		
		
		

//		ExtentTestManager.getTest().info("---------------------SCREEN S081----------------------------");
//		//S68 ran here 
//		//commonMethodPage.verifyS081Question(s081Question);
//		commonMethodPage.coverageThroughJobEndedInLast3Months_S081(firstChildFullName);
//		commonMethodPage.whyCoverageEnd_S081(coverageEndReason);
//		commonMethodPage.clickSaveAndContinueButton();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(applicantFullName);
		commonMethodPage.currentlyEnrolled_S068(spouseFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatTypeCoverageHave_S069(tricare);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatTypeCoverageHave_S069(medicare);
		commonMethodPage.clickSaveAndContinueButton();

//		// Offered from state benefit plan through job
//		ExtentTestManager.getTest().info("---------------------SCREEN S082----------------------------");
//		Wait.wait2Second();
//		commonMethodPage.verifyS082(s082Question);
//		commonMethodPage.stateBenifitPlanThroughJob_S082(noneOfThese);
//		commonMethodPage.clickSaveAndContinueButton();

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

//		// S070 covearge through job starting from next month
//		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
//	//	commonMethodPage.verifyS070(s070Question);
//		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
//		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		//commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait3Second();
		//commonMethodPage.verifyS074(s074QuestionSpouse);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// help paying for medical bills
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		Wait.wait5Second();
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
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
		//commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S090
		ExtentTestManager.getTest().info("---------------------SCREEN S090----------------------------");
		//commonMethodPage.verifyS090(s090Question);
		commonMethodPage.whoGetMarried_S090(applicantFullName + " & " + spouseFullName);
		//commonMethodPage.verifyS090Question2(s090Question2);
		commonMethodPage.s090EnterDate(marriedDate);
		//commonMethodPage.verifyS090Question3(s090Question3);
		commonMethodPage.qualifyForHealthCoverageIn60Days_S090(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		Wait.wait5Second();
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
		Wait.wait5Second();
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait10Second();
		commonMethodPage.downloadEligibilityReport();
		Wait.wait5Second();
		
		//Logout
		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
		commonMethodPage.clickLogoutDropDown();
		commonMethodPage.clickLogout();

		
	}

}
