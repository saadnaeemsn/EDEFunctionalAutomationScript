package ede_partner_testcases4;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_157 extends BaseTest {
  @Test  public void testCase_157() throws Exception {

		ExtentTestManager.createTest("PTC157", "Partner Test Case 157");
		String tcDataFile = "partner_157.properties";
		
		// Get data from data.properties
		String url = Utility.getValue("url");
		String lnkSignInEDE = Utility.getValue("lnkSignIntoEDE");
		String userName = Utility.getValue("edeEmail");
		String password = Utility.getValue("edePassword");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
//		String someoneElse = "Someone else who isn't applying for coverage";
		String someoneElse = "Someone else who isn";
		String spanTag = Utility.getValue("spanTag");
		String inputTag = Utility.getValue("inputTag");
		String attrAriaLabel = Utility.getValue("attrAriaLabel");
		String s085Incarcerated = "Was released from incarceration (detention or jail)";
		String continueWithoutAnsweringQuestion = Utility.getValue("continueWithoutAnsweringQuestion");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String noneOfTheseChanges = Utility.getValue("noneOfTheseChanges");
		String noneOfThesePeople = Utility.getValue("noneOfThesePeople");
		String noneOfTheseApply = Utility.getValue("noneOfTheseApply");
		String isAIAN = Utility.getValue("isAIAN");
		String medicaid = Utility.getValue("medicaid");
		String noticeMedium = Utility.getValue("noticeMedium");
		String noticeMediumEmail = Utility.getValue("selectNoticeMediumEmail");
		String noticeMediumEmailAt = Utility.getValue("noticeMediumEmailAt");
		String agentUserName = Utility.getValue("agentUserName");
		String agentPassword = Utility.getValue("agentPassword");
		String identityProfing = Utility.getValue("identityProfing");
		String single = Utility.getValue("single");
		String married = Utility.getValue("married");
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
		String marketPlaceCoverage = Utility.getValue("marketPlaceCoverage");
		String otherReason = Utility.getValue("otherReason");

		String state = Utility.getData_TestCase(tcDataFile, "state");
		String stateTribe = Utility.getData_TestCase(tcDataFile, "stateTribe");
		String firstName = Utility.getData_TestCase(tcDataFile, "firstName");
		String lastName = Utility.getData_TestCase(tcDataFile, "lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase(tcDataFile, "age");
		String streetAddress = Utility.getData_TestCase(tcDataFile, "streetAddress");
		String city = Utility.getData_TestCase(tcDataFile, "city");
		String zipCode = Utility.getData_TestCase(tcDataFile, "zipCode");
		String county = Utility.getData_TestCase(tcDataFile, "county");
		String phoneNumber = Utility.getData_TestCase(tcDataFile, "phoneNumber");
		String phoneType = Utility.getData_TestCase(tcDataFile, "phoneType");
		String applSSN = Utility.getData_TestCase(tcDataFile, "applSSN");
		String hraCoverage = Utility.getData_TestCase(tcDataFile, "hraCoverage");
		String spouseSSN = Utility.getData_TestCase(tcDataFile, "spouseSSN");
		String childSSN = Utility.getData_TestCase(tcDataFile, "childSSN");
		String domesticPartnerFirstName = Utility.getData_TestCase(tcDataFile, "domesticPartnerFirstName");
		String domesticPartnerLastName = Utility.getData_TestCase(tcDataFile, "domesticPartnerLastName");
		String domesticPartnerFullName = domesticPartnerFirstName + " " + domesticPartnerLastName;
		String domesticPartnerAge = Utility.getData_TestCase(tcDataFile, "domesticPartnerAge");
		String incomeAmount = Utility.getData_TestCase(tcDataFile, "incomeAmount");
		String incomeAmount2 = Utility.getData_TestCase(tcDataFile, "incomeAmount2");
		String annualPredictedAmount = Utility.getData_TestCase(tcDataFile, "annualPredictedAmount");
		String reimbursementPeriod = Utility.getData_TestCase(tcDataFile, "reimbursementPeriod");
		String reimbursementAmount = null;
		if(state.trim().equals("NC")) {
			reimbursementAmount = Utility.getData_TestCase(tcDataFile, "reimbursementAmountNC");
		} else if(state.trim().equals("FL")) {
			reimbursementAmount = Utility.getData_TestCase(tcDataFile, "reimbursementAmountFL");
		}
		String reimbursementAmount4JobB = Utility.getData_TestCase(tcDataFile, "reimbursementAmount4JobB");
		String educationExpenses = Utility.getData_TestCase(tcDataFile, "educationExpenses");
		String selfPremiumAmount = Utility.getData_TestCase(tcDataFile, "selfOnlyPremiumAmount");
		String incomeType = Utility.getData_TestCase(tcDataFile, "incomeType");
		String employerName = Utility.getData_TestCase(tcDataFile, "employerName");
		String employerName2 = Utility.getData_TestCase(tcDataFile, "employerName2");
		String incomePeriod = Utility.getData_TestCase(tcDataFile, "incomePeriod");
		String domesticPartnerIncomeAmount = Utility.getData_TestCase(tcDataFile, "domesticPartnerIncomeAmount");
		String domesticPartnerIncomeType = Utility.getData_TestCase(tcDataFile, "domesticPartnerIncomeType");
		String domesticPartnerEmployerName = Utility.getData_TestCase(tcDataFile, "domesticPartnerEmployerName");
		String domesticPartnerIncomePeriod = Utility.getData_TestCase(tcDataFile, "domesticPartnerIncomePeriod");
		String relationShip = Utility.getData_TestCase(tcDataFile, "relationShip");
		String spouseFirstName = Utility.getData_TestCase(tcDataFile, "spouseFirstName");
		String spouseLastName = Utility.getData_TestCase(tcDataFile, "spouseLastName");
		String spouseAge = Utility.getData_TestCase(tcDataFile, "spouseAge");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String spouseRelationship = Utility.getData_TestCase(tcDataFile, "spouseRelationship");
		String employerPhone = Utility.getData_TestCase(tcDataFile, "employerPhone");
		String employerPhone2 = Utility.getData_TestCase(tcDataFile, "employerPhone2");
		String gotMarried = Utility.getData_TestCase(tcDataFile, "gotMarried");
		String adoption = Utility.getData_TestCase(tcDataFile, "adoption");
		String childFirstName = Utility.getData_TestCase(tcDataFile, "childFirstName");
		String childLastName = Utility.getData_TestCase(tcDataFile, "childLastName");
		String childFullName = childFirstName + " " + childLastName;
		String childAge = Utility.getData_TestCase(tcDataFile, "childAge");
		String childRelationship = Utility.getData_TestCase(tcDataFile, "childRelationship");
		String plan = Utility.getData_TestCase(tcDataFile, "plan");
		String withoutDocument = Utility.getData_TestCase(tcDataFile, "withoutDocument");
		String childIncomeAmount = Utility.getData_TestCase(tcDataFile, "childIncomeAmount");
		String incomeDiscrepanciesReason = Utility.getData_TestCase(tcDataFile, "incomeDiscrepanciesReason");
		String hours = Utility.getData_TestCase(tcDataFile, "hours");
		String minus60DaysDate = ESTTimeZone.getPreviousDate("60", "MMM d, yyyy");
		String minus90DaysDate = ESTTimeZone.getPreviousDate("90", "MMM d, yyyy");
		String minus60DaysDate2 = ESTTimeZone.getPreviousDate("60", "MM/dd/yyyy");
		String minus90DaysDate2 = ESTTimeZone.getPreviousDate("90", "MM/dd/yyyy");
		
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
		String s012QuestionChild2 = "What is " + childFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012SameNameQuestion = "Is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionChild = "Is " + childFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + childFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionSpouse = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionChild = "Is " + childFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
//		String s015Question = "Does this match the name and date of birth on "+applicantFullName+"'s Social Security card?";
		String s015Question = applicantFullName;
		String s017Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s017Question");
		String s017QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s017Question");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What’s" + " " + applicantFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026QuestionChild = "What’s" + " " + childFullName + "'s" + " "
				+ Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + "2024" + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + "2024" + "?";
		String s027QuestionDependentCouple = "Will " + applicantFullName + " and " + spouseFullName + " " 
				+ Utility.getFromTextProperties("s027QuestionDependent") + " " + "2024" + "?";

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
		String s038QuestionSpouse1 = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038QuestionSpouse2 = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionDaughter = "Does " + childFullName + " " + Utility.getFromTextProperties("s038Question");
		String s046QuestionMedicad = null;
		if(state.trim().equalsIgnoreCase("FL")) {
			s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicadFL") + " " + minus90DaysDate;	
		} else if(state.trim().equalsIgnoreCase("NC")) {
			s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicadNC") + " " + minus90DaysDate;
		}
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s049QuestionMedicad1 = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicad5");
		String s049QuestionMedicad2 = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicad5");
		String s049QuestionMedicad3 = "Did " + childFullName + " " + Utility.getFromTextProperties("s049QuestionMedicad5");
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s052Question = Utility.getFromTextProperties("s052Question");
		String s053Question = Utility.getFromTextProperties("s053Question");
		String s053DrawerHeading = Utility.getFromTextProperties("s053DrawerHeading");
		String s053DrawerContnet = Utility.getFromTextProperties("s053DrawerContnet");
		String s053Question2 = "How many babies is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s053Question2");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionChild = "Will " + childFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " "
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
		String s057Question3DomesticPartner = "How often does " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s057Question5 = "Enter the amount " + applicantFullName + " " + Utility.getFromTextProperties("s057Question5");
		
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2024" + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question") + " "
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
		String s069CQuestion = "On " + ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy") + ", will " + applicantFullName + " " + Utility.getFromTextProperties("s069CQuestion");
		String s069CQuestion2 = "Which employers offer " + applicantFullName + " " + Utility.getFromTextProperties("s069CQuestion2");
		String s069EQuestion = "Tell us about the ICHRA offered by " + employerName + " (" + applicantFullName + "'s job).";
		String s069EQuestion1 = "Tell us about the ICHRA offered by " + employerName;
		String s069EQuestion2 = "Tell us about the ICHRA offered by " + employerName2;
		String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
		String plus60DaysDate2 = ESTTimeZone.getAdvanceDate("60", "MM/d/yyyy");
		String plus65DaysDate = ESTTimeZone.getAdvanceDate("65", "MMM d, yyyy");
		String plus65DaysDate2 = ESTTimeZone.getAdvanceDate("65", "MM/d/yyyy");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and " + plus60DaysDate + "?";
		String s069DQuestion2 = "Which type of HRA coverage has "+applicantFullName+" been offered?";
		String s069DQuestion3 = "Is "+applicantFullName+" currently enrolled in an Individual coverage HRA through this employer?";
		String s069DQuestion02 = Utility.getFromTextProperties("s069DQuestion2");
		String s069DQuestion03 = Utility.getFromTextProperties("s069DQuestion3");
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s070Question = Utility.getFromTextProperties("s070Question");
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName + " ("+ applicantFullName + "'s job).";
		String s074Question2 = Utility.getFromTextProperties("s074Question") + " " + employerName2 + " ("+ applicantFullName + "'s job).";
		String s074QuestionDomesticPartner = Utility.getFromTextProperties("s074Question") + " " + domesticPartnerEmployerName + " (" + domesticPartnerFullName + "'s job).";
		String s075Question = Utility.getFromTextProperties("s075Question");
		String s075Question2 = "Where's "+applicantFullName+"'s tribe located?";
		String s075Question3 = "Which federally recognized tribe does "+applicantFullName+" belong to?";
		String s077Question = Utility.getFromTextProperties("s077Question");
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
		String s087Question = Utility.getFromTextProperties("s087Question");
		String s089Question = Utility.getFromTextProperties("s089Question") + " " + minus60DaysDate + "?";
		String s090Question = Utility.getFromTextProperties("s090Question");
		String marriedDate = ESTTimeZone.getPreviousDate("45", "MM/dd/yyyy");
		String s090Question2 = "When did " + applicantFullName + " and " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");
		String s094Question = Utility.getFromTextProperties("s094Question");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s042Question2 = "What's " + applicantFullName + "'s " + Utility.getFromTextProperties("s042Question2");
		String s045Question1 = Utility.getFromTextProperties("s045Question1");
		String s045Question2 = Utility.getFromTextProperties("s045Question2");
		String s019Question2 = "Select the document type that corresponds with " + applicantFullName + "'s "
				+ Utility.getFromTextProperties("s019Question2");
		String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + "2024" + "?";
		String s027QuestionDependentSingleMale = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + "2024" + "?";
		String s024Question = "Has " + applicantFullName + " " + Utility.getFromTextProperties("s024Question");
		String s030QuestionChild = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
				+ childFullName + " " + Utility.getFromTextProperties("s030Question");
		String s50Question = Utility.getFromTextProperties("s50Question");
		String s081Question = Utility.getFromTextProperties("s081Question");
		String s071QuestionApplicant = "Which of " + applicantFullName + "'s " + "employers offer " + applicantFullName + " "
				+ Utility.getFromTextProperties("s071Question");
		String s072Question = Utility.getFromTextProperties("s072Question");
		String s072Question2 = "Does " + employerName + " " + Utility.getFromTextProperties("s072Question2");
		String s073Question = "Do the plans offered by " + employerName + " " + Utility.getFromTextProperties("s073Question");
		String s079Question = Utility.getFromTextProperties("s079Question");
		String s067Question = Utility.getFromTextProperties("s067Question");

		String applEligibleResult = "Eligible";
		String applEligibleResultDetails = "To buy a Marketplace plan\n"
				+ "\n"
				+ "For lower copayments, coinsurance and deductibles (cost-sharing reductions) on Silver plans.";
		
		String spouseEligibleResult = "Eligible";
		String spouseEligibleResultDetails = "To buy a Marketplace plan\n"
				+ "\n"
				+ "For lower copayments, coinsurance and deductibles (cost-sharing reductions) on Silver plans.";
		
		String childEligibleResult = "May be eligible";
		String childEligibleResultDetails = "For Medicaid,  you'll get a final decision from your state Medicaid agency.";
		
		
		// Open Browser and execute URL

		loginEdeQa(userName, password, url);
		CommonMethodPage commonMethodPage = new CommonMethodPage();
		LoginPage loginPage = new LoginPage();
//		commonMethodPage.clickContinueBtn();
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
		commonMethodPage.selectGender(male);
		commonMethodPage.clickSaveAndContinueButton();

		// Address
		ExtentTestManager.getTest().info("---------------------SCREEN S002----------------------------");
		commonMethodPage.refreshPage();
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

		// Phone and Email
		ExtentTestManager.getTest().info("---------------------SCREEN S004----------------------------");
		commonMethodPage.enterPhoneNumber(phoneNumber);
		commonMethodPage.verifyS004(s004Question);
		commonMethodPage.selectPhoneType(phoneType);
		commonMethodPage.clickSaveAndContinueButton();

		// Spoken and Written language
		ExtentTestManager.getTest().info("---------------------SCREEN S005----------------------------");
		commonMethodPage.verifyS005(s005Question, questionExplaination, s005DrawerHeading, s005DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Notice Medium
		ExtentTestManager.getTest().info("---------------------SCREEN S006----------------------------");
		commonMethodPage.verifyS006(s006Question);
		commonMethodPage.selectNoticeMediumEmail(noticeMediumEmail);
		commonMethodPage.selectNoticeMediumEmailAt(noticeMediumEmailAt);
		commonMethodPage.clickSaveAndContinueButton();

		// Professional Help
		ExtentTestManager.getTest().info("---------------------SCREEN S007----------------------------");
		commonMethodPage.verifyS007(s007Question, s007DrawerHeading, s007DrawerContent);
		commonMethodPage.selectIsProfessnalHelping(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Financial Coverage
		ExtentTestManager.getTest().info("---------------------SCREEN S008----------------------------");
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.selectHelpPayingForCoverage(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant Details
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		// Get application ID
		String applicationId = commonMethodPage.getS010AppId();
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// SSN - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012-----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.clickWithOutSSN();
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();

		// Citizenship - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question,s014DrawerHeading, s014drawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Marital Status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionDependentSingleMale, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(no);
		commonMethodPage.chooseAnOption(no, 1, 3);
//		commonMethodPage.chooseAnOption(childFullName, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Take care of children - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
//		commonMethodPage.verifyPTC171S038(s038Question1);
		commonMethodPage.verifyS038(s038Question2);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Sexual Orientation - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Race - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
				
		// More About This Household Questions
		
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		Wait.wait2Second();
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 2);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
//		commonMethodPage.verifyQuestionContents(s049QuestionMedicad1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyPTC107S046(s046QuestionMedicad);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.chooseAnOption(noneOfTheseApply, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S052----------------------------");
		commonMethodPage.verifyS052(s052Question);
		commonMethodPage.chooseAnOption(applicantFullName, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// Income Questions - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		Wait.wait3Second();
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2);
		commonMethodPage.selectIncomeType(incomeType);
		commonMethodPage.enterEmployerName(employerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount);
//						commonMethodPage.verifyS057Question5EducationExpense(s057Question5);
//						commonMethodPage.enterEducationExpenses(educationExpenses);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Applicant Expense - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
//		Wait.wait2Second();
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		// calculate monthly income
//		Wait.wait3Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// 
		ExtentTestManager.getTest().info("---------------------SCREEN S064----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Income Discrepancies
		ExtentTestManager.getTest().info("---------------------SCREEN S063----------------------------");
		commonMethodPage.enterReasonToDiffrenceIncome_S063(incomeDiscrepanciesReason);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// Currently Enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// S069C - Applicant - P1
		ExtentTestManager.getTest().info("---------------------SCREEN S069C----------------------------");
		commonMethodPage.verifyS069C(s069CQuestion);
		commonMethodPage.chooseAnOption(yes, 1);
		commonMethodPage.verifyS069CQuestion2(s069CQuestion2);
		commonMethodPage.chooseAnOption(employerName, 1);
		commonMethodPage.chooseAnOption(employerName2, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S069E - Applicant - P1
		ExtentTestManager.getTest().info("---------------------SCREEN S069E----------------------------");
		commonMethodPage.verifyS069E(s069EQuestion);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, reimbursementAmount, reimbursementPeriod, employerPhone, s069EQuestion1);
		commonMethodPage.ptc151S069EFillForm(plus60DaysDate2, plus65DaysDate2, reimbursementAmount4JobB, reimbursementPeriod, employerPhone2, s069EQuestion2);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// S069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.chooseAnOption(applicantFullName, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s069DQuestion2, s069DQuestion2, 1, 1);
		commonMethodPage.chooseAnOption(hraCoverage, 1, 1);
		commonMethodPage.enterNSelectOption(inputTag, attrAriaLabel, s069DQuestion02, 2, minus60DaysDate2, 1);
		commonMethodPage.enterNSelectOption(inputTag, attrAriaLabel, s069DQuestion03, 2, minus60DaysDate2, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s069DQuestion3, s069DQuestion3, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
//				commonMethodPage.verifyS070(s070Question);
		commonMethodPage.verifyQuestionContents(spanTag, s070Question, s070Question, 2, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// About Employer - Phone #
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question);
//		commonMethodPage.enterPhoneNumber4(employerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// About Employer - Federally Recognized Tribe
		ExtentTestManager.getTest().info("---------------------SCREEN S075----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s075Question, s075Question, 1, 1);
		commonMethodPage.chooseAnOption(applicantFullName, 1);
//		commonMethodPage.verifyQuestionContents(spanTag, s075Question2, s075Question2, 1, 1);
		commonMethodPage.ptc152S075ChooseStateNTribe("Select a state", "AZ");
		commonMethodPage.verifyQuestionContents(spanTag, s075Question3, s075Question3, 1, 1);
		commonMethodPage.ptc152S075ChooseStateNTribe(s075Question3, stateTribe);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		/*
		// S077
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.verifyS077(s077Question);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
		commonMethodPage.verifyS084(s084Question, "");
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S085
		ExtentTestManager.getTest().info("---------------------SCREEN S085----------------------------");
		commonMethodPage.verifyS085(s085Question);
		commonMethodPage.chooseAnOption(noneOfTheseChanges, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// S087
		ExtentTestManager.getTest().info("---------------------SCREEN S087----------------------------");
		commonMethodPage.verifyS087(s087Question);
		commonMethodPage.chooseAnOption(applicantFullName, 1);
		commonMethodPage.chooseAnOption(spouseFullName, 1);
		commonMethodPage.enterIncarceratedDate(applicantFullName, minus60DaysDate);
		commonMethodPage.enterIncarceratedDate(spouseFullName, minus60DaysDate);
		*/
		
		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		Wait.wait2Second();
		commonMethodPage.chooseAnOption("I agree", 1, 1);
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.chooseAnOption("I agree to allow the Marketplace to end the Marketplace coverage for anyone on my application who’s enrolled in both Marketplace and Medicare coverage.", 1, 1);
//		commonMethodPage.chooseAnOption("I agree to allow the", 2, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
//		commonMethodPage.agreeOne();
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.enterSignature(applicantFullName);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
//		commonMethodPage.downloadEligibilityReport();
		
//				Wait.wait10Second();
//				Utility.attachWebScreenShotToReport(ExtentTestManager.name + "_" + ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms"));
		/*
		ExtentTestManager.getTest().info("---------------------LOGOUT----------------------------");
		commonMethodPage.clickLogoutDropDown();
		commonMethodPage.clickLogout();
		Wait.wait10Second();
		*/
  }
}
