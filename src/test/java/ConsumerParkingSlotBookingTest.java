import Pages.Baseclass;
import Pages.ConsumerParkingSlotBooking;
import Pages.ProviderSignIn;
import Pages.ProviderSignUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ConsumerParkingSlotBookingTest extends Baseclass {

    public ConsumerParkingSlotBookingTest() throws IOException {
        super();
    }

    @BeforeSuite
    public void setUp() throws IOException {
        Baseclass.init();

        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void withoutEnteringDetails() throws IOException {
        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking ConsumerBookingObj = new ConsumerParkingSlotBooking();
        ConsumerBookingObj.selectLocation();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        ConsumerBookingObj.js1Click(driver);
        try {
            if (driver.findElement(By.xpath("(//button[@class='btn btn-primary']")).isEnabled()) {
                System.out.println("Show more is  there");
            }
        } catch (Exception e) {
            System.out.println("Show more is not there");
        }


    }
    @Test(priority = 2)
    public void consumerSignin()
    {

    }
    @Test(priority = 3)
    public void enterValidDetails() throws IOException {
        driver.navigate().refresh();

 ConsumerParkingSlotBooking consumerParkingSlotBookingobj= new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_entryTime();
        consumerParkingSlotBookingobj.enter_exitDate();
        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        try {
            if (driver.findElement(By.xpath("(//button[@class='btn btn-primary']")).isEnabled()) {
                System.out.println("Show more is  there");
            }
        } catch (Exception e) {
            System.out.println("Show more is not there");
        }

    }
    @AfterSuite
    public void close_browser()
    {
        driver.quit();
    }


}

