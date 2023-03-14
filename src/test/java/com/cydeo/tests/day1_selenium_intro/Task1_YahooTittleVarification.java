package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTittleVarification {
    public static void main(String[] args) {
//1-Yqhoo tittle verificition

        //do set up browser driver

        WebDriverManager.chromedriver().setup();

         //open chrome browser
        WebDriver driver=new ChromeDriver();


        // make our page full screen

        driver.manage().window().maximize();

        //go to do http://www.yahoo.com
        driver.get("http://www.yahoo.com");


        // verify title:
        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports &amp; Videos
    String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports &amp; Videos";

    //actual tiitle comes from the browser
    String actualTittle=driver.getTitle();

    if(actualTittle.equals(expectedTitle)){
        System.out.println("Title is as expected.Varifacition is passed");
    }else{
        System.out.println("Title is not expected.Varifacition is failed");
    }

    }
}