package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObjects.Pageobjectmanager;
import pageObjects.PomLandingpage;
import pageObjects.PomOfferpage;
import utils.Textcontextsetup;

public class offerPage {
	Pageobjectmanager pageobjectmanager;
	public String landingPageProductName;
	public String offerPageProductName;
	Textcontextsetup tcs;

	public offerPage(Textcontextsetup tcs) {
		this.tcs = tcs;
	}

	@Then("User searched for {string} Shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
		switchToOffersPage();
		PomOfferpage pomOfferpage = tcs.pageobjectmanager.getPomOfferpage();
		pomOfferpage.searchItem(shortName);
		Thread.sleep(2000);
	}

	public void switchToOffersPage() {
		PomLandingpage landingpage = tcs.pageobjectmanager.getPomLandingpage();

		landingpage.selectTopDeals();
		tcs.genricutils.switchWindowToChild();
	}

	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(landingPageProductName, offerPageProductName);
	}
}
