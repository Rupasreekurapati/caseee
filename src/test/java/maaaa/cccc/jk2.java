package maaaa.cccc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jk2 {

	WebDriver driver;
	    
	@Given("login page")
	public void login_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\rupaa\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.findElement(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")).click();
	}

	@Given("enter the username as {string}")
	public void enter_the_username_as(String a) {
		driver.findElement(By.cssSelector("#userName")).click();
		driver.findElement(By.cssSelector("#userName")).sendKeys(a);
	}

	@Given("enter the password as {string}")
	public void enter_the_password_as(String b) {
		driver.findElement(By.cssSelector("#password")).sendKeys(b);
	}

	@Given("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("next page is displayed")
	public void next_page_is_displayed() {
	    
	}
}