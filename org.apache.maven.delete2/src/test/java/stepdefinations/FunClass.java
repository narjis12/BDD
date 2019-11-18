package stepdefinations;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import jxl.read.biff.BiffException;
import runner.RunTest;
import utility.Exceldata;

public class FunClass extends RunTest{

	Exceldata excel = new Exceldata();
	
	@Given("^A user$")
	public void a_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("FUn senario");
	}

	@Then("^having fun$")
	public void having_fun() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("not FUn senario");
		 RunTest.getTestData("ValidateWallpostLinks");
			//excel.getTestData(data.get("EmailID"));
			System.out.println(data.get("EmailID"));
			System.out.println(data.get("WallpostLink"));
	}
	@DataProvider
	public Object[][] dp() throws BiffException, IOException, InterruptedException 
	{
		getTestData("ValidateWallpostLinks");
	    return new Object[][]{{data.get("EmailID")}};
	    }
}
