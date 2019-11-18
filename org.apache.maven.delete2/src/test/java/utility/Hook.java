package utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.it.Data;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Hook {
	protected static Map<String, String> data = null;
	  protected static int dataIndex = 0;

	private static WebDriver driver;
	
	@Before("@web")
	public void setUp()
	{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		String driverPath = "C:\\Users\\n.fathima\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	     chromeOptions.setBinary("C:\\Users\\n.fathima\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	     driver= new ChromeDriver(chromeOptions);
	     System.out.println("Before web execution");
	     System.out.println();
	    
	     //driver.findElement(By.name("q")).sendKeys(data.get("sdss"));
		
	}

	/*@Before
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
	  }*/
	
	/*@Before("@appium")
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 9");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"//App//ApiDemos.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}*/
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
