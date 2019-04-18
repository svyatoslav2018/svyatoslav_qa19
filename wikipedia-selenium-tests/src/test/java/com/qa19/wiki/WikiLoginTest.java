package com.qa19.wiki;

        import org.openqa.selenium.By;
        import org.testng.annotations.Test;

public class WikiLoginTest extends TestBase {


    @Test
    public void testLogin(By wpPassword1){
        selectLanguage();
        initLogin();
        fillLoginForm(By.name("wpName"));
        fillPasswordForm(By.name("wpPassword1"));
        clickOnButtonLogin(By.cssSelector("button[value='Log in']"));
    }
}