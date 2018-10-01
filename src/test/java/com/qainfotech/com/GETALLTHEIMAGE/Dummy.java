package com.qainfotech.com.GETALLTHEIMAGE;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Dummy {
    static List<WebElement> listofURL;
    static List<WebElement> listofURL1;
    static ClickLink clicklink;
    static Images image;
    static FindAllLinks findallLinks;
	public static void main(String[] args) {
		image = new Images();
		image.downloadImage();
		findallLinks = new FindAllLinks();
		//findallLinks.URL();
		listofURL=findallLinks.GetLinks();
		clicklink = new ClickLink();
		try {
		for (WebElement  link: listofURL) {
			if(link.getAttribute("href").toString().contains("https://")) {
				System.out.println("^^^"+link.getAttribute("href"));
				image.DownloadImages(link.getAttribute("href"));
	          //  for(WebElement link1: findallLinks.GetLinks(link.getAttribute("href"))){
				
			}}
	
	}
		catch(Exception e) {}
		for (WebElement  link: listofURL) {
			if(link.getAttribute("href").toString().contains("https://")) {
		page1(link.getAttribute("href"));	
			}}
}
	public static void page1(String URL) {
		listofURL1=findallLinks.GetLinks(URL);
		for (WebElement  link: listofURL1) {
			try {
				if(link.getAttribute("href").toString().contains("https://")) {
					clicklink.openURL(link.getAttribute("href").toString());
					image.DownloadImages(link.getAttribute("href"));
				}
		}catch(Exception e) {}}}
		
	}
