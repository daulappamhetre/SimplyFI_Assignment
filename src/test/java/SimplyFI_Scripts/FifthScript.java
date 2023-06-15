package SimplyFI_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SimplyFI.Genericutilities.BaseClass;
import SimpplyFI.Objects.Company;

public class FifthScript extends BaseClass

{
	@Test
	public void fifthscript()
	{
		Company com=new Company(driver);
		com.getCompanY().click();
		
	   WebElement story = com.getOurstory();
	   story.click();
	}
			

}
