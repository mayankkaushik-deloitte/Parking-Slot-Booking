import Pages.ActiveBooking;
import Pages.Baseclass;
import Pages.ProviderSignIn;
import Pages.ProviderSignInFromHome;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Pages.Baseclass.driver;
import static Pages.ProviderSignInFromHome.clickOnSignIn;

public class ActiveBookingTest {
    public ActiveBookingTest () {
        super();
    }
    @BeforeSuite
    public void setUp () throws IOException {
        Baseclass.init();
        ProviderSignIn providerSignIn = new ProviderSignIn();
        ActiveBooking activeBooking = new ActiveBooking();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

    }
    @Test(priority = 1)
    public void registerClick() {
        ProviderSignIn.clickRegisterHere();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

    }
    @Test(priority = 2)
    public void signInButton() {
        try {
            ProviderSignIn.clickSignInForm();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

    }
    @Test(priority = 3)
    public void signInForm() {
        try{
            ProviderSignIn.addEmail();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }catch (Exception e){
            System.out.println("Problem in adding the email...." + e.getMessage());
        }
        try {
            ProviderSignIn.addPassword();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }catch (Exception e){
            System.out.println("Problem in adding the password... " + e.getMessage());
        }
        try {
            ProviderSignIn.clickSignIn();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    @Test(priority = 4)
    public void clickOnDashboard() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        try{
            ActiveBooking.clickOnMyDashBoard();
        }catch (Exception e){
            System.out.println("Problem with clicking the dashboard.. " + e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

    }
    @Test(priority = 5)
    public void checkActiveBookings() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        try{
            Assert.assertEquals(ActiveBooking.bookingStatus(driver),true);
        }catch (Exception e){
            System.out.println(driver.getCurrentUrl());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    @AfterSuite
    public void kill () {
        Baseclass.driver.close();
    }
}
