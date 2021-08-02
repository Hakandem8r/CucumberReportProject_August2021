package pages;

import org.openqa.selenium.By;

public interface Locators1 {

    // login page locators
    String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    By usernameTextBox = By.cssSelector("input#txtUsername");
    By passwordTextBox = By.cssSelector("input#txtPassword");
    By loginButton = By.cssSelector("input#btnLogin");
    By welcomeLink = By.cssSelector("a#welcome");





}
