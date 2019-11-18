package runner;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@CucumberOptions(features={"src//test//java//features"}
,glue={"stepdefinations","utility"}
,plugin = {"pretty", "html:target/cucumber"}, tags ={"@web"}

)



public class RunTest extends AbstractTestNGCucumberTests{
	protected static Map<String, String> data = null;
	protected static int dataIndex = 0;
    @Test(alwaysRun = true)
	public void test() throws BiffException, IOException, InterruptedException
	{
    	//getTestData("ValidateWallpostLinks");
		System.out.println("before class test");
	}

	  public static void getTestData(String testName) throws BiffException, IOException, InterruptedException {
		    data = new HashMap<String, String>();
		    Sheet dataSheet = Workbook.getWorkbook(new File(("./TestData.xls"))).getSheet("testsheet");
		    dataIndex = dataSheet.findCell(testName).getRow();
		    for (int i = 1; i < dataSheet.getColumns(); i++) {
		    for (int j = dataIndex - 1; j < dataSheet.getRows(); j++) {
		    String key = dataSheet.getCell(i, j).getContents();
		    String value = dataSheet.getCell(i, dataIndex).getContents();
		    data.put(key, value);

		      }
		    }
		  }
	
}
