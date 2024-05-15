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

    @FindBy(id = "email-address")
    WebElement Email;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(id= "join-form-submit")
    WebElement Submit;

    @FindBy(linkText = "Sign in")
    WebElement SingIn;

    @FindBy(id = "first-name")
    WebElement FirstName;

    @FindBy(id = "last-name")
    WebElement LastName;

    @FindBy(partialLinkText = "Next")
    WebElement Next;

    @FindBy(xpath = "//*[@id=\"ember16\"]")
    WebElement Student;

    @FindBy(xpath = "//*[@id=\"onboarding-profile-edu-start-year\"]")
    WebElement StartYearDrop;

    @FindBy(xpath = "//*[@id=\"onboarding-profile-edu-end-year\"]")
    WebElement EndYearDrop;

    @FindBy(linkText = "Continue")
    WebElement ContinueBtn;

    public void sendKeysToEmail (String email){
        Email.sendKeys(email);
    }

    public void sendKeysToPassword (String password){
        Password.sendKeys(password);
    }

    public void clickSubmit (){
        Submit.click();
    }

    public void clickSignIn (){
        SingIn.click();
    }

    public void senKeysFirstName(String firstName){
        FirstName.sendKeys(firstName);
    }

    public void sendKeysLastName(String lastName){
        LastName.sendKeys(lastName);
    }

    public void clickNext(){
        Next.click();
    }

    public void clickStudent(){
        Student.click();
    }

    public void selectStartYear (int index){
        Select select = new Select(StartYearDrop);
        select.selectByIndex(index);
    }

    public void selectEndYear (int index){
        Select select = new Select(EndYearDrop);
        select.selectByIndex(index);
    }

    public void continueBtn (){
        ContinueBtn.click();
    }
}
