package maaaa.cccc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppTest {
	WebDriver driver;
	@Given("testmeapp link")
	public void testmeapp_link() {
		System.setProperty("webdriver.chrome.driver","C:\\rupaa\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	    
	}

	@When("click the sign in")
	public void click_the_sign_in() {
		driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@When("enter the user as {string}")
	public void enter_the_user_as(String a) {
		//driver.findElement(By.cssSelector("#userName")).click();
		driver.findElement(By.id("userName")).sendKeys(a);
	    
	}

	@When("enter the first as {string}")
	public void enter_the_first_as(String b) {
		driver.findElement(By.id("firstName")).sendKeys(b);
	   
	}

	@When("enter the last as {string}")
	public void enter_the_last_as(String c) {
		driver.findElement(By.id("lastName")).sendKeys(c);
	}

	@When("enter the pass as {string}")
	public void enter_the_pass_as(String d) {
		driver.findElement(By.cssSelector("#password")).sendKeys(d);
	}

	@When("enter the confirm as {string}")
	public void enter_the_confirm_as(String e) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(e);
	}

	@When("enter the gender as {string}")
	public void enter_the_gender_as(String f) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@When("enter the email as {string}")
	public void enter_the_email_as(String g) {
		driver.findElement(By.id("emailAddress")).sendKeys(g);
	}

	@When("enter the mobile as {string}")
	public void enter_the_mobile_as(String h) {
		driver.findElement(By.id("mobileNumber")).sendKeys(h);
	}

	@When("enter the dob as {string}")
	public void enter_the_dob_as(String i) {
		driver.findElement(By.cssSelector("#dob")).click();
		driver.findElement(By.cssSelector("#dob")).sendKeys(i);
	}

	@When("enter the address as {string}")
	public void enter_the_address_as(String j) {
		driver.findElement(By.cssSelector("#address")).sendKeys(j);
	}

	@When("enter the answer as {string}")
	public void enter_the_answer_as(String k) {
		Select a=new Select(driver.findElement(By.id("securityQuestion")));
		  a.selectByIndex(1);
		  driver.findElement(By.id("answer")).sendKeys(k);
		 
	}

	@When("click the signup")
	public void click_the_signup() {
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("web page is displayed")
	public void web_page_is_displayed() {
	   
	}

}