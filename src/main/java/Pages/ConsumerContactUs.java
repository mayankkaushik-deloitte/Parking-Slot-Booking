package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ConsumerContactUs extends Baseclass{
    public void ClickContactUS() throws InterruptedException {
        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id='mobile']/li[3]"));
        contactUsButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(5000);
    }
    public void ClickHomeHyperlink(){
        WebElement home = driver.findElement(By.xpath("//*[@id='footerid']/div[2]/ul/li[1]/a"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", home);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void ClickEditProfile(){
        WebElement editProfile = driver.findElement(By.xpath("//*[@id='footerid2']/ul/li[1]/a"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", editProfile);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
