import org.testng.annotations.Test;


public class SampleTest {

	@Test  //'Test' is an inbuilt class in TestNG. '@Test'  is an annotation function/method that represents that 'testApp' is our TC
	public void testApp(){
		System.out.println("Testing App");	
	}
	
	@Test //2nd TC
	public void testLogin(){
		System.out.println("Login Test");
	}
	
	//So with the help of @Test annotation u can make ur function representing TC.
	// right click on Module 9 folder in project explorer and select option "Refresh" after that a folder named as "test-output" get generated automatically in project explorer
	//inside this folder we hv a file index.html .These are ur HTML test reports generated automaticaaly.This feature is not present in JUnit.Thsese reports are called XSLT reports
	
}
