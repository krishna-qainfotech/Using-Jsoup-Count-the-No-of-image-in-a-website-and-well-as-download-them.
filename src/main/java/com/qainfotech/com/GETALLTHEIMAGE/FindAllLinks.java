package com.qainfotech.com.GETALLTHEIMAGE;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {
	WebDriver driver;
	public FindAllLinks() {
	String dir = System.getProperty("user.dir");
	System.out.println(System.getProperty("user.dir"));
	String chromedriver= "chromedriver";  		
	System.setProperty("webdriver.chrome.driver", dir+"///"+chromedriver);
	}
	public String URL() {

		driver = new ChromeDriver();
        driver.get("https://unity3d.com/");
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i = 1; i<=links.size(); i=i+1)
        {
    	System.out.println(links.get(i).getText());
		}
    	return links.get(1).getText();
	}
	public List GetLinks() {
		driver = new ChromeDriver();
		driver.get("https://unity3d.com/");
        
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("All links found on web page are: " + allLinks.size() + " links");
		for (WebElement link : allLinks) {
		//print the links i.e. http://example.com or https://www.example.com
		System.out.println(link.getAttribute("href"));
		 
		//print the links text
	//	System.out.println(link.getText());
	//	System.out.println("&&&&&&&"+link+"##########");
		}
	return allLinks;
	}
	public List GetLinks(String krishna) {
		driver = new ChromeDriver();
		driver.get(krishna);
        
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("All links found on web page are: " + allLinks.size() + " links");
		for (WebElement link : allLinks) {
		//print the links i.e. http://example.com or https://www.example.com
		System.out.println(link.getAttribute("href"));
		
	}
		return allLinks;}
}
