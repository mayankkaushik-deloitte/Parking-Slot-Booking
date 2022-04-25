package Pages;
//import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Provider_BusinessTracker extends Baseclass {
    public void ClickProfileButton() {
        WebElement profile = driver.findElement(By.xpath("//*[@id='mobile']/li[5]/div/span/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profile).build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void ClickDashBoardButton() {
        WebElement dashboardBtn = driver.findElement(By.xpath("//*[@id='sm-font']"));
        dashboardBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void ClickBusinessTracker() {
        WebElement businessTrackerBtn = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div[2]/a[4]/p/span"));
        businessTrackerBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void HoverToGraph() {
        WebElement graphHovering = driver.findElement(By.xpath("//div[@class='recharts-wrapper']/child::div[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(graphHovering).build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
