package SimpplyFI.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Industries 
{
	@FindBy(xpath="//a[text()='Industries ']")
	private WebElement industries;
	
	
	public Industries(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getIndustries()
	{
		return industries;
	}
	public void ClickIndustriespage(String industriespage)
	{
		industries.sendKeys(industriespage);
		
	}

}
