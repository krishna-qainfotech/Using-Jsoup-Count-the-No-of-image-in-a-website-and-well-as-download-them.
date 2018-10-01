package com.qainfotech.com.GETALLTHEIMAGE;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Images {
	 //The url of the website. This is just an example
    private static final String webSiteURL = "https://www.pexels.com/";

    //The path of the folder that you want to save the images to
    private static final String folderPath = System.getProperty("user.dir");

    public void downloadImage() {
    	try {
    		System.out.println("Working");
            //Connect to the website and get the html
            Document doc = Jsoup.connect("https://unity3d.com/").get();
            System.out.println("Working");
            //Get all elements with img tag ,
            Elements img = doc.getElementsByTag("img");
            System.out.println("################"+img.size()+"#################");
            for (Element el : img) {
 
                //for each element get the srs url
                String src = el.absUrl("src");
                
                System.out.println("Image Found!");
                System.out.println("src attribute is : "+src);

                getImages(src);

            }

        } catch (IOException ex) {
            System.err.println("There was an error");
          //  Logger.getLogger(DownloadImages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DownloadImages(String krishna) {
    	try {
    		System.out.println("Working");
            Document doc = Jsoup.connect(krishna).get();
            Elements img = doc.getElementsByTag("img");
           System.out.println("################"+img.size()+"#################");
            for (Element el : img) {
 
                String src = el.absUrl("src");
                
                System.out.println("Image Found!");
                System.out.println("src attribute is : "+src);

                getImages(src);

            }

        } catch (IOException ex) {
            System.err.println("There was an error");
          //  Logger.getLogger(DownloadImages.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
	 private static void getImages(String src) throws IOException {

	        String folder = null;

	        //Exctract the name of the image from the src attribute
	        int indexname = src.lastIndexOf("/");

	        if (indexname == src.length()) {
	            src = src.substring(1, indexname);
	        }

	        indexname = src.lastIndexOf("/");
	        String name = src.substring(indexname, src.length());

	        System.out.println(name);

	        //Open a URL Stream
	        URL url = new URL(src);
	        InputStream in = url.openStream();

	        OutputStream out = new BufferedOutputStream(new FileOutputStream( System.getProperty("user.dir")+"///"+ name));

	        for (int b; (b = in.read()) != -1;) {
	            out.write(b);
	        }
	   //     out.close();
	     //   in.close();

	    }
}
