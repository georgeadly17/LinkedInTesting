package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindJobPage extends PageBase{
    public FindJobPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"f4794b19-adcc-43ce-bfa0-001d97329791\"]/div[14]/div/div/div[1]/a")
    WebElement applyBtn;

    @FindBy (partialLinkText = "Apply")
    WebElement jobBtn;

    @FindBy (xpath = "//*[@id=\"6fad608a-4a0c-9c9f-f0a2-11880b68a348\"]/div/a[1]")
    WebElement startFormBtn;
    public void clickApplyBtn(){
        applyBtn.click();
    }

    public void clickJobBtn(){
        jobBtn.click();
    }

    public void clickStartFormBtn(){
        startFormBtn.click();
    }
}
