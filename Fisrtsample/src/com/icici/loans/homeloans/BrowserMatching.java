package com.icici.loans.homeloans;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserMatching  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn_q3nc2b2\\Desktop\\Seleniums Zip\\chromedriver_win32\\chromedriver.exe");		
             /* ChromeDriver v = new ChromeDriver();
              v.get("http://www.google.com");
              
             System.setProperty("webdriver.gecko.driver","C:\\Users\\vishn_q3nc2b2\\Desktop\\Seleniums Zip\\geckodriver-v0.19.1-win64\\geckodriver.exe" );
             FirefoxDriver s = new FirefoxDriver();
             s.get("http://www.bing.com");*/
             
             System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "//Drivers//IEDriverServer.exe" );
             InternetExplorerDriver h = new InternetExplorerDriver();
             h.get("http://www.wikipedia.com");
	}

}
