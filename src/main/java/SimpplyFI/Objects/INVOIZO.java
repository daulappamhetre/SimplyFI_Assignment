package SimpplyFI.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class INVOIZO 
{
	@FindBy(xpath="//a[text()='INVOIZO']")
	private WebElement invoizo;
	
	
	
	
	public INVOIZO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getInvoizo()
	{
		return invoizo;
	}
	
	public void ClickGetInvoizo(String invoiza_page)
	{
		invoizo.sendKeys(invoiza_page);
	}
			
			

}
