package ede_partner_testcases2;

import java.util.ArrayList;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_46 extends BaseTest {
	@Test
	public void testCase_46() throws Exception {

		ExtentTestManager.createTest("Test case 46", "Test case 46");

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
		String studentLoan = Utility.getValue("studentLoan");
		String monthly = Utility.getValue("monthly");
		String otherCoverage = Utility.getValue("otherCoverage");
		String someOneElse = Utility.getValue("someOneElse");
		String parentRelation = Utility.getValue("parentRelation");
		String selfEmployement = Utility.getValue("selfEmployement");
		String anualPredictedAmount = Utility.getValue("anualPredictedAmount");
		
		
		
		// Get data from testcase1_M.properties
		String state = Utility.getDate_TestCase_46("state");
		String firstName = Utility.getDate_TestCase_46("firstName");
		String lastName = Utility.getDate_TestCase_46("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getDate_TestCase_46("age");
		String streetAddress = Utility.getDate_TestCase_46("streetAddress");
		String city = Utility.getDate_TestCase_46("city");
		String zipCode = Utility.getDate_TestCase_46("zipCode");
		String county = Utility.getDate_TestCase_46("county");
		String phoneNumber = Utility.getDate_TestCase_46("phoneNumber");
		String phoneType = Utility.getDate_TestCase_46("phoneType");
		String SSN = Utility.getDate_TestCase_46("SSN");
		String spouseSSN = Utility.getDate_TestCase_46("spouseSSN");
		String relationShip = Utility.getDate_TestCase_46("relationShip");
		String spouseFirstName = Utility.getDate_TestCase_46("spouseFirstName");
		String spouseLastName = Utility.getDate_TestCase_46("spouseLastName");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String s050OptionPregnant = Utility.getDate_TestCase_46("s050OptionPregnant");
		String babyCount = Utility.getDate_TestCase_46("babyCount");
		String incomeAmount = Utility.getDate_TestCase_46("incomeAmount");
		String incomeType = Utility.getDate_TestCase_46("incomeType");
		String employerName = Utility.getDate_TestCase_46("employerName");
		String incomePeriod = Utility.getDate_TestCase_46("incomePeriod");
		String spouseIncomeAmount = Utility.getDate_TestCase_46("spouseIncomeAmount");
		String spouseIncomeType = Utility.getDate_TestCase_46("spouseIncomeType");
		String spouseEmployerName = Utility.getDate_TestCase_46("spouseEmployerName");
		String spouseIncomePeriod = Utility.getDate_TestCase_46("spouseIncomePeriod");
		String EmployerPhone = Utility.getDate_TestCase_46("EmployerPhone");
		String gotMarried = Utility.getDate_TestCase_46("gotMarried");
		String firstChildFirstName = Utility.getDate_TestCase_46("firstChildFirstName");
		String firstChildLastName = Utility.getDate_TestCase_46("firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getDate_TestCase_46("firstChildAge");
		String secondChildFirstName = Utility.getDate_TestCase_46("secondChildFirstName");
		String secondChildLastName = Utility.getDate_TestCase_46("secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getDate_TestCase_46("secondChildAge");
		String childRelationShip = Utility.getDate_TestCase_46("childRelationShip");
		String plan = Utility.getDate_TestCase_46("plan");
		String brotherRelation = Utility.getDate_TestCase_46("brotherRelation");
		String firstChildSSN = Utility.getDate_TestCase_46("firstChildSSN");
		String secondChildSSN = Utility.getDate_TestCase_46("secondChildSSN");
		String expenseAmount = Utility.getDate_TestCase_46("expenseAmount");
		String coverageName = Utility.getDate_TestCase_46("coverageName");
		String policyNumber = Utility.getDate_TestCase_46("policyNumber");
		String coverageEndReason = Utility.getDate_TestCase_46("coverageEndReason");
		String spouseAge = Utility.getDate_TestCase_46("spouseAge");
		String otherStreetAddress = Utility.getDate_TestCase_46("otherStreetAddress");
		String otherCity = Utility.getDate_TestCase_46("otherCity");
		String otherZipCode = Utility.getDate_TestCase_46("otherZipCode");
		String otherCounty = Utility.getDate_TestCase_46("otherCounty");
		String otherState = Utility.getDate_TestCase_46("otherState");
		String otherAddress = Utility.getDate_TestCase_46("otherAddress");

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
		String s012QuestionSpouseOptional = "What is " + spouseFullName + "'s "
				+ Utility.getFromTextProperties("s012QuestionOptional");
		String s012QuestionFirstChild = "What is " + firstChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionSecondChild = "What is " + secondChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionFemale = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionSecondChild = "What�s" + " " + secondChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionFirstChild = "What�s" + " " + firstChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependent = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
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
		String s057QuestionDaughter = "Will " + secondChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionFirstChild = "Will " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionSecondChild = "Will " + secondChildFullName + " "
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
		String s012QuestionSpouse = "What is " + spouseFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s067Question = Utility.getFromTextProperties("s067Question");
		String s081Question = Utility.getFromTextProperties("s081Question");
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		
		
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		commonMethodPage.clickAgreeConntinueBtn();
		commonMethodPage.selectYear(ESTTimeZone.getCurrentYear());
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
//			commonMethodPage.selectAddress();
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
		commonMethodPage.enterDob(secondChildAge);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_L(childRelationShip, "No applicable", "not applicable", "not applicable", "1");

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
//		Wait.wait2Second();
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.selectToAddNonAplicantSpouse_S026("Someone else who isn't applying for coverage");
		commonMethodPage.enterDob(spouseAge);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_L(parentRelation, "", "", "", "1");
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		//commonMethodPage.verifyS027(s027Question, s027DrawerHeading, s027DrawerContent);
//		Wait.wait3Second();
		commonMethodPage.selectIsFilingTax(no);
		//commonMethodPage.verifyS027Single2(s027QuestionSingle);
		commonMethodPage.selectIsFilingTaxMarriedNotFillingJointlyQuestion2_S027(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependent, s027DependentDrawerHeading,
			//	s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependentMarriedButFillingSeprate_027(yes);
		commonMethodPage.selectDependent(secondChildFirstName);
		commonMethodPage.selectDependent(someOneElse);
		commonMethodPage.enterDob(firstChildAge);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, brotherRelation, childRelationShip, "", "3");
		commonMethodPage.doesApplicantAndSpouseLiveTogather_027(no);
		commonMethodPage.areYouHeadOfHouseHold_027_4thIndex(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(no);
		commonMethodPage.verifyS041AQuestion2(s041AQuestion2);
		commonMethodPage.selectWhoLiveOnThisAddress_S041A(firstChildFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip spouse
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
		//commonMethodPage.verifyS026(s026QuestionSecondChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S031----------------------------");
//		Wait.wait2Second();
		commonMethodPage.liveWithTaxFilerParentWhoClaims_S031(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		commonMethodPage.whatIsHomeAddress_S041(otherAddress);
		commonMethodPage.enterStreetAddress(otherStreetAddress);
		commonMethodPage.selectStateInContactInfo(otherState);
		commonMethodPage.enterCity(otherCity);
		commonMethodPage.enterZipCode(otherZipCode);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(otherCounty);
		commonMethodPage.clickSaveAndContinueButton();
		if (!otherState.equals("WI")) {
//			commonMethodPage.selectAddress();
		}
		
		// Screen 34 didn't appear
		
		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
//		Wait.wait2Second();
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(yes);
		commonMethodPage.clickSaveAndContinueButton();

//		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
//		Wait.wait3Second();
	//	commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
//		Wait.wait3Second();
		commonMethodPage.whatIsHomeAddress_S041(otherStreetAddress);
		commonMethodPage.clickSaveAndContinueButton();

//		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		//commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();
		commonMethodPage.clickContinueWithoutSsnBtn();

//		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.verifyS045Question(s045Question1, s045Question2);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
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
		commonMethodPage.selectIncomeType(selfEmployement);
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

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionDaughter);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSecondChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(no);
		commonMethodPage.incomePredict_S059(no);
		commonMethodPage.enterAnuualPreditedAmount(anualPredictedAmount);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
	}
}
