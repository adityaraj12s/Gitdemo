package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.Textcontextsetup;

public class Hooks {
	Textcontextsetup tcs;
	
	public Hooks(Textcontextsetup tcs)
	{
		this.tcs = tcs;
	}
  @After
  public void AfterScenario() throws IOException 
  {
	tcs.testbase.WebDriverManager().quit();  
  }
  

}