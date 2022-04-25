package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class ConsumerDashboard extends Baseclass{
    public void Hoverprofile() throws Exception{
        Thread.sleep(5000);
        WebElement profile = By.xpath("//*[@id='mobile']/li[4]/div/span/img").findElement(driver);
        profile.click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(profile).build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void ClickDashBoardButton() {
        WebElement dashboardBtn = driver.findElement(By.xpath("//a[contains(text(), 'My Dashboard')]"));
        dashboardBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void bookinghistory()
    {
        WebElement bookinghistory = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div[2]/a[2]/p/span"));
        bookinghistory.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void givereview() throws InterruptedException {
        Thread.sleep(5000);
        WebElement givereview = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div/div/ul/li[7]/button[1]"));
        givereview.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement givereview1 = driver.findElement(By.xpath("//*[@id='rw5']/div/div/div[2]/form/center/span/label[4]"));
        givereview1.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement submit = driver.findElement(By.xpath("//*[@id='rw5']/div/div/div[2]/form/button[2]"));
        submit.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement more = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div/div/ul/li[5]/button"));
        more.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void bookingtracker()
    {
        WebElement tracker = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div[2]/a[4]/p/span"));
        tracker.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void myprofile()
    {
        WebElement profile = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div[2]/a[5]/p/span"));
        profile.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement edit = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div/div/div/div/div/div/form/div[4]/button[1]"));
        edit.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement firstname=driver.findElement(By.name("first_name"));
        firstname.sendKeys("Jatin");
        WebElement lastname=driver.findElement(By.name("last_name"));
        lastname.sendKeys("Agarwal");
        WebElement phonenumber=driver.findElement(By.name("phone_number"));
        lastname.sendKeys("9999955555");
        WebElement save = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div/div/div/div/div/div/form/div[4]/button[2]"));
        save.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public ConsumerDashboard() throws IOException {
        PageFactory.initElements(driver,this);
    }
}
