package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.w3c.dom.css.DocumentCSS;

public class Genericutils {
	//public WebDriver driver;
	Textcontextsetup tcs;
	public Genericutils( Textcontextsetup tcs)
	{
		this.tcs=tcs;
	}
public void switchWindowToChild()
{
	Set<String> s1 = tcs.getWindowHandles();
	Iterator<String> i1 = s1.iterator();
	String parentwindow = i1.next();
	String childwindow = i1.next();
	driver.switchTo().window(childwindow);
}
}
