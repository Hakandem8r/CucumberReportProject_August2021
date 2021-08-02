package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.Locators1;
import utils.BaseClass;
import utils.Driver;
import utils.WaitType;
//import static pages.Locators.*;
//import static pages.Locators1.*;


public class Stepdefs extends BaseClass implements Locators1 {


    @Given("user on homepage")
    public void userOnHomepage() {
        open(url);
    }

    @When("user login username as {string} and password as {string}")
    public void userLoginUsernameAsAndPasswordAs(String username, String password) {
        sendKeysTo(usernameTextBox, username);
        sendKeysTo(passwordTextBox, password);
        clickTo(loginButton);
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        waitFor(welcomeLink, WaitType.visible);
    }
}
