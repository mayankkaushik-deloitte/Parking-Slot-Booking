package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ActiveBooking extends Baseclass{
    @FindBy(xpath = "//*[@id=\"mobile\"]/li[5]/div")
    public static WebElement profile;
    @FindBy(xpath = "//a[contains(text(), 'My Dashboard')]")
    public  static WebElement dashBoard;
    public ActiveBooking () {
        PageFactory.initElements(driver,this);
    }
    public static void clickOnMyDashBoard() {
        profile.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        dashBoard.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

    }
    public static boolean bookingStatus (WebDriver driver) {
        String newURL = URL + "providerdashboard";
        System.out.println(newURL);
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl().equals(newURL);
    }
}
