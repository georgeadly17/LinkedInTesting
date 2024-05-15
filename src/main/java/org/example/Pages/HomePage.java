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

    @FindBy(name = "username")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div/form/button")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[1]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div[2]/a/button")
    WebElement findJobBtn;

    public void LoginIn(){
        login.click();
    }

    public void createAccount(){
        createAccount.click();
    }

    public void sendKeysEmail(String mail){
        email.sendKeys(mail);
    }

    public void sendKeysPassword (String pass){
        password.sendKeys(pass);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public void clickFindJobBtn(){
        findJobBtn.click();
    }
}

