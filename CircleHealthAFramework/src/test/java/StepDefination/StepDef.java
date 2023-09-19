package StepDefination;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Objects.BookAppointement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;
	public BookAppointement bookApp;
	
	@Given("User Launches Chrome Browser")
	public void user_launchs_chrome_browser() {
		//WebDriverManager.chromedriver().driverVersion("116.0.5845.96").setup();
		//WebDriver driver = new ChromeDriver();
		driver = WebDriverManager.chromedriver().create();
	    bookApp = new BookAppointement(driver);
	}
   
    @Given("User Launches Firefox Browser")
    public void user_launches_firefox_browser() {
   //WebDriverManager.firefoxdriver().driverVersion("117.0.1").setup();
    	//WebDriver driver = new FirefoxDriver();
    	driver = WebDriverManager.firefoxdriver().create();
    	bookApp = new BookAppointement(driver);
    }
	
	@When("User Opens URL")
	public void user_opens_url() {
	   driver.get("https://www.circlehealthgroup.co.uk/");
	}


	@And("User Accepts Cookies")
	public void user_accept_cookies() {
		bookApp.acceptcookies();
	    
	}
	
	@Then("User clicks on Book Appointment")
	public void user_clicks_on_book_appointment() {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		bookApp.bookappointement();
	    
	}

    @Then("User selects Knee replacement Surgery from dropdown")
    public void user_selects_knee_replacement_surgery_from_dropdown() {
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	bookApp.findtreatement();
 
    }
    @Then("User selects location as CB19SB")
    public void user_selects_location_as_cb19sb() {
	bookApp.findlocation();
    }
    @Then("User is able to click on Search button")
    public void user_is_able_to_click_on_search_button() {
	bookApp.clicksearchbtn();
    
    }
    @Then("User selects Date")
    public void user_selects_date() {
	bookApp.selectdate();
	
    }
    @Then("Choose the available Consultant")
    public void choose_the_available_consultant() {
    
	bookApp.chooseconsultant();
    }
    
    @Then("Validate the available time slots")
    public void i_validate_the_available_time_slots() {
    	 List<String> availableTimeSlots = bookApp.getAvailableTimeSlots();
         List<String> expectedTimeSlots = Arrays.asList("18:00", "18:15", "18:30", "18:45", "19:00");

         for (String timeSlot : availableTimeSlots) {
             if (expectedTimeSlots.contains(timeSlot)) {
                 System.out.println("Available time slot: " + timeSlot);
             } else {
                 System.out.println("Unexpected time slot: " + timeSlot);
             }
         }
    }
    
    @Then("Close the browser")
    public void close_the_browser() 
    {
    	if (driver != null) 
    	{
            driver.quit();
    
    	}
    }



}
