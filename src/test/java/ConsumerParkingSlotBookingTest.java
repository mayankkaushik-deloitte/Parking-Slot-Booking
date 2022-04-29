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

    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();

        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void withoutEnteringDetails() throws IOException, InterruptedException {


        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking ConsumerBookingObj = new ConsumerParkingSlotBooking();




        ConsumerBookingObj.js1Click(driver);
        ConsumerBookingObj.checkAfter_invalidDetails();


    }

    @Test(priority = 2)
    public void without_entering_entryDate() throws IOException, InterruptedException {
        driver.navigate().refresh();

        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryTime();
        consumerParkingSlotBookingobj.enter_exitDate();
        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        consumerParkingSlotBookingobj.js1Click(driver);
        consumerParkingSlotBookingobj.checkAfter_invalidDetails();
    }

    @Test(priority = 3)
    public void without_entering_entryTime() throws IOException, InterruptedException {
        driver.navigate().refresh();

        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_exitDate();
        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);


        consumerParkingSlotBookingobj.js1Click(driver);
        consumerParkingSlotBookingobj.checkAfter_invalidDetails();

    }

    @Test(priority = 4)
    public void without_entering_exitDate() throws IOException, InterruptedException {
        driver.navigate().refresh();

        Actions action = new Actions(driver);
        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.selectLocation();
        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_entryTime();

        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);



        consumerParkingSlotBookingobj.js1Click(driver);
        consumerParkingSlotBookingobj.checkAfter_invalidDetails();

    }

    @Test(priority = 5)
    public void without_entering_exitTime() throws IOException, InterruptedException {
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
        consumerParkingSlotBookingobj.checkAfter_invalidDetails();
    }

    @Test(priority = 7)
    public void enterValidDetails() throws IOException, InterruptedException {

        ConsumerParkingSlotBooking consumerParkingSlotBookingobj = new ConsumerParkingSlotBooking();
        consumerParkingSlotBookingobj.signinForm();
        consumerParkingSlotBookingobj.enter_Email();
        consumerParkingSlotBookingobj.enter_password();
        consumerParkingSlotBookingobj.click_signIn();


        consumerParkingSlotBookingobj.selectLocation();


        consumerParkingSlotBookingobj.enter_entryDate();
        consumerParkingSlotBookingobj.enter_entryTime();
        consumerParkingSlotBookingobj.enter_exitDate();
        consumerParkingSlotBookingobj.enter_exitTime();
        consumerParkingSlotBookingobj.js1Click(driver);
        consumerParkingSlotBookingobj.bookSlot(driver);
        consumerParkingSlotBookingobj.Add_Vehicle(driver);
        consumerParkingSlotBookingobj.addManufacturer();
        consumerParkingSlotBookingobj.click_submit(driver);
        consumerParkingSlotBookingobj.check_reseve();

    }
    @AfterTest
    public void close_browser()
    {
        driver.quit();
    }


}
