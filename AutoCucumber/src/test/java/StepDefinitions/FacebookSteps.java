package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSteps {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - Browser is open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Majed Eddine BEJAOUI\\Desktop\\Nouveau dossier\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
	}

	/*@And("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Test Done");

	}*/

	@When("User enters first name")
	public void user_enters_first_name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Majed");
	}

	@Then("User checks user first name is present")
	public void user_checks_user_first_name_is_present() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Test Done");
	}
	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	    driver = null;
	    
	}


	

}
