package stepdefinations;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.read.biff.BiffException;
import runner.RunTest;
import utility.Exceldata;
import utility.Hook;

public class GoogleSearch extends Exceldata{
	
	Exceldata excel = new Exceldata();

		
		private WebDriver driver;
		
		//protected static Map<String, String> data;
		
		public GoogleSearch() {
			this.driver = Hook.getDriver();
		}
		
		
		@Test(alwaysRun = true)
		@Given("^I open a browser at location \"([^\"]*)\"$")
		public void i_open_a_browser(String path) throws Throwable {
			System.out.println("Browser is opened successfully");
			Exceldata.getTestData("ValidateWallpostLinks");
			//excel.getTestData(data.get("EmailID"));
			System.out.println(data.get("EmailID"));
			System.out.println(data.get("WallpostLink"));
			
		}

		@When("^I navigate to google page$")
		public void i_navigate_to_google_page() throws Throwable {
			driver.get("https://www.google.com");
			System.out.println();
			//driver.findElement(By.name("q")).sendKeys(data.get("sdss"));
			
		}

		@Then("^I validate the search text field$")
		public void i_validate_the_search_text_field() throws Throwable {
			//Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		}
		
		@Then("^I validate the Gmail Link$")
		public void i_validate_the_Gmail_Link() throws Throwable {
			//Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
		}

		@Then("^I validate the Image Link$")
		public void i_validate_the_Image_Link() throws Throwable {
			//Assert.assertTrue(driver.findElement(By.linkText("Image")).isDisplayed());
		}
		
		@When("^I enter \"([^\"]*)\" in search keyword$")
		public void i_enter_in_search_keyword(String searchText) throws Throwable {
		    //driver.findElement(By.name("q")).clear();
			//driver.findElement(By.name("q")).sendKeys(searchText);
			Thread.sleep(5000);
		}

		@Then("^I validate searched text$")
		public void i_validate_searched_text() throws Throwable {
		   
		}
		
}
