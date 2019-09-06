package maaaa.cccc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jk4 {
	WebDriver driver;
	@Given("the login page displayed")
	public void the_login_page_displayed() {
		System.setProperty("webdriver.chrome.driver","C:\\rupaa\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.findElement(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")).click();
	}

	@Given("give username as {string}")
	public void give_username_as(String a) {
		driver.findElement(By.cssSelector("#userName")).click();
		driver.findElement(By.cssSelector("#userName")).sendKeys(a);
	}

	@Given("give password as {string}")
	public void give_password_as(String b) {
		driver.findElement(By.cssSelector("#password")).sendKeys(b);
	}

	@Given("click  the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("next page  displayed")
	public void next_page_displayed() {
	    
	}

	@Then("click the search bar")
	public void click_the_search_bar() {
		driver.findElement(By.cssSelector("#myInput")).click();
	}

	@Then("enter the {string} in it")
	public void enter_the_in_it(String c) throws InterruptedException {
		driver.findElement(By.cssSelector("#myInput")).sendKeys(c);
		Thread.sleep(5000);
	}

}
