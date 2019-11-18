package utility;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exceldata {
	protected static Map<String, String> data = null;
	protected static int dataIndex = 0;
	
	 public static void getTestData(String testName) throws BiffException, IOException, InterruptedException {
		    data = new HashMap<String, String>();
		    Sheet dataSheet = Workbook.getWorkbook(new File(("./TestData.xls"))).getSheet("testsheet");
		    dataIndex = dataSheet.findCell(testName).getRow();
		    for (int i = 1; i < dataSheet.getColumns(); i++) {
		    for (int j = dataIndex - 1; j < dataSheet.getRows(); j++) {
		    String key = dataSheet.getCell(i, j).getContents();
		    String value = dataSheet.getCell(i, dataIndex).getContents();
		    data.put(key, value);
		   // System.out.println(data.get("EmailID"));

		      }
		    }
		  }
	
}
