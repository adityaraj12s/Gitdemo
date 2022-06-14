package pageObjects;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {
public PomLandingpage pomlandingpage;
public PomOfferpage pomofferpage;
public WebDriver driver;
public Pageobjectmanager(WebDriver driver)
{	
	this.driver=driver;
}
	public PomLandingpage getPomLandingpage()
	{
		pomlandingpage=new PomLandingpage(driver);
		return pomlandingpage;
	}
	public PomOfferpage getPomOfferpage()
	{
		pomofferpage=new PomOfferpage(driver);
		return  pomofferpage;
	}
	
	
	
	
}

