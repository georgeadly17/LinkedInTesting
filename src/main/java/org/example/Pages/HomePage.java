package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div[4]/ul[1]/li[6]/button")
    WebElement login;

    @FindBy(partialLinkText = "Create an")
    WebElement createAccount;


    public void LoginIn(){
        login.click();
    }

    public void createAccount(){
        createAccount.click();
    }

}

