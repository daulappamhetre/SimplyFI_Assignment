package SimpplyFI.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company 
{
	@FindBy(xpath="//a[text()='Company ']")
	private WebElement company;
	
	@FindBy(xpath = "//a[text()='Our Story']")
	private WebElement ourstory;
	

		

	
	
	public Company(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

}
	public WebElement getCompanY()
	{
		return company;
		
	}
	public void ClickCompany(String companypage)
	{
		company.sendKeys(companypage);
	}
	
	//for OueStory
	
	public WebElement getOurstory()
	  {
		  return ourstory;
		  
	  }
	  public void CliCkOnOurStory(String ourStory)
	  {
		  ourstory.sendKeys(ourStory);
	  }

	
	
			
	
}