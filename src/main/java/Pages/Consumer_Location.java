package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Consumer_Location extends Baseclass {
    public void ClickLocation() throws Exception {
        Thread.sleep(5000);
        WebElement locationButton = driver.findElement(By.xpath("//*[@id='mobile']/li[2]/a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",locationButton);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickZoomin() throws Exception {
        WebElement zoomin = driver.findElement(By.xpath("//*[@id='company_location']/div/div/div[2]/div/div/div/div[12]/div/div[2]/div/button[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",zoomin);
        js.executeScript("arguments[0].click()",zoomin);
        js.executeScript("arguments[0].click()",zoomin);
        js.executeScript("arguments[0].click()",zoomin);
        js.executeScript("arguments[0].click()",zoomin);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
    public void ClickZoomOut() throws InterruptedException {
        WebElement zoomOut = driver.findElement(By.xpath("//*[@id='company_location']/div/div/div[2]/div/div/div/div[12]/div/div[2]/div/button[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",zoomOut);
        js.executeScript("arguments[0].click()",zoomOut);
        js.executeScript("arguments[0].click()",zoomOut);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void ClickContactUs() throws InterruptedException{
        WebElement contactUs = driver.findElement(By.xpath("//*[@id='company_location']/div/div/div[1]/button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",contactUs);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
