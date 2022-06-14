package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomLandingpage {
	public WebDriver driver;
	public PomLandingpage(WebDriver driver)
	{
		this.driver = driver;
	}

	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By topDeals=By.linkText("Top Deals");
	public void searchItem (String name)//these are action method
	{
		driver.findElement(search ).sendKeys(name);//name will fall here from stepDefinition Landingpage
	}
	public void getSearchText()
	{
		driver.findElement(search ).getText();
	}
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	public void selectTopDeals()
	{
		driver.findElement(topDeals).click();
	}
}
