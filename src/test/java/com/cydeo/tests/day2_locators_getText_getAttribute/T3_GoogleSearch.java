package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
    //    TC#3: Google search

     //   1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


     //   2- Go to: https://google.com

        driver.get(" https://google.com");

        Thread.sleep(3000);
     //   3- Write “apple” in search box
        // PRESS ENTER using Keys.ENTER
       WebElement googleSearchBox= driver.findElement(By.name("q"));
googleSearchBox.sendKeys("apple"+ Keys.ENTER);

     //   5- Verify title:
        String expectedInTitle="apple";
        String actualTitle =driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("title verification passed");
        }else {
            System.out.println("Title verification failed");
        }

        //  Expected: Title should start with “apple” word





    }
}
