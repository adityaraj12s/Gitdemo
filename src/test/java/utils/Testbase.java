package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("qAurl");
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get(url);
		}
		return driver;
	}
}
