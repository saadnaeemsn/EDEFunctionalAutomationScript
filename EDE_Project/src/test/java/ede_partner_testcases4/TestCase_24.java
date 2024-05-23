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

public class TestCase_24 extends BaseTest {
	@Test
	public void TestCase_24() throws Exception {

		ExtentTestManager.createTest("Test case 24", "Test case 24");
		String tcDataFile = "partner_24.properties";
		
		// Get data from data.properties
		String url = Utility.getValue("url");
		String userName = Utility.getValue("userName");
		String password = Utility.getValue("password");
		String yes = Utility.getValue("yes");
		String no = Utility.getValue("no");
		String male = Utility.getValue("male");
		String female = Utility.getValue("female");
		String noneOfThese = Utility.getValue("noneOfThese");
		String noneOfTheseApply = Utility.getValue("noneOfTheseApply");
		String noneOfTheseChanges = Utility.getValue("noneOfTheseChanges");
		String noneOfThesePeople = Utility.getValue("noneOfThesePeople");
		String single = Utility.getValue("single");
		String spanTag = Utility.getValue("spanTag");
		String divTag = Utility.getValue("divTag");
		String selectTag = Utility.getValue("selectTag");
		String inputTag = Utility.getValue("inputTag");
		String buttonTag = Utility.getValue("buttonTag");
		String attrAriaLabel = Utility.getValue("attrAriaLabel");
		String married = Utility.getValue("married");
		String noticeMedium = Utility.getValue("noticeMedium");
		String grandChildRelation = Utility.getValue("grandChildRelation");
		String ralc = Utility.getValue("ralc");
		String ralcCaps = Utility.getValue("ralcCaps");
		String cont = Utility.getValue("cont");
		String death = Utility.getValue("death");
		String divorce = Utility.getValue("divorce");
		String iAgree = Utility.getValue("iAgree");
		String iAgreeToThisStatement = Utility.getValue("iAgreeToThisStatement");
		String iAgreeToAllow = Utility.getValue("iAgreeToAllow");
		String noneOfTheseChildren = Utility.getValue("noneOfTheseChildren");
		String someoneNotApplying = Utility.getValue("someoneNotApplying");
		String parentRelation = Utility.getValue("parentRelation");
		String someoneApplying = Utility.getValue("someoneApplying");

		// Get data from testcase43.properties
		String state = Utility.getData_TestCase(tcDataFile, "state");
		String state2 = Utility.getData_TestCase(tcDataFile, "state2");
		String firstName = Utility.getData_TestCase(tcDataFile, "firstName");
		String lastName = Utility.getData_TestCase(tcDataFile, "lastName");
		String applicantFullName = firstName + " " + lastName;
		String age = Utility.getData_TestCase(tcDataFile, "age");
		String ssn = Utility.getData_TestCase(tcDataFile, "ssn");
		String incarceration = Utility.getData_TestCase(tcDataFile, "incarceration");
		String spouseFirstName = Utility.getData_TestCase(tcDataFile, "spouseFirstName");
		String spouseLastName = Utility.getData_TestCase(tcDataFile, "spouseLastName");
		String spouseFullName = spouseFirstName + " " + spouseLastName;
		String spouseAge = Utility.getData_TestCase(tcDataFile, "spouseAge");
		String spouseSSN = Utility.getData_TestCase(tcDataFile, "spouseSSN");
		String firstChildFirstName = Utility.getData_TestCase(tcDataFile, "firstChildFirstName");
		String firstChildLastName = Utility.getData_TestCase(tcDataFile, "firstChildLastName");
		String firstChildFullName = firstChildFirstName + " " + firstChildLastName;
		String firstChildAge = Utility.getData_TestCase(tcDataFile, "firstChildAge");
		String firstChildSSN = Utility.getData_TestCase(tcDataFile, "firstChildSSN");
		String fatherFirstName = Utility.getData_TestCase(tcDataFile, "fatherFirstName");
		String fatherLastName = Utility.getData_TestCase(tcDataFile, "fatherLastName");
		String fatherFullName = fatherFirstName + " " + fatherLastName;
		String fatherAge = Utility.getData_TestCase(tcDataFile, "fatherAge");
		String secondChildFirstName = Utility.getData_TestCase(tcDataFile, "secondChildFirstName");
		String secondChildLastName = Utility.getData_TestCase(tcDataFile, "secondChildLastName");
		String secondChildFullName = secondChildFirstName + " " + secondChildLastName;
		String secondChildAge = Utility.getData_TestCase(tcDataFile, "secondChildAge");
		String thirdChildFirstName = Utility.getData_TestCase(tcDataFile, "thirdChildFirstName");
		String thirdChildLastName = Utility.getData_TestCase(tcDataFile, "thirdChildLastName");
		String thirdChildFullName = thirdChildFirstName + " " + thirdChildLastName;
		String thirdChildAge = Utility.getData_TestCase(tcDataFile, "thirdChildAge");
		String spouseRelationship = Utility.getData_TestCase(tcDataFile, "spouseRelationship");
		String childRelationship = Utility.getData_TestCase(tcDataFile, "childRelationship");
		String childRelationship2 = Utility.getData_TestCase(tcDataFile, "childRelationship2");
		String brotherRelationship = Utility.getData_TestCase(tcDataFile, "brotherRelationship");
		String nephewNieceRelationship = Utility.getData_TestCase(tcDataFile, "nephewNieceRelationship");
		String cousinRelationship = Utility.getData_TestCase(tcDataFile, "cousinRelationship");
		String parentRelationship = Utility.getData_TestCase(tcDataFile, "parentRelationship");
		String unrelatedRelationship = Utility.getData_TestCase(tcDataFile, "unrelatedRelationship");
		String stepparentRelationship = Utility.getData_TestCase(tcDataFile, "stepparentRelationship");
		String streetAddress = Utility.getData_TestCase(tcDataFile, "streetAddress");
		String city = Utility.getData_TestCase(tcDataFile, "city");
		String zipCode = Utility.getData_TestCase(tcDataFile, "zipCode");
		String county = Utility.getData_TestCase(tcDataFile, "county");
		String streetAddress2 = Utility.getData_TestCase(tcDataFile, "streetAddress2");
		String city2 = Utility.getData_TestCase(tcDataFile, "city2");
		String zipCode2 = Utility.getData_TestCase(tcDataFile, "zipCode2");
		String county2 = Utility.getData_TestCase(tcDataFile, "county2");
		String otherAddress = Utility.getData_TestCase(tcDataFile, "otherAddress");
		String phoneNumber = Utility.getData_TestCase(tcDataFile, "phoneNumber");
		String phoneType = Utility.getData_TestCase(tcDataFile, "phoneType");
		String hraCoverage = Utility.getData_TestCase(tcDataFile, "hraCoverage");
		String qsehra = Utility.getData_TestCase(tcDataFile, "qsehra");
		String someoneElse = Utility.getData_TestCase(tcDataFile, "someoneElse");
		String daughterFirstName = Utility.getData_TestCase(tcDataFile, "daughterFirstName");
		String daughterLastName = Utility.getData_TestCase(tcDataFile, "daughterLastName");
		String daughterFullName = daughterFirstName + " " + daughterLastName;
		String daughterRelationship = Utility.getData_TestCase(tcDataFile, "daughterRelationship");
		String incomeAmount = Utility.getData_TestCase(tcDataFile, "incomeAmount");
		String incomeType = Utility.getData_TestCase(tcDataFile, "incomeType");
		String employerName = Utility.getData_TestCase(tcDataFile, "employerName");
		String incomePeriod = Utility.getData_TestCase(tcDataFile, "incomePeriod");
		String incomeAmount2 = Utility.getData_TestCase(tcDataFile, "incomeAmount2");
		String incomeType2 = Utility.getData_TestCase(tcDataFile, "incomeType2");
		String employerName2 = Utility.getData_TestCase(tcDataFile, "employerName2");
		String incomePeriod2 = Utility.getData_TestCase(tcDataFile, "incomePeriod2");
		String spouseIncomeAmount = Utility.getData_TestCase(tcDataFile, "spouseIncomeAmount");
		String spouseIncomeType = Utility.getData_TestCase(tcDataFile, "spouseIncomeType");
		String spouseEmployerName = Utility.getData_TestCase(tcDataFile, "spouseEmployerName");
		String spouseIncomePeriod = Utility.getData_TestCase(tcDataFile, "spouseIncomePeriod");
		String firstChildIncomeAmount = Utility.getData_TestCase(tcDataFile, "firstChildIncomeAmount");
		String firstChildIncomeType = Utility.getData_TestCase(tcDataFile, "firstChildIncomeType");
		String firstChildEmployerName = Utility.getData_TestCase(tcDataFile, "firstChildEmployerName");
		String firstChildIncomePeriod = Utility.getData_TestCase(tcDataFile, "firstChildIncomePeriod");
		String employerPhone = Utility.getData_TestCase(tcDataFile, "employerPhone");
		String spouseEmployerPhone = Utility.getData_TestCase(tcDataFile, "spouseEmployerPhone");
		String firstChildEmployerPhone = Utility.getData_TestCase(tcDataFile, "firstChildEmployerPhone");
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
		String s012Question2 = "What is " + applicantFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012QuestionSpouse = "What is " + spouseFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionSpouse2 = "What is " + spouseFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012QuestionFather = "What is " + fatherFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionFather2 = "What is " + fatherFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012QuestionDaughter = "What is " + daughterFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012QuestionFirstChild = "What is " + firstChildFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionSecondChild = "What is " + secondChildFullName + "'s " + Utility.getFromTextProperties("s012Question");
		String s012QuestionFirstChild2 = "What is " + firstChildFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012QuestionSecondChild2 = "What is " + secondChildFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012QuestionThirdChild = "What is " + thirdChildFullName + "'s " + Utility.getFromTextProperties("s012Question2");
		String s012SameNameQuestion = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s012SameNameQuestionFemale");
		String s012SameNameQuestionFirstChild = "Is " + firstChildFullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s012SameNameQuestionSecondChild = "Is " + secondChildFullName + " " + Utility.getFromTextProperties("s012SameNameQuestion");
		String s014Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionDaughter = "Is " + daughterFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionFirstChild = "Is " + firstChildFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014QuestionSecondChild = "Is " + secondChildFullName + " " + Utility.getFromTextProperties("s014Question");
		String s014DrawerHeading = Utility.getFromTextProperties("s014DrawerHeading");
		String s014drawerContent = Utility.getFromTextProperties("s014drawerContent");
		String s010AQuestion = Utility.getFromTextProperties("s010AQuestion");
		String s010BQuestionFemale = "Remove "+spouseFullName+", " + Utility.getFromTextProperties("s010BQuestionFemale");
		String s010BQuestionFirstChild = "Remove "+firstChildFullName+", " + Utility.getFromTextProperties("s010BQuestionMale");
		String s010BQuestionSecondChild = "Remove "+secondChildFullName+", " + Utility.getFromTextProperties("s010BQuestionMale");
		String removeAppl = "Remove "+spouseFullName+" from the application";
		String changeFirstChildStatus = "Change "+firstChildFullName;
		String changeSecondChildStatus = "Change "+secondChildFullName;
		String s010BQuestion2 = "Why are you removing "+spouseFullName+" from the application?";
		String dateOfDeath = "Date of Death";
		String dateOfDivorce = "Date of Divorce";
		String s010ADrawerHeading = Utility.getFromTextProperties("s010ADrawerHeading");
		String s010ADrawerContent = Utility.getFromTextProperties("s010ADrawerContent");
		String s019Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s019Question");
		String s026Question = "What’s" + " " + applicantFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionSpouse = "What’s" + " " + spouseFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionDaughter = "What’s" + " " + daughterFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionFirstChild = "What’s" + " " + firstChildFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s026QuestionSecondChild = "What’s" + " " + secondChildFullName + "'s" + " " + Utility.getFromTextProperties("s026Question");
		String s028QuestionFirstChild = Utility.getFromTextProperties("s028Question") + " "+firstChildFullName+" "+Utility.getFromTextProperties("s028Question2");
		String s028QuestionFirstChild2 = Utility.getFromTextProperties("s028Question3") + " "+firstChildFullName+"?";
		String s028QuestionSecondChild = "Who is the tax filer that will claim "+secondChildFullName+" on their income tax return?";
		String s026DrawerContent = Utility.getFromTextProperties("s026DrawerContent");
		String s026DrawerHeading = Utility.getFromTextProperties("s026DrawerHeading");
		String s027Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionMale = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale2") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionMale") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSingle2 = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSingle = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentFirstChild = "Will " + firstChildFullName + " " + Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentPair = "Will " + applicantFullName + " and " + spouseFullName + " " + Utility.getFromTextProperties("s027QuestionDependent") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionDependentPairDependents = "Who are "+ applicantFullName+" and "+spouseFullName;
		String s027QuestionFirstChild = "Does " + firstChildFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionFirstChild2 = "Will " + firstChildFullName + " " + Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionFirstChild3 = "Will " + firstChildFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027Question3 = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSecondChild = "Does " + secondChildFullName + " " + Utility.getFromTextProperties("s027QuestionSingle") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSecondChild2 = "Will " + secondChildFullName + " " + Utility.getFromTextProperties("s027QuestionDependentSingleFemale") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s027QuestionSecondChild3 = "Will " + secondChildFullName + " " + Utility.getFromTextProperties("s027QuestionSomeOneElseTaxReturn") + " " + ESTTimeZone.getCurrentYear() + "?";
		
		String s027DrawerHeading = Utility.getFromTextProperties("s027DrawerHeading");
		String s027DrawerContent = Utility.getFromTextProperties("s027DrawerContent");
		String s027DependentDrawerHeading = Utility.getFromTextProperties("s027DependentDrawerHeading");
		String s027DependentDrawerContent = Utility.getFromTextProperties("s027DependentDrawerContent");
		String s027Question2 = "s dependents?";
		String s027QuestionAboutDependents = "Who are " + applicantFullName + " and " + spouseFullName + "'s dependents?";
		String s027QuestionAboutSingleDependents = "Who are " + applicantFullName + "'s dependents?";
		String s028Question = Utility.getFromTextProperties("s028Question") + " " + firstChildFullName + " " + Utility.getFromTextProperties("s028Question2");
		String s028Question3 = "Does "+firstChildFullName+" live with this parent?";
		String s028Question4 = "Does "+firstChildFullName+" live with any parent or stepparent?";
		String s030Question = "You told us "+firstChildFullName+" lives with "+applicantFullName+". Does "+firstChildFullName+" also live with another parent at this address?";
		String s032Question = "Is the person who claims "+firstChildFullName+" married?";
		String s032Question2 = "Does " + fatherFullName + " " + Utility.getFromTextProperties("s032Question") + " ?";
		String s032Question3 = "Who is "+fatherFullName;
		String s033Question = "Will "+spouseFullName+" claim any other tax dependents?";
		String s033Question2 = "Who will "+spouseFullName+" claim as tax dependents?";
		String s034Question = "Do any other family members live with " + applicantFullName;
		String s034QuestionFirstChild = "Do any other family members live with " + firstChildFullName;
		String s038Question = "Is " + applicantFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s038Question2 = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038Question3 = "Is "+applicantFullName+" " + Utility.getFromTextProperties("s038Question3");
		String s038QuestionSpouse = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionSpouse2 = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionSpouse3 = "Is " + spouseFullName + " " + Utility.getFromTextProperties("s038Question3");
		String s038QuestionFirstChild = "Does " + firstChildFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionFirstChild2 = "Is " + firstChildFullName + " " + Utility.getFromTextProperties("s038Question");
		String s038QuestionFirstChild3 = "Does " + firstChildFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionFirstChild4 = "Does " + firstChildFullName + " " + Utility.getFromTextProperties("s038Question3");
		String s038QuestionSecondChild = "Does " + secondChildFullName + " " + Utility.getFromTextProperties("s038Question2");
		String s038QuestionDaughter = "Is " + daughterFullName + " " + Utility.getFromTextProperties("s038Question1");
		String s041AQuestion = Utility.getFromTextProperties("s041AQuestion");
		String s041AQuestion2 = Utility.getFromTextProperties("s041AQuestion2") + " " + applicantFullName + ".";
		String s041ADrawerHeading = Utility.getFromTextProperties("s041ADrawerHeading");
		String s041ADrawerContent = Utility.getFromTextProperties("s041ADrawerContent");
		String s042Question = "Is "+applicantFullName+" living outside "+state+" temporarily?";
		String s046Question = null, s046QuestionSpouse = null, s046QuestionFirstChild = null, s046QuestionSecondChild = null, s046QuestionThirdChild = null,
				s049Question = null, s049QuestionSpouse = null, s049QuestionFirstChild = null, s049QuestionSecondChild = null, s049QuestionThirdChild = null,
				s081Question = null, s082Question = null;
		String s046QuestionMedicad = Utility.getFromTextProperties("s046QuestionMedicad");
		String s046QuestionCHIP = Utility.getFromTextProperties("s046QuestionCHIP");
		String s046DrawerHeading = Utility.getFromTextProperties("s046DrawerHeading");
		String s046DrawerContent = Utility.getFromTextProperties("s046DrawerContent");
		if(state.trim().equalsIgnoreCase("fl")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadFL") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?";
		}else if(state.trim().equalsIgnoreCase("mi")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadMI") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?";
		}else if(state.trim().equalsIgnoreCase("de")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadDE") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
		}else if(state.trim().equalsIgnoreCase("nh")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadNH") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
		}else if(state.trim().equalsIgnoreCase("ia")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadIA") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question3");
			s082Question = Utility.getFromTextProperties("s082QuestionIA");
		}else if(state.trim().equalsIgnoreCase("la")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadLA") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082QuestionLA");
		}else if(state.trim().equalsIgnoreCase("in")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadIN") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082QuestionIN");
		}else if(state.trim().equalsIgnoreCase("ks")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadKS") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082QuestionKS");
		}else if(state.trim().equalsIgnoreCase("ga")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadGA") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082QuestionGA");
		}else if(state.trim().equalsIgnoreCase("ok")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadOK") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082QuestionOK");
		}else if(state.trim().equalsIgnoreCase("tx")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadTX") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082QuestionTX");
		}else if(state.trim().equalsIgnoreCase("ms")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadMS") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s082Question = Utility.getFromTextProperties("s082QuestionMS");
		}else if(state.trim().equalsIgnoreCase("aZ")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadAZ") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
			s082Question = Utility.getFromTextProperties("s082Question");
		}else if(state.trim().equalsIgnoreCase("ut")) {
			s046Question = Utility.getFromTextProperties("s046QuestionMedicadUT") + " " + ESTTimeZone.getPreviousDate("90", "MMM d, yyyy") + "?"; ;
			s081Question = Utility.getFromTextProperties("s081Question");
		}
		
		if(state.trim().equalsIgnoreCase("fl")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
			s049QuestionSpouse = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
			s049QuestionSecondChild = "Did " + secondChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
			s049QuestionThirdChild = "Did " + thirdChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadFL");
		}else if(state.trim().equalsIgnoreCase("mi")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMI");
			s049QuestionSpouse = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMI");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMI");
			s049QuestionSecondChild = "Did " + secondChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMI");
			s049QuestionThirdChild = "Did " + thirdChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMI");
		}else if(state.trim().equalsIgnoreCase("de")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadDE");
			s049QuestionSpouse = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadDE");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadDE");
			s049QuestionSecondChild = "Did " + secondChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadDE");
			s049QuestionThirdChild = "Did " + thirdChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadDE");
		}else if(state.trim().equalsIgnoreCase("nh")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadNH");
			s049QuestionSpouse = "Did " + spouseFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadNH");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadNH");
			s049QuestionSecondChild = "Did " + secondChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadNH");
			s049QuestionThirdChild = "Did " + thirdChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadNH");
		}else if(state.trim().equalsIgnoreCase("ia")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadIA");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadIA");
		}else if(state.trim().equalsIgnoreCase("la")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadLA");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadLA");
		}else if(state.trim().equalsIgnoreCase("in")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadIN");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadIN");
		}else if(state.trim().equalsIgnoreCase("ks")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadKS");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadKS");
		}else if(state.trim().equalsIgnoreCase("ga")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadGA");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadGA");
		}else if(state.trim().equalsIgnoreCase("ok")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadOK");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadOK");
		}else if(state.trim().equalsIgnoreCase("tx")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTX");
			s049QuestionSpouse = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTX");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadTX");
		}else if(state.trim().equalsIgnoreCase("Ms")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMS");
			s049QuestionSpouse = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMS");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadMS");
		}else if(state.trim().equalsIgnoreCase("aZ")) {
			s049Question = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadAZ");
			s049QuestionSpouse = "Did " + applicantFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadAZ");
			s049QuestionFirstChild = "Did " + firstChildFullName + " " + Utility.getFromTextProperties("s049QuestionMedicadAZ");
		}
		
		String s050AQuestion = Utility.getFromTextProperties("s050AQuestion");
		String s057Question = "Will " + applicantFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2 = "Select a type of income " + applicantFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3 = "How often does " + applicantFullName + " " + Utility.getFromTextProperties("s057Question3");
		String s057QuestionFirstChild2 = "Select a type of income " + firstChildFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057QuestionFirstChild3 = "How often does " + firstChildFullName + " " + Utility.getFromTextProperties("s057Question3");
		String s057QuestionSpouse = "Will " + spouseFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionFather = "Will " + fatherFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionFirstChild = "Will " + firstChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionSecondChild = "Will " + secondChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionThirdChild = "Will " + thirdChildFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057QuestionDaughter = "Will " + daughterFullName + " " + Utility.getFromTextProperties("s057Question");
		String s057Question2Spouse = "Select a type of income " + spouseFullName + " " + Utility.getFromTextProperties("s057Question2");
		String s057Question3Spouse = "How often does " + spouseFullName + " "
				+ Utility.getFromTextProperties("s057Question3");
		String s057Question4 = Utility.getFromTextProperties("s057Question4");
		String s058Question = "Does " + applicantFullName + " " + Utility.getFromTextProperties("s058Question") + " "
				+ ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSpouse = "Does " + spouseFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFather = "Does " + fatherFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionFirstChild = "Does " + firstChildFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionSecondChild = "Does " + secondChildFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionThirdChild = "Does " + thirdChildFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?";
		String s058QuestionDaughter = "Does " + daughterFullName + " " + Utility.getFromTextProperties("s058Question") + " " + ESTTimeZone.getCurrentYear() + "?"; 
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
		String minus60DaysDate2 = ESTTimeZone.getPreviousDate("60", "MM/dd/yyyy");
		String minus90DaysDate = ESTTimeZone.getPreviousDate("90", "MMM d, yyyy");
		String minus90DaysDate2 = ESTTimeZone.getPreviousDate("90", "MM/dd/yyyy");
		String minus30DaysDate = ESTTimeZone.getPreviousDate("30", "MMM d, yyyy");
		String minus30DaysDate2 = ESTTimeZone.getPreviousDate("30", "MM/dd/yyyy");
		String todayDate = ESTTimeZone.getCurrentDate("MMM d, yyyy");
		String todayDate2 = ESTTimeZone.getCurrentDate("MM/dd/yyyy");
		String nextMonthFirstDay = ESTTimeZone.getStartOfNextMonth("MM/d/yyyy");
		String s069DQuestion = Utility.getFromTextProperties("s069DQuestion") + " " + minus60DaysDate + " and " + plus60DaysDate + "?";
		String s069DQuestion2 = "Is "+spouseFullName+" " + Utility.getFromTextProperties("s069DQuestion7");
		String s069DQuestion3 = "Is "+applicantFullName+" " + Utility.getFromTextProperties("s069DQuestion6");
		String s069DQuestion02 = Utility.getFromTextProperties("s069DQuestion2");
		String s069DQuestion03 = Utility.getFromTextProperties("s069DQuestion3");
		String s069DQuestion04 = Utility.getFromTextProperties("s069DQuestion4");
		String s069DQuestion05 = Utility.getFromTextProperties("s069DQuestion5");
		String s069DQuestionApplicant = "Which type of HRA coverage has "+applicantFullName+" been offered?";
		String s069DQuestionSpouse = "Which type of HRA coverage has "+spouseFullName+" been offered?";
		String s069DDrawerHeading = Utility.getFromTextProperties("s069DDrawerHeading");
		String s069DDrowerContent = Utility.getFromTextProperties("s069DDrowerContent");
		String s070Question = Utility.getFromTextProperties("s070Question");
		String s074Question = Utility.getFromTextProperties("s074Question") + " " + employerName + " (" + applicantFullName + "'s job).";
		String s074QuestionFirstChild = Utility.getFromTextProperties("s074Question") + " " + firstChildEmployerName + " (" + firstChildFullName + "'s job).";
		String s074QuestionSpouse = Utility.getFromTextProperties("s074Question") + " " + spouseEmployerName + " (" + daughterFullName + "'s job).";
		String s082QuestionWI = Utility.getFromTextProperties("s082QuestionWI");
		String s083Question = Utility.getFromTextProperties("s083Question") + " " + minus60DaysDate + " and " + ESTTimeZone.getCurrentDate("MMM d, yyyy") + "?";
		String s083DrawerHeading = Utility.getFromTextProperties("s083DrawerHeading");
		String date = " " + minus60DaysDate + " - " + ESTTimeZone.getCurrentDate("MMM d, yyyy");
		String s079Question = Utility.getFromTextProperties("s079Question");
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
		String s087Question2 = "When was "+applicantFullName+" released from incarceration?";
		String s090Question = Utility.getFromTextProperties("s090Question");
		String marriedDate = ESTTimeZone.getPreviousDate("45", "MM/dd/yyyy");
		String s090Question2 = "When did " + applicantFullName + " and " + daughterFullName + " "
				+ Utility.getFromTextProperties("s090Question2");
		String s090Question3 = "Did " + applicantFullName + " or " + daughterFullName + " "
				+ Utility.getFromTextProperties("s090Question3");
		String reviewDrawerHeading = Utility.getFromTextProperties("reviewDrawerHeading");
		String reviewDrawerContent = Utility.getFromTextProperties("reviewDrawerContent");

//		String s030Question = "You told us " + daughterFullName + " lives with " + applicantFullName + ". Does " + daughterFullName + " " + Utility.getFromTextProperties("s030Question");
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
//		commonMethodPage.needCoverage(yes, "1");
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
		commonMethodPage.refreshPage();
		Wait.wait2Second();
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
		commonMethodPage.verifyS008(s008Question);
		commonMethodPage.selectHelpPayingForCoverage(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// S010 Applicant detail
		ExtentTestManager.getTest().info("---------------------SCREEN S010----------------------------");
		// Add 2nd Person
		commonMethodPage.clickAddPerson2();
		//commonMethodPage.needCoverage(yes, "2");
		commonMethodPage.enterDob(spouseAge, 2);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(spouseRelationship, spouseRelationship, "not applicable", "1");
		
		// Add 3rd Person
		commonMethodPage.clickAddPerson2();
		commonMethodPage.enterDob(firstChildAge, 3);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.selectGender(male);
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "1");
		commonMethodPage.selectRelation(childRelationship2, childRelationship2, "not applicable", "2");
		commonMethodPage.clickSaveAndContinueButton();
		
		// S010A
		ExtentTestManager.getTest().info("---------------------SCREEN S010A----------------------------");
		commonMethodPage.verifyS010A(s010AQuestion, s010ADrawerHeading, s010ADrawerContent);
		commonMethodPage.selectToRemovePerson(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// SSN - 1st Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012Question);
		commonMethodPage.chooseAnOption(applicantFullName + " does not have an SSN.", 1, 1);
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
		commonMethodPage.verifyS027(s027QuestionMale, s027DrawerHeading, s027DrawerContent);
		commonMethodPage.selectIsFilingTax(yes);
		commonMethodPage.verifyQuestionContents(spanTag, s027QuestionDependentPair, s027QuestionDependentPair, 2, 1);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.chooseAnOption(firstChildFullName, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Do they live togather
		ExtentTestManager.getTest().info("---------------------SCREEN S041A----------------------------");
		commonMethodPage.verifyS041A(s041AQuestion, s041ADrawerHeading, s041ADrawerContent);
		commonMethodPage.selectDoTheyLiveTogather(yes);
//		commonMethodPage.verifyQuestionContents(spanTag, s041AQuestion2, s041AQuestion2, 1, 1);
//		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// 1st Appl - Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s038Question, s038Question, 1, 1);
		commonMethodPage.chooseAnOption(noneOfTheseChildren, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s038Question2, s038Question2, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		/*
		commonMethodPage.verifyQuestionContents(spanTag, s038Question3, s038Question3, 1, 1);
		commonMethodPage.chooseAnOption(yes, 1, 2);
		Wait.wait2Second();
		commonMethodPage.enterDob(firstChildAge, 1);
		commonMethodPage.enterFirstName(firstChildFirstName);
		commonMethodPage.enterLastName(firstChildLastName);
		commonMethodPage.chooseAnOption(male, 1, 1);
		commonMethodPage.selectRelation3H_S038(childRelationship, childRelationship, "not applicable", "", "", "", "1");
		*/
		commonMethodPage.clickSaveAndContinueButton();
						
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionSpouse);
		commonMethodPage.chooseAnOption(spouseFullName + " does not have an SSN.", 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();
		
		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionSpouse, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();

		// 2nd Appl - Take care of children
		ExtentTestManager.getTest().info("---------------------SCREEN S038----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s038QuestionSpouse, s038QuestionSpouse, 1, 1);
		commonMethodPage.chooseAnOption(noneOfTheseChildren, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s038QuestionSpouse2, s038QuestionSpouse2, 1, 1);
//		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		/*
		commonMethodPage.verifyQuestionContents(spanTag, s038QuestionSpouse3, s038QuestionSpouse3, 1, 1);
		commonMethodPage.chooseAnOption(yes, 1, 2);
		commonMethodPage.enterDob(secondChildAge, 1);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(female);
//		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "1");
//		commonMethodPage.selectRelation(childRelationship2, childRelationship2, "not applicable", "2");
		commonMethodPage.selectAnOption(selectTag, attrAriaLabel, spouseFullName+"?", childRelationship, 2, 1);
		*/
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		// SSN - 3rd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S012----------------------------");
		commonMethodPage.verifyS012(s012QuestionFirstChild);
		commonMethodPage.chooseAnOption(firstChildFullName + " does not have an SSN.", 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		commonMethodPage.clickContinueWithoutSsnBtn();
		
		// CitizenShip
		ExtentTestManager.getTest().info("---------------------SCREEN S014----------------------------");
		commonMethodPage.verifyS014(s014QuestionFirstChild, s014DrawerHeading, s014drawerContent);
		commonMethodPage.selectUSCitizenOrNot(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Drived or naturalized
		ExtentTestManager.getTest().info("---------------------SCREEN S017----------------------------");
		commonMethodPage.selectNaturalizedOrDrived(no, "", "", "");
		commonMethodPage.clickSaveAndContinueButton();
//				Wait.wait3Second();

		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S026----------------------------");
		commonMethodPage.verifyS026(s026QuestionFirstChild, s026DrawerHeading, s026DrawerContent);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// Filling Tax - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S027----------------------------");
		commonMethodPage.verifyS027(s027QuestionFirstChild, s027DrawerHeading, s027DrawerContent);-
		commonMethodPage.selectIsFilingTax(no);
//		commonMethodPage.verifyQuestionContents(spanTag, s027QuestionDependentFirstChild, s027QuestionDependentFirstChild, 1, 1);
		commonMethodPage.selectIsAnyDependent(yes);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S028----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s028Question, s028Question, 1, 1);
		commonMethodPage.chooseAnOption(applicantFullName, 2, 1);
		*/
		/*
		commonMethodPage.selectAnOption(selectTag, attrAriaLabel, s028QuestionFirstChild2, parentRelationship, 1, 1);
//		commonMethodPage.verifyQuestionContents(spanTag, s028Question3, s028Question3, 1, 1);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		/*
		commonMethodPage.verifyQuestionContents(spanTag, s028Question4, s028Question4, 1, 1);
		commonMethodPage.chooseAnOption(yes, 1, 2);
		commonMethodPage.chooseAnOption(yes, 1, 3);
		*
		Wait.wait2Second();
		commonMethodPage.enterDob(spouseAge, 1);
		commonMethodPage.enterFirstName(spouseFirstName);
		commonMethodPage.enterLastName(spouseLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(childRelationship, childRelationship, "not applicable", "1");
		commonMethodPage.clickSaveAndContinueButton();
		*/
	
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();

		/*
		// Marital status
		ExtentTestManager.getTest().info("---------------------SCREEN S032----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s032Question, s032Question, 1, 1);
		commonMethodPage.selectMaritalStatus(single);
		commonMethodPage.clickSaveAndContinueButton();

		ExtentTestManager.getTest().info("---------------------SCREEN S033----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s033Question, s033Question, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S034----------------------------");
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S035----------------------------");
		Wait.wait2Second();
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S036----------------------------");
		Wait.wait2Second();
//		commonMethodPage.verifyQuestionContents(spanTag, s033Question2, s033Question2, 1, 1);
		commonMethodPage.chooseAnOption(yes, 1, 1);
		commonMethodPage.chooseAnOption(someoneNotApplying, 2, 1);
		Wait.wait2Second();
		commonMethodPage.enterDob(secondChildAge, 1);
		commonMethodPage.enterFirstName(secondChildFirstName);
		commonMethodPage.enterLastName(secondChildLastName);
		commonMethodPage.selectGender(female);
		commonMethodPage.selectRelation(parentRelationship, parentRelationship, "not applicable", "1");
		commonMethodPage.selectRelation(parentRelationship, parentRelationship, "not applicable", "2");
//		commonMethodPage.selectRelation(childRelationship, brotherRelationship, childRelationship, "3");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		Wait.wait2Second();
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN - 3rd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		commonMethodPage.verifyS012(s012QuestionSpouse2);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait2Second();
		commonMethodPage.clickContinueWithoutSsnBtn();
		Wait.wait2Second();
		commonMethodPage.clickContinueWithoutSsnBtn();
		Wait.wait2Second();
				
		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		commonMethodPage.chooseAnOption(otherAddress, 1, 1);
		commonMethodPage.enterStreetAddress(streetAddress2);
		commonMethodPage.selectStateInContactInfo(state2);
		commonMethodPage.enterCity(city2);
		commonMethodPage.enterZipCode(zipCode2);
		commonMethodPage.clickCountyDropDown();
		commonMethodPage.selectCounty(county2);
		commonMethodPage.clickSaveAndContinueButton();
		if (!state.equals("WI")) {
			commonMethodPage.selectAddress();
		}
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		// SSN - 4th Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S013----------------------------");
		commonMethodPage.verifyS012(s012QuestionSecondChild2);
		commonMethodPage.clickSaveAndContinueButton();
		Wait.wait3Second();
		commonMethodPage.clickContinueWithoutSsnBtn();
//		commonMethodPage.clickContinueWithoutSsnBtn();
		Wait.wait3Second();
		
		/*
		ExtentTestManager.getTest().info("---------------------SCREEN S041----------------------------");
		commonMethodPage.chooseAnOption(streetAddress, 2, 1);
		commonMethodPage.clickSaveAndContinueButton();
		*
		
		ExtentTestManager.getTest().info("---------------------SCREEN S042A----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		
		ExtentTestManager.getTest().info("---------------------SCREEN S043----------------------------");
		commonMethodPage.clickSaveAndContinueButton();
		*/
		
		ExtentTestManager.getTest().info("---------------------SCREEN S045----------------------------");
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 2);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP ended or end soon
		ExtentTestManager.getTest().info("---------------------SCREEN S049----------------------------");
		commonMethodPage.verifyQuestionContents(spanTag, s049Question, s049Question, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 1);
		commonMethodPage.verifyQuestionContents(spanTag, s049QuestionFirstChild, s049QuestionFirstChild, 1, 1);
		commonMethodPage.chooseAnOption(no, 1, 2);
		commonMethodPage.chooseAnOption(no, 1, 3);
		commonMethodPage.clickSaveAndContinueButton();

		// Medicaid and CHIP
		ExtentTestManager.getTest().info("---------------------SCREEN S046----------------------------");
		commonMethodPage.verifyS046(s046Question, s046Question, s046DrawerHeading, s046DrawerContent);
		commonMethodPage.foundNotEligibleMedicaidOrCHIP_S046(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// S050A
		ExtentTestManager.getTest().info("---------------------SCREEN S050A----------------------------");
		commonMethodPage.verifyS050A(s050AQuestion);
		commonMethodPage.chooseAnOption(noneOfTheseApply, 1, 1);
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
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		
		// Income Questions - 3rd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSpouse);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSpouse);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();

		// Income Questions - 2nd Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionFirstChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionFirstChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		
		/*
		// Income Questions - 4th Appl
		ExtentTestManager.getTest().info("---------------------SCREEN S057----------------------------");
		commonMethodPage.verifyS057QuestionHaveIncomeThisMonth(s057QuestionSecondChild);
		commonMethodPage.incomeThisMonth_S057(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Expense
		ExtentTestManager.getTest().info("---------------------SCREEN S058----------------------------");
		commonMethodPage.verifyS058(s058QuestionSecondChild);
		commonMethodPage.expenseDecision_S058(no);
		commonMethodPage.clickSaveAndContinueButton();

		// Income verification
		ExtentTestManager.getTest().info("---------------------SCREEN S059----------------------------");
		commonMethodPage.incomeVerification_S059(yes);
		commonMethodPage.clickSaveAndContinueButton();
		*/

		// currently enrolled
		ExtentTestManager.getTest().info("---------------------SCREEN S068----------------------------");
		commonMethodPage.verifyS068(s068Question);
		commonMethodPage.currentlyEnrolled_S068(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		/*
		if(state.trim().equalsIgnoreCase("az") || state.trim().equalsIgnoreCase("tx") || state.trim().equalsIgnoreCase("ut")) {
			// S081
			ExtentTestManager.getTest().info("---------------------SCREEN S081----------------------------");
			commonMethodPage.verifyQuestionContents(spanTag, s081Question, s081Question, 1, 1);
			commonMethodPage.loseQualifyingHealthCovRecent_PTC043S083(noneOfThesePeople);
			commonMethodPage.clickSaveAndContinueButton();	
		}
		*/
		
		// Ichra offer from job
		ExtentTestManager.getTest().info("---------------------SCREEN S069A----------------------------");
		commonMethodPage.verifyS069A(s069AQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		// Ichra offer but not accepted
		ExtentTestManager.getTest().info("---------------------SCREEN S069B----------------------------");
		commonMethodPage.verifyS069B(s069BQuestion);
		commonMethodPage.throughJobICHRA_S069A(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();

		/*
//		if(state.trim().equalsIgnoreCase("ga") || state.trim().equalsIgnoreCase("ks")) {
			// S082
			ExtentTestManager.getTest().info("---------------------SCREEN S082----------------------------");
			commonMethodPage.verifyQuestionContents(spanTag, s082Question, s082Question, 2, 1);
			commonMethodPage.loseQualifyingHealthCovRecent_PTC043S083(noneOfThesePeople);
			commonMethodPage.clickSaveAndContinueButton();	
//		}
		*/
		
		// s069D
		ExtentTestManager.getTest().info("---------------------SCREEN S069D----------------------------");
		commonMethodPage.haveICHRAandQSEHRA_S069D(noneOfThese);
		commonMethodPage.verifyS069D(s069DQuestion, s069DDrawerHeading, s069DDrowerContent);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S070 covearge through job starting from next month
		ExtentTestManager.getTest().info("---------------------SCREEN S070----------------------------");
		commonMethodPage.verifyS070(s070Question);
//						commonMethodPage.CoverageThroughJobStartingNextMonth_S070(noneOfThese);
		commonMethodPage.chooseAnOption(noneOfThesePeople, 1, 1);
		commonMethodPage.clickSaveAndContinueButton();

		// About Applicant's Employer
		ExtentTestManager.getTest().info("---------------------SCREEN S074----------------------------");
		commonMethodPage.verifyS074(s074Question);
//		commonMethodPage.enterPhoneNumber4(employerPhone);
		commonMethodPage.clickSaveAndContinueButton();
		
//		if(state.trim().equalsIgnoreCase("ok")) {
			Wait.wait2Second();
			ExtentTestManager.getTest().info("---------------------SCREEN S077----------------------------");
			commonMethodPage.clickSaveAndContinueButton();
//		}
		
		// S083
		ExtentTestManager.getTest().info("---------------------SCREEN S083----------------------------");
		Wait.wait2Second();
//		commonMethodPage.verifyS083(s083Question, s083DrawerHeading, s83DrawerContent);
//		commonMethodPage.loseQualifyingHealthCovRecent_S083(noneOfThese);
		commonMethodPage.loseQualifyingHealthCovRecent_PTC043S083(noneOfThese);
		commonMethodPage.clickSaveAndContinueButton();
		
		// S084
		ExtentTestManager.getTest().info("---------------------SCREEN S084----------------------------");
//				Wait.wait5Second();
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
		commonMethodPage.chooseAnOption(iAgreeToThisStatement, 1, 1);
//		if(state.trim().equalsIgnoreCase("ok")) {
			commonMethodPage.chooseAnOption(iAgreeToThisStatement, 1, 2);	
//		}
		commonMethodPage.chooseAnOption(iAgree, 1, 1);
//		commonMethodPage.chooseAnOption(iAgree, 1, 2);
		commonMethodPage.chooseAnOption(iAgreeToAllow, 1, 1);
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
//		commonMethodPage.clickSaveAndContinueButton(); // Remove this repeated Step

		// Eligibility
		ExtentTestManager.getTest().info("---------------------ELIGIBILITY----------------------------");
		Wait.wait15Second();
		//				commonMethodPage.downloadEligibilityReport();
			commonMethodPage.clickLogoutDropDown();
		//				commonMethodPage.clickHome();
	}
}
