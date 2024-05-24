package ede_ph_1;

import java.util.ArrayList;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase1_C extends BaseTest {
	@Test
	public void testCase1_C() throws Exception {

		ExtentTestManager.createTest("Test case 1.C", "Test case 1.C");

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
		String single = Utility.getValue("single");
		String noticeMedium = Utility.getValue("noticeMedium");
		String studentLoan = Utility.getValue("studentLoan");
		String monthly = Utility.getValue("monthly");
		String otherReason = Utility.getValue("otherReason");
		String recentlyMoved = Utility.getValue("recentlyMoved");

		// Get data from testcase1.C.properties

		String state = Utility.getData_TestCase1_C("state");
		String firstName = Utility.getData_TestCase1_C("firstName");
		String lastName = Utility.getData_TestCase1_C("lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase1_C("age");
		String streetAddress = Utility.getData_TestCase1_C("streetAddress");
		String city = Utility.getData_TestCase1_C("city");
		String zipCode = Utility.getData_TestCase1_C("zipCode");
		String county = Utility.getData_TestCase1_C("county");
		String phoneNumber = Utility.getData_TestCase1_C("phoneNumber");
		String phoneType = Utility.getData_TestCase1_C("phoneType");
		String relationShip = Utility.getData_TestCase1_C("relationShip");
		String sonFirstName = Utility.getData_TestCase1_C("sonFirstName");
		String sonLastName = Utility.getData_TestCase1_C("sonLastName");
		String sonFullName = sonFirstName + " " + sonLastName;
		String incomeAmount = Utility.getData_TestCase1_C("incomeAmount");
		String incomeType = Utility.getData_TestCase1_C("incomeType");
		String employerName = Utility.getData_TestCase1_C("employerName");
		String incomePeriod = Utility.getData_TestCase1_C("incomePeriod");
		String sonIncomeAmount = Utility.getData_TestCase1_C("sonIncomeAmount");
		String sonIncomeType = Utility.getData_TestCase1_C("sonIncomeType");
		String sonEmployerName = Utility.getData_TestCase1_C("sonEmployerName");
		String sonIncomePeriod = Utility.getData_TestCase1_C("sonIncomePeriod");
		String EmployerPhone = Utility.getData_TestCase1_C("EmployerPhone");
		String sonAge = Utility.getData_TestCase1_C("sonAge");
		String language = Utility.getData_TestCase1_C("language");
		String SSN = Utility.getData_TestCase1_C("SSN");
		String sonSSN = Utility.getData_TestCase1_C("sonSSN");
		String expenseAmount = Utility.getData_TestCase1_C("expenseAmount");
		String movedZipCode = Utility.getData_TestCase1_C("movedZipCode");
		String movedState = Utility.getData_TestCase1_C("movedState");
		String movedCounty = Utility.getData_TestCase1_C("movedCounty");
		String movedDate = ESTTimeZone.getPreviousDate("40", "MM/dd/yyyy");

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
		String s012QuestionSon = "What is " + sonFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + sonFullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSon = "Is " + sonFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What�s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026Questionson = "What�s" + " " + sonFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ "2023" + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + "2023" + "?";
		String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " "
				+ "2023" + "?";

		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
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
		String s057QuestionSon = "Will " + sonFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2son = "Select a type of income " + sonFullName + " "
				+ Utility.getFromTextProperties("s057Question2");
		String s057Question3son = "How often does " + sonFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2023" + "?";
		String s058QuestionSon = "Does " + sonFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2023" + "?";
		String s068Question = Utility.getFromTextProperties("s068Question");
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
		String s074Questionson = Utility.getFromTextProperties("s074Question") + " " + sonEmployerName + " ("
				+ sonFullName + "'s job).";
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
		String s090Question2 = "When did " + applicantFullName + " and " + sonFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + sonFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");

		String s030Question = "You told us " + sonFullName + " lives with " + applicantFullName + ". Does "
				+ sonFullName + " " + Utility.getFromTextProperties("s030Question");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s051Question = Utility.getFromTextProperties("s051Question");
		String s051Question2 = "Does one or more of " + sonFullName + "'s "
				+ Utility.getFromTextProperties("s051Question2") + " " + state + "?";
		String s067Question = Utility.getFromTextProperties("s067Question");
		String s064Question = "income in " + "2023" + " "
				+ Utility.getFromTextProperties("s064Question");
		String s088Question = Utility.getFromTextProperties("s088Question");
		String dateError = Utility.getFromTextProperties("dateError") + " "
				+ ESTTimeZone.getPreviousDate("60", "MMM d, yyyy") + " and "
				+ ESTTimeZone.getCurrentDate("MMM d, yyyy");

	//Execution starts here 
		
		// Open Browser and execute URL
		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
		Wait.wait5Second();
		commonMethodPage.clickToCancelSessionOutBtn();
		//commonMethodPage.clickContinueBtn();
		commonMethodPage.clickAgreeConntinueBtn();
		Wait.wait5Second();
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
		commonMethodPage.selectGender(female);
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
		commonMethodPage.selectMailingAddress(yes);
		//commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
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
		commonMethodPage.selectWrittenLanguage(language);
		commonMethodPage.selectSpokenLanguage(language);
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
		//commonMethodPage.verifyS008(s008Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant detail
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		// commonMethodPage.verifyS010(medicaidDrawerHeading, notToIncludeDrawerHeading,
		// removeSomeOneDrawerHeading,
		// medicaidDrawerContent, notIncludeDrawerContent, removeSomeOneDrawerContent);
		// Add Second person
		commonMethodPage.clickAddPerson();
		Wait.wait2Second();
		//commonMethodPage.needCoverage(yes, "2");
		
		commonMethodPage.enterFirstName(sonFirstName);
		commonMethodPage.enterLastName(sonLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.enterDOB_S010(sonAge,"2");
		commonMethodPage.selectRelation(relationShip, "No applicable", "not applicable", "1");

		commonMethodPage.clickSaveAndContinueScrolled();

		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.enterSSN(SSN, s012SameNameQuestionFemale);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS014(s014Question, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait3Second();
		//commonMethodPage.verifyS027(s027QuestionSingle, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		//commonMethodPage.verifyS027Dependent(s027QuestionDependentSingleFemale, s027DependentDrawerHeading,
				//s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.selectDependent(sonFullName);
		commonMethodPage.clickSaveAndContinueButton();

		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		Wait.wait2Second();
		// commonMethodPage.verifyS038(s038Question);
		commonMethodPage.applicantTakeCareOfChildrenFirst_S038(noneOfThese);
		commonMethodPage.applicantTakeCareOfChildren_S038Question2(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// SSN for female spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012QuestionSon);
		commonMethodPage.enterSSN(sonSSN, s012SameNameQuestion);
		commonMethodPage.selectWithSameName(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// CitizenShip spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS014(s014QuestionSon, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// live with another parent
		ExtentTestManager.getTest().info("---------------------SCREEN S030----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS030Question(s030Question);
		commonMethodPage.liveWithAnotherParent_S030(no);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait3Second();
		commonMethodPage.clickSaveAndContinueButton();

		// NON-Magi Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		Wait.wait2Second();
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
		Wait.wait2Second();
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.selectSitutionHouseHold_S050A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		//commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
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
		//Wait.wait2Second();commonMethodPage.verifyS058(s058Question);
		Wait.wait2Second();
		commonMethodPage.expenseDecision_S058(yes);
		commonMethodPage.expenseType_S058(studentLoan);
		commonMethodPage.expensePeriod_S058(monthly);
		commonMethodPage.enterExpenseAmount_S058(expenseAmount);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();

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

		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSon);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		//commonMethodPage.verifyS058(s058QuestionSon);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		Wait.wait2Second();
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		Wait.wait2Second();
		//commonMethodPage.verifyS074(s074Question);
		//commonMethodPage.enterPhoneNumber4(EmployerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		// help paying for medical bills
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();

		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		Wait.wait2Second();
		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		//commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
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
		commonMethodPage.recentChanges_S085(recentlyMoved);
		//commonMethodPage.verifyS085(s085Question);
		commonMethodPage.clickSaveAndContinueButton();

		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S088----------------------------");
		Wait.wait5Second();
		//commonMethodPage.verifyS088(s088Question);
		commonMethodPage.whoRecentlyMoved_S088(applicantFullName);
		commonMethodPage.enterZipCode(movedZipCode);
		Wait.wait2Second();
		commonMethodPage.selectStateInContactInfo(movedState);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(movedCounty);
		//commonMethodPage.s088EnterDate("02/02/2020");
		commonMethodPage.s088EnterDate(movedDate);
		//commonMethodPage.verifyErrorOnDate(dateError);
		//commonMethodPage.s088enterDateToFilledField(movedDate);
		commonMethodPage.priorCoverageQuestion_S088(no);
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
//		Wait.wait3Second();
		commonMethodPage.downloadEligibilityReport();
//		Wait.wait5Second();

		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
//		commonMethodPage.clickLogoutDropDown();
//		commonMethodPage.clickLogout();

	}
}
