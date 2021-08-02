package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    private WebDriver driver;
    private WebDriverWait wait;

    public void open(String url){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get(url);
    }


    public void sendKeysTo(By locator, String textToSend){
        //driver.findElement(locator).sendKeys(textToSend);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(textToSend);
    }


    public void clickTo(By locator){
        //driver.findElement(locator).click();
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void waitFor(By locator, WaitType type){
        switch (type){
            case visible:
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                break;
            case clickable:
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                break;
            case invisible:
                wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
                break;
            case exist:
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                break;
        }

    }
}
