package com.qainfotech.com.GETALLTHEIMAGE;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickLink {
	static List<WebElement> listofURL;
	WebDriver driver;
	String VALIDURL[];
	int i=0;
	public ClickLink() {
	String dir = System.getProperty("user.dir");
	System.out.println(System.getProperty("user.dir"));
	String chromedriver= "chromedriver";  		
	System.setProperty("webdriver.chrome.driver", dir+"///"+chromedriver);
	}
	public List openURL(String URL) {
	driver.get(URL);
	Images image = new Images();
	image.DownloadImages(URL);
	FindAllLinks links = new FindAllLinks();
	listofURL=links.GetLinks(URL);
	return listofURL;
	}
	
}
