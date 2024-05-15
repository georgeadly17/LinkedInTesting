package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    // Start a post
    @FindBy(id = "ember1346")
    WebElement startAPost;

    // Like Button
    @FindBy(id = "ember1368")
    WebElement like;

    // Comment Button
    @FindBy(id = "feed-shared-social-action-bar-comment-ember1367")
    WebElement comment;

    // My Network
    @FindBy(tagName = "a")
    WebElement myNetwork;

    // Start a post
    public void setStartAPost() {
        startAPost.click();
    }

    // Like Button
    public void setLike() {
        like.click();
    }

    // Comment Button
    public void setComment() {
        comment.click();
    }

    // Comment Button
    public void setMyNetwork() {
        myNetwork.click();
    }

}

