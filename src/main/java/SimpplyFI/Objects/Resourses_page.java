package SimpplyFI.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resourses_page
{
	@FindBy(xpath = "//a[text()='Resources ']")
	private WebElement resources;
	
	//for blogs page
	@FindBy(xpath = "(//a[text()='Blogs'])[1]")
	private WebElement blogs;
	
	@FindBy(xpath = "//a[text()='Podcasts']")
	private WebElement podcasts;
	
	
	public Resourses_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getResources()
	{
		return resources;
	}
	public void ClickOnResources(String passresources)
	{
		resources.sendKeys(passresources);
	}
	
	//for blogs page
	
	
	public WebElement getBlogs()
	{
		return blogs;
	}
	public void ClickOnBlogs(String BlogsPage)
	{
		blogs.sendKeys(BlogsPage);
	}

	//for podcasts page
	
	public WebElement getPodcasts()
	{
		return podcasts;
	}
	public void ClickPodcasts(String Podcasts)
	{
		blogs.sendKeys(Podcasts);
	}
	

}
