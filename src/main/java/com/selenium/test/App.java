package com.selenium.test;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 
    	  //System.setProperty("webdriver.chrome.driver","/Users/shubham/Documents/softwares/chrome-driver/chromedriver");
    	  
    	  WebDriverManager.chromedriver().setup();
    	  
    	  
    	  ChromeOptions chromeOptions = new ChromeOptions(); 
    	  chromeOptions.addArguments("--headless");
    	  
    	  WebDriver driver = new ChromeDriver(chromeOptions);
    	  
    	  System.out.println("Scripted Executing");
    	  
    	  //1. Open the browser and get to the url
    	  driver.get("http://18.216.150.25:8081/addressbook-2.0/");
    	  
    	  //enable wait of 3 seconds 
    	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	  
    	  //Click on new contact button
    	  driver.findElement(By.className("v-button")).click();
    	  
    	  
    	  //Locate first name and enter details.
    	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
    	  
    	  
    	  
    	  //locate last name and enter details.
    	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
    	  
    	  
    	  //locate phone number and enter detail
    	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
    	  
    	  
    	  //locate email and enter detail
    	  driver.findElement(By.id("gwt-uid-11")).sendKeys("shubham@xyz.com");
    	  
    	  
    	  //locate date of birth and enter details
    	  driver.findElement(By.id("gwt-uid-13")).sendKeys("23/02/2024,");
    	  
    	  
    	  
    	  //Locate save button and click on save
    	  driver.findElement(By.className("v-button-primary")).click();
    	  
    	  Thread.sleep(1000);
    	  
    	//  String text = driver.findElement(By.className("v-Notification")).getText();
    	//  System.out.println(text);
    	  
    	  
    	//  assertEquals("Saved 'Shubham Singh Kushwah'.", text); driver.quit();
    	  
    	  System.out.println("Scripted executed successfully"); Thread.sleep(1000); 
    	 
     
}
}