package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomOfferpage {
	public WebDriver driver;
	public PomOfferpage(WebDriver driver)
	{
		this.driver = driver;
	}

	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem (String shortName )
	{
		driver.findElement(search ).sendKeys(shortName );
	}
	public void getSearchText()
	{
		driver.findElement(search ).getText();
	}
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	 
}
