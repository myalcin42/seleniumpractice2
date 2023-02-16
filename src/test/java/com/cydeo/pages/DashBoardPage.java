package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardPage {

    public DashBoardPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "h6#time")
    public WebElement topDisplayedText;

    @FindBy(xpath = "(//table/tbody/tr/td//span[. = 'Pending']/../..)/td[5]")
    public List<WebElement> tablePendingAmounts;

}
