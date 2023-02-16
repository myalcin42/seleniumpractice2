package com.cydeo.tests;

import com.cydeo.pages.DashBoardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingLoginTest {

    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Test()
    public void test1(){

        Driver.getDriver().get("https://demo.applitools.com/index.html");

        loginPage.username.sendKeys("sdfgsfgfgd");
        loginPage.password.sendKeys("2354235245");

        loginPage.loginButton.click();

    }

    @Test()
    public void test2(){

        Assert.assertTrue(dashBoardPage.topDisplayedText.getText().contains("Your nearest branch"));

        for (WebElement tablePendingAmount : dashBoardPage.tablePendingAmounts) {
            System.out.println(tablePendingAmount.getText());
        }
    }
}
