package api_functional_integration;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_F004_Agent extends BaseTest {
	@Test
	public void testCase_F004_Agent() throws Exception {

		ExtentTestManager.createTest("TestCase F004 Agent", "TestCase F004 Agent");

		// Get data from data.properties
		String url = Utility.getValue("url");
		String userName = Utility.getValue("agentUserName");
		String password = Utility.getValue("agentPassword");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String married = Utility.getValue("married");
		String agentUserName = Utility.getValue("agentUserName");
		String agentPassword = Utility.getValue("agentPassword");
		String identityProfing = Utility.getValue("identityProfing");
		String single = Utility.getValue("single");
		String alimony = Utility.getValue("alimony");
		String everyTwoWeek = Utility.getValue("everyTwoWeek");
		String monthly = Utility.getValue("monthly");
		String studentLoan = Utility.getValue("studentLoan");
		String selfEmployement = Utility.getValue("selfEmployement");
		String peaceCorps = Utility.getValue("peaceCorps");
		String retirement = Utility.getValue("retirement");
		String remove = Utility.getValue("remove");
		String death = Utility.getValue("death");
		String noticeMedium = Utility.getValue("noticeMedium");

		// Get data from testcase2A.properties
		String state = Utility.getData_TestCase_F004("state");
		String firstName = Utility.getData_TestCase_F004("firstName");
		String lastName = Utility.getData_TestCase_F004("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase_F004("age");
		String streetAddress = Utility.getData_TestCase_F004("streetAddress");
		String city = Utility.getData_TestCase_F004("city");
		String zipCode = Utility.getData_TestCase_F004("zipCode");
		String county = Utility.getData_TestCase_F004("county");
		String phoneNumber = Utility.getData_TestCase_F004("phoneNumber");
		String phoneType = Utility.getData_TestCase_F004("phoneType");
		String SSN = Utility.getData_TestCase_F004("SSN");
		String spouseSSN = Utility.getData_TestCase_F004("spouseSSN");
		String relationShip = Utility.getData_TestCase_F004("relationShip");
		String spouseFirstName = Utility.getData_TestCase_F004("spouseFirstName");
		String spouseLastName = Utility.getData_TestCase_F004("spouseLastName");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String s050OptionPregnant = Utility.getData_TestCase_F004("s050OptionPregnant");
		String babyCount = Utility.getData_TestCase_F004("babyCount");
		String incomeAmount = Utility.getData_TestCase_F004("incomeAmount");
		String incomeType = Utility.getData_TestCase_F004("incomeType");
		String employerName = Utility.getData_TestCase_F004("employerName");
		String incomePeriod = Utility.getData_TestCase_F004("incomePeriod");
		String spouseIncomeAmount = Utility.getData_TestCase_F004("spouseIncomeAmount");
		String spouseIncomeType = Utility.getData_TestCase_F004("spouseIncomeType");
		String spouseEmployerName = Utility.getData_TestCase_F004("spouseEmployerName");
		String spouseIncomePeriod = Utility.getData_TestCase_F004("spouseIncomePeriod");
		String EmployerPhone = Utility.getData_TestCase_F004("EmployerPhone");
		String gotMarried = Utility.getData_TestCase_F004("gotMarried");
		String firstChildFirstName = Utility.getData_TestCase_F004("firstChildFirstName");
		String firstChildLastName = Utility.getData_TestCase_F004("firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getData_TestCase_F004("firstChildAge");
		String secondChildFirstName = Utility.getData_TestCase_F004("secondChildFirstName");
		String secondChildLastName = Utility.getData_TestCase_F004("secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getData_TestCase_F004("secondChildAge");
		String thirdChildFirstName = Utility.getData_TestCase_F004("thirdChildFirstName");
		String thirdChildLastName = Utility.getData_TestCase_F004("thirdChildLastName");
		String thirdChildFullName = thirdChildFirstName + " " + thirdChildLastName;
		String thirdChildAge = Utility.getData_TestCase_F004("thirdChildAge");
		String childRelationShip = Utility.getData_TestCase_F004("childRelationShip");
		String plan = Utility.getData_TestCase_F004("plan");
		String brotherRelation = Utility.getData_TestCase_F004("brotherRelation");
		String firstChildSSN = Utility.getData_TestCase_F004("firstChildSSN");
		String secondChildSSN = Utility.getData_TestCase_F004("secondChildSSN");
		String thirdChildSSN = Utility.getData_TestCase_F004("thirdChildSSN");
		String fourthChildFirstName = Utility.getData_TestCase_F004("fourthChildFirstName");
		String fourthChildLastName = Utility.getData_TestCase_F004("fourthChildLastName");
		String fourthChildFullName = fourthChildFirstName + " " + fourthChildLastName;
		String fourthChildAge = Utility.getData_TestCase_F004("fourthChildAge");
		String fourthChildSSN = Utility.getData_TestCase_F004("fourthChildSSN");
		String fifthChildFirstName = Utility.getData_TestCase_F004("fifthChildFirstName");
		String fifthChildLastName = Utility.getData_TestCase_F004("fifthChildLastName");
		String fifthChildFullName = fifthChildFirstName + " " + fifthChildLastName;
		String fifthChildAge = Utility.getData_TestCase_F004("fifthChildAge");
		String fifthChildSSN = Utility.getData_TestCase_F004("fifthChildSSN");
		String sixthChildFirstName = Utility.getData_TestCase_F004("sixthChildFirstName");
		String sixthChildLastName = Utility.getData_TestCase_F004("sixthChildLastName");
		String sixthChildFullName = sixthChildFirstName + " " + sixthChildLastName;
		String sixthChildAge = Utility.getData_TestCase_F004("sixthChildAge");
		String sixthChildSSN = Utility.getData_TestCase_F004("sixthChildSSN");
		String seventhChildFirstName = Utility.getData_TestCase_F004("seventhChildFirstName");
		String seventhChildLastName = Utility.getData_TestCase_F004("seventhChildLastName");
		String seventhChildFullName = seventhChildFirstName + " " + seventhChildLastName;
		String seventhChildAge = Utility.getData_TestCase_F004("seventhChildAge");
		String seventhChildSSN = Utility.getData_TestCase_F004("seventhChildSSN");
		String expenseAmount = Utility.getData_TestCase_F004("expenseAmount");
		String anualPredictedAmount = Utility.getData_TestCase_F004("anualPredictedAmount");
		String spouseExpenseAmount = Utility.getData_TestCase_F004("spouseExpenseAmount");
		String theodoreIncomeAmount = Utility.getData_TestCase_F004("theodoreIncomeAmount");
		String theodoreAnualPredictedIncome = Utility.getData_TestCase_F004("theodoreAnualPredictedIncome");
		String recentlyMoved = Utility.getData_TestCase_F004("recentlyMoved");
		String movedZipCode = Utility.getData_TestCase_F004("movedZipCode");
		String movedState = Utility.getData_TestCase_F004("movedState");
		String movedCounty = Utility.getData_TestCase_F004("movedCounty");
		String spouseAge = Utility.getData_TestCase_F004("spouseAge");
		String preferredSpokenLanguage = Utility.getData_TestCase_F004("preferredSpokenLanguage");
		String preferredWrittenLanguage = Utility.getData_TestCase_F004("preferredWrittenLanguage");
		String noticeMediumEmail = Utility.getData_TestCase_F004("noticeMediumEmail");
		String lailahRace = Utility.getData_TestCase_F004("lailahRace");
		String jayceRace = Utility.getData_TestCase_F004("jayceRace");
		String salvadorRace = Utility.getData_TestCase_F004("salvadorRace");
		String amareRace = Utility.getData_TestCase_F004("amareRace");
		String amareOrigin = Utility.getData_TestCase_F004("amareOrigin");
		String zainRace = Utility.getData_TestCase_F004("zainRace");
		String zainOrigin = Utility.getData_TestCase_F004("zainOrigin");
		String ryannRace = Utility.getData_TestCase_F004("ryannRace");
		String elissaRace = Utility.getData_TestCase_F004("elissaRace");
		String retireeIncomeAmount = Utility.getData_TestCase_F004("retireeIncomeAmount");
		String deathDate = ESTTimeZone.getCurrentDate("MM/dd/yyyy");

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
		String s012QuestionFourthChild = "What is " + fourthChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionFifthChild = "What is " + fifthChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionSixthChild = "What is " + sixthChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionSeventhChild = "What is " + seventhChildFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionThirdChild = "Is " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionFourthChild = "Is " + fourthChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFifthChild = "Is " + fifthChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSixthChild = "Is " + sixthChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSeventhChild = "Is " + seventhChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSpouse = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionThirdChild = "Is " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionFourthChild = "Is " + fourthChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionFifthChild = "Is " + fifthChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSixthChild = "Is " + sixthChildFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionSeventhChild = "Is " + seventhChildFullName + " "
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
		String s026QuestionFourthChild = "What�s" + " " + fourthChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionFifthChild = "What�s" + " " + fifthChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
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
		String s057QuestionSeventhChild = "Will " + seventhChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionSixthChild = "Will " + sixthChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionFifthChild = "Will " + fifthChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionFourthChild = "Will " + fourthChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
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
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFirstChild = "Does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSecondChild = "Does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionThirdChild = "Does " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFourthChild = "Does " + fourthChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFifthChild = "Does " + fifthChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSixthChild = "Does " + sixthChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSeventhChild = "Does " + seventhChildFullName + " "
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
		String dateError = Utility.getFromTextProperties("dateError") + " "
				+ ESTTimeZone.getPreviousDate("60", "MMM d, yyyy") + " and "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy");
		String s067Question = Utility.getFromTextProperties("s067Question");
		String s010BQuestion = "Remove " + fifthChildFullName + ", " + Utility.getFromTextProperties("s010BQuestion");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();

		commonMethodPage.clickCreateSearchLink();

		commonMethodPage.clickContinueBtn();

		commonMethodPage.selectStateAgent(state);
		commonMethodPage.clickApplyOrRenewAgent();
		commonMethodPage.selectIdentityProofing("Telephone");
		commonMethodPage.enterFirstNameAgent(firstName);
		commonMethodPage.enterLastNameAgent(lastName);
		String dateOfBirth=commonMethodPage.enterDobAgent(age);
		commonMethodPage.clickContinueAgent();
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
		commonMethodPage.enterAgainDob(dateOfBirth);
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
			commonMethodPage.selectAddress();
		}

		// Mail Address
		ExtentTestManager.getTest().info("---------------------SCREEN S003----------------------------");
		commonMethodPage.selectMailingAddress(yes);
		commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
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
		commonMethodPage.selectWrittenLanguage(preferredWrittenLanguage);
		commonMethodPage.selectSpokenLanguage(preferredSpokenLanguage);
		commonMethodPage.clickSaveAndContinueButton();

		// notice medium
		ExtentTestManager.getTest().info("---------------------SCREEN S006----------------------------");
		commonMethodPage.verifyS006(s006Question);
		commonMethodPage.selectNoticeMedium(noticeMedium);
		commonMethodPage.clickSaveAndContinueButton();

		// professional help
		ExtentTestManager.getTest().info("---------------------SCREEN S007----------------------------");
		Wait.wait2Second();
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
		commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDob(spouseAge);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_O(relationShip, "No applicable", "not applicable", "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDobLow(firstChildAge);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, "not applicable", "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "2");

		commonMethodPage.clickAddPerson();
		commonMethodPage.needCoverage(yes, "4");
		commonMethodPage.enterDob(secondChildAge);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, brotherRelation, "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "3");

		commonMethodPage.clickAddPerson();
		commonMethodPage.needCoverage(yes, "5");
		commonMethodPage.enterDob(thirdChildAge);
		commonMethodPage.enterFirstName(thirdChildFirstName);
		commonMethodPage.enterLastName(thirdChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, brotherRelation, brotherRelation,
				"not applicable", "not applicable", "not applicable", "not applicable", "4");

		commonMethodPage.clickAddPerson();
		commonMethodPage.needCoverage(yes, "6");
		commonMethodPage.enterDob(fourthChildAge);
		commonMethodPage.enterFirstName(fourthChildFirstName);
		commonMethodPage.enterLastName(fourthChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, brotherRelation, brotherRelation,
				brotherRelation, "not applicable", "not applicable", "not applicable", "5");

		commonMethodPage.clickAddPerson();
		commonMethodPage.needCoverage(yes, "7");
		commonMethodPage.enterDob(fifthChildAge);
		commonMethodPage.enterFirstName(fifthChildFirstName);
		commonMethodPage.enterLastName(fifthChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_O(childRelationShip, childRelationShip, brotherRelation, brotherRelation,
				brotherRelation, brotherRelation, "not applicable", "not applicable", "6");

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
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027Question, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependent, s027DependentDrawerHeading,
				s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(firstChildFirstName);
		commonMethodPage.selectDependent(secondChildFirstName);
		commonMethodPage.selectDependent(thirdChildFirstName);
		commonMethodPage.selectDependent(fourthChildFirstName);
		commonMethodPage.selectDependent(fifthChildFirstName);
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
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(lailahRace);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for male application filler
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSpouse);
		commonMethodPage.enterSSN(spouseSSN, s012SameNameQuestionSpouse);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(jayceRace);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for male application filler
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		commonMethodPage.enterSSN(firstChildSSN, s012SameNameQuestionFirstChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(salvadorRace);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for forth child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFourthChild);
		Wait.wait5Second();
		commonMethodPage.enterSSN(fourthChildSSN, s012SameNameQuestionFourthChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip fourth child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFourthChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFourthChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(yes);
		commonMethodPage.selectRace_S043(amareOrigin);
		commonMethodPage.selectRace_S043(amareRace);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for fifth child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFifthChild);
		Wait.wait5Second();
		commonMethodPage.enterSSN(fifthChildSSN, s012SameNameQuestionFifthChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip fifth child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFifthChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFifthChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(yes);
		commonMethodPage.selectRace_S043(zainOrigin);
		commonMethodPage.selectRace_S043(zainRace);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female second child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		Wait.wait5Second();
		commonMethodPage.enterSSN(secondChildSSN, s012SameNameQuestionSecondChild);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip fifth child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSecondChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(ryannRace);
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
		commonMethodPage.selectRace_S043(elissaRace);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.verifyS045Question(s045Question1, s045Question2);
		commonMethodPage.physicalDisability_S045(firstChildFirstName);
		commonMethodPage.helpWithDailyActivities_S045(thirdChildFirstName);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046QuestionMedicad, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(applicantFullName);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(spouseFullName);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(firstChildFirstName);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(secondChildFullName);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(thirdChildFullName);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(fourthChildFullName);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(fifthChildFullName);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.s046EnterDate(FoundNotEligibleDate);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S047----------------------------");
		commonMethodPage.applyForHealthCoverage_S047(applicantFullName);
		commonMethodPage.applyForHealthCoverage_S047(spouseFullName);
		commonMethodPage.applyForHealthCoverage_S047(firstChildFirstName);
		commonMethodPage.applyForHealthCoverage_S047(secondChildFullName);
		commonMethodPage.applyForHealthCoverage_S047(thirdChildFullName);
		commonMethodPage.applyForHealthCoverage_S047(fourthChildFullName);
		commonMethodPage.applyForHealthCoverage_S047(fifthChildFullName);
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
		Wait.wait2Second();
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//								Float yearlyIncome = Float.parseFloat(incomeAmount);
//								Float income = yearlyIncome / 12;
//								String monthlyIncome = String.format("%.2f", income);
//								System.out.println(monthlyIncome);
		//
//								// format yearly income
//								String yearIncome =String.format("%.2f", yearlyIncome);
//								System.out.println(yearIncome);

//								String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//								ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//								Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//								String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + yearIncome);
//								ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//								Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
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
		// commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(spouseIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS058(s058QuestionSpouse);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Add new income
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.clickAddNewIncomeSource();
		Wait.wait2Second();

		// second income source
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Spouse);
		commonMethodPage.selectIncomeType(retirement);
		Wait.wait2Second();
		commonMethodPage.incomePeriod_S057(spouseIncomePeriod);
		Wait.wait2Second();
		commonMethodPage.enterIncomeAmountWithOutTab(retireeIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//								Float yearlyIncome = Float.parseFloat(incomeAmount);
//								Float income = yearlyIncome / 12;
//								String monthlyIncome = String.format("%.2f", income);
//								System.out.println(monthlyIncome);
		//
//								// format yearly income
//								String yearIncome =String.format("%.2f", yearlyIncome);
//								System.out.println(yearIncome);

//								String monthlyIncomeFound = commonMethodPage.getMonthlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + monthlyIncome);
//								ExtentTestManager.getTest().info("Found: " + monthlyIncomeFound);
//								Assert.assertEquals(monthlyIncomeFound, monthlyIncome, "Failed to verified: " + monthlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + monthlyIncomeFound);
		//
//								String yearlyIncomeFound = commonMethodPage.getYearlyIncome();
//								ExtentTestManager.getTest().info("Expected: " + yearIncome);
//								ExtentTestManager.getTest().info("Found: " + yearlyIncomeFound);
//								Assert.assertEquals(yearlyIncomeFound, yearIncome, "Failed to verified: " + yearlyIncomeFound);
//								ExtentTestManager.getTest().info("Verified: " + yearlyIncomeFound);
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
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionFourthChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionFourthChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionFifthChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionFifthChild);
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

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
		Wait.wait15Second();
		commonMethodPage.clickLogoutDropDown();
		commonMethodPage.clickLogout();
		Wait.wait25Second();

		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickSignInButton();
		Wait.wait5Second();

		commonMethodPage.clickCreateSearchLink();
		Wait.wait5Second();
		commonMethodPage.clickContinueBtn();
		commonMethodPage.clickSearchForApplicationBtn();
		Wait.wait5Second();
		commonMethodPage.clickCheckBoxForSearch();
		commonMethodPage.enterFirstNameForSearch(firstName);
		commonMethodPage.enterLastNameForSearch(lastName);
		commonMethodPage.enterDobForSearch(dateOfBirth);
		Wait.wait5Second();
		commonMethodPage.clickSearchButton();
		commonMethodPage.clickApplicationToupdate(applicationId);
		Wait.wait2Second();
		commonMethodPage.clickUpdateApplication(applicationId);
		Wait.wait5Second();
		commonMethodPage.selectIdentityProofing("Telephone");
		commonMethodPage.clickContinueAgent();
		Wait.wait2Second();
		commonMethodPage.clickContinueApplication();

		ExtentTestManager.getTest().info("---------------------TESTCASE F004----------------------------");
		ExtentTestManager.getTest().info("---------------------START CIC----------------------------");
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
		commonMethodPage.verifyS002(s002Question);

		// refreshPage();
		commonMethodPage.clickSaveAndContinueButton();
		if (!state.equals("WI")) {
			commonMethodPage.selectAddress();
		}

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
		commonMethodPage.verifyS007(s007Question, s007DrawerHeading, s007DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Financial coverage
		ExtentTestManager.getTest().info("---------------------SCREEN S008----------------------------");
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant detail
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		// commonMethodPage.verifyS010(medicaidDrawerHeading, notToIncludeDrawerHeading,
		// removeSomeOneDrawerHeading,
		// medicaidDrawerContent, notIncludeDrawerContent, removeSomeOneDrawerContent);
		// Add Second person
		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(fifthChildFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// S010B
		ExtentTestManager.getTest().info("---------------------SCREEN S010B----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS010B(s010BQuestion);
		commonMethodPage.removeOrKeepHimInApplicationWithoutCoverage_S010B(remove);
		commonMethodPage.reasonOfRemove_S010B(death);
		commonMethodPage.s046EnterDate(deathDate);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for male application filler
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027Question, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for male application filler
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSpouse);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for male application filler
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for forth child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFourthChild);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip fourth child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFourthChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFourthChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female second child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip fifth child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSecondChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female third child
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionThirdChild);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip third child
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionThirdChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.verifyS045Question(s045Question1, s045Question2);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046QuestionMedicad, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S047----------------------------");
		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();

		// S050A
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.selectSitutionHouseHold_S050A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS058(s058Question);
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
		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		Wait.wait5Second();
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSpouse);
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
		Wait.wait5Second();
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
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionFourthChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionFourthChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
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
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
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
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(noneOfThese);
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
		Wait.wait5Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		Wait.wait5Second();
		commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait5Second();
		commonMethodPage.verifyS074(s074QuestionSpouse);
		commonMethodPage.enterPhoneNumber(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();
//
		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		//Wait.wait5Second();
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
		Wait.wait5Second();
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		commonMethodPage.downloadEligibilityReport();
		Wait.wait5Second();

		commonMethodPage.clickContinueToEnrollmentBtn();
		commonMethodPage.continueButtonAfterEligibility();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.howMuchFromYourLowerPremium("All");
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickViewPlans();
		commonMethodPage.clickEnrol(plan);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.selectIAgreeCheckBox();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.goBackToHomeButton();

	}
}
