package ede_partner_testcases4;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_183  extends BaseTest {
	
	@Test
	public void testCase_183() throws Exception {


		ExtentTestManager.createTest("Test case 183", "Test case 183");
		
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
				String medicaid = Utility.getValue("medicaid");
				String married = Utility.getValue("married");
				String noticeMedium = Utility.getValue("noticeMedium");
				String noticeMediumEmail = Utility.getValue("selectNoticeMediumEmail");
				String noticeMediumEmailAt = Utility.getValue("noticeMediumEmailAt");
				String agentUserName = Utility.getValue("agentUserName");
				String agentPassword = Utility.getValue("agentPassword");
				String identityProfing = Utility.getValue("identityProfing");
				String single = Utility.getValue("single");
				String anotherEmployerReason = Utility.getValue("anotherEmployerReason");
				String domesticPartner = Utility.getValue("domesticPartner");
				String alimony = Utility.getValue("alimony");
				String monthly = Utility.getValue("monthly");
				String parentRelation = Utility.getValue("parentRelation");
				String hourly = Utility.getValue("hourly");
				String grandChildRelation = Utility.getValue("grandChildRelation");
				String retirement = Utility.getValue("retirement");
				String selfEmployement = Utility.getValue("selfEmployement");
				String VAHealthcareProgram = Utility.getValue("VAHealthcareProgram");
				String peaceCorps = Utility.getValue("peaceCorps");
				String CHIP = Utility.getValue("CHIP");
				String tricare = Utility.getValue("tricare");
				String marketPlaceCoverage = Utility.getValue("marketPlaceCoverage");
				String otherReason = Utility.getValue("otherReason");

				// Get data from testcase_183.properties
				String state = Utility.getDate_TestCase183("state");
				String firstName = Utility.getDate_TestCase183("firstName");
				String lastName = Utility.getDate_TestCase183("lastName");
				String applicantFullName = firstName + " " + lastName;
				String age = Utility.getDate_TestCase183("age");
				String firstCousinFirstName = Utility.getDate_TestCase183("firstCousinFirstName");
				String firstCousinLastName = Utility.getDate_TestCase183("firstCousinLastName");
				String firstCousinFullName = firstCousinFirstName + " " + firstCousinLastName;
				String firstCousinAge = Utility.getDate_TestCase183("firstCousinAge");
				String streetAddress = Utility.getDate_TestCase183("streetAddress");
				String city = Utility.getDate_TestCase183("city");
				String zipCode = Utility.getDate_TestCase183("zipCode");
				String county = Utility.getDate_TestCase183("county");
				String phoneNumber = Utility.getDate_TestCase183("phoneNumber");
				String phoneType = Utility.getDate_TestCase183("phoneType");
				String SSN = Utility.getDate_TestCase183("SSN");
				String parentSSN = Utility.getDate_TestCase183("parentSSN");
				String childSSN = Utility.getDate_TestCase183("childSSN");
				String domesticPartnerFirstName = Utility.getDate_TestCase183("domesticPartnerFirstName");
				String domesticPartnerLastName = Utility.getDate_TestCase183("domesticPartnerLastName");
				String domesticPartnerFullName = domesticPartnerFirstName + " " + domesticPartnerLastName;
				String domesticPartnerAge = Utility.getDate_TestCase183("domesticPartnerAge");
				String incomeAmount = Utility.getDate_TestCase183("incomeAmount");
				String selfPremiumAmount = Utility.getDate_TestCase183("selfOnlyPremiumAmount");
				String familypremiumAmount = Utility.getDate_TestCase183("familypremiumAmount");
				String incomeType = Utility.getDate_TestCase183("incomeType");
				String employerName = Utility.getDate_TestCase183("employerName");
				String incomePeriod = Utility.getDate_TestCase183("incomePeriod");
				String coverageType = Utility.getDate_TestCase183("coverageType");
				String parentIncomeAmount = Utility.getDate_TestCase183("parentIncomeAmount");
				String parentIncomeType = Utility.getDate_TestCase183("parentIncomeType");
				String parentEmployerName = Utility.getDate_TestCase183("parentEmployerName");
				String parentIncomePeriod = Utility.getDate_TestCase183("parentIncomePeriod");
				String premiumAmountPeriod = Utility.getDate_TestCase183("premiumAmountPeriod");
				String jobStartDate = Utility.getDate_TestCase183("jobStartDate");
				String jobEndDate = Utility.getDate_TestCase183("jobEndDate");
				String jobNoticeDate = Utility.getDate_TestCase183("jobNoticeDate");
				String domesticPartnerIncomeAmount = Utility.getDate_TestCase183("domesticPartnerIncomeAmount");
				String domesticPartnerIncomeType = Utility.getDate_TestCase183("domesticPartnerIncomeType");
				String domesticPartnerEmployerName = Utility.getDate_TestCase183("domesticPartnerEmployerName");
				String domesticPartnerIncomePeriod = Utility.getDate_TestCase183("domesticPartnerIncomePeriod");
				String relationShip = Utility.getDate_TestCase183("relationShip");
				String parentFirstName = Utility.getDate_TestCase183("parentFirstName");
				String parentLastName = Utility.getDate_TestCase183("parentLastName");
				String parentAge = Utility.getDate_TestCase183("parentAge");
				String parentFullName = parentFirstName + " " + parentLastName;
				String EmployerPhone = Utility.getDate_TestCase183("employerPhone");
				String gotMarried = Utility.getDate_TestCase183("gotMarried");
				String childFirstName = Utility.getDate_TestCase183("childFirstName");
				String childLastName = Utility.getDate_TestCase183("childLastName");
				String childFullName = childFirstName + " " + childLastName;
				String childAge = Utility.getDate_TestCase183("childAge");
				String childRelationShip = Utility.getDate_TestCase183("childRelationShip");
				String plan = Utility.getDate_TestCase183("plan");
				String withoutDocument = Utility.getDate_TestCase183("withoutDocument");
				String childIncomeAmount = Utility.getDate_TestCase183("childIncomeAmount");
				String anualPredictedAmount = Utility.getDate_TestCase183("anualPredictedAmount");
				String hours = Utility.getDate_TestCase183("hours");

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
				String s012QuestionSpouse = "What is " + parentFullName + "'s "
						+ Utility.getFromTextProperties("s012Question");
				String s012QuestionChild = "What is " + childFullName + "'s " + Utility.getFromTextProperties("s012Question");
				String s012SameNameQuestion = "Is " + applicantFullName + " "
						+ Utility.getFromTextProperties("s012SameNameQuestion");
				String s012SameNameQuestionChild = "Is " + childFullName + " "
						+ Utility.getFromTextProperties("s012SameNameQuestion");
				String s012SameNameQuestionFemale = "Is " + childFullName + " "
						+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
				String s012SameNameQuestionSpouse = "Is " + parentFullName + " "
						+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
				String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
				String s014QuestionSpouse = "Is " + parentFullName + " "
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
						+ ESTTimeZone.getCurrentYear() + "?";
				String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale")
				+ " " + "2024" + "?";
				String s027QuestionSingle = "Does " + applicantFullName + " "
						+ Utility.getFromTextProperties("s027QuestionSingle") + " " + "2024" + "?";
				String s027QuestionDependentSingleMale = "Will " + applicantFullName + " "
						+ Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + "2024"
						+ "?";

				// ESTTimeZone.getCurrentYear() to be used for getting Current year

				String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
				String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
				String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
				String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
				String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
				String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
				String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
				String s038Question1 = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question1");
				String s038Question2 = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question2");
				String s038QuestionSpouse1 = "Is " + parentFullName + " " + Utility.getFromTextProperties("s038Question1");
				String s038QuestionSpouse2 = "Does " + parentFullName + " " + Utility.getFromTextProperties("s038Question2");
				String s038QuestionDaughter = "Does " + childFullName + " " + Utility.getFromTextProperties("s038Question");
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
				String s057Questionspouse = "Will " + parentFullName + " " + Utility.getFromTextProperties("s057Question");
				String s057QuestionChild = "Will " + childFullName + " " + Utility.getFromTextProperties("s057Question");
				String s057Question2 = "Select a type of income " + applicantFullName + " "
						+ Utility.getFromTextProperties("s057Question2");
				String s057Question2Spouse = "Select a type of income " + parentFullName + " "
						+ Utility.getFromTextProperties("s057Question2");
				String s057Question3 = "How often does " + applicantFullName + " "
						+ Utility.getFromTextProperties("s057Question3");
				String s057Question2Child = "Select a type of income " + childFullName + " "
						+ Utility.getFromTextProperties("s057Question2");
				String s057Question3Child = "How often does " + childFullName + " "
						+ Utility.getFromTextProperties("s057Question3");
				String s057QuestionDomesticPartner = "Will " + domesticPartnerFullName + " "
						+ Utility.getFromTextProperties("s057Question");
				String s057Question2DomesticPartner = "Select a type of income " + domesticPartnerFullName + " "
						+ Utility.getFromTextProperties("s057Question2");
				String s057Question3Spouse = "How often does " + parentFullName + " "
						+ Utility.getFromTextProperties("s057Question3");
				String s057Question4 = Utility.getFromTextProperties("s057Question4");
				String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
						+ "2024" + "?";
				String s058QuestionSpouse = "Does " + parentFullName + " " + Utility.getFromTextProperties("s058Question") + " "
						+ "2024" + "?";
				String s058QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s058Question") + " "
						+ "2024" + "?";
				String s058QuestionDomesticPartner = "Does " + domesticPartnerFullName + " "
						+ Utility.getFromTextProperties("s058Question") + " " + "2024" + "?";
				String s064Question = "income in " + "2024" + " "
						+ Utility.getFromTextProperties("s064Question");
				String s068Question = Utility.getFromTextProperties("s068Question");
				String s082Question = Utility.getFromTextProperties("s082Question");
				String s069AQuestion = Utility.getFromTextProperties("s069AQuestion");
				String s069BQuestion = Utility.getFromTextProperties("s069BQuestion");
				String s069CQuestion = Utility.getFromTextProperties("s069CQuestion");
				String s069CQuestion2 = Utility.getFromTextProperties("s069CQuestion2");
				String s069EQuestion = Utility.getFromTextProperties("s069EQuestion");
				String minus60DaysDate = ESTTimeZone.getPreviousDate("60", "MMM d, yyyy");
				String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
				String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and "
						+ plus60DaysDate + "?";
				String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
				String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
				String s070Question = Utility.getFromTextProperties("s070Question");

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
				String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
				String s042Question2 = "What's " + applicantFullName + "'s " + Utility.getFromTextProperties("s042Question2");
				String s045Question1 = Utility.getFromTextProperties("s045Question1");
				String s045Question2 = Utility.getFromTextProperties("s045Question2");
				String s019Question2 = "Select the document type that corresponds with " + applicantFullName + "'s "
						+ Utility.getFromTextProperties("s019Question2");
				String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " "
						+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
						+ "2024" + "?";
				String s024Question = "Has " + applicantFullName + " " + Utility.getFromTextProperties("s024Question");
				String s030QuestionChild = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
						+ childFullName + " " + Utility.getFromTextProperties("s030Question");
				String s50Question = Utility.getFromTextProperties("s50Question");
				String s081Question = Utility.getFromTextProperties("s081Question");
				String s071QuestionApplicant = "Which of " + applicantFullName + "'s " + "employers offer " + applicantFullName + " "
						+ Utility.getFromTextProperties("s071Question");
				String s071QuestionSpouse = "Which of " + parentFullName + "'s " + "employers offer " + applicantFullName + " "
						+ Utility.getFromTextProperties("s071Question");
				String s072Question2_1 = "Does " + employerName + " " + Utility.getFromTextProperties("s072Question2");
				String s072Question2_2 = "Does " + employerName + " " + Utility.getFromTextProperties("s072Question2");
				String s073Question_1 = "Do the plans offered by " + employerName + " " + Utility.getFromTextProperties("s073Question");
				String s073Question_2 = "Do the plans offered by " + employerName + " " + Utility.getFromTextProperties("s073Question");
				String s072Question = Utility.getFromTextProperties("s072Question");
				String s079Question = Utility.getFromTextProperties("s079Question");
				String s067Question = Utility.getFromTextProperties("s067Question");
				
				// Open Browser and execute URL

				loginEdeQa(userName, password, url);
				CommonMethodPage commonMethodPage = new CommonMethodPage();
				LoginPage loginPage = new LoginPage();
				commonMethodPage.clickToCancelSessionOutBtn();
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
				commonMethodPage.verifyS001(s001Question);
				commonMethodPage.enterFirstName(firstName);
				String dob = commonMethodPage.enterDob(age);
				commonMethodPage.enterMiddleName("");
				commonMethodPage.enterLastName(lastName);
				commonMethodPage.selectGender(male);
				commonMethodPage.needCoverage(yes, "1");
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
				commonMethodPage.selectNoticeMediumEmail(noticeMediumEmail);
				commonMethodPage.selectNoticeMediumEmailAt(noticeMediumEmailAt);
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
				
				// Household Composition

				ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
				//commonMethodPage.verifyS010(medicaidDrawerHeading, notToIncludeDrawerHeading,
				//removeSomeOneDrawerHeading,
				//medicaidDrawerContent, notIncludeDrawerContent, removeSomeOneDrawerContent);
				String applicationId = commonMethodPage.getS010AppId();
				commonMethodPage.clickAddPerson();
				commonMethodPage.enterDOB_S010(childAge,"2");
				commonMethodPage.enterFirstName(childFirstName);
				commonMethodPage.enterLastName(childLastName);
				commonMethodPage.selectGender(male);
				commonMethodPage.selectRelation1_L(relationShip, "No applicable", "not applicable", "not applicable", "1");
				commonMethodPage.clickSaveAndContinueButton();
				
				// S010A
				ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
				Wait.wait2Second();
				commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
				commonMethodPage.selectToRemovePerson(noneOfThese);
				commonMethodPage.clickSaveAndContinueButton();
				
				// SSN

				ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
				Wait.wait2Second();
				commonMethodPage.verifyS012(s012Question);
				commonMethodPage.enterSSN(SSN,s012SameNameQuestion);
				commonMethodPage.clickSaveAndContinueButton();
				commonMethodPage.selectWithSameName(yes);
				commonMethodPage.clickSaveAndContinueButton();
				
				// CitizenShip GrandChild

				ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
				Wait.wait2Second();
				commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
				commonMethodPage.selectUSCitizenOrNot(yes);
				commonMethodPage.clickSaveAndContinueButton();
				
				
				// Marital status
				ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
				//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
				commonMethodPage.selectMaritalStatus(single);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Filling Tax
				ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
			////	commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
				commonMethodPage.selectIsFilingTax(yes);
				//commonMethodPage.verifyS027Dependent(s027QuestionDependent, s027DependentDrawerHeading,
					//	s027DependentDrawerContent);
				commonMethodPage.selectIsAnyDependent(yes);
				commonMethodPage.selectDependent(childFullName);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Do they live togather
				ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
				commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
				commonMethodPage.selectDoTheyLiveTogather(yes);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Take care of children
				ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
				//commonMethodPage.verifyS038(s038Question2);
				commonMethodPage.applicantMainPersontakingCare_S038(childFullName);
				commonMethodPage.clickSaveAndContinueScrolled();

				ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
				commonMethodPage.clickSaveAndContinueButton();
				
				ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
				commonMethodPage.clickSaveAndContinueButton();
				
				// SSN for Parent
				ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
				//commonMethodPage.verifyS012(s012QuestionFirstChild);
				commonMethodPage.enterSSN(childSSN,s012SameNameQuestionChild);
				commonMethodPage.clickSaveAndContinueButton();
				commonMethodPage.selectWithSameName(yes);
				commonMethodPage.clickSaveAndContinueButton();
				
				// CitizenShip
				ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
				commonMethodPage.verifyS014(s014QuestionChild, s014DrawerHeading, s014drawerContent);
				commonMethodPage.selectUSCitizenOrNot(yes);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Marital status
				ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
				//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
				Wait.wait2Second();
				commonMethodPage.selectMaritalStatus(single);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Filling Tax
				ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
			////	commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
				Wait.wait2Second();
				commonMethodPage.clickSaveAndContinueButton();
				
				ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
				Wait.wait2Second();
				commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(no);
				commonMethodPage.clickSaveAndContinueButton();
				
			
				// Take care of children
				ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
				//commonMethodPage.verifyS038(s038Question2);
				Wait.wait2Second();
				commonMethodPage.applicantMainPersontakingCare_S038(no);
				commonMethodPage.clickSaveAndContinueScrolled();
				
				ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
				commonMethodPage.clickSaveAndContinueButton();
				
				ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
				commonMethodPage.clickSaveAndContinueButton();
				
				ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
				commonMethodPage.clickSaveAndContinueButton();
				
				
				// Medicaid and CHIP ended or end soon
				ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
				//commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
				Wait.wait2Second();
				commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(no);
				commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
				commonMethodPage.clickSaveAndContinueButton();

				// Medicaid and CHIP
				ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
				//commonMethodPage.verifyS046(s046QuestionMedicad, s046QuestionCHIP, s046DrawerHeading, s046DrawerContent);
				Wait.wait2Second();
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
				
				// Applicant Expense

				ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
				commonMethodPage.verifyS058(s058Question);
				commonMethodPage.expenseDecision_S058(no);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Income verification
				ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
				// calculate monthly income
				Wait.wait2Second();
				commonMethodPage.incomeVerification_S059(yes);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Income Questions for Parent
				ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
				//commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSpouse);
				Wait.wait2Second();
				commonMethodPage.incomeThisMonth_S057(no);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Applicant Expense for Parent

				ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
				//commonMethodPage.verifyS058(s058Question);
				Wait.wait2Second();
				commonMethodPage.expenseDecision_S058(no);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Income verification for Parent
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
				
				// Ichra offer

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
				Wait.wait2Second();
				//commonMethodPage.verifyS070(s070Question);
				commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
				commonMethodPage.clickSaveAndContinueButton();
				
				// About Employer
				ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
				//commonMethodPage.verifyS074(s074Question);
				Wait.wait2Second();
				//commonMethodPage.enterPhoneNumberJobB(EmployerPhone);
				commonMethodPage.clickSaveAndContinueButton();
						
				
				// S083
				ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
				Wait.wait2Second();
				//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
				commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
				commonMethodPage.clickSaveAndContinueButton();
				
				// S084
				ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
				Wait.wait2Second();
				commonMethodPage.loseQualifyingHealthCovUpcoming_S084(noneOfThese);
				//commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
				commonMethodPage.clickSaveAndContinueButton();
				
				// S085
				ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
				Wait.wait2Second();
				commonMethodPage.recentChanges_S085(noneOfThese);
				//commonMethodPage.verifyS085(s085Question);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Review
				ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
				commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
				commonMethodPage.clickSaveAndContinueScrolled();
				
				// Agreement
				ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
				Wait.wait3Second();
				commonMethodPage.agreeTwo();
				commonMethodPage.agreeTwoNew();
				commonMethodPage.agreeThree();
				commonMethodPage.clickSaveAndContinueButton();
				
				// Signature
				ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
				Wait.wait3Second();
				commonMethodPage.agreeOne();
				commonMethodPage.enterSignature(applicantFullName);
				commonMethodPage.clickSaveAndContinueButton();
				
				// Eligibility
				ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
				commonMethodPage.downloadEligibilityReport();
				Wait.wait5Second();

				ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
				//commonMethodPage.clickLogoutDropDown();
				//commonMethodPage.clickLogout();


				
		
	}

}
