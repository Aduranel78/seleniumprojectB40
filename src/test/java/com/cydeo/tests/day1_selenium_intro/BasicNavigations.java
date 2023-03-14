package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {




        //1-set up the browser driver

        WebDriverManager.chromedriver().setup();


        //2-Create instance of the selenium Webdriver
        // this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3-go  to do "http://tesla.com"
        driver.get("http://www.tesla.com");
        // get the title of page
        String  currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //stop code execution for 3 second
        Thread.sleep(3000);


        //use selenium to navigate back

        driver.navigate().back();

        // stop code execution for 3 second
        Thread.sleep(3000);

        driver.navigate().forward();

        // stop code execution for 3 second
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();
        // stop code execution for 3 second
        Thread.sleep(3000);

        //use navigate ().to()
        driver.navigate().to("http://www.google.com");

        // get the current title after getting the googlle page
          currentTitle=driver.getTitle();

        //get the title of page
        // System.out.println("driver.getTitle() = " +driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

   //get the current URL using selenium

        currentURL=driver.getCurrentUrl();

       // System.out.println("currentURL = " + currentURL);
           driver.quit();

    // this will close currently opened window

        driver.close();
        //this will close all of the windows



    }



}