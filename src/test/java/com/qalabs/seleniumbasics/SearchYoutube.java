package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchYoutube {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get youtube home page
        myDriver.get("https://www.youtube.com");
        // Search in yputube
        WebElement myElement = myDriver.findElement(By.id("search"));
        boolean displayed = myElement.isDisplayed();
        assert displayed == true : "the element is enable";
        myElement.sendKeys("selenium");
        myElement = myDriver.findElement(By.id("search-icon-legacy"));
        myElement.click();
        Thread.sleep(5000);

        myDriver.close();
    }
}
