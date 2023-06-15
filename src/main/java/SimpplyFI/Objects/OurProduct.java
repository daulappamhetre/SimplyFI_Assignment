package SimpplyFI.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurProduct 
{
	@FindBy(xpath = "//a[text()='Our Products ']")
	private WebElement ourproduct;
		
	
	//initilize the Our prouct be using POM
	
	public OurProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	public WebElement getOurproduct()
	{
		return ourproduct;
	}
	public void ClickOurProduct(String our_products)
	{
		ourproduct.sendKeys(our_products);
		
	}
	
	
		
	}
	
			


