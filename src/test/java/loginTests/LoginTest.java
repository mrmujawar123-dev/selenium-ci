package loginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{
    @Test
    public void validLogin() {
        LoginPage page = new LoginPage(driver);
        page.open();
        page.login("tomsmith", "SuperSecretPassword!");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement flashMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("flash"))
        );

        Assert.assertTrue(page.getMessage().contains("You logged into a secure area!"));
    }

    @Test
    public void invalidLogin() {
        LoginPage page = new LoginPage(driver);
        page.open();
        page.login("tomsmith", "wrong");
        Assert.assertTrue(page.getMessage().contains("Your password is invalid!"));
    }

    @Test
    public void emptyFields() {
        LoginPage page = new LoginPage(driver);
        page.open();
        page.login("", "");
        Assert.assertTrue(page.getMessage().contains("Your username is invalid!"));
    }

}
