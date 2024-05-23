package mainTCs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.Test;

import ede_ph_1.TestCase1_A;
import ede_ph_1.TestCase1_B;
import ede_ph_1.TestCase1_C;
import ede_ph_2.TestCase2_A;
import ede_ph_2.TestCase2_B;
import ede_ph_2.TestCase2_B_2;
import ede_ph_3.TestCase3_A;
import ede_ph_3.TestCase3_C;
import ede_ph_3.TestCase3_D;


public class MainTCsExecution {
  @Test
  public void f() throws Exception {
	  String fileName = System.getProperty("user.dir") + "\\TCsNumber.txt";
      System.out.println("Main TCs Execution");
      //read using BufferedReader, to read line by line
      executeTCsFromNotepadFile(fileName);
  }
  private static void executeTCsFromNotepadFile(String fileName) throws Exception {
      File file = new File(fileName);
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line;
//      System.out.println("Read text file using BufferedReader");
      while((line = br.readLine()) != null){
//          System.out.println(line);
    	  // Phase 1 Test Cases
    	  if(line.trim().equalsIgnoreCase("1a") || line.trim().equalsIgnoreCase("1_A")) {
    		  TestCase1_A t1a = new TestCase1_A();
//    		  TC1_A.tc1_A();
    	  }
    	  /*
    	  if(line.trim().equalsIgnoreCase("1B") || line.trim().equalsIgnoreCase("1_b")) {
    		  TestCase1_B.testCase1_B();
    	  }
    	  if(line.trim().equalsIgnoreCase("1c") || line.trim().equalsIgnoreCase("1_C")) {
    		  TestCase1_C.testCase1_C();
    	  }
    	  // Phase 2 Test Cases
    	  if(line.trim().equalsIgnoreCase("2a") || line.trim().equalsIgnoreCase("2_A")) {
//    		  TestCase1_A t1a = new TestCase1_A();tc1_A
    		  TestCase2_A.testCase2_A();
    	  }
    	  if(line.trim().equalsIgnoreCase("2B") || line.trim().equalsIgnoreCase("2_b")) {
    		  TestCase2_B.testCase2_B();
    	  }
    	  if(line.trim().equalsIgnoreCase("2b2") || line.trim().equalsIgnoreCase("2_b_2")) {
    		  TestCase2_B_2.testCase2_B_2();
    	  }
    	  // Phase 3 Test Cases
    	  if(line.trim().equalsIgnoreCase("3a") || line.trim().equalsIgnoreCase("3_A")) {
//    		  TestCase1_A t1a = new TestCase1_A();
    		  TestCase3_A.testCase3_A();
    	  }
    	  */
    	  if(line.trim().equalsIgnoreCase("3C") || line.trim().equalsIgnoreCase("3_c")) {
    		  TestCase3_C.testCase3_C();
    	  }
    	  if(line.trim().equalsIgnoreCase("3d") || line.trim().equalsIgnoreCase("3_D")) {
    		  TestCase3_D.testCase3_D();
    	  }
    	  
      }
      //close resources
      br.close();
      fr.close();
  }
}
