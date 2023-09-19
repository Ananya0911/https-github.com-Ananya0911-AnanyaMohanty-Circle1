package Objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointement {

	WebDriver ldriver;
	

	public BookAppointement(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}


	@FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
	WebElement acceptcookies;

	@FindBy(xpath = "//a[@href='/find-an-appointment']")
	WebElement bookappointement;
	
	@FindBy(id = "treatment")
	WebElement findtreatemnet;
	
	@FindBy(xpath = "//li[contains(@data-value, 'Knee replacement surgery')]/a")
	WebElement findknee;

	@FindBy(id = "location")
	WebElement findlocation;
	
	@FindBy(xpath = "//*[text()='Lucerne Close, Cambridge, UK']")
	WebElement findaddress;
	

	@FindBy(xpath = "//*[text()='Search']")
	WebElement searchbtn;
	
	@FindBy(xpath = "//div[@class='vc-day id-2023-10-05 day-5 day-from-end-27 weekday-5 weekday-position-4 weekday-ordinal-1 weekday-ordinal-from-end-4 week-2 week-from-end-5 in-month vc-day-box-center-center']")
	WebElement selectdate;
	
	@FindBy(xpath = "//a[@href='/consultants/majeed-shakokani']")		
	WebElement chooseconsultant;
	
	@FindBy(className = "consultant-result-card__times-content")
	WebElement timeSlotsContainer;

	@FindBy(className = "consultant-result-card__times-button")
	List<WebElement> timeSlots;
	

   public void acceptcookies() 
	{

		acceptcookies.click();
	}

	public void bookappointement() 
	{

		bookappointement.click();

	}
	public void findtreatement()
	{
		findtreatemnet.sendKeys("Knee replacement surgery");
		findknee.click();
		
	}
	public void findlocation()
	{
        findlocation.sendKeys("CB19SB");
        findaddress.click();
		
	}
	public void clicksearchbtn()
	{
		
		searchbtn.click();
		
	}
	public void selectdate()
	{
		
		selectdate.click();
		
	}
	public void chooseconsultant()
	{
		
		chooseconsultant.getText();
		
	}
	public List<String> getAvailableTimeSlots() {
        List<String> availableTimeSlots = new ArrayList<>();
        for (WebElement timeSlot : timeSlots) {
            availableTimeSlots.add(timeSlot.getText());
        }
        return availableTimeSlots;
    }
}
	
	

	
	


