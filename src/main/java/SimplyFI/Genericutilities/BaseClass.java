package SimplyFI.Genericutilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static WebDriver driver1;
	public  WebDriver driver;
	public FileUtility flib=new FileUtility();
	public WebdriverUtility wlib=new WebdriverUtility();


	
	@BeforeClass
	public void lauchBrpwser() throws IOException
	{
	  String Browser =	flib.FetchDataPropperty("browser");
	  if(Browser.equalsIgnoreCase("chrome"))
		 
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	  }
		 
	}
	@BeforeMethod
	public void LoginToApp() throws IOException
	{
		String url = flib.FetchDataPropperty("URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Iconstants.implicity));
		
	}


}