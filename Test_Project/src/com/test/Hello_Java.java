package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hello_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\selenium\\chromedriver_win32(1)\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		driver.get("https://in.yahoo.com/?p=us");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	   System.out.println(driver.getTitle());*/
		   
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\selenium\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		 
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());*/
		
		

	}

}
