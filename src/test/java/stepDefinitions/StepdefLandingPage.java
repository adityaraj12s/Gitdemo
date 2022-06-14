package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.PomLandingpage;
import utils.Textcontextsetup;

public class StepdefLandingPage {
	public String landingPageProductName;
	Textcontextsetup tcs;

	public StepdefLandingPage(Textcontextsetup tcs)
	{
		this.tcs = tcs;
	}

	@Given("User is on Green cart Landing page")
	public void user_is_on_green_cart_landing_page() {

	}

	@When("User searched with Shortname {string} and extract actual name of product")
	public void user_searched_with_shortname_and_extract_actual_name_of_product(String shortName)
			throws InterruptedException {
		
		PomLandingpage landingpage = tcs.pageobjectmanager.getPomLandingpage();
		landingpage.searchItem(shortName);

		Thread.sleep(2000);
		
		landingPageProductName = landingpage.getProductName().split("-")[0].trim();
		System.out.println(landingPageProductName + " " + "is extracted from Home page");
	}
}
