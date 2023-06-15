package SimplyFI_Scripts;

import org.testng.annotations.Test;

import SimplyFI.Genericutilities.BaseClass;
import SimpplyFI.Objects.Industries;

public class ForthScripts extends BaseClass
{
	@Test
	public void forthscript()
	{
		Industries indust=new Industries(driver);
		indust.getIndustries().click();
		
		
		
		
		
	}
			

}
