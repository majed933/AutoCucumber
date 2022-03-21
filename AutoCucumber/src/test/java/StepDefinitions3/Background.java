package StepDefinitions3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Background {

	WebDriver driver = null;

	@Given("^User is on login page$")
	public void User_is_on_login_pag() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - Browser is open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Majed Eddine BEJAOUI\\Desktop\\Nouveau dossier\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String Username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys(Username);
	}

	@And("^User enters user surname$")
	public void user_enters_user_surname() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Majed");
	}
	@Then("^User checkss user first name is present$")
	public void User_checkss_user_first_name_is_present() {
	    // Write code here that turns the phrase above into concrete actions
	    String fistname = driver.findElement(By.xpath("//*[@name=\"firstname\"]")).getAttribute("value");
	    Assert.assertEquals("Majed", fistname);
	}
	@And("User checks user surname is present")
	public void user_check_user_surname_is_present() {
	    // Write code here that turns the phrase above into concrete actions
	    String lastname = driver.findElement(By.xpath("//*[@name=\"lastname\"]")).getAttribute("value");
	    Assert.assertEquals("Majed", lastname);
	}

	@But("User Mobile field should be blank")
	public void user_Mobile_field_should_be_blank() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - blank");
	}
}
