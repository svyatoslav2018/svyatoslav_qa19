package com.qa19.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


class Second {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();

        wd.get("https://trello.com/");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //click login button
        wd.findElement(By.linkText("/login")).click();
        //type name
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("black_sun_2004@bk.ru");



//type password
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Mystic2909");

        wd.findElement(By.id("login")).click();

    }

    @Test
    public void openGoogleTest() {
        //wd.get("https://www.google.com");

        //clickOnPlusButtonOnHeader
        wd.findElement(By.cssSelector("[aria-label='Create board or organization']")).click();
        wd.findElement(By.className());
        //typeBoardName
        wd.findElement(By.cssSelector());
        wd.findElement(By.cssSelector());
        wd.findElement(By.cssSelector());
        //submitBoardCreation
        wd.findElement(By.cssSelector());

    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }
}
