package mini_audit_scenario;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class MiniAuditScenario extends BaseTest {
	@Test
	public void testCase_39() throws Exception {

		ExtentTestManager.createTest("Test case 39", "Test case 39");

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
		String studentLoan = Utility.getValue("studentLoan");
		String monthly = Utility.getValue("monthly");
		String otherCoverage = Utility.getValue("otherCoverage");
		String parentRelation = Utility.getValue("parentRelation");
		String domesticPartner = Utility.getValue("domesticPartner");
		String someOneElse = Utility.getValue("someOneElse");
		String grandChildRelation = Utility.getValue("grandChildRelation");
		String grandParentRelation = Utility.getValue("grandParentRelation");
		String noHomeAddress = Utility.getValue("noHomeAddress");
		String americanAlaskan = Utility.getValue("americanAlaskan");
		String pregnant = Utility.getValue("pregnant");
		String unEmployment = Utility.getValue("unEmployment");
		String twiceMonth = Utility.getValue("twiceMonth");
		String capitalGains = Utility.getValue("capitalGains");
		String yearly = Utility.getValue("yearly");
		String investment = Utility.getValue("investment");

		// Get data from testcase1_M.properties
		String state = Utility.getDate_Mini_Audit("state");
		String grandMaFirstName = Utility.getDate_Mini_Audit("grandMaFirstName");
		String grandMaLastName = Utility.getDate_Mini_Audit("grandMaLastName");
		String applicantFullName = grandMaFirstName + " " + grandMaLastName;
		String dob = Utility.getDate_Mini_Audit("dob");
		String streetAddress = Utility.getDate_Mini_Audit("streetAddress");
		String city = Utility.getDate_Mini_Audit("city");
		String zipCode = Utility.getDate_Mini_Audit("zipCode");
		String county = Utility.getDate_Mini_Audit("county");
		String phoneNumber = Utility.getDate_Mini_Audit("phoneNumber");
		String phoneType = Utility.getDate_Mini_Audit("phoneType");
		String relationShip = Utility.getDate_Mini_Audit("relationShip");
		String daughterFirstName = Utility.getDate_Mini_Audit("daughterFirstName");
		String daughterLastName = Utility.getDate_Mini_Audit("daughterLastName");
		String daughterFullName = daughterFirstName + " " + daughterLastName;
		String daughterAge = Utility.getDate_Mini_Audit("daughterAge");
		String incomeAmount = Utility.getDate_Mini_Audit("incomeAmount");
		String incomeAmount2 = Utility.getDate_Mini_Audit("incomeAmount2");
		String incomeType = Utility.getDate_Mini_Audit("incomeType");
		String employerName = Utility.getDate_Mini_Audit("employerName");
		String incomePeriod = Utility.getDate_Mini_Audit("incomePeriod");
		String domesticPartnerIncomeAmount = Utility.getDate_Mini_Audit("domesticPartnerIncomeAmount");
		String domesticPartnerIncomeType = Utility.getDate_Mini_Audit("domesticPartnerIncomeType");
		String domesticPartnerEmployerName = Utility.getDate_Mini_Audit("domesticPartnerEmployerName");
		String domesticPartnerIncomePeriod = Utility.getDate_Mini_Audit("domesticPartnerIncomePeriod");
		String EmployerPhone = Utility.getDate_Mini_Audit("EmployerPhone");
		String grandDaughterFirstName = Utility.getDate_Mini_Audit("grandDaughterFirstName");
		String grandDaughterLastName = Utility.getDate_Mini_Audit("grandDaughterLastName");
		String grandDaughterFullName = grandDaughterFirstName + " " + grandDaughterLastName;
		String grandDaughterAge = Utility.getDate_Mini_Audit("grandDaughterAge");
		String grandSonFirstName = Utility.getDate_Mini_Audit("grandSonFirstName");
		String grandSonLastName = Utility.getDate_Mini_Audit("grandSonLastName");
		String grandSonFullName = grandSonFirstName + " " + grandSonLastName;
		String grandSonAge = Utility.getDate_Mini_Audit("grandSonAge");
		String grandPaFirstName = Utility.getDate_Mini_Audit("grandPaFirstName");
		String grandPaLastName = Utility.getDate_Mini_Audit("grandPaLastName");
		String grandPaFullName = grandSonFirstName + " " + grandSonLastName;
		String childRelationShip = Utility.getDate_Mini_Audit("childRelationShip");
		String plan = Utility.getDate_Mini_Audit("plan");
		String brotherRelation = Utility.getDate_Mini_Audit("brotherRelation");
		String otherAddress = Utility.getDate_Mini_Audit("otherAddress");
		String otherStreetAddress = Utility.getDate_Mini_Audit("otherStreetAddress");
		String otherCity = Utility.getDate_Mini_Audit("otherCity");
		String otherZipCode = Utility.getDate_Mini_Audit("otherZipCode");
		String otherCounty = Utility.getDate_Mini_Audit("otherCounty");
		String otherState = Utility.getDate_Mini_Audit("otherState");
		String document = Utility.getDate_Mini_Audit("document");
		String alienNumber = Utility.getDate_Mini_Audit("alienNumber");
		String naturalizeNumber = Utility.getDate_Mini_Audit("naturalizeNumber");
		String american = Utility.getDate_Mini_Audit("american");
		String imigration = Utility.getDate_Mini_Audit("imigration");
		String documentType = Utility.getDate_Mini_Audit("documentType");
		String white = Utility.getDate_Mini_Audit("white");
		String babyCount = Utility.getDate_Mini_Audit("babyCount");
		String expenseAmount = Utility.getDate_Mini_Audit("expenseAmount");
		String anualPredictedAmount = Utility.getDate_Mini_Audit("anualPredictedAmount");
		String tribeIncomeAmount = Utility.getDate_Mini_Audit("tribeIncomeAmount");
		String daughterIncomeAmount = Utility.getDate_Mini_Audit("daughterIncomeAmount");
		String daughterPredictedAmount = Utility.getDate_Mini_Audit("daughterPredictedAmount");
		String grandDaughterIncomeAmount = Utility.getDate_Mini_Audit("grandDaughterIncomeAmount");
		String currentCoverageChip = Utility.getDate_Mini_Audit("currentCoverageChip");
		String limitedCoverage = Utility.getDate_Mini_Audit("limitedCoverage");

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
		String s012QuestionFirstChild = "What is " + grandDaughterFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012QuestionGrandSon = "What is " + grandSonFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFirstChild = "Is " + grandDaughterFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + grandSonFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionFemale = "Is " + daughterFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionDaughter = "Is " + daughterFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionApplicant = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionGrandSon = "Is " + grandSonFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionDaughter = "What�s" + " " + daughterFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
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
		String s038QuestionSpouse = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s038Question");
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s053Question = Utility.getFromTextProperties("s053Question");
		String s053DrawerHeading = Utility.getFromTextProperties("s053DrawerHeading");
		String s053DrawerContnet = Utility.getFromTextProperties("s053DrawerContnet");
		String s053Question2 = "How many babies is " + daughterFullName + " "
				+ Utility.getFromTextProperties("s053Question2");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionGrandSon = "Will " + grandSonFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionDaughter = "Will " + daughterFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Daughter = "Select a type of income " + daughterFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3Daughter = "How often does " + daughterFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionGrandDaughter = "Will " + grandDaughterFullName + " "
				+ Utility.getFromTextProperties("s057Question");
		String s057Question2GrandDaughter = "Select a type of income " + grandDaughterFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3GrandDaughter = "How often does " + grandDaughterFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionGrandDaughter = "Does " + grandDaughterFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionGrandSon = "Does " + grandSonFullName + " " + Utility.getFromTextProperties("s058Question")
				+ " " + ESTTimeZone.getCurrentYear() + "?";
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
		String s074QuestionDomesticPartner = Utility.getFromTextProperties("s074Question") + " "
				+ domesticPartnerEmployerName + " (" + grandDaughterFullName + "'s job).";
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
		String s012QuestionSpouse = "What is " + daughterFullName + "'s "
				+ Utility.getFromTextProperties("s012Question");
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDaughter = "Does " + daughterFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSomeOneElseTaxReturn = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s027QuestionDependentDaughter = "Will " + daughterFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear()
				+ "?";
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s067Question = Utility.getFromTextProperties("s067Question");
		String s030QuestionDaughter = "You told us " + daughterFullName + " lives with " + applicantFullName + ". Does "
				+ daughterFullName + " " + Utility.getFromTextProperties("s030Question");
		String s017Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s017Question");
		String s017DrawerHeading = Utility.getFromTextProperties("s017DrawerHeading");
		String s017DrawerContent = Utility.getFromTextProperties("s017DrawerContent");
		String s017DocumentQuestion = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s017DocumentQuestion");
		String s017DocumentDrawerHeading = Utility.getFromTextProperties("s017DocumentDrawerHeading");
		String s017DocumentDrawerContent = Utility.getFromTextProperties("s017DocumentDrawerContent");
		String s017DocumentSubQuestion = applicantFullName + "'s "
				+ Utility.getFromTextProperties("s017DocumentSubQuestion");
		String s017DocumentSubDrawerHeading = Utility.getFromTextProperties("s017DocumentSubDrawerHeading");
		String s017DocumentSubDrawerContent = Utility.getFromTextProperties("s017DocumentSubDrawerContent");
		String s019QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s019Question");
		String s019QuestionDaughter2 = "Select the document type that corresponds with " + daughterFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s030Question = "You told us " + daughterFullName + " lives with " + applicantFullName + ". Does "
				+ daughterFullName + " " + Utility.getFromTextProperties("s030Question");
		String lastDateOfMedicaidCHIP = ESTTimeZone.getLastMonthLastDate("MM/dd/yyyy");
		String s50Question = Utility.getFromTextProperties("s50Question");
		String s052Question = Utility.getFromTextProperties("s052Question");
		String s075Question = Utility.getFromTextProperties("s075Question");
		String s079Question = Utility.getFromTextProperties("s079Question");

		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		Wait.wait2Second();
		commonMethodPage.clickContinueBtn();
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
		commonMethodPage.enterFirstName(grandMaFirstName);
		commonMethodPage.enterAgainDob(dob);
		commonMethodPage.enterMiddleName("");
		commonMethodPage.enterLastName(grandMaLastName);
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
		commonMethodPage.selectAddress();

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
		commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDob(daughterAge);
		commonMethodPage.enterFirstName(daughterFirstName);
		commonMethodPage.enterLastName(daughterLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation1_O(childRelationShip, "No applicable", "not applicable", "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "1");

		commonMethodPage.clickAddPerson();
		commonMethodPage.needCoverage(yes, "3");
		commonMethodPage.enterDob(grandSonAge);
		commonMethodPage.enterFirstName(grandSonFirstName);
		commonMethodPage.enterLastName(grandSonLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_O(grandChildRelation, childRelationShip, "not applicable", "not applicable",
				"not applicable", "not applicable", "not applicable", "not applicable", "2");
		commonMethodPage.clickSaveAndContinueButton();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		Wait.wait2Second();
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
		commonMethodPage.verifyS014(s014QuestionApplicant, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// dreived or naturalize
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		//commonMethodPage.verifyS017(s017Question, s017DrawerHeading, s017DrawerContent);
		commonMethodPage.selectNaturalizedOrDrived(yes, s017DocumentQuestion, s017DocumentDrawerHeading,
				s017DocumentDrawerContent);
		commonMethodPage.selectDocumentType(document, s017DocumentSubQuestion, s017DocumentSubDrawerHeading,
				s017DocumentSubDrawerContent);
		commonMethodPage.enterAlienNumber(alienNumber);
		commonMethodPage.enterNaturalizedNumber(naturalizeNumber);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		commonMethodPage.selectToAddNonAplicantSpouse_S026("Someone else who isn't applying for coverage");
		commonMethodPage.enterAgainDob(dob);
		commonMethodPage.enterFirstName(grandPaFirstName);
		commonMethodPage.enterLastName(grandPaLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation1_L(parentRelation, grandParentRelation, "", "", "2");
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		commonMethodPage.verifyS027(s027Question, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(no);
		commonMethodPage.verifyS027Single2(s027QuestionSingle);
		commonMethodPage.selectIsFilingTaxMarriedNotFillingJointlyQuestion2_S027(yes);
		commonMethodPage.verifyS027Dependent3(s027QuestionDependent, s027DependentDrawerHeading,
				s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependentMarriedButFillingSeprate_027(yes);
		commonMethodPage.selectDependent(grandSonFullName);
		commonMethodPage.selectDependent(daughterFullName);
		commonMethodPage.doesApplicantAndSpouseLiveTogather_027(no);
		commonMethodPage.doesApplicantFileAsHouseHold_027(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(no);
		commonMethodPage.verifyS041AQuestion2(s041AQuestion2);
		commonMethodPage.selectWhoLiveOnThisAddress_S041A(grandSonFullName);
		commonMethodPage.selectWhoLiveOnThisAddress_S041A(daughterFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(daughterFullName);
		commonMethodPage.applicantTakeCareOfChildrenOther_S038(grandSonFullName);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(no);
		commonMethodPage.selectRace_S043(american);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female spouse
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

		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S019----------------------------");
		commonMethodPage.verifyS019(s019QuestionDaughter);
		commonMethodPage.immigrationStatus_S019(yes);
		commonMethodPage.verifyS019Question2(s019QuestionDaughter2);
		commonMethodPage.selectDocument_S019(imigration);
		commonMethodPage.selectDocumentType_S019(documentType);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		ExtentTestManager.getTest().info("---------------------SCREEN S021----------------------------");
		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutAddingMore();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionDaughter, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
		commonMethodPage.verifyS030Question(s030Question);
		commonMethodPage.liveWithAnotherParent_S030(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(no);
		commonMethodPage.selectRace_S043(american);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionGrandSon);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionGrandSon, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();
		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
		Wait.wait3Second();
		commonMethodPage.doAnyOtherFamilyMemberLiveOnThisAddress_S034(yes);
		commonMethodPage.canYouProvideMoreInfo_S034(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S035----------------------------");
		commonMethodPage.liveWithParentOrStepParent_S035(no);
		// commonMethodPage.selectParentOrStepParent_S035(childFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S036----------------------------");
		commonMethodPage.liveWithBrotherSisterUnderAge_S036(yes);
		commonMethodPage.whoIsBrotherSisterStepSister_S036(someOneElse);
		commonMethodPage.enterDob(grandDaughterAge);
		commonMethodPage.enterFirstName(grandDaughterFirstName);
		commonMethodPage.enterLastName(grandDaughterLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation3G_S27(grandChildRelation, childRelationShip, grandChildRelation,
				"not applicable", "3");
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		Wait.wait2Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(no);
		commonMethodPage.selectRace_S043(white);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		commonMethodPage.whatIsHomeAddress_S041(otherAddress);
		commonMethodPage.enterStreetAddress(otherStreetAddress);
		commonMethodPage.selectStateInContactInfo(otherState);
		commonMethodPage.enterCity(otherCity);
		commonMethodPage.enterZipCode(zipCode);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(otherCounty);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.selectAddress();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(no);
		commonMethodPage.selectRace_S043(white);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();
		Wait.wait5Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.selectRace_S043(no);
		commonMethodPage.selectRace_S043(white);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();
		// discharged vetrans or active duty
		ExtentTestManager.getTest().info("---------------------SCREEN S044----------------------------");
		// commonMethodPage.verifyS044();
		commonMethodPage.isAnyOneVetran_S044(applicantFullName);
		commonMethodPage.isAnyOneSpouseOfVetran_S044(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		Wait.wait5Second();
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyS049(s046QuestionMedicad, s046QuestionCHIP);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P1(yes);
		commonMethodPage.haveMedicaidOrChipEndedOrEndedSoon_S049_P2(no);
		commonMethodPage.s049EnterDate(lastDateOfMedicaidCHIP);
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
		commonMethodPage.deniedMedicaidCHIPBecauseOfImmigrationStatus_S050(daughterFullName);
		commonMethodPage.hadCurrentImmigrationStatusSinceFiveYear_S050(no);
		commonMethodPage.hadCurrentImmigrationStatusSinceFiveYear_S050(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// S050A
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.selectSitutionHouseHold_S050A(americanAlaskan);
		commonMethodPage.selectSitutionHouseHold_S050A(pregnant);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S052----------------------------");
		commonMethodPage.verifyS052(s052Question);
		commonMethodPage.whoIsAmericanAlaskan_S052(applicantFullName);
		commonMethodPage.whoIsAmericanAlaskan_S052(daughterFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// S053 Who is pregnent
		ExtentTestManager.getTest().info("---------------------SCREEN S053----------------------------");
		commonMethodPage.verifyS053(s053Question, s053DrawerHeading, s053DrawerContnet);
		commonMethodPage.whoIsPregnant_S053(daughterFullName);
		commonMethodPage.verifyS053Question2(s053Question2);
		commonMethodPage.selectBabyCount(babyCount);
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
		commonMethodPage.isTribeSourceIncome_S057(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.expenseDecision_S058(yes);
		commonMethodPage.expenseType_S058(studentLoan);
		commonMethodPage.expensePeriod_S058(monthly);
		commonMethodPage.enterExpenseAmount_S058(expenseAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Add new income
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.clickAddNewIncomeSource();
		Wait.wait2Second();

		// second income source
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057Question2IncomeType(s057Question2);
		commonMethodPage.selectIncomeType(unEmployment);
		Wait.wait2Second();
		commonMethodPage.incomePeriod_S057(twiceMonth);
		Wait.wait2Second();
		commonMethodPage.enterIncomeAmountWithOutTab(incomeAmount2);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(no);
		commonMethodPage.incomePredict_S059(no);
		commonMethodPage.enterAnuualPreditedAmount(anualPredictedAmount);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		// Income Questions for Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionDaughter);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Daughter);
		commonMethodPage.selectIncomeType(capitalGains);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Daughter);
		commonMethodPage.incomePeriod_S057(yearly);
		commonMethodPage.enterIncomeAmount(daughterIncomeAmount);
		commonMethodPage.isTribeSourceIncome_S057(yes);
		commonMethodPage.enterTribeIncomeAmount(tribeIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionDaughter);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(no);
		commonMethodPage.incomePredict_S059(no);
		commonMethodPage.enterAnuualPreditedAmount(daughterPredictedAmount);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionGrandSon);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionGrandSon);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		// Income Questions for Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionGrandDaughter);
		commonMethodPage.incomeThisMonth_S057(yes);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2GrandDaughter);
		commonMethodPage.selectIncomeType(investment);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3GrandDaughter);
		commonMethodPage.incomePeriod_S057(monthly);
		commonMethodPage.enterIncomeAmount(grandDaughterIncomeAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionGrandDaughter);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(grandSonFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S069----------------------------");
		Wait.wait2Second();
		commonMethodPage.whatTypeCoverageHave_S069(currentCoverageChip);
		commonMethodPage.whatTypeCoverageHave_S069(otherCoverage);
		commonMethodPage.whatTypeCoverageHave_S069(limitedCoverage);
		commonMethodPage.clickSaveAndContinueButton();

		// Offered from state benefit plan through job
		ExtentTestManager.getTest().info("---------------------SCREEN S082----------------------------");
		//commonMethodPage.verifyS082(s082Question);
		commonMethodPage.stateBenifitPlanThroughJob_S082(noneOfThese);
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
		//commonMethodPage.verifyS070(s070Question);
		commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S075----------------------------");
		//commonMethodPage.verifyS075(s075Question);
		commonMethodPage.whoFederallyRecognizedTribe_S075(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------SCREEN S076----------------------------");
		commonMethodPage.healthServiceFromIHS_S076_P1(no);
		commonMethodPage.healthServiceFromIHS_S076_P2(no);
		commonMethodPage.clickSaveAndContinueButton();

		// help paying for medical bills
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.helpPayingBill_S077(daughterFullName);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S079----------------------------");
		commonMethodPage.verifyScreen_s079_Question(s079Question);
		commonMethodPage.isParentLiveOutSideHome_S079(noneOfThese);
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
		commonMethodPage.verifyS084(s084Question, s084DrawerHeading);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.recentChanges_S085(noneOfThese);
		//commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
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
		commonMethodPage.agreeOne();
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		commonMethodPage.downloadEligibilityReport();
		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
		commonMethodPage.clickLogoutDropDown();

	}
}
