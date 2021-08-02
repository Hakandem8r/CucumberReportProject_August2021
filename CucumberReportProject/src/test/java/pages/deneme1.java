package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Driver;

public class deneme1 {
    WebDriver driver;

    @Test
    public void test01(){



        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        driver.quit();

    }
}
