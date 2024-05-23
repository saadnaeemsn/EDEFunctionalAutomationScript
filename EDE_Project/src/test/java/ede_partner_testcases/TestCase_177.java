package ede_partner_testcases;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_177 extends BaseTest {
	@Test
	public void testCase_177() throws Exception {

		ExtentTestManager.createTest("CIC177", "CIC 177");

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
		String domesticPartner = Utility.getValue("domesticPartner");
		String alimony = Utility.getValue("alimony");
		String monthly = Utility.getValue("monthly");
		String parentRelation = Utility.getValue("parentRelation");
		String hourly = Utility.getValue("hourly");
		String grandChildRelation = Utility.getValue("grandChildRelation");
		String retirement = Utility.getValue("retirement");
		String selfEmployement = Utility.getValue("selfEmployement");
		String someOneElse = Utility.getValue("someOneElse");
		String otherUnRelatedRelation = Utility.getValue("otherUnRelatedRelation");

		// Get data from testcase3_C.properties
		String state = Utility.getDate_TestCase177("state");
		String firstName = Utility.getDate_TestCase177("firstName");
		String lastName = Utility.getDate_TestCase177("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase177("age");
		String streetAddress = Utility.getDate_TestCase177("streetAddress");
		String city = Utility.getDate_TestCase177("city");
		String zipCode = Utility.getDate_TestCase177("zipCode");
		String county = Utility.getDate_TestCase177("county");
		String phoneNumber = Utility.getDate_TestCase177("phoneNumber");
		String phoneType = Utility.getDate_TestCase177("phoneType");
		String unrelatedPersonFirstName = Utility.getDate_TestCase177("unrelatedPersonFirstName");
		String unrelatedPersonLastName = Utility.getDate_TestCase177("unrelatedPersonLastName");
		String unrelatedPersonFullName = unrelatedPersonFirstName + " " + unrelatedPersonLastName;
		String unrelatedPersonAge = Utility.getDate_TestCase177("unrelatedPersonAge");
		String incomeAmount = Utility.getDate_TestCase177("incomeAmount");
		String incomeType = Utility.getDate_TestCase177("incomeType");
		String employerName = Utility.getDate_TestCase177("employerName");
		String incomePeriod = Utility.getDate_TestCase177("incomePeriod");
		String unrelatedPersonIncomeAmount = Utility.getDate_TestCase177("unrelatedPersonIncomeAmount");
		String unrelatedPersonIncomeType = Utility.getDate_TestCase177("unrelatedPersonIncomeType");
		String unrelatedPersonEmployerName = Utility.getDate_TestCase177("unrelatedPersonEmployerName");
		String unrelatedPersonIncomePeriod = Utility.getDate_TestCase177("unrelatedPersonIncomePeriod");
		String EmployerPhone = Utility.getDate_TestCase177("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase177("gotMarried");
		String childFirstName = Utility.getDate_TestCase177("childFirstName");
		String childLastName = Utility.getDate_TestCase177("childLastName");
		String childFullName = childFirstName + " " + childLastName;
		String childAge = Utility.getDate_TestCase177("childAge");
		String childRelationShip = Utility.getDate_TestCase177("childRelationShip");
		String plan = Utility.getDate_TestCase177("plan");
		String withoutDocument = Utility.getDate_TestCase177("withoutDocument");
		String childIncomeAmount = Utility.getDate_TestCase177("childIncomeAmount");
		String anualPredictedAmount = Utility.getDate_TestCase177("anualPredictedAmount");
		String hours = Utility.getDate_TestCase177("hours");
		String document = Utility.getDate_TestCase177("document");
		String documentType = Utility.getDate_TestCase177("documentType");
		String s050OptionPregnant = Utility.getDate_TestCase177("s050OptionPregnant");
		String babyCount = Utility.getDate_TestCase177("babyCount");
		String coverageEndReason = Utility.getDate_TestCase177("coverageEndReason");
		String premiumAmount = Utility.getDate_TestCase177("premiumAmount");
		String otherAddress = Utility.getDate_TestCase177("otherAddress");
		String otherStreetAddress = Utility.getDate_TestCase177("otherStreetAddress");
		String otherCity = Utility.getDate_TestCase177("otherCity");
		String otherZipCode = Utility.getDate_TestCase177("otherZipCode");
		String otherCounty = Utility.getDate_TestCase177("otherCounty");
		String otherState = Utility.getDate_TestCase177("otherState");

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
		String s012QuestionUnRelatedPeroson = "What is " + unrelatedPersonFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionChild = "What is " + childFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionUnRelatedPeroson = "Is " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionChild = "Is " + childFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What’s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionChild = "What’s" + " " + childFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s027QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s027QuestionSingle")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentChild = "Will " + childFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingleMale = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038Question2 = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038QuestionUnRelatedPeroson = "Does " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s038Question");
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
		String s057QuestionUnRelatedPerson = "Will " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question2UnRelatedPerson = "Select a type of income " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3UnRelatedPerson = "How often does " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question2Child = "Select a type of income " + childFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Child = "How often does " + childFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionUnRelatedPeroson = "Will " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2UnRelatedPeroson = "Select a type of income " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3UnRelatedPeroson = "How often does " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionUnRelatedPerson = "Does " + unrelatedPersonFullName + " "
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
		String s074QuestionUnRelatedPeroson = Utility.getFromTextProperties("s074Question") + " "
				+ unrelatedPersonEmployerName + " (" + unrelatedPersonFullName + "'s job).";
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
		String s090Question2 = "When did " + applicantFullName + " and " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + unrelatedPersonFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s042Question2 = "What's " + applicantFullName + "'s " + Utility.getFromTextProperties("s042Question2");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s019Question2 = "Select the document type that corresponds with " + applicantFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSomeOneElseTaxReturn = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s024Question = "Has " + applicantFullName + " " + Utility.getFromTextProperties("s024Question");
		String s030QuestionChild = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
				+ childFullName + " " + Utility.getFromTextProperties("s030Question");
		String s50Question = Utility.getFromTextProperties("s50Question");
		String s081Question = Utility.getFromTextProperties("s081Question");
		String s071Question = "Which employer offers " + childFullName + "'s "
				+ Utility.getFromTextProperties("s071Question");
		String s072Question = Utility.getFromTextProperties("s072Question");
		String s073Question = "Does " + employerName + " " + Utility.getFromTextProperties("s073Question");
		String s079Question = Utility.getFromTextProperties("s079Question");
		String s067Question = Utility.getFromTextProperties("s067Question");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		commonMethodPage.clickAgreeConntinueBtn();
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
//			commonMethodPage.selectAddress();
		}

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
		commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
		commonMethodPage.selectMailingAddress(yes);
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
		commonMethodPage.enterDob(childAge);
		commonMethodPage.enterFirstName(childFirstName);
		commonMethodPage.enterLastName(childLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(childRelationShip, "No applicable", "not applicable", "1");
		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip GrandChild
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependentSingleFemale, s027DependentDrawerHeading,
			//	s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(no);
		commonMethodPage.verifyS027QuestionSomeOneElseTaxReturn(s027QuestionSomeOneElseTaxReturn);
		commonMethodPage.questionSomeOneElseTaxReturn_S027(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyPTC171S038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012QuestionChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip GrandChild
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027QuestionChild, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(no);
		//commonMethodPage.verifyS027QuestionSomeOneElseTaxReturn(s027QuestionDependentChild);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
		Wait.wait2Second();
		commonMethodPage.whoIsTaxFilerWhoClaims_S028(someOneElse);
		commonMethodPage.selectRelationS28_Item92(otherUnRelatedRelation);
		commonMethodPage.selectRelationS28_ParentInfo(yes);
		commonMethodPage.enterDob(unrelatedPersonAge);
		commonMethodPage.enterFirstName(unrelatedPersonFirstName);
		commonMethodPage.enterLastName(unrelatedPersonLastName);
		commonMethodPage.selectGender(female);
		
		// issue in the below line - UI doesn't show other relation Application ID: 4388108895
		
		commonMethodPage.selectRelation3G_S27(parentRelation, "Not Applicable", "Not Applicable", "not applicable", "1");
		commonMethodPage.clickSaveAndContinueButton();

//		ExtentTestManager.getTest().info("---------------------SCREEN S031----------------------------");
//		Wait.wait2Second();
//		commonMethodPage.liveWithTaxFilerParentWhoClaims_S031(no);
//		// commonMethodPage.liveWithOtherParent_S031(yes,"2");
//		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S032----------------------------");
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S033----------------------------");
		Wait.wait2Second();
		commonMethodPage.isClaimingAnyOtherInTaxReturn_S033(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		//commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		commonMethodPage.whatIsHomeAddress_S041(otherAddress);
		commonMethodPage.enterStreetAddress(otherStreetAddress);
		commonMethodPage.selectStateInContactInfo(otherState);
		commonMethodPage.enterCity(otherCity);
		commonMethodPage.enterZipCode(zipCode);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(otherCounty);
		commonMethodPage.clickSaveAndContinueButton();
		if (!otherState.equals("WI")) {
			commonMethodPage.selectAddress();
		}
//		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		Wait.wait2Second();
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
		Wait.wait2Second();
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
//												Float yearlyIncome = Float.parseFloat(incomeAmount);
//												Float income = yearlyIncome / 12;
//												String monthlyIncome = String.format("%.2f", income);
//												System.out.println(monthlyIncome);
		//
//												// format yearly income
//												String yearIncome =String.format("%.2f", yearlyIncome);
//												System.out.println(yearIncome);

//												String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//												ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//												ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//												Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//												ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//												String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//												ExtentTestManager.getTest().info("Expected: " + yearIncome);
//												ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//												Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//												ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS058(s058QuestionChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionUnRelatedPerson);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionUnRelatedPerson);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		Wait.wait2Second();
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
		Wait.wait2Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// help paying for medical bills
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// S079
		ExtentTestManager.getTest().info("---------------------SCREEN S079----------------------------");
		commonMethodPage.verifyScreen_s079_Question(s079Question);
		commonMethodPage.isParentLiveOutSideHome_S079(childFullName);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS085(s085Question);
		commonMethodPage.recentChanges_S085(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		Wait.wait2Second();
		commonMethodPage.agreeOne();
		commonMethodPage.agreeTwo();
//		commonMethodPage.agreeTwoNew();
		commonMethodPage.agreeThree();
		commonMethodPage.agreeFour();
		commonMethodPage.clickSaveAndContinueButton();
//		commonMethodPage.clickSaveAndContinueButton();

		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		commonMethodPage.downloadEligibilityReport();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------GO TO HOME----------------------------");
		commonMethodPage.clickLogoutDropDown();
//		commonMethodPage.clickLogout();
		commonMethodPage.clickHome();

		ExtentTestManager.getTest().info("---------------------CIC Started----------------------------");
//		loginEdeQa(userName, password, url);
//		commonMethodPage.clickAgreeConntinueBtn();
		commonMethodPage.clickApplication();
		commonMethodPage.clickReportLifeChangeLink();
		commonMethodPage.clickReportLifeChangeButton();

		commonMethodPage.clickContinueBtn();
		commonMethodPage.clickIAgreeCheckBox();
		commonMethodPage.clickIUnderstandCheckBox();
		commonMethodPage.clickIAllowCheckBox();
		commonMethodPage.clickSaveAndContinueButton();

		// Contact Info

		ExtentTestManager.getTest().info("---------------------SCREEN S001----------------------------");
		commonMethodPage.verifyS001(s001Question);
		commonMethodPage.clickSaveAndContinueButton();

		// Address
		ExtentTestManager.getTest().info("---------------------SCREEN S002----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.selectAddress();

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
		commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Phone and email
		ExtentTestManager.getTest().info("---------------------SCREEN S004----------------------------");
		commonMethodPage.verifyS004(s004Question);
		commonMethodPage.clickSaveAndContinueButton();

		// Spoken and written language
		ExtentTestManager.getTest().info("---------------------SCREEN S005----------------------------");
		commonMethodPage.verifyS005(s005Question, questionExplaination, s005DrawerHeading, s005DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// notice medium
		ExtentTestManager.getTest().info("---------------------SCREEN S006----------------------------");
		commonMethodPage.verifyS006(s006Question);
		commonMethodPage.clickSaveAndContinueButton();

		// professional help
		ExtentTestManager.getTest().info("---------------------SCREEN S007----------------------------");
		commonMethodPage.selectIsProfessnalHelping(no);
		commonMethodPage.verifyS007(s007Question, s007DrawerHeading, s007DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Financial coverage
		ExtentTestManager.getTest().info("---------------------SCREEN S008----------------------------");
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant detail
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
//		commonMethodPage.verifyS010(medicaidDrawerHeading, notToIncludeDrawerHeading, removeSomeOneDrawerHeading,
//				medicaidDrawerContent, notIncludeDrawerContent, removeSomeOneDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

//		// S010A
//		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip GrandChild
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependentSingleFemale, s027DependentDrawerHeading, s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(childFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
//		commonMethodPage.verifyS038(s038Question);
		commonMethodPage.verifyPTC171S038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012QuestionChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip GrandChild
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
//		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
//		commonMethodPage.verifyS030Question(s030QuestionChild);
//		commonMethodPage.liveWithAnotherParent_S030(no);
//		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatIsHomeAddress_S041(otherAddress);
		commonMethodPage.enterStreetAddress(otherStreetAddress);
		commonMethodPage.selectStateInContactInfo(otherState);
		commonMethodPage.enterCity(otherCity);
		commonMethodPage.enterZipCode(zipCode);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(otherCounty);
		commonMethodPage.clickSaveAndContinueButton();
		if (!otherState.equals("WI")) {
			commonMethodPage.selectAddress();
		}

		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046QuestionMedicad, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		// S050A
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.selectSitutionHouseHold_S050A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
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

		/*
		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S079----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyScreen_s079_Question(s079Question);
		commonMethodPage.isParentLiveOutSideHome_S079(childFullName);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		
		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		Wait.wait2Second();
//		commonMethodPage.agreeOne();
//		commonMethodPage.agreeTwo();
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
}
}
