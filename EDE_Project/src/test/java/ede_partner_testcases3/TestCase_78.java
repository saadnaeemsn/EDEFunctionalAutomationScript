package ede_partner_testcases3;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_78 extends BaseTest {
	@Test
	public void testCase_78() throws Exception {


		ExtentTestManager.createTest("Test case 78", "Test case 78");

		// Get data from data.properties
		String url = Utility.getValue("url");
		String lnkSignInEDE = Utility.getValue("lnkSignIntoEDE");
		String userName = Utility.getValue("edeEmail");
		String password = Utility.getValue("edePassword");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String continueWithoutAnsweringQuestion = Utility.getValue("continueWithoutAnsweringQuestion");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String married = Utility.getValue("married");
		String noticeMedium = Utility.getValue("noticeMedium");
		String noticeMediumEmail = Utility.getValue("selectNoticeMediumEmail");
		String noticeMediumEmailAt = Utility.getValue("noticeMediumEmailAt");
		String agentUserName = Utility.getValue("agentUserName");
		String agentPassword = Utility.getValue("agentPassword");
		String identityProfing = Utility.getValue("identityProfing");
		String single = Utility.getValue("single");
		String domesticPartner = Utility.getValue("domesticPartner");
		String alimony = Utility.getValue("alimony");
		String monthly = Utility.getValue("monthly");
		String parentRelation = Utility.getValue("parentRelation");
		String hourly = Utility.getValue("hourly");
		String grandChildRelation = Utility.getValue("grandChildRelation");
		String retirement = Utility.getValue("retirement");
		String selfEmployement = Utility.getValue("selfEmployement");
		String fosterCare = Utility.getValue("fosterCare");


		// Get data from testcase_78.properties
		String state = Utility.getDate_TestCase_78("state");
		String fosterCareState = Utility.getDate_TestCase_78("fosterCareState");
		String firstName = Utility.getDate_TestCase_78("firstName");
		String lastName = Utility.getDate_TestCase_78("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase_78("age");
		String streetAddress = Utility.getDate_TestCase_78("streetAddress");
		String city = Utility.getDate_TestCase_78("city");
		String zipCode = Utility.getDate_TestCase_78("zipCode");
		String county = Utility.getDate_TestCase_78("county");
		String phoneNumber = Utility.getDate_TestCase_78("phoneNumber");
		String phoneType = Utility.getDate_TestCase_78("phoneType");
		String SSN = Utility.getDate_TestCase_78("SSN");
		String spouseSSN = Utility.getDate_TestCase_78("spouseSSN");
		String childSSN = Utility.getDate_TestCase_78("childSSN");
		String domesticPartnerFirstName = Utility.getDate_TestCase_78("domesticPartnerFirstName");
		String domesticPartnerLastName = Utility.getDate_TestCase_78("domesticPartnerLastName");
		String domesticPartnerFullName = domesticPartnerFirstName + " " + domesticPartnerLastName;
		String domesticPartnerAge = Utility.getDate_TestCase_78("domesticPartnerAge");
		String selfPremiumAmount = Utility.getDate_TestCase_78("selfOnlyPremiumAmount");
		String incomeAmount1 = Utility.getDate_TestCase_78("incomeAmount1");
		String incomeType1 = Utility.getDate_TestCase_78("incomeType1");
		String employerName1 = Utility.getDate_TestCase_78("employerName1");
		String incomePeriod1 = Utility.getDate_TestCase_78("incomePeriod1");
		String incomeAmount2 = Utility.getDate_TestCase_78("incomeAmount2");
		String incomeType2 = Utility.getDate_TestCase_78("incomeType2");
		String employerName2 = Utility.getDate_TestCase_78("employerName2");
		String incomePeriod2 = Utility.getDate_TestCase_78("incomePeriod2");
		String incomeAmount3 = Utility.getDate_TestCase_78("incomeAmount3");
		String incomeType3 = Utility.getDate_TestCase_78("incomeType3");
		String employerName3 = Utility.getDate_TestCase_78("employerName3");
		String incomePeriod3 = Utility.getDate_TestCase_78("incomePeriod3");
		String incomeAmount4 = Utility.getDate_TestCase_78("incomeAmount4");
		String incomeType4 = Utility.getDate_TestCase_78("incomeType4");
		String employerName4 = Utility.getDate_TestCase_78("employerName4");
		String incomePeriod4 = Utility.getDate_TestCase_78("incomePeriod4");
		String incomeAmount5 = Utility.getDate_TestCase_78("incomeAmount5");
		String incomeType5 = Utility.getDate_TestCase_78("incomeType5");
		String employerName5 = Utility.getDate_TestCase_78("employerName5");
		String incomePeriod5 = Utility.getDate_TestCase_78("incomePeriod5");
		String incomeEndDate = Utility.getDate_TestCase_78("income5EndDate");
		String expensePeriod1 = Utility.getDate_TestCase_78("expensePeriod1");
		String expenseAmount1 = Utility.getDate_TestCase_78("expenseAmount1");
		String expensePeriod2 = Utility.getDate_TestCase_78("expensePeriod2");
		String expenseAmount2 = Utility.getDate_TestCase_78("expenseAmount2");


		String domesticPartnerIncomeAmount = Utility.getDate_TestCase_78("domesticPartnerIncomeAmount");
		String domesticPartnerIncomeType = Utility.getDate_TestCase_78("domesticPartnerIncomeType");
		String domesticPartnerEmployerName = Utility.getDate_TestCase_78("domesticPartnerEmployerName");
		String domesticPartnerIncomePeriod = Utility.getDate_TestCase_78("domesticPartnerIncomePeriod");
		String relationShip = Utility.getDate_TestCase_78("relationShip");
		String spouseFirstName = Utility.getDate_TestCase_78("spouseFirstName");
		String spouseLastName = Utility.getDate_TestCase_78("spouseLastName");
		String spouseAge = Utility.getDate_TestCase_78("spouseAge");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String EmployerPhone = Utility.getDate_TestCase_78("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase_78("gotMarried");
		String childFirstName = Utility.getDate_TestCase_78("childFirstName");
		String childLastName = Utility.getDate_TestCase_78("childLastName");
		String childFullName = childFirstName + " " + childLastName;
		String childAge = Utility.getDate_TestCase_78("childAge");
		String childRelationShip = Utility.getDate_TestCase_78("childRelationShip");
		String plan = Utility.getDate_TestCase_78("plan");
		String withoutDocument = Utility.getDate_TestCase_78("withoutDocument");
		String childIncomeAmount = Utility.getDate_TestCase_78("childIncomeAmount");
		String anualPredictedAmount = Utility.getDate_TestCase_78("anualPredictedAmount");
		String hours = Utility.getDate_TestCase_78("hours");
		String leftFosterCareAge = Utility.getDate_TestCase_78("leftFosterCareAge");
		String document = Utility.getDate_TestCase_78("document");
		String documentType = Utility.getDate_TestCase_78("documentType");

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
		String s012QuestionSpouse = "What is " + spouseFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionChild = "What is " + childFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionChild = "Is " + childFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionChild = "What�s" + " " + childFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ "2023" + "?";
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale")
		+ " " + "2023" + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + "2023" + "?";
		String s027QuestionDependentSingleMale = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + "2023"
				+ "?";
		String s030Question = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
				+ childFullName + " " + Utility.getFromTextProperties("s030Question");

		// "2023" to be used for getting Current year

		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question1 = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038Question2 = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionSpouse1 = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038QuestionSpouse2 = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionDaughter = "Does " + childFullName + " " + Utility.getFromTextProperties("s038Question");
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s047Question = Utility.getFromTextProperties("s047Question");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s053Question = Utility.getFromTextProperties("s053Question");
		String s053DrawerHeading = Utility.getFromTextProperties("s053DrawerHeading");
		String s053DrawerContnet = Utility.getFromTextProperties("s053DrawerContnet");
		String s053Question2 = "How many babies is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s053Question2");
		String s054Question = Utility.getFromTextProperties("s054Question");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Questionspouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionChild = "Will " + childFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question2Spouse = "Select a type of income " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Spouse = "How often does " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionDomesticPartner = "Will " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2DomesticPartner = "Select a type of income " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3DomesticPartner = "How often does " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058QuestionApplicant = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2023" + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2023" + "?";
		String s058QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2023" + "?";
		String s058QuestionDomesticPartner = "Does " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + "2023" + "?";
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
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName1 + " ("
				+ applicantFullName + "'s job).";
		String s074QuestionDomesticPartner = Utility.getFromTextProperties("s074Question") + " "
				+ domesticPartnerEmployerName + " (" + domesticPartnerFullName + "'s job).";
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
		String s089Question = Utility.getFromTextProperties("s089Question") + " " + minus60DaysDate + "?";
		String s090Question = Utility.getFromTextProperties("s090Question");
		String marriedDate = ESTTimeZone.getPreviousDate("45", "MM/dd/yyyy");
		String s090Question2 = "When did " + applicantFullName + " and " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s019QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s019Question");
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s042Question2 = "What's " + applicantFullName + "'s " + Utility.getFromTextProperties("s042Question2");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s019Question2 = "Select the document type that corresponds with " + applicantFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s019Question2Spouse = "Select the document type that corresponds with " + spouseFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
				+ "2023" + "?";
		String s027QuestionDependentSingle = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + "2023"
				+ "?";
		String s024Question = "Has " + applicantFullName + " " + Utility.getFromTextProperties("s024Question");
		String s030QuestionChild = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
				+ childFullName + " " + Utility.getFromTextProperties("s030Question");
		String s50Question = Utility.getFromTextProperties("s50Question");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2023" + "?";
		String s081Question = Utility.getFromTextProperties("s081Question");
		String s071QuestionApplicant = "Which of " + applicantFullName + "'s " + "employers offer " + applicantFullName + " "
				+ Utility.getFromTextProperties("s071Question");
		String s072Question = Utility.getFromTextProperties("s072Question");
		String s072Question2 = "Does " + employerName1 + " " + Utility.getFromTextProperties("s072Question2");
		String s073Question = "Do the plans offered by " + employerName1 + " " + Utility.getFromTextProperties("s073Question");
		String s079Question = Utility.getFromTextProperties("s079Question");
		String s067Question = Utility.getFromTextProperties("s067Question");
		String deniedMedicaidDate = ESTTimeZone.getPreviousDate("40","MM/dd/yyyy");

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
		commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
		commonMethodPage.selectMailingAddress(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Phone and email

		ExtentTestManager.getTest().info("---------------------SCREEN S004----------------------------");
		commonMethodPage.enterPhoneNumber(phoneNumber);
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
		commonMethodPage.selectNoticeMediumEmail(noticeMediumEmail);
		Wait.wait2Second();
		commonMethodPage.selectNoticeMediumEmailAt(noticeMediumEmailAt);
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

		// Get application ID
		String applicationId = commonMethodPage.getS010AppId();
		commonMethodPage.clickSaveAndContinueButton();

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

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax

		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		//commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependentSingle, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(no);
		commonMethodPage.selectIsAnyDependentMarriedButFillingSeprate_027(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children

		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyS038(s038Question2);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(no);
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions

		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		Wait.wait5Second();
		commonMethodPage.physicalDisability_S045(noneOfThese);
		commonMethodPage.helpWithDailyActivities_S045(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon

		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
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
		commonMethodPage.selectIncomeType(incomeType1);
		commonMethodPage.enterEmployerName(employerName1);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod1);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount1);
		commonMethodPage.clickSaveAndContinueButton();

		// Applicant Expense

		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		//income verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.addAnotherIncomeSource_S059();
		Wait.wait3Second();

		// Add Another Income Questions

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");

		commonMethodPage.selectIncomeType(incomeType2);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod2);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount2);
		commonMethodPage.clickSaveAndContinueButton();

		//income verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.addAnotherIncomeSource_S059();
		Wait.wait3Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");

		commonMethodPage.selectIncomeType(incomeType3);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod3);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount3);
		commonMethodPage.clickSaveAndContinueButton();

		//income verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.addAnotherIncomeSource_S059();
		Wait.wait3Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");

		commonMethodPage.selectIncomeType(incomeType4);
		//commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		//commonMethodPage.incomePeriod_S057(incomePeriod4);
		//commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount4);
		commonMethodPage.clickSaveAndContinueButton();

		//income verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.addAnotherIncomeSource_S059();
		Wait.wait3Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");

		commonMethodPage.selectIncomeType(incomeType5);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod5);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount5);
		commonMethodPage.enterEndDateJobA(incomeEndDate);
		commonMethodPage.clickSaveAndContinueButton();

		//Expense verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.addAnotherExpense_S059();
		Wait.wait3Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.expensePeriod_S058(expensePeriod1);
		commonMethodPage.enterExpenseAmount_S058(expenseAmount1);
		commonMethodPage.clickSaveAndContinueButton();

		//Expense verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.addAnotherExpense_S059();
		Wait.wait3Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.expensePeriod_S058(expensePeriod2);
		commonMethodPage.enterExpenseAmount_S058(expenseAmount2);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
		Wait.wait2Second();
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
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		//	commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		Wait.wait5Second();
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
		commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(noneOfThese);
		commonMethodPage.verifyS085(s085Question);
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
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
		commonMethodPage.clickLogoutDropDown();
		commonMethodPage.clickLogout();
	}
}
