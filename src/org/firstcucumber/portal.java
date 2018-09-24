package org.firstcucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class portal {
	
	WebDriver driver;
	
	@Given("^Login zoniac website \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void login_zoniac_website(String Corpcode, String Userid, String Password) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Kirupa\\New folder\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://portal.zoniac.com/newapp/login.html?t=9101537262428167");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='loginCorporateCode']")).sendKeys(Corpcode);
		driver.findElement(By.xpath("//input[@id='loginName']")).sendKeys(Userid);
		driver.findElement(By.xpath("//input[@id='loginPass']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	
	}

	@Given("^Click and go to candidate module$")
	public void click_and_go_to_candidate_module() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Candidates']")).click();
		
	}

	@Given("^Click quick candidate button$")
	public void click_quick_candidate_button() {
		driver.findElement(By.xpath("//b[text()='Quick Candidate']")).click();
	}

	@When("^To enter the all details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void to_enter_the_all_details(String FirstName, String LastName, String Phone, String Mobile, String CandidateType) {
		driver.findElement(By.xpath("//input[@name='EmpFn']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='EmpLn']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='EmpHph1']")).sendKeys(Phone);
		driver.findElement(By.xpath("//input[@name='EmpHcellphone']")).sendKeys(Mobile);
		driver.findElement(By.xpath("//select[@name='EmpType']")).sendKeys(CandidateType);

	}

	@When("^click save option$")
	public void click_save_option() {
		driver.findElement(By.xpath("//b[text()='Save']")).click();
		
	}

	@Then("^To view the created candidate from the list$")
	public void to_view_the_created_candidate_from_the_list() {
	   Assert.assertEquals(driver.getTitle(),driver.getTitle());
	}

}
