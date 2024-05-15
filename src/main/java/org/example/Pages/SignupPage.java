package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage  extends  PageBase{
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (name = "firstName")
    WebElement firstName;

    @FindBy(name= "lastName")
    WebElement lastName;

    @FindBy (name = "username")
    WebElement email;

    public void sendKeysFirstName(String name){
        firstName.sendKeys(name);
    }

    public void sendKeysLastName(String name){
        lastName.sendKeys(name);
    }

    public void sendKeysEmail(String mail){
        email.sendKeys(mail);
    }
}
