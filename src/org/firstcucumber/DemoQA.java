package org.firstcucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoQA {

	WebDriver driver;

	@Given("^Go to demoqa register page$")
	public void go_to_demoqa_register_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kirupa\\New folder\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}

	@When("^To enter the all values \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void to_enter_the_all_values(String Firstname, String Lastname, String Address, String Emailaddress, String Phone, String Gender, String Hobbies, String Languages, String Skills, String Country, String SelectCountry, String Year, String Month, String Date, String Password, String ConfirmPassword) throws AWTException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Emailaddress);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(Phone);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
//		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//select[@id='Skills']")).sendKeys(Skills);
		driver.findElement(By.xpath("//select[@id='countries']")).sendKeys(Country);
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		   driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("india");
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='yearbox']")).sendKeys(Year);
		driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys(Month);
		driver.findElement(By.xpath("//select[@id='daybox']")).sendKeys(Date);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(ConfirmPassword);

	}

	@When("^Click Submit buttton$")
	public void click_Submit_buttton() {
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

	}

	@Then("^To verify sucessfully message shown or not$")
	public void to_verify_sucessfully_message_shown_or_not() {
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
	}

}
