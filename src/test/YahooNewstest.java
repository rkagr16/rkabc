package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewstest {
	
	@BeforeTest
	public void XYZ(){
		System.out.println("Before Executing Yahoo News test");
		//throw new SkipException("Skipping the test because of some reason");
	}

	@Test
	public void testNews(){
		System.out.println("Executing Yahoo News test");
		//selenium code
		//expected value, actual value comparision
		
		//Assert.assertEquals("Good", "Good");  //actual value will be read from application by selenium code
		//if actual value is equal to expected value then only pass the TC otherwise fail the TC
		
		System.out.println("Before Assertion Error");
		try{
		Assert.assertTrue(6<1, "Error occured as condition is not evaluted as true");
		}catch (Throwable t){ 
			System.out.println("Caught the error");
			//Code--report the error onto the reports
		}
		Assert.assertFalse(6<1, "Error occured as condition is not evaluted as false"); 
		System.out.println("After Assertion Error");
	}
}

/*If in a test an assertion get failed , the lines after that assertion failure line will not get executed and controls skip over to next TC
suppose if in this case if assertTrue assertion get failed then after that line no other lines will get executed in that TC(each @test annotation represents a TC)
so control will skip to next @test annotation to resume execution. */

/* Assertion is an error not an exception thats why we hv used here Throwable class not exception class bcoz Throwable class can catch both errors and exceptions but Exception class can not catch error
  So by using try catch block the control will not  skip to next TC(@test annotation function) and will execute the remaining steps in current TC(current @test annotation function)
 The catch block will get execute only if its try block throws an error but this error has been caught in catch block so this error will not be reported in result and TC status will be passed
 But if we need that the error should be reported in the result for example in quikr.com site there are so many links 
  and when i click on each link the new window should open but for one particular link the new window does not get open
   because of any reason then this error should be reported in result and control should be continued with remaining links
    testing.For that purpose we need to use 'listeners'----will learn in next modules*/


