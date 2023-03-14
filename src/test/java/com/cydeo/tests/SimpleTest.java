package com.cydeo.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SimpleTest {
@Test
    public void tsetAddition(){
    System.out.println("Hello world");

    int num1=2;
    int num2=2;
    int expectedResult=4;

    assertEquals(expectedResult,num1+num2);
}
}
