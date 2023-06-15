package SimplyFI.Genericutilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebdriverUtility 
{
	public void MaximizeThebrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
		
	}
	public void implicityWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Iconstants.implicity));
		

}
	public void action (WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void SwitchToWindow(WebDriver driver)
	{
		Set<String> handles = driver.getWindowHandles();
		

	
	
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	