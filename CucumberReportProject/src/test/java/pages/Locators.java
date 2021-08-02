package pages;

import org.openqa.selenium.By;

public class Locators {

    // login page locators
    public static final String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    public static final By usernameTextBox = By.cssSelector("input#txtUsername");
    public static final By passwordTextBox = By.cssSelector("input#txtPassword");
    public static final By loginButton = By.cssSelector("input#btnLogin");
    public static final By welcomeLink = By.cssSelector("a#welcome");





}
