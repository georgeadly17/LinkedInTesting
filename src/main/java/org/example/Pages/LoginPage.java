package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"session_key\"]")
    WebElement EmailOrPhone;

    @FindBy(xpath = "//*[@id=\"session_password\"]")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/a")
    WebElement ForgetPassword;

    @FindBy(linkText = "Join now")
    WebElement SignInButton;

    public void sendKeyToEmail(String keys){
        EmailOrPhone.sendKeys(keys);
    }

    public void sendKeyToPassword(String keys){
        Password.sendKeys(keys);
    }

    public void clickForgetPassword(){
        ForgetPassword.click();
    }

    public void ClickSignButton(){
        SignInButton.click();
    }
}
