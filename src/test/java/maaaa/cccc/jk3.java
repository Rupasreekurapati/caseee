package maaaa.cccc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jk3 {

WebDriver driver;
	@Given("home page gets displayed")
	public void home_page_gets_displayed() {
		System.setProperty("webdriver.chrome.driver","C:\\rupaa\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@Given("Alex searches the product like {string}")
	public void alex_searches_the_product_like(String e) {
		driver.findElement(By.id("myInput")).click();
		driver.findElement(By.id("myInput")).sendKeys(e);
		driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	}

	@Given("payment page without adding to cart")
	public void payment_page_without_adding_to_cart() {
		driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
	}

	@Then("login page gets displayed")
	public void login_page_gets_displayed() {
	    System.out.println("login page displayed");
	}

}