package ede_ph_3;

import java.util.ArrayList;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase3_D extends BaseTest {
	@Test
	public static void testCase3_D() throws Exception {

		ExtentTestManager.createTest("Test case 3.D", "Test case 3.D");

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
		String incarcerated = Utility.getValue("incarcerated");
		String alimony = Utility.getValue("alimony");
		String monthly = Utility.getValue("monthly");
		String parentRelation = Utility.getValue("parentRelation");
		String hourly = Utility.getValue("hourly");
		String domesticPartner = Utility.getValue("domesticPartner");
		String parentDomesticPartner = Utility.getValue("parentDomesticPartner");
		String childOfDomesticPartner = Utility.getValue("childOfDomesticPartner");
		String cobra = Utility.getValue("cobra");
		

		// Get data from testcase3_D.properties
		String state = Utility.getDate_TestCase3_D("state");
		String firstName = Utility.getDate_TestCase3_D("firstName");
		String lastName = Utility.getDate_TestCase3_D("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase3_D("age");
		String streetAddress = Utility.getDate_TestCase3_D("streetAddress");
		String city = Utility.getDate_TestCase3_D("city");
		String zipCode = Utility.getDate_TestCase3_D("zipCode");
		String county = Utility.getDate_TestCase3_D("county");
		String phoneNumber = Utility.getDate_TestCase3_D("phoneNumber");
		String phoneType = Utility.getDate_TestCase3_D("phoneType");
		String SSN = Utility.getDate_TestCase3_D("SSN");
		String domesticSSN = Utility.getDate_TestCase3_D("domesticSSN");
		String relationShip = Utility.getDate_TestCase3_D("relationShip");
		String domesticFirstName = Utility.getDate_TestCase3_D("domesticFirstName");
		String domesticLastName = Utility.getDate_TestCase3_D("domesticLastName");
		String domesticFullName = domesticFirstName + " " + domesticLastName;
		String s050OptionPregnant = Utility.getDate_TestCase3_D("s050OptionPregnant");
		String babyCount = Utility.getDate_TestCase3_D("babyCount");
		String incomeAmount = Utility.getDate_TestCase3_D("incomeAmount");
		String incomeType = Utility.getDate_TestCase3_D("incomeType");
		String employerName = Utility.getDate_TestCase3_D("employerName");
		String incomePeriod = Utility.getDate_TestCase3_D("incomePeriod");
		String domesticIncomeAmount = Utility.getDate_TestCase3_D("domesticIncomeAmount");
		String domesticIncomeType = Utility.getDate_TestCase3_D("domesticIncomeType");
		String domesticEmployerName = Utility.getDate_TestCase3_D("employerNameDomestic");
		String domesticIncomePeriod = Utility.getDate_TestCase3_D("domesticIncomePeriod");
		String EmployerPhone = Utility.getDate_TestCase3_D("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase3_D("gotMarried");
		String childFirstName = Utility.getDate_TestCase3_D("childFirstName");
		String childLastName = Utility.getDate_TestCase3_D("childLastName");
		String childFullName = childFirstName + " " + childLastName;
		String childAge = Utility.getDate_TestCase3_D("childAge");
		String childRelationShip = Utility.getDate_TestCase3_D("childRelationShip");
		String plan = Utility.getDate_TestCase3_D("plan");
		String withoutDocument = Utility.getDate_TestCase3_D("withoutDocument");
		String expenseAmount = Utility.getDate_TestCase3_D("expenseAmount");
		String anualPredictedAmount = Utility.getDate_TestCase3_D("anualPredictedAmount");
		String otherAddress = Utility.getDate_TestCase3_D("otherAddress");
		String otherStreetAddress = Utility.getDate_TestCase3_D("otherStreetAddress");
		String otherCity = Utility.getDate_TestCase3_D("otherCity");
		String otherZipCode = Utility.getDate_TestCase3_D("otherZipCode");
		String otherCounty = Utility.getDate_TestCase3_D("otherCounty");
		String otherState = Utility.getDate_TestCase3_D("otherState");
		String FoundNotEligibleDate = ESTTimeZone.getPreviousDate("38", "MM/dd/yyyy");
		String hours = Utility.getDate_TestCase3_D("hours");
		String premiumAmount = Utility.getDate_TestCase3_D("premiumAmount");
		String incomeAmountDomestic = Utility.getDate_TestCase3_D("incomeAmountDomestic");
		String incomeTypeDomestic = Utility.getDate_TestCase3_D("incomeTypeDomestic");
		String employerNameDomestic = Utility.getDate_TestCase3_D("employerNameDomestic");
		String incomePeriodDomestic = Utility.getDate_TestCase3_D("incomePeriodDomestic");
		String hoursDomestic = Utility.getDate_TestCase3_D("hoursDomestic");
		String anualPredictedAmountDomestic = Utility.getDate_TestCase3_D("anualPredictedAmountDomestic");
		String recentlyMoved = Utility.getDate_TestCase3_D("recentlyMoved");
		String movedZipCode = Utility.getDate_TestCase3_D("movedZipCode");
		String movedCounty = Utility.getDate_TestCase3_D("movedCounty");
		String movedState = Utility.getDate_TestCase3_D("movedState");

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
		String s012QuestionDomestic = "What is " + domesticFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionChild = "What is " + childFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + domesticFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionDomestic = "Is " + domesticFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionChild = "Is " + childFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionDomestic = "What�s" + " " + domesticFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionChild = "What�s" + " " + childFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDomestic = "Does " + domesticFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingle = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSomeOneElseTaxReturn = "Will " + domesticFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s027QuestionDependent = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038Questiondomestic = "Does " + domesticFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s038Question");
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
		String s057QuestionChild = "Will " + childFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionDomestic = "Will " + domesticFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Domestic = "Select a type of income " + domesticFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Domestic = "How often does " + domesticFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionDomestic = "Does " + domesticFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s058Question") + " "
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
		String s074QuestionDomestic = Utility.getFromTextProperties("s074Question") + " " + domesticEmployerName + " ("
				+ domesticFullName + "'s job).";
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
		String s090Question2 = "When did " + applicantFullName + " and " + domesticFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + domesticFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s067Question = Utility.getFromTextProperties("s067Question");
		String s030QuestionChild = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
				+ childFullName + " " + Utility.getFromTextProperties("s030Question");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s071Question = "Which employer offers " + applicantFullName + "'s "
				+ Utility.getFromTextProperties("s071Question");
		String s072Question = Utility.getFromTextProperties("s072Question");
		String s073Question = "Does " + employerName + " " + Utility.getFromTextProperties("s073Question");
		String dateError = Utility.getFromTextProperties("dateError") + " "
				+ ESTTimeZone.getPreviousDate("60", "MMM d, yyyy") + " and "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy");
		String s088Question = Utility.getFromTextProperties("s088Question");
		String movedDate = ESTTimeZone.getPreviousDate("40", "MM/dd/yyyy");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		commonMethodPage.clickToCancelSessionOutBtn();
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
		commonMethodPage.selectGender(female);

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
			//commonMethodPage.selectAddress();
		}

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
		Wait.wait2Second();
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

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDOB_S010(age,"2");
		commonMethodPage.enterFirstName(domesticFirstName);
		commonMethodPage.enterLastName(domesticLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(domesticPartner, "No applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDOB_S010(childAge,"3");
		commonMethodPage.enterFirstName(childFirstName);
		commonMethodPage.enterLastName(childLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(childRelationShip, childOfDomesticPartner, "not applicable", "2");
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

		Wait.wait2Second();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependentSingle, s027DependentDrawerHeading,
			//	s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(childFirstName);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(childFirstName);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionDomestic);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionDomestic, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026QuestionDomestic, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		//commonMethodPage.verifyS027(s027QuestionDomestic, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(no);
		//commonMethodPage.verifyS027QuestionSomeOneElseTaxReturn(s027QuestionSomeOneElseTaxReturn);
		commonMethodPage.selectIsAnyDependent(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(childFirstName);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();	
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS014(s014QuestionChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
		commonMethodPage.verifyS030Question(s030QuestionChild);
		commonMethodPage.liveWithAnotherParent_S030(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.verifyS045Question(s045Question1, s045Question2);
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
		commonMethodPage.enterHours(hours);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
//		commonMethodPage.verifyS058(s058Question);
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

		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(no);
		commonMethodPage.incomePredict_S059(no);
		commonMethodPage.enterAnuualPreditedAmount(anualPredictedAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionDomestic);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Domestic);
		commonMethodPage.selectIncomeType(incomeTypeDomestic);
		commonMethodPage.enterEmployerName(employerNameDomestic);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Domestic);
		commonMethodPage.incomePeriod_S057(incomePeriodDomestic);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmountDomestic);
		commonMethodPage.enterHours(hoursDomestic);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		//commonMethodPage.verifyS058(s058QuestionDomestic);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//																Float yearlyIncome = Float.parseFloat(incomeAmount);
//																Float income = yearlyIncome / 12;
//																String monthlyIncome = String.format("%.2f", income);
//																System.out.println(monthlyIncome);
		//
//																// format yearly income
//																String yearIncome =String.format("%.2f", yearlyIncome);
//																System.out.println(yearIncome);

//																String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//																ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//																ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//																Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//																ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//																String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//																ExtentTestManager.getTest().info("Expected: " + yearIncome);
//																ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//																Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//																ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(childFullName);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatTypeCoverageHave_S069(cobra);
		commonMethodPage.enterEmployerNameCobra_S069(employerName);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

//		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		Wait.wait2Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		//commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S071----------------------------");
		//commonMethodPage.verifyScreen_s071_Question(s071Question);
		commonMethodPage.whichEmployerOfferThisCoverage_S071(employerName);
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S071A----------------------------");
		commonMethodPage.enterPhoneNumber_S004(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

//		ExtentTestManager.getTest().info("---------------------SCREEN S072----------------------------");
//		//commonMethodPage.verifyScreen_s072_Question(s072Question);
//		commonMethodPage.doYouWantToAddAnOtherEmployer_S072(no);
//		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S073----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyScreen_s073_Question(s073Question);
		commonMethodPage.doesEmployerCoverageMeetMinimumValueStandard_S073(yes);
		commonMethodPage.enterAmount_S073(premiumAmount);
		commonMethodPage.selectSelfPremiumPeriod_s073(monthly);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		//commonMethodPage.verifyS074(s074Question);
		//commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		// About Employer of domestic partner
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		//commonMethodPage.verifyS074(s074QuestionDomestic);
		//commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();


//		// help paying for medical bills
//		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
//		commonMethodPage.clickSaveAndContinueButton();
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
		//commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(recentlyMoved);
		//commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S088 needs to be corrected in sense of xpaths
		
		// S088
		ExtentTestManager.getTest().info("---------------------SCREEN S088----------------------------");
		Wait.wait3Second();
		commonMethodPage.verifyS088(s088Question);
		commonMethodPage.whoRecentlyMoved_S088(applicantFullName);
		commonMethodPage.whoRecentlyMoved_S088(childFullName);
		commonMethodPage.enterZipCode(movedZipCode);
		commonMethodPage.selectStateInContactInfo(movedState);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(movedCounty);
		commonMethodPage.s088EnterDate("02/02/2020");
		commonMethodPage.verifyErrorOnDate(dateError);
		commonMethodPage.s088enterDateToFilledField(movedDate);
		commonMethodPage.priorCoverageQuestion_S088(yes);
		commonMethodPage.enterZipCode2OnSamePage(movedZipCode);
		commonMethodPage.selectStateInContactInfoOnSamePage(movedState);
		commonMethodPage.clickCountyDropDownOnSamePage();
		commonMethodPage.selectCountyOnSamePage(movedCounty);
		commonMethodPage.s088EnterDateOnSamePage("02/02/2020");
		commonMethodPage.verifyErrorOnDate(dateError);
		commonMethodPage.s088enterDateToFilledFieldOnSamePage(movedDate);
		commonMethodPage.priorCoverageQuestion_S088OnSamePage(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
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
