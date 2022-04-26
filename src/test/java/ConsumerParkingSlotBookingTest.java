import Pages.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
@Listeners(ExtentReport.class)
public class ConsumerParkingSlotBookingTest extends Baseclass {

    public ConsumerParkingSlotBookingTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();

        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void withoutEnteringDetails() throws IOException {


        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking ConsumerBookingObj = new ConsumerParkingSlotBooking();
        //ConsumerBookingObj.selectLocation();
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
            public void without_entering_entryDate() throws IOException {
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryTime();
        consumerParkingSlotBookingobj.enter_exitDate();
        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        consumerParkingSlotBookingobj.js1Click(driver);
        try {
            if (driver.findElement(By.xpath("(//button[@class='btn btn-primary']")).isEnabled()) {
                System.out.println("Show more is  there");
            }
        } catch (Exception e) {
            System.out.println("Show more is not there");
        }
    }
    @Test(priority = 3)
    public void without_entering_entryTime() throws IOException {
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_exitDate();
        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);



        consumerParkingSlotBookingobj.js1Click(driver);
        try {
            if (driver.findElement(By.xpath("(//button[@class='btn btn-primary']")).isEnabled()) {
                System.out.println("Show more is  there");
            }
        } catch (Exception e) {
            System.out.println("Show more is not there");
        }
    }
    @Test(priority = 4)
    public void without_entering_exitDate() throws IOException {
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_entryTime();

        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        consumerParkingSlotBookingobj.js1Click(driver);
        try {
            if (driver.findElement(By.xpath("(//button[@class='btn btn-primary']")).isEnabled()) {
                System.out.println("Show more is  there");
            }
        } catch (Exception e) {
            System.out.println("Show more is not there");
        }
    }
    @Test(priority = 5)
    public void without_entering_exitTime() throws IOException {
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_entryTime();
        consumerParkingSlotBookingobj.enter_exitDate();

        consumerParkingSlotBookingobj.js1Click(driver);
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        consumerParkingSlotBookingobj.js1Click(driver);
        try {
            if (driver.findElement(By.xpath("(//button[@class='btn btn-primary']")).isEnabled()) {
                System.out.println("Show more is  there");
            }
        } catch (Exception e) {
            System.out.println("Show more is not there");
        }
    }
    @Test(priority = 6)
    public void consumerSignin()
    {

    }
    @Test(priority = 7)
    public void enterValidDetails() throws IOException {
        driver.navigate().refresh();

 ConsumerParkingSlotBooking consumerParkingSlotBookingobj= new ConsumerParkingSlotBooking();
   driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
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
    @AfterTest
    public void close_browser()
    {
        driver.quit();
    }


}

