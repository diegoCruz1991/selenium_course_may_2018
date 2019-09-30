package com.qalabs.javabasics.facebook.components.login.login;

import com.qalabs.javabasics.facebook.components.login.FacebookComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class LoginHeaderComponent extends FacebookComponent{

    @FindBy(how = How.CLASS_NAME, using = "fb_logo img sp_ydUEsVjCbun sx_7e0f83")
    private WebElement fbIconElement;
    @FindBy(how = How.ID, using = "email")
    private WebElement fbUserInputElement;
    @FindBy(how = How.ID, using = "pass")
    private WebElement fbPassInputElement;
    @FindBy(how = How.ID, using = "u_0_4")
    private WebElement fbForgotPassLinkElement;
    @FindBy(how = How.XPATH, using = "//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
    private WebElement fbLoginButtonElement;

    public LoginHeaderComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public com.qalabs.javabasics.facebook.pages.FacebookLoginPage clickOnFacebookIcon() {
        fbIconElement.click();
        return new com.qalabs.javabasics.facebook.pages.FacebookLoginPage(this.driver);
    }

    public com.qalabs.javabasics.facebook.pages.FacebookLoginPage logInFacebook(String userName, String password) {
        fbUserInputElement.sendKeys(userName);
        fbPassInputElement.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fbLoginButtonElement.click();
        return new com.qalabs.javabasics.facebook.pages.FacebookLoginPage(driver);
    }

    public com.qalabs.javabasics.facebook.pages.FacebookLoginPage clickOnFacebookForgotPass() {
        fbIconElement.click();
        return new com.qalabs.javabasics.facebook.pages.FacebookLoginPage(this.driver);
    }

}
