package SimplyFI_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SimplyFI.Genericutilities.BaseClass;
import SimpplyFI.Objects.OurProduct;
import SimpplyFI.Objects.Simba_page;

public class SecondScript extends BaseClass
{
	@Test
	public void secondscript()
	{
		OurProduct product=new OurProduct(driver);
		product.getOurproduct().click();
		
		Simba_page page=new Simba_page(driver);
		
		//intilize the getwindow handles method
		
		page.getSimbaPage().click();
		wlib.SwitchToWindow(driver);
		
		//to print the text
      		WebElement text = page.getPrintText();
        String print = text.getText();	
        System.out.println(print);
		
		
	}

}
