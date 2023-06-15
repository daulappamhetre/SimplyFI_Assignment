package SimpplyFI.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Simba_page 
{
	@FindBy(xpath ="//a[text()='SIMBA']" )
	private WebElement simba;
	
	@FindBy(xpath="//p[@id='banner-text']")
	private WebElement printtext;
	
	
	
	
	public Simba_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//get he value and  iit will return the value
	
	public WebElement getSimbaPage()
	{
		return simba;
		
	}
	//Click on Simba page and by passing string value
	
	public void ClickSimba_page(String Simbapage)
	{
		simba.sendKeys(Simbapage);
	}

	
	
	//intilize the text
	
	public WebElement getPrintText()
	{
		return printtext;
	}
	public void ClickPrintText(String printtextwebpage)
	{
		printtext.sendKeys(printtextwebpage);
	}
}


