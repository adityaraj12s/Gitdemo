package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.Pageobjectmanager;
 

 
public class Textcontextsetup {
	public WebDriver driver;
	 	public String landingPageProductName;
	 	public Pageobjectmanager pageobjectmanager;
	 	public Genericutils genricutils;
	 	public Testbase testbase;
	 	public Textcontextsetup() throws IOException
	 	{
	 		testbase = new Testbase();
	 		pageobjectmanager = new Pageobjectmanager(testbase.WebDriverManager());
	 		genricutils = new Genericutils(testbase.WebDriverManager());
	 	}
	 
}
