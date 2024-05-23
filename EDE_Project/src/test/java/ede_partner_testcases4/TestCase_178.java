package ede_partner_testcases4;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CommonMethodPage;
import pages.LoginPage;
import utils.ESTTimeZone;
import utils.ExtentTestManager;
import utils.Utility;
import utils.Wait;

public class TestCase_178 extends BaseTest {
  @Test  public void testCase_178() throws Exception {

		ExtentTestManager.createTest("PTC178", "Partner Test Case 178");
		String tcDataFile = "partner_178.properties";
		
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
		String s085Incarcerated = "Was released from incarceration (detention or jail)";
		String continueWithoutAnsweringQuestion = Utility.getValue("continueWithoutAnsweringQuestion");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String noneOfTheseChanges = Utility.getValue("noneOfTheseChanges");
		String noneOfThesePeople = Utility.getValue("noneOfThesePeople");
		String noneOfTheseApply = Utility.getValue("noneOfTheseApply");
		String medicaid = Utility.getValue("medicaid");
		String noticeMedium = Utility.getValue("noticeMedium");
		String noticeMediumEmail = Utility.getValue("selectNoticeMediumEmail");
		String noticeMediumEmailAt = Utility.getValue("noticeMediumEmailAt");
		String agentUserName = Utility.getValue("agentUserName");
		String agentPassword = Utility.getValue("agentPassword");
		String identityProfing = Utility.getValue("identityProfing");
		String single = Utility.getValue("single");
		String married = Utility.getValue("married");
		String inputTag = Utility.getValue("inputTag");
		String selectTag = Utility.getValue("selectTag");
		String buttonTag = Utility.getValue("buttonTag");
		String attrAriaLabel = Utility.getValue("attrAriaLabel");
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
		String ralc = Utility.getValue("ralc");
		String ralcCaps = Utility.getValue("ralcCaps");
		String cont = Utility.getValue("cont");

		// Get data from testcase_115.properties
		String state = Utility.getData_TestCase(tcDataFile, "state");
		String firstName = Utility.getData_TestCase(tcDataFile, "firstName");
		String lastName = Utility.getData_TestCase(tcDataFile, "lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase(tcDataFile, "age");
		String ssn = Utility.getData_TestCase(tcDataFile, "ssn");
		String streetAddress = Utility.getData_TestCase(tcDataFile, "streetAddress");
		String city = Utility.getData_TestCase(tcDataFile, "city");
		String zipCode = Utility.getData_TestCase(tcDataFile, "zipCode");
		String county = Utility.getData_TestCase(tcDataFile, "county");
		String phoneNumber = Utility.getData_TestCase(tcDataFile, "phoneNumber");
		String phoneType = Utility.getData_TestCase(tcDataFile, "phoneType");
		String spouseSSN = Utility.getData_TestCase(tcDataFile, "spouseSSN");
		String childSSN = Utility.getData_TestCase(tcDataFile, "childSSN");
		String secondChildSSN = Utility.getData_TestCase(tcDataFile, "secondChildSSN");
		String domesticPartnerFirstName = Utility.getData_TestCase(tcDataFile, "domesticPartnerFirstName");
		String domesticPartnerLastName = Utility.getData_TestCase(tcDataFile, "domesticPartnerLastName");
		String domesticPartnerFullName = domesticPartnerFirstName + " " + domesticPartnerLastName;
		String domesticPartnerAge = Utility.getData_TestCase(tcDataFile, "domesticPartnerAge");
		String incomeAmount = Utility.getData_TestCase(tcDataFile, "incomeAmount");
		String annualPredictedAmount = Utility.getData_TestCase(tcDataFile, "annualPredictedAmount");
		String educationExpenses = Utility.getData_TestCase(tcDataFile, "educationExpenses");
		String selfPremiumAmount = Utility.getData_TestCase(tcDataFile, "selfOnlyPremiumAmount");
		String incomeType = Utility.getData_TestCase(tcDataFile, "incomeType");
		String employerName = Utility.getData_TestCase(tcDataFile, "employerName");
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
		String spouseIncomeAmount = Utility.getData_TestCase(tcDataFile, "spouseIncomeAmount");
		String spouseIncomeAmount2 = Utility.getData_TestCase(tcDataFile, "spouseIncomeAmount2");
		String spouseIncomeType = Utility.getData_TestCase(tcDataFile, "spouseIncomeType");
		String spouseEmployerName = Utility.getData_TestCase(tcDataFile, "spouseEmployerName");
		String spouseIncomePeriod = Utility.getData_TestCase(tcDataFile, "spouseIncomePeriod");
		String employerPhone = Utility.getData_TestCase(tcDataFile, "employerPhone");
		String gainDependent = Utility.getData_TestCase(tcDataFile, "gainDependent");
		String gotMarried = Utility.getData_TestCase(tcDataFile, "gotMarried");
		String adoption = Utility.getData_TestCase(tcDataFile, "adoption");
		String childFirstName = Utility.getData_TestCase(tcDataFile, "childFirstName");
		String childLastName = Utility.getData_TestCase(tcDataFile, "childLastName");
		String childFullName = childFirstName + " " + childLastName;
		String childAge = Utility.getData_TestCase(tcDataFile, "childAge");
		String childRelationship = Utility.getData_TestCase(tcDataFile, "childRelationship");
		String childCoverage = Utility.getData_TestCase(tcDataFile, "childCoverage");
		String brotherRelationship = Utility.getData_TestCase(tcDataFile, "brotherRelationship");
		String secondChildFirstName = Utility.getData_TestCase(tcDataFile, "secondChildFirstName");
		String secondChildLastName = Utility.getData_TestCase(tcDataFile, "secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getData_TestCase(tcDataFile, "secondChildAge");
		String secondChildRelationship = Utility.getData_TestCase(tcDataFile, "secondChildRelationship");
		String secondChildBrotherRelationship = Utility.getData_TestCase(tcDataFile, "brotherRelation");
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
		String s012QuestionSpouse = "What is " + spouseFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionChild = "What is " + childFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionChild2 = "What is " + secondChildFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012SameNameQuestion = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionChild = "Is " + childFullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionFemale = "Is " + childFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionSpouse = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " "
				+ Utility.getFromTextProperties("s014Question");
		String s014QuestionChild = "Is " + childFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
//		String s015Question = "Does this match the name and date of birth on "+applicantFullName+"'s Social Security card?";
		String s015Question = applicantFullName;
		String s017Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s017Question");
		String s017QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s017Question");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s026Question = "What’s" + " " + applicantFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026Question2 = "Who is" + " " + applicantFullName + "'s" + " " + Utility.getFromTextProperties("s026Question2");
		String s026QuestionChild = "What’s" + " " + childFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionSpouse = "What’s" + " " + spouseFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale2") + " " + "2024" + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " "
				+ Utility.getFromTextProperties("s027QuestionSingle") + " " + "2024" + "?";
		String s027QuestionDependentCouple = "Will " + applicantFullName + " and " + spouseFullName + " " 
				+ Utility.getFromTextProperties("s027QuestionDependent") + " " + "2024" + "?";

		// ESTTimeZone.getCurrentYear() to be used for getting Current year

		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s028Question = "Who is the tax filer that will claim "+childFullName+" on their income tax return?";
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s038Question1 = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038Question2 = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionSpouse1 = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038QuestionSpouse2 = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionDaughter = "Does " + childFullName + " " + Utility.getFromTextProperties("s038Question");
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionMedicad1 = Utility.getFromTextProperties("s046QuestionMedicad1");
		String s046QuestionMedicad4 = Utility.getFromTextProperties("s046QuestionMedicad4") + " " + minus90DaysDate + "?";
		String s046QuestionMedicad5 = Utility.getFromTextProperties("s046QuestionMedicad5");
		String s046QuestionMedicad6 = Utility.getFromTextProperties("s046QuestionMedicad6") + " " + minus90DaysDate;
		String s046QuestionMedicad7 = Utility.getFromTextProperties("s046QuestionMedicad7") + " " + minus90DaysDate + "?";
		String s046QuestionMedicadOH = Utility.getFromTextProperties("s046QuestionMedicad8") + " " + minus90DaysDate + "?";
		String s046QuestionMedicadIL = Utility.getFromTextProperties("s046QuestionMedicadIL") + " " + minus90DaysDate;
		String s046QuestionMedicadAZ = Utility.getFromTextProperties("s046QuestionMedicadAZ") + " " + minus90DaysDate;
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		s046QuestionMedicad = null;
		if(state.trim().equalsIgnoreCase("wi")) {
			s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicadWI") + " " + minus90DaysDate + "?";
		}else if(state.trim().equalsIgnoreCase("fl")) {
			s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicadFL") + " " + minus90DaysDate + "?";
		}else if(state.trim().equalsIgnoreCase("al")) {
			s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicadAL") + " " + minus90DaysDate + "?";
		}
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		String s049QuestionMedicad1 = null, s049QuestionMedicad2 = null, s049QuestionMedicad3 = null;
		if(state.trim().equalsIgnoreCase("wi")) {
			s049QuestionMedicad1 = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadWI");
			s049QuestionMedicad2 = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadWI");
			s049QuestionMedicad3 = "Did " + childFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadWI");
		}else if(state.trim().equalsIgnoreCase("fl")) {
			s049QuestionMedicad1 = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
			s049QuestionMedicad2 = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
			s049QuestionMedicad3 = "Did " + childFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
		}else if(state.trim().equalsIgnoreCase("al")) {
			s049QuestionMedicad1 = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadAL");
			s049QuestionMedicad2 = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadAL");
			s049QuestionMedicad3 = "Did " + childFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadAL");
		}
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s053Question = Utility.getFromTextProperties("s053Question");
		String s053DrawerHeading = Utility.getFromTextProperties("s053DrawerHeading");
		String s053DrawerContnet = Utility.getFromTextProperties("s053DrawerContnet");
		String s053Question2 = "How many babies is " + applicantFullName + " "
				+ Utility.getFromTextProperties("s053Question2");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionChild = "Will " + childFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionChild2 = "Will " + secondChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " " + Utility.getFromTextProperties("s057Question3");
		String s057Question2Spouse = "Select a type of income " + spouseFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3Spouse = "How often does " + spouseFullName + " "+ Utility.getFromTextProperties("s057Question3");
		String s057Question2Child = "Select a type of income " + childFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3Child = "How often does " + childFullName + " "+ Utility.getFromTextProperties("s057Question3");
		String s057QuestionDomesticPartner = "Will " + domesticPartnerFullName + " "+ Utility.getFromTextProperties("s057Question");
		String s057Question2DomesticPartner = "Select a type of income " + domesticPartnerFullName + " "+ Utility.getFromTextProperties("s057Question2");
		String s057Question3DomesticPartner = "How often does " + domesticPartnerFullName + " " + Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s057Question5 = "Enter the amount " + applicantFullName + " " + Utility.getFromTextProperties("s057Question5");
		
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2024" + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2024" + "?";
		String s058QuestionChild = "Does " + childFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2024" + "?";
		String s058QuestionChild2 = "Does " + secondChildFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ "2024" + "?";
		String s058QuestionDomesticPartner = "Does " + domesticPartnerFullName + " "
				+ Utility.getFromTextProperties("s058Question") + " " + "2024" + "?";
		String s064Question = "income in " + "2024" + " "
				+ Utility.getFromTextProperties("s064Question");
		String s068Question = Utility.getFromTextProperties("s068Question");
		String s081Question = Utility.getFromTextProperties("s081Question");
//		String s081Question2 = "Why did "+childFullName+"'s coverage end? (Optional)";
		String s081Question2 = "Why did "+childFullName;
		String s082Question = Utility.getFromTextProperties("s082Question");
		String s082QuestionAZ = Utility.getFromTextProperties("s082QuestionAZ");
		String s082QuestionWI = Utility.getFromTextProperties("s082QuestionWI");
		String s069AQuestion = Utility.getFromTextProperties("s069AQuestion");
		String s069BQuestion = Utility.getFromTextProperties("s069BQuestion");
		String plus60DaysDate = ESTTimeZone.getAdvanceDate("60", "MMM d, yyyy");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and " + plus60DaysDate + "? ";
		String s069DQuestion2 = Utility.getFromTextProperties("s069DQuestion");
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s070Question = Utility.getFromTextProperties("s070Question");
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName + " ("+ applicantFullName + "'s job).";
		String s074Question2 = Utility.getFromTextProperties("s074Question") + " " + employerName + " ("+ spouseFullName + "'s job).";
		String s074QuestionDomesticPartner = Utility.getFromTextProperties("s074Question") + " " + domesticPartnerEmployerName + " (" + domesticPartnerFullName + "'s job).";
		String s077Question = Utility.getFromTextProperties("s077Question");
		String s079Question = Utility.getFromTextProperties("s079Question");
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
		String s089Question2 = "When did "+childFullName+" become a dependent?";
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
		String s027QuestionDependentSingleFemale = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + "2024?";
		String s027QuestionDependentSingleMale = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + "2024?";
		String s027QuestionCoupleDependents = "Will " + applicantFullName + " and " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependent") + " " + "2024?";
		String s027QuestionAboutDependents = "Who are " + applicantFullName + " and " + spouseFullName + "'s dependents?";
		String s027QuestionAboutDependents2 = "Who are " + applicantFullName + "'s dependents?";
		String s027Question2 = "s dependents?";
		String s024Question = "Has " + applicantFullName + " " + Utility.getFromTextProperties("s024Question");
		String s030QuestionChild = "You told us " + childFullName + " lives with " + applicantFullName + ". Does "
				+ childFullName + " " + Utility.getFromTextProperties("s030Question");
		String s50Question = Utility.getFromTextProperties("s50Question");
		String s071QuestionApplicant = "Which of " + applicantFullName + "'s " + "employers offer " + applicantFullName + " "
				+ Utility.getFromTextProperties("s071Question");
		String s072Question = Utility.getFromTextProperties("s072Question");
		String s072Question2 = "Does " + employerName + " " + Utility.getFromTextProperties("s072Question2");
		String s073Question = "Do the plans offered by " + employerName + " " + Utility.getFromTextProperties("s073Question");
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
		Wait.wait2Second();
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
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant Details
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		// Get application ID
		String applicationId = commonMethodPage.getS010AppId();
		
		// Add Second person (Spouse)
		commonMethodPage.clickAddPerson2();
		commonMethodPage.enterDob(spouseAge, 2);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(spouseRelationship, "No applicable", "not applicable", "1");
		commonMethodPage.clickSaveAndContinueButton();
		
		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012-----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.enterSSN(ssn, s012SameNameQuestion);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Citizenship - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question,s014DrawerHeading, s014drawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Marital Status - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		/*
		commonMethodPage.verifyS026Q2(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.enterNchooseAnOptionWithContains("Who is", spouseFullName, 1);
		*/
		commonMethodPage.clickSaveAndContinueButton();
		
		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionCoupleDependents, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(no);
//		commonMethodPage.verifyQuestionContents(spanTag, s027Question2, s027QuestionAboutDependents2, 2, 1);
//		commonMethodPage.chooseAnOption(childFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Take care of children - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
//		commonMethodPage.verifyPTC171S038(s038Question2);
		commonMethodPage.verifyS038(s038Question2);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Sexual Orientation - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Race - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012-----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012QuestionSpouse);
		commonMethodPage.enterSSN(spouseSSN, s012SameNameQuestionSpouse);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Citizenship - 2nd Appl - Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Take care of children - 2nd Appl - Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
//				commonMethodPage.verifyPTC171S038(s038Question2);
		commonMethodPage.verifyS038(s038QuestionSpouse2);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Sexual Orientation - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S042A---------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Race - 2nd Appl
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
		// 1st Appl
		commonMethodPage.verifyQuestionContents(spanTag, s049QuestionMedicad1, s049QuestionMedicad1, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		// 2nd Appl
		commonMethodPage.verifyQuestionContents(spanTag, s049QuestionMedicad2, s049QuestionMedicad2, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 2);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
//		commonMethodPage.verifyPTC107S046(s046QuestionMedicad7);
		commonMethodPage.verifyQuestionContents(spanTag, s046QuestionMedicad, s046QuestionMedicad, 1, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.chooseAnOption(noneOfTheseApply, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2);
		commonMethodPage.selectIncomeType(incomeType);
		commonMethodPage.enterEmployerName(employerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount);
//		commonMethodPage.verifyS057Question5EducationExpense(s057Question5);
//		commonMethodPage.enterEducationExpenses(educationExpenses);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Applicant Expense - 1st Appl - Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
//		commonMethodPage.chooseAnOption(yes,  2);
//		Wait.wait2Second();
//		commonMethodPage.enterAnuualPreditedAmount(annualPredictedAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions - 2nd Appl - Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSpouse);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Spouse);
		commonMethodPage.selectIncomeType(spouseIncomeType);
		commonMethodPage.enterEmployerName(spouseEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Spouse);
		commonMethodPage.incomePeriod_S057(spouseIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(spouseIncomeAmount);
//		commonMethodPage.verifyS057Question5EducationExpense(s057Question5);
//		commonMethodPage.enterEducationExpenses(educationExpenses);
		commonMethodPage.clickSaveAndContinueButton();
		
		
		// Applicant Expense - 2nd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSpouse);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification - 2nd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// 
		ExtentTestManager.getTest().info("---------------------SCREEN S064----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
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
		
		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S081----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s081Question, s081Question, 1, 1);
		commonMethodPage.chooseAnOption(childFullName, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s081Question2, s081Question2, 1, 2);
		commonMethodPage.chooseAnOptionWithContains(childCoverage, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
//				commonMethodPage.verifyQuestionContents(spanTag, s069DQuestion, s069DQuestion, 1, 1);
//				commonMethodPage.verifyQuestionContents(spanTag, s069DQuestion, s069DQuestion, 1, 2);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S070 coverage through job starting from next month
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
		
		// About 2nd Employer - Phone #
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question2);
//		commonMethodPage.enterPhoneNumber4(employerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// S082
		ExtentTestManager.getTest().info("---------------------SCREEN S082----------------------------");
//		commonMethodPage.verifyS082(s082Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.verifyQuestionContents(spanTag, s082QuestionWI, s082QuestionWI, 2, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*/
		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.verifyS077(s077Question);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S079----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s079Question, s079Question, 1, 1);
		commonMethodPage.chooseAnOption(childFullName, 1);
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
//		commonMethodPage.chooseAnOption("I agree to this statement", 1);
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.chooseAnOption("I agree", 1, 1);
//		commonMethodPage.chooseAnOption("I agree", 1, 2);
		commonMethodPage.chooseAnOption("I agree to allow the Marketplace to end the Marketplace coverage for anyone on my application who’s enrolled in both Marketplace and Medicare coverage.", 1, 1);
//		commonMethodPage.chooseAnOptionWithContains("I agree to allow the", 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
//		commonMethodPage.agreeOne();
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.enterSignature(applicantFullName);
//		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait10Second();
		//				commonMethodPage.downloadEligibilityReport();
			commonMethodPage.clickLogoutDropDown();
		//				commonMethodPage.clickHome();
		commonMethodPage.clickHome();
		
		// Home Page - Load Created Application
		ExtentTestManager.getTest().info("---------------------HOME PAGE----------------------------");
		commonMethodPage.clickAnElement(state, 2, 1);
		
		// Eligibility Page
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY PAGE----------------------------");
		commonMethodPage.clickAnElement(ralc, 1, 1);
		commonMethodPage.clickAnElement(ralcCaps, 1, 1);
		Wait.wait1Second();
		commonMethodPage.clickAnElement(buttonTag, cont, 1, 1);
		
		commonMethodPage.clickIAgreeCheckBox();
		commonMethodPage.clickIUnderstandCheckBox();
		commonMethodPage.clickIAllowCheckBox();
		commonMethodPage.clickSaveAndContinueButton();

		// Contact Info
		ExtentTestManager.getTest().info("---------------------SCREEN S001----------------------------");
		commonMethodPage.needCoverage(yes, "1");
		commonMethodPage.verifyS001(s001Question);
		commonMethodPage.enterFirstName(firstName);
		dob = commonMethodPage.enterDob(age);
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
//						Wait.wait3Second();
		commonMethodPage.selectMailingAddress(yes);
		commonMethodPage.verifyScreen_s003(linkMailingDrawer, mailingDrawerHeading, s003Question, drawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// Phone and email
		ExtentTestManager.getTest().info("---------------------SCREEN S004----------------------------");
		commonMethodPage.enterPhoneNumber_S004(phoneNumber);
		commonMethodPage.verifyS004(s004Question);
//				commonMethodPage.selectPhoneType(phoneType);
		commonMethodPage.clickSaveAndContinueButton();

		// Spoken and written language
		ExtentTestManager.getTest().info("---------------------SCREEN S005----------------------------");
		commonMethodPage.verifyS005(s005Question, questionExplaination, s005DrawerHeading, s005DrawerContent);
		commonMethodPage.clickSaveAndContinueButton();

		// notice medium
		ExtentTestManager.getTest().info("---------------------SCREEN S006----------------------------");
		commonMethodPage.verifyS006(s006Question);
//				commonMethodPage.selectNoticeMedium(noticeMedium);
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
		// Add Third person
		commonMethodPage.clickAddPerson2();
		//commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDob(childAge, 3);
		commonMethodPage.enterFirstName(childFirstName);
		commonMethodPage.enterLastName(childLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(childRelationship, childRelationship, childRelationship, "1");
		commonMethodPage.selectRelation(childRelationship, childRelationship, childRelationship, "2");
		commonMethodPage.clickSaveAndContinueScrolled();
		
		/*
		commonMethodPage.clickAddPerson();
		*/
		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012-----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012Question);
//		commonMethodPage.enterSSN(ssn, s012SameNameQuestion);
//		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Citizenship - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014Question,s014DrawerHeading, s014drawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Marital Status - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(married);
		/*
		commonMethodPage.verifyS026Q2(s026Question, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.enterNchooseAnOptionWithContains("Who is", spouseFullName, 1);
		*/
		commonMethodPage.clickSaveAndContinueButton();
		
		// Filling Tax
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyS027Dependent(s027QuestionCoupleDependents, s027DependentDrawerHeading,s027DependentDrawerContent);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.verifyQuestionContents(spanTag, s027Question2, s027QuestionAboutDependents, 2, 1);
		commonMethodPage.chooseAnOption(childFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Take care of children - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyPTC171S038(s038Question1);
//		commonMethodPage.verifyS038(s038Question2);
		commonMethodPage.chooseAnOption(childFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Sexual Orientation - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Race - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012-----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012QuestionSpouse);
//		commonMethodPage.enterSSN(spouseSSN, s012SameNameQuestionSpouse);
//		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Citizenship - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Take care of children - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyPTC171S038(s038QuestionSpouse1);
//		commonMethodPage.verifyS038(s038QuestionSpouse2);
		commonMethodPage.chooseAnOption(childFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Sexual Orientation - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S042A---------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// Race - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN - 3rd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012-----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS012(s012QuestionChild);
		commonMethodPage.enterSSN(childSSN, s012SameNameQuestionChild);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Citizenship - 3rd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		
		ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s028Question, s028Question, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Race - 3rd Appl
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
		// 1st Appl
		commonMethodPage.verifyQuestionContents(spanTag, s049QuestionMedicad1, s049QuestionMedicad1, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		// 2nd Appl
		commonMethodPage.verifyQuestionContents(spanTag, s049QuestionMedicad2, s049QuestionMedicad2, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 2);
		commonMethodPage.clickSaveAndContinueButton();
		// 3rd Appl
		commonMethodPage.verifyQuestionContents(spanTag, s049QuestionMedicad3, s049QuestionMedicad3, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 3);
		commonMethodPage.clickSaveAndContinueButton();		
		
		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
//				commonMethodPage.verifyPTC107S046(s046QuestionMedicad7);
		commonMethodPage.verifyQuestionContents(spanTag, s046QuestionMedicad, s046QuestionMedicad, 1, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.chooseAnOption(noneOfTheseApply, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057Question);
		/*
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2);
		commonMethodPage.selectIncomeType(incomeType);
		commonMethodPage.enterEmployerName(employerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3);
		commonMethodPage.incomePeriod_S057(incomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(incomeAmount);
		*/
//		commonMethodPage.verifyS057Question5EducationExpense(s057Question5);
//		commonMethodPage.enterEducationExpenses(educationExpenses);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Applicant Expense - 1st Appl - Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058Question);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
//		commonMethodPage.chooseAnOption(yes,  2);
//		Wait.wait2Second();
//		commonMethodPage.enterAnuualPreditedAmount(annualPredictedAmount);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions - 2nd Appl - Spouse
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSpouse);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.verifyS057Question2IncomeType(s057Question2Spouse);
		commonMethodPage.selectIncomeType(spouseIncomeType);
		commonMethodPage.enterEmployerName(spouseEmployerName);
		commonMethodPage.verifyS057Question3IncomeDuration(s057Question3Spouse);
		commonMethodPage.incomePeriod_S057(spouseIncomePeriod);
		commonMethodPage.verifyS057Question4EnterIncome(s057Question4);
		commonMethodPage.enterIncomeAmount(spouseIncomeAmount2);
//		commonMethodPage.verifyS057Question5EducationExpense(s057Question5);
//		commonMethodPage.enterEducationExpenses(educationExpenses);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Applicant Expense - 2nd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSpouse);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification - 2nd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions - 3rd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionChild);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
				
		// Applicant Expense - 3rd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionChild);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification - 3rd Appl - Child
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		Wait.wait2Second();
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// 
		ExtentTestManager.getTest().info("---------------------SCREEN S064----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
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
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		Wait.wait2Second();
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRAHaveNotAccept_S069B(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
//								commonMethodPage.verifyQuestionContents(spanTag, s069DQuestion, s069DQuestion, 1, 1);
//								commonMethodPage.verifyQuestionContents(spanTag, s069DQuestion, s069DQuestion, 1, 2);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S070 coverage through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
//								commonMethodPage.verifyS070(s070Question);
		commonMethodPage.verifyQuestionContents(spanTag, s070Question, s070Question, 2, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// About Employer - Phone #
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question);
		commonMethodPage.enterPhoneNumber4(employerPhone);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
		commonMethodPage.verifyS077(s077Question);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S081----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s081Question, s081Question, 1, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S082
		ExtentTestManager.getTest().info("---------------------SCREEN S082----------------------------");
//				commonMethodPage.verifyS082(s082Question, s083DrawerHeading, s83DrawerContent);
		commonMethodPage.verifyQuestionContents(spanTag, s082QuestionWI, s082QuestionWI, 2, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
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
		commonMethodPage.chooseAnOption(gainDependent, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// S089
		ExtentTestManager.getTest().info("---------------------SCREEN S089----------------------------");
		commonMethodPage.verifyS089(s089Question);
		commonMethodPage.chooseAnOption(childFullName, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s089Question2, s089Question2, 2, 1);
		commonMethodPage.enterNSelectOption(inputTag, attrAriaLabel, s089Question2, 1, minus60DaysDate2, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Review
		ExtentTestManager.getTest().info("---------------------SCREEN REVIEW----------------------------");
		commonMethodPage.verifyReviewScreen(reviewDrawerHeading, reviewDrawerContent);
		commonMethodPage.clickSaveAndContinueScrolled();

		// Agreement
		ExtentTestManager.getTest().info("---------------------AGREEMENT----------------------------");
		Wait.wait2Second();
//		commonMethodPage.chooseAnOption("I agree to this statement", 1);
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.chooseAnOption("I agree", 1, 1);
//		commonMethodPage.chooseAnOption("I agree", 1, 2);
		commonMethodPage.chooseAnOption("I agree to allow the Marketplace to end the Marketplace coverage for anyone on my application who’s enrolled in both Marketplace and Medicare coverage.", 1, 1);
//		commonMethodPage.chooseAnOptionWithContains("I agree to allow the", 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Signature
		ExtentTestManager.getTest().info("---------------------SIGNATURE----------------------------");
//		commonMethodPage.agreeOne();
		commonMethodPage.chooseAnOption("I agree to this statement", 1, 1);
		commonMethodPage.enterSignature(applicantFullName);
//		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
//		Wait.wait5Second();
		
		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait10Second();
		//				commonMethodPage.downloadEligibilityReport();
			commonMethodPage.clickLogoutDropDown();
		
	}
}
