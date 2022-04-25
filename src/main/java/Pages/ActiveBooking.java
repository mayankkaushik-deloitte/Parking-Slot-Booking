package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

public class ActiveBooking extends Baseclass{
    @FindBy(xpath = "//*[@id='sm-font']")
    static WebElement dashboard;
    @FindBy(xpath = "//*[@id='mobile']/li[5]/div/span/img")
    static WebElement dashBoardImg;
    public ActiveBooking () {
        PageFactory.initElements(driver,this);
    }
    public static void clickOnMyDashBoard() {
        Actions action = new Actions(driver);
        action.moveToElement(dashBoardImg);
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        dashboard.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    }
    public static boolean bookingStatus (WebDriver driver) {
        String newURL = URL + "slotprovider";
        return driver.getCurrentUrl().equals(newURL);
    }
}
