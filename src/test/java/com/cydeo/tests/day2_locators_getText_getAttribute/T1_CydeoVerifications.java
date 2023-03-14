package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) throws InterruptedException {
        // Tc #1:Cydeo practice
        // 1 open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
        // go to do http://practice.cydeo.com

        driver.navigate().to("http://practice.cydeo.com");

        // verify URL contains
        // expected cydeo
        String expectedUrl= "driver";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL verifaction passed");
        }else {
            System.out.println("URL verifation failled");
        }
        Thread.sleep(3000);

        //Verify title:
        //Expected:Practice

        String expectedTitle="Practice";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("title varification passed");
        }else {
            System.out.println("Title varification failled");
        }
        driver.close();
    }
}
