package ede_partner_testcases4;

import java.util.ArrayList;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_154 extends BaseTest {
	@Test
	public void TestCase_154() throws Exception {

		ExtentTestManager.createTest("Test case 154", "Test case 154");
		String tcDataFile = "partner_154.properties";
		
		// Get data from data.properties
		String url = Utility.getValue("url");
		String userName = Utility.getValue("userName");
		String password = Utility.getValue("password");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String noneOfTheseChanges = Utility.getValue("noneOfTheseChanges");
		String noneOfThesePeople = Utility.getValue("noneOfThesePeople");
		String single = Utility.getValue("single");
		String married = Utility.getValue("married");
		String noticeMedium = Utility.getValue("noticeMedium");
		String grandChildRelation = Utility.getValue("grandChildRelation");

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
		String daughterFirstName = Utility.getData_TestCase(tcDataFile, "daughterFirstName");
		String daughterLastName = Utility.getData_TestCase(tcDataFile, "daughterLastName");
		String daughterFullName = daughterFirstName + " " + daughterLastName;
		String daughterRelationship = Utility.getData_TestCase(tcDataFile, "daughterRelationship");
		String incomeAmount = Utility.getData_TestCase(tcDataFile, "incomeAmount");
		String incomeType = Utility.getData_TestCase(tcDataFile, "incomeType");
		String employerName = Utility.getData_TestCase(tcDataFile, "employerName");
		String incomePeriod = Utility.getData_TestCase(tcDataFile, "incomePeriod");
		String spouseIncomeAmount = Utility.getData_TestCase(tcDataFile, "spouseIncomeAmount");
		String spouseIncomeType = Utility.getData_TestCase(tcDataFile, "spouseIncomeType");
		String spouseEmployerName = Utility.getData_TestCase(tcDataFile, "spouseEmployerName");
		String spouseIncomePeriod = Utility.getData_TestCase(tcDataFile, "spouseIncomePeriod");
		String employerPhone = Utility.getData_TestCase(tcDataFile, "employerPhone");
		String spouseEmployerPhone = Utility.getData_TestCase(tcDataFile, "spouseEmployerPhone");
		String fullTimeStudent = Utility.getData_TestCase(tcDataFile, "fullTimeStudent");
		String grandChildFirstName = Utility.getData_TestCase(tcDataFile, "grandChildFirstName");
		String grandChildLastName = Utility.getData_TestCase(tcDataFile, "grandChildLastName");
		String grandChildFullName = grandChildFirstName + " " + grandChildLastName;
		String grandChiledAge = Utility.getData_TestCase(tcDataFile, "grandChildAge");
		String loseCoverageDate = ESTTimeZone.getPreviousDate("48", "MM/dd/yyyy");
		String daughterAge = Utility.getData_TestCase(tcDataFile, "daughterAge");

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
		String s012QuestionDaughter = "What is " + daughterFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionGrandChild = "What is " + grandChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + daughterFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014Questionspouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionDaughter = "Is " + daughterFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionGrandChild = "Is " + grandChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s026Question = "What’s" + " " + applicantFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026Questionspouse = "What’s" + " " + spouseFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionDaughter = "What’s" + " " + daughterFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionGrandChild = "What�s" + " " + grandChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027Questionspouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingle = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentPair = "Will " + applicantFullName + " and " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependent") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentPairDependents = "Who are "+ applicantFullName+" and "+spouseFullName;
		
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s038Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038Questionspouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Questionspouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionDaughter = "Will " + daughterFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2spouse = "Select a type of income " + spouseFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3spouse = "How often does " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058Questionspouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionDaughter = "Does " + daughterFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s068Question = Utility.getFromTextProperties("s068Question");
		String s069AQuestion = Utility.getFromTextProperties("s069AQuestion");
		String s069BQuestion = Utility.getFromTextProperties("s069BQuestion");
		String s069CQuestion = "On " + ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy") + ", will " + applicantFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestionSpouse = "On " + ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy") + ", will " + spouseFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestionDaughter = "On " + ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy") + ", will " + daughterFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestion2 = "Which employers offer " + applicantFullName + " " + Utility.getFromTextProperties("s069CQuestion2");
		String s069CQuestion2Spouse = "Which employers offer " + spouseFullName + " " + Utility.getFromTextProperties("s069CQuestion2");
		String s069CQuestion2Daughter = "Which employers offer " + daughterFullName + " " + Utility.getFromTextProperties("s069CQuestion2");
		String s069EQuestion = "Tell us about the ICHRA offered by " + employerName + " (" + applicantFullName + "'s job).";
		String s069EQuestionSpouse = "Tell us about the ICHRA offered by " + spouseEmployerName + " (" + spouseFullName + "'s job).";
		String s069EQuestionDaughter = "Tell us about the ICHRA offered by " + spouseEmployerName + " (" + spouseFullName + "'s job).";
		String s069EQuestion1 = "Tell us about the ICHRA offered by " + employerName;
		String s069EQuestion1Spouse = "Tell us about the ICHRA offered by " + spouseEmployerName;
		String s069EQuestion2 = "Tell us about the ICHRA offered by " + spouseEmployerName;
		String reimbursementPeriod = Utility.getData_TestCase(tcDataFile, "reimbursementPeriod");
		String reimbursementAmount = Utility.getData_TestCase(tcDataFile, "reimbursementAmount");
		String spouseReimbursementPeriod = Utility.getData_TestCase(tcDataFile, "spouseReimbursementPeriod");
		String spouseReimbursementAmount = Utility.getData_TestCase(tcDataFile, "spouseReimbursementAmount");
		String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
		String plus59DaysDate = ESTTimeZone.getAdvanceDate("59", "MM/d/yyyy");
		String plus60DaysDate2 = ESTTimeZone.getAdvanceDate("60", "MM/d/yyyy");
		String plus61DaysDate = ESTTimeZone.getAdvanceDate("61", "MMM d, yyyy");
		String plus61DaysDate2 = ESTTimeZone.getAdvanceDate("61", "MM/d/yyyy");
		String plus65DaysDate = ESTTimeZone.getAdvanceDate("65", "MMM d, yyyy");
		String plus65DaysDate2 = ESTTimeZone.getAdvanceDate("65", "MM/d/yyyy");
		String minus60DaysDate = ESTTimeZone.getPreviousDate("60", "MMM d, yyyy");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and "
				+ plus60DaysDate + "?";
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s070Question = Utility.getFromTextProperties("s070Question");
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName + " ("
				+ applicantFullName + "'s job).";
		String s074Questionspouse = Utility.getFromTextProperties("s074Question") + " " + spouseEmployerName + " ("
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
		String marriedDate = ESTTimeZone.getPreviousDate("45", "MM/dd/yyyy");
		String s090Question2 = "When did " + applicantFullName + " and " + daughterFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + daughterFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");

		String s030Question = "You told us " + daughterFullName + " lives with " + applicantFullName + ". Does "
				+ daughterFullName + " " + Utility.getFromTextProperties("s030Question");
		String s030QuestionGrandChild = "You told us " + grandChildFullName + " lives with " + applicantFullName
				+ ". Does " + grandChildFullName + " " + Utility.getFromTextProperties("s030Question");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s051Question = Utility.getFromTextProperties("s051Question");
		String s051Question2 = "Does one or more of " + daughterFullName + "'s "
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
		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDOB_S010(spouseAge, "2");
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(relationship, "No applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		commonMethodPage.enterDOB_S010(daughterAge, "3");
		commonMethodPage.enterFirstName(daughterFirstName);
		commonMethodPage.enterLastName(daughterLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(daughterRelationship, daughterRelationship, "not applicable", "2");

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

		/*
		// CitizenShip - Immigration Status
		ExtentTestManager.getTest().info("---------------------SCREEN S019----------------------------");
		commonMethodPage.verifyS019(s019Question);
		commonMethodPage.chooseAnOptionWithContains("I would like to continue", 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		
		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
//		Wait.wait3Second();
		commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependentPair, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.verifyQuestionContents("span", s027QuestionDependentPairDependents, s027QuestionDependentPairDependents, 1, 2);
		commonMethodPage.chooseAnOption(daughterFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		 commonMethodPage.verifyS038(s038Question);
		commonMethodPage.chooseAnOption(no, 1, 1);
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
		commonMethodPage.verifyS026(s026Questionspouse, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
//		Wait.wait3Second();
		commonMethodPage.verifyS027(s027Questionspouse, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependentSpouse, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(no);
		commonMethodPage.chooseAnOption(no, 3);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyS038(s038Questionspouse);
		commonMethodPage.chooseAnOption(no, 1, 1);
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

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionDaughter);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionDaughter, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionDaughter, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
//		commonMethodPage.verifyS027(s027Questionspouse, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*	
		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
//		Wait.wait2Second();
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(no);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS038(s038QuestionDaughter);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
//		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
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
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//						Float yearlyIncome = Float.parseFloat(incomeAmount);
//						Float income = yearlyIncome / 12;
//						String monthlyIncome = String.format("%.2f", income);
//						System.out.println(monthlyIncome);
		//
//						// format yearly income
//						String yearIncome =String.format("%.2f", yearlyIncome);
//						System.out.println(yearIncome);

//						String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//						ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//						ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//						Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//						ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//						String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//						ExtentTestManager.getTest().info("Expected: " + yearIncome);
//						ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//						Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//						ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for Daughter
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Questionspouse);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2spouse);
		commonMethodPage.selectIncomeType(spouseIncomeType);
		commonMethodPage.enterEmployerName(spouseEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3spouse);
		commonMethodPage.incomePeriod_S057(spouseIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(spouseIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058Questionspouse);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income for child
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionDaughter);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionDaughter);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
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
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.chooseAnOption(spouseFullName, 1, 1);
		commonMethodPage.chooseAnOption(daughterFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S069C - Applicant - P1/Applicant
		ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
		commonMethodPage.verifyS069C(s069CQuestion);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS069CQuestion2(s069CQuestion2);
		commonMethodPage.chooseAnOption(employerName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069E - Applicant - P1/Applicant
		ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
		commonMethodPage.verifyS069E(s069EQuestion);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, reimbursementAmount, reimbursementPeriod, employerPhone, s069EQuestion1);
//		commonMethodPage.ptc151S069EFillForm(plus59DaysDate, plus61DaysDate2, reimbursementAmount, reimbursementPeriod, employerPhone, s069EQuestion1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069C - P2/Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
		commonMethodPage.verifyS069C(s069CQuestionSpouse);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS069CQuestion2(s069CQuestion2Spouse);
		commonMethodPage.chooseAnOption(spouseEmployerName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069E - P2/Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
		commonMethodPage.verifyS069E(s069EQuestionSpouse);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, spouseReimbursementAmount, spouseReimbursementPeriod, spouseEmployerPhone, s069EQuestion1Spouse);
//		commonMethodPage.ptc151S069EFillForm(plus59DaysDate, plus61DaysDate2, spouseReimbursementAmount, spouseReimbursementPeriod, spouseEmployerPhone, s069EQuestion1Spouse);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069C - P3/Daughter
		ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
		commonMethodPage.verifyS069C(s069CQuestionDaughter);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS069CQuestion2(s069CQuestion2Daughter);
		commonMethodPage.chooseAnOption(spouseEmployerName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069E - P3/Daughter
		ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
		commonMethodPage.verifyS069E(s069EQuestionDaughter);
		commonMethodPage.clickSaveAndContinueButton();
		
		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		commonMethodPage.verifyS070(s070Question);
//		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		//commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(employerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of Daughter
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		//commonMethodPage.verifyS074(s074QuestionDaughter);
		commonMethodPage.enterPhoneNumber4(spouseEmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// help paying for medical bills
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
//		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.loseQualifyingHealthCovRecent_PTC043S083(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
//		Wait.wait5Second();
		commonMethodPage.verifyS084(s084Question, "");
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.verifyS085(s085Question);
		commonMethodPage.recentChanges_S085(noneOfThese);
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
		/*
		commonMethodPage.agreeOne();
		commonMethodPage.agreeTwoNew();
		commonMethodPage.agreeThree();
		commonMethodPage.agreeFour();
		*/
		commonMethodPage.clickSaveAndContinueButton();

		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait15Second();
		Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
//		commonMethodPage.downloadEligibilityReport();
//		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
//		commonMethodPage.clickLogoutDropDown();

	}
}
