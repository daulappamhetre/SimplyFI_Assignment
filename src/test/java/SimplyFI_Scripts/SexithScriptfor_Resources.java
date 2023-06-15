package SimplyFI_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SimplyFI.Genericutilities.BaseClass;
import SimpplyFI.Objects.Resourses_page;

public class SexithScriptfor_Resources extends BaseClass
{
	@Test
	public void sexithscript()
	{
		Resourses_page reso=new Resourses_page(driver);
		reso.getResources().click();
		
		
		//to create object for Blogs
		
		
		WebElement blog = reso.getBlogs();
		blog.click();
		
		
		//for podcasts
		WebElement podcas = reso.getPodcasts();
		podcas.click();
		wlib.SwitchToWindow(driver);
		
		
	}

}
