package org.testtt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
WebDriver driver;
@Given("The user should be in facebook login page")
public void the_user_should_be_in_facebook_login_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\skann\\eclipse-workspace\\CucumberProject1\\bb\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("The user has to fill invalid usernae and password then click the login button")
public void the_user_has_to_fill_invalid_usernae_and_password_then_click_the_login_button() {
 WebElement user = driver.findElement(By.id("email")); 
 user.sendKeys("Anitha");
 WebElement pass = driver.findElement(By.id("pass"));
 pass.sendKeys("123456");

}

@When("The user has to click login button")
public void the_user_has_to_click_login_button() {
	WebElement login = driver.findElement(By.name("login"));
	login.click();
   }

@Then("The user should navigate to the invalid login page")
public void the_user_should_navigate_to_the_invalid_login_page() {
	
	driver.quit();
}

}
