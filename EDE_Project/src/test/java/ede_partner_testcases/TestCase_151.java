package ede_partner_testcases;

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
	public void testCase_151() throws Exception {

		ExtentTestManager.createTest("PTC151", "Partner Test Case 151");

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
		String monthly = Utility.getValue("monthly");
		String coverageThroughJob = Utility.getValue("coverageThroughJob");

		// Get data from testcase151.properties
		String state = Utility.getData_TestCase151("state");
		String firstName = Utility.getData_TestCase151("firstName");
		String lastName = Utility.getData_TestCase151("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase151("age");
		String streetAddress = Utility.getData_TestCase151("streetAddress");
		String city = Utility.getData_TestCase151("city");
		String zipCode = Utility.getData_TestCase151("zipCode");
		String county = Utility.getData_TestCase151("county");
		String phoneNumber = Utility.getData_TestCase151("phoneNumber");
		String phoneType = Utility.getData_TestCase151("phoneType");
		String relationShip = Utility.getData_TestCase151("relationShip");
		String spouseFirstName = Utility.getData_TestCase151("spouseFirstName");
		String spouseLastName = Utility.getData_TestCase151("spouseLastName");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String s050OptionPregnant = Utility.getData_TestCase151("s050OptionPregnant");
		String babyCount = Utility.getData_TestCase151("babyCount");
		String incomeAmount = Utility.getData_TestCase151("incomeAmount");
		String familypremiumAmount = Utility.getData_TestCase151("familypremiumAmount");
		String incomeType = Utility.getData_TestCase151("incomeType");
		String employerName = Utility.getData_TestCase151("employerName");
		String incomePeriod = Utility.getData_TestCase151("incomePeriod");
		String spouseIncomeAmount = Utility.getData_TestCase151("spouseIncomeAmount");
		String spouseIncomeType = Utility.getData_TestCase151("spouseIncomeType");
		String spouseEmployerName = Utility.getData_TestCase151("spouseEmployerName");
		String spouseIncomePeriod = Utility.getData_TestCase151("spouseIncomePeriod");
		String EmployerPhone = Utility.getData_TestCase151("EmployerPhone");
		String gotMarried = Utility.getData_TestCase151("gotMarried");
		String firstChildFirstName = Utility.getData_TestCase151("firstChildFirstName");
		String firstChildLastName = Utility.getData_TestCase151("firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getData_TestCase151("firstChildAge");
		String secondChildFirstName = Utility.getData_TestCase151("secondChildFirstName");
		String secondChildLastName = Utility.getData_TestCase151("secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getData_TestCase151("secondChildAge");
		String thirdChildFirstName = Utility.getData_TestCase151("thirdChildFirstName");
		String thirdChildLastName = Utility.getData_TestCase151("thirdChildLastName");
		String thirdChildFullName = thirdChildFirstName + " " + thirdChildLastName;
		String thirdChildAge = Utility.getData_TestCase151("thirdChildAge");
		String childRelationShip = Utility.getData_TestCase151("childRelationShip");
		String plan = Utility.getData_TestCase151("plan");
		String brotherRelation = Utility.getData_TestCase151("brotherRelation");
		String firstChildIncomeAmount = Utility.getData_TestCase151("firstChildIncomeAmount");
		String firstChildIncomeType = Utility.getData_TestCase151("firstChildIncomeType");
		String firstChildEmployerName = Utility.getData_TestCase151("firstChildEmployerName");
		String firstChildIncomePeriod = Utility.getData_TestCase151("firstChildIncomePeriod");
		String ichraAmount = Utility.getData_TestCase151("ichraAmount");
		String ichraPeriod = Utility.getData_TestCase151("ichraPeriod");
		String ichraAmountFirstChild = Utility.getData_TestCase151("ichraAmountFirstChild");
		String ichraPeriodFirstChild = Utility.getData_TestCase151("ichraPeriodFirstChild");
		String premiumAmount = Utility.getData_TestCase151("premiumAmount");

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
		String s012SameNameQuestion = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionThirdChild = "Is " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
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
		String s017Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s017Question");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionFirstChild = "What�s" + " " + firstChildFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionSecondChild = "What�s" + " " + secondChildFullName + "'s" + " "
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
		String s057QuestionFirstChild = "Will " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionSecondChild = "Will " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057QuestionThirdChild = "Will " + thirdChildFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2FirstChild = "Select a type of income " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3FirstChild = "How often does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Spouse = "Select a type of income " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Spouse = "How often does " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFirstChild = "Does " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSecondChild = "Does " + secondChildFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
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
		String s069CQuestionFirstChild = "will " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestionSpouse = "will " + spouseFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestion2FirstChild = "Which employers offer " + firstChildFullName + " "
				+ Utility.getFromTextProperties("s069CQuestion2");
		String s069CQuestion2Spouse = "Which employers offer " + spouseFullName + " "
				+ Utility.getFromTextProperties("s069CQuestion2");
		String ichraStartDateSpouseJob = ESTTimeZone.getCurrentDate("MM/dd/yyyy");
		String ichraEndDateSpouseJob = ESTTimeZone.getAdvanceDate("65", "MM/dd/yyyy");
		String ichraStartDateFirstChildJob = ESTTimeZone.getCurrentDate("MM/dd/yyyy");
		String ichraEndDateFirstChildJob = ESTTimeZone.getAdvanceDate("65", "MM/dd/yyyy");
		String s069EQuestion = Utility.getFromTextProperties("s069EQuestion") + " " + spouseEmployerName;
		String s071Question = "Which employer offers " + spouseFullName + "'s "
				+ Utility.getFromTextProperties("s071Question");
		String s071QuestionSecondChild = "Which employer offers " + secondChildFullName + "'s "
				+ Utility.getFromTextProperties("s071Question");
		String s071QuestionThirdChild = "Which employer offers " + thirdChildFullName + "'s "
				+ Utility.getFromTextProperties("s071Question");
		String s072Question = Utility.getFromTextProperties("s072Question");
		String s073Question = "Does " + spouseEmployerName + " " + Utility.getFromTextProperties("s073Question");
		String s073QuestionApplicantEmployer = "Does " + employerName + " "
				+ Utility.getFromTextProperties("s073Question");
		String s067Question = Utility.getFromTextProperties("s067Question");

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
//		Wait.wait3Second();
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
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.selectHelpPayingForCoverage(yes);
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
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(relationShip, "No applicable", "not applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDob(firstChildAge);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, childRelationShip, "not applicable", "not applicable",
				"2");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "4");
		commonMethodPage.enterDob(secondChildAge);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, childRelationShip, brotherRelation, "not applicable",
				"3");

		commonMethodPage.clickAddPerson();
		//commonMethodPage.needCoverage(yes, "5");
		commonMethodPage.enterDob(thirdChildAge);
		commonMethodPage.enterFirstName(thirdChildFirstName);
		commonMethodPage.enterLastName(thirdChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(childRelationShip, childRelationShip, brotherRelation, brotherRelation, "4");
		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
//		Wait.wait2Second();
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
		commonMethodPage.verifyS017(s017Question, "", "");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
//		Wait.wait3Second();
		//commonMethodPage.verifyS027(s027Question, s027DrawerHeading, s027DrawerContent);
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
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(secondChildFirstName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(thirdChildFirstName);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait15Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSpouse);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
//		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(secondChildFirstName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(thirdChildFirstName);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
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
//		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
	//	commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
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
//		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
//		Wait.wait2Second();
		//commonMethodPage.verifyS026(s026QuestionSecondChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN
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
//		Wait.wait2Second();
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

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

		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions for FirstChild
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

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSecondChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSecondChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionThirdChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionThirdChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait3Second();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
//		Wait.wait2Second();
		commonMethodPage.whatTypeCoverageHave_S069(coverageThroughJob);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(spouseFullName);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(firstChildFullName);
		commonMethodPage.clickSaveAndContinueButton();

		String question = commonMethodPage.getS069CQuestion();
		int flag = 0;
		if (question.contains(firstChildFullName)) {

			ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
			commonMethodPage.verifyS069C(s069CQuestionFirstChild);
			commonMethodPage.ableToUseHRA_S069C(yes);
			commonMethodPage.verifyS069CQuestion2(s069CQuestion2FirstChild);
			commonMethodPage.whichEmployerOfferHRA_S069C(spouseEmployerName);
			commonMethodPage.whichEmployerOfferHRA_S069C(firstChildEmployerName);
			flag = 1;
			commonMethodPage.clickSaveAndContinueButton();

			ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
			commonMethodPage.verifyS069E(s069EQuestion);
			commonMethodPage.enterStartDateJobA(ichraStartDateSpouseJob);
			commonMethodPage.enterEndDateJobA(ichraEndDateSpouseJob);
			commonMethodPage.enterIchraAmountOffered(ichraAmount);
			commonMethodPage.selectIchraAmountPeriod(ichraPeriod);
			commonMethodPage.enterPhoneNumber(EmployerPhone);
			commonMethodPage.enterStartDateJobB(ichraStartDateFirstChildJob);
			commonMethodPage.enterEndDateJobB(ichraEndDateFirstChildJob);
			commonMethodPage.enterIchraAmountOfferedJobB(ichraAmountFirstChild);
			commonMethodPage.selectIchraAmountPeriod(ichraPeriodFirstChild);
			commonMethodPage.enterPhoneNumber_S69E(EmployerPhone);
			commonMethodPage.clickSaveAndContinueScrolled();

		} else {

			ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
			//commonMethodPage.verifyS069C(s069CQuestionSpouse);
			commonMethodPage.ableToUseHRA_S069C(yes);
			commonMethodPage.verifyS069CQuestion2(s069CQuestion2Spouse);
			commonMethodPage.whichEmployerOfferHRA_S069C(spouseEmployerName);
			flag = 2;
			commonMethodPage.clickSaveAndContinueButton();

			ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
			commonMethodPage.verifyS069E(s069EQuestion);
			commonMethodPage.enterStartDateJobA(ichraStartDateSpouseJob);
			commonMethodPage.enterEndDateJobA(ichraEndDateSpouseJob);
			commonMethodPage.enterIchraAmountOffered(ichraAmount);
			commonMethodPage.selectIchraAmountPeriod(ichraPeriod);
			commonMethodPage.enterPhoneNumber_S69E(EmployerPhone);
			commonMethodPage.clickSaveAndContinueButton();
		}

		if (flag == 1) {
			ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
			commonMethodPage.verifyS069C(s069CQuestionSpouse);
			commonMethodPage.ableToUseHRA_S069C(yes);
			commonMethodPage.verifyS069CQuestion2(s069CQuestion2Spouse);
			commonMethodPage.whichEmployerOfferHRA_S069C(spouseEmployerName);
			commonMethodPage.clickSaveAndContinueButton();

			ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
//			Wait.wait5Second();
			commonMethodPage.clickSaveAndContinueButton();

		} else if (flag == 2) {
			ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
			commonMethodPage.verifyS069C(s069CQuestionFirstChild);
			commonMethodPage.ableToUseHRA_S069C(yes);
			commonMethodPage.verifyS069CQuestion2(s069CQuestion2FirstChild);
			commonMethodPage.whichEmployerOfferHRA_S069C(spouseEmployerName);
			commonMethodPage.whichEmployerOfferHRA_S069C(firstChildEmployerName);
			commonMethodPage.clickSaveAndContinueButton();

			ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
			commonMethodPage.enterStartDateJobB(ichraStartDateFirstChildJob);
			commonMethodPage.enterEndDateJobB(ichraEndDateFirstChildJob);
			commonMethodPage.enterIchraAmountOfferedJobB(ichraAmountFirstChild);
			commonMethodPage.selectIchraAmountPeriod(ichraPeriodFirstChild);
			commonMethodPage.enterPhoneNumberJobB(EmployerPhone);
			commonMethodPage.clickSaveAndContinueScrolled();
		}

		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
//		Wait.wait5Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_PTC151S070(applicantFullName);
		commonMethodPage.CoverageThroughJobStartingNextMonth_PTC151S070(spouseFullName);
		//commonMethodPage.CoverageThroughJobStartingNextMonth_S070(thirdChildFullName);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S071B----------------------------");
		commonMethodPage.verifyScreen_s071_Question(s071Question);
//		commonMethodPage.whichEmployerOfferThisCoverage_S071(employerName);
		commonMethodPage.clickSaveAndContinueButton();
		
		//Employer offer extension

		ExtentTestManager.getTest().info("---------------------SCREEN S072B----------------------------");
//		commonMethodPage.verifyScreen_s072_Question(s072Question2);
		commonMethodPage.employerOfferextendsTo_PTC151S072(secondChildFullName);
		commonMethodPage.employerOfferextendsTo_PTC151S072(thirdChildFullName);
//		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		// minimum value standard meet

		ExtentTestManager.getTest().info("---------------------SCREEN S073B----------------------------");
		commonMethodPage.verifyScreen_s073_Question(s073Question);
		commonMethodPage.doesEmployerCoverageMeetMinimumValueStandard_S073(yes);
		commonMethodPage.enterFamilyPremiumAmount_S073(familypremiumAmount);
		commonMethodPage.selectFamilyPremiumPeriod_s073(monthly);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S071----------------------------");
		commonMethodPage.verifyScreen_s071_Question(s071Question);
		commonMethodPage.whichEmployerOfferThisCoverage_PTC151S071(spouseEmployerName);
		commonMethodPage.clickSaveAndContinueButton();
		
		//Employer offer extension

		ExtentTestManager.getTest().info("---------------------SCREEN S072B----------------------------");
//		commonMethodPage.verifyScreen_s072_Question(s072BQuestion2);
		commonMethodPage.employerOfferextendsTo_PTC151S072(secondChildFullName);
		commonMethodPage.employerOfferextendsTo_PTC151S072(thirdChildFullName);
//		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		// Additional info about Employer

		ExtentTestManager.getTest().info("---------------------SCREEN S071AB----------------------------");
		commonMethodPage.enterPhoneNumber_S004(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Changes to be done here
		
		ExtentTestManager.getTest().info("---------------------SCREEN S071----------------------------");
//		Wait.wait10Second();
		commonMethodPage.verifyScreen_s071_Question(s071QuestionSecondChild);
		commonMethodPage.whichEmployerOfferThisCoverage_PTC151S071(employerName);
		commonMethodPage.whichEmployerOfferThisCoverage_PTC151S071(spouseEmployerName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S071----------------------------");
//		Wait.wait10Second();
	//	commonMethodPage.verifyScreen_s071_Question(s071QuestionThirdChild);
		commonMethodPage.whichEmployerOfferThisCoverage_PTC151S071(employerName);
		commonMethodPage.whichEmployerOfferThisCoverage_PTC151S071(spouseEmployerName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S071A----------------------------");
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S072----------------------------");
	//	commonMethodPage.verifyScreen_s072_Question(s072Question);
		commonMethodPage.doYouWantToAddAnOtherEmployer_S072(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S073----------------------------");
	//	commonMethodPage.verifyScreen_s073_Question(s073Question);
		commonMethodPage.doesEmployerCoverageMeetMinimumValueStandard_S073(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S071A----------------------------");
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S072----------------------------");
	//	commonMethodPage.verifyScreen_s072_Question(s072Question);
		commonMethodPage.doYouWantToAddAnOtherEmployer_S072(no);
		// commonMethodPage.anotherEmployerOfferThisCoverage_S072(spouseEmployerName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S073----------------------------");
		commonMethodPage.verifyScreen_s073_Question(s073QuestionApplicantEmployer);
		commonMethodPage.doesEmployerCoverageMeetMinimumValueStandard_S073(yes);
		commonMethodPage.enterAmount_S073(premiumAmount);
		commonMethodPage.selectSelfPremiumPeriod_s073(monthly);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
	//	commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
	//	commonMethodPage.verifyS074(s074QuestionSpouse);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

//		// About Employer of spouse
//		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
//		commonMethodPage.clickSaveAndContinueButton();

		// About Employer of spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
	//	commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
//		Wait.wait5Second();
		commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
	//	commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(noneOfThese);
	//	commonMethodPage.verifyS085(s085Question);
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
