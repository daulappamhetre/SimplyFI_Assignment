package SimplyFI_Scripts;

import org.testng.annotations.Test;

import SimplyFI.Genericutilities.BaseClass;
import SimpplyFI.Objects.INVOIZO;
import SimpplyFI.Objects.OurProduct;

public class ThridScript extends  BaseClass
{
	@Test
	
	public void thridscipt()
	{
		
		OurProduct product=new OurProduct(driver);
		product.getOurproduct().click();
		
		//Click on Invoizopage
		
		INVOIZO invoizoclick=new  INVOIZO(driver);
		invoizoclick.getInvoizo().click();
		wlib.SwitchToWindow(driver);
		
		
	}
	//when click on invoizo button and open the Login page and click sign in button it will not sending a mail througth mail(defect)
	
			

}
