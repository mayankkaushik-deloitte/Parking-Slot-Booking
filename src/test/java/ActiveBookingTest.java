import Pages.ActiveBooking;
import Pages.Baseclass;
import Pages.ProviderSignIn;
import Pages.ProviderSignInFromHome;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Pages.Baseclass.driver;
import static Pages.ProviderSignInFromHome.clickOnSignIn;

public class ActiveBookingTest {
    public ActiveBookingTest () {
        super();
    }
    @BeforeTest
    public void setUp () throws IOException {
        Baseclass.init();
        ProviderSignIn providerSignIn = new ProviderSignIn();
        ActiveBooking activeBooking = new ActiveBooking();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void registerClick() {
        ProviderSignIn.clickRegisterHere();
        Baseclass.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    }
    @Test(priority = 2)
    public void signInButton() {
        try {
            ProviderSignIn.clickSignInForm();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
        Baseclass.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

    }
    @Test(priority = 3)
    public void signInForm() {
        try{
            ProviderSignIn.addEmail();
        }catch (Exception e){
            System.out.println("Problem in adding the email...." + e.getMessage());
        }
        try {
            ProviderSignIn.addPassword();
        }catch (Exception e){
            System.out.println("Problem in adding the password... " + e.getMessage());
        }
        try {
            ProviderSignIn.clickSignIn();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
        Baseclass.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

    }
    @Test(priority = 4)
    public void clickOnDashboard() {
        try{
            ActiveBooking.clickOnMyDashBoard();
        }catch (Exception e){
            System.out.println("Problem with clicking the dashboard.. " + e.getMessage());
        }
        Baseclass.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

    }
    @Test(priority = 5)
    public void checkActiveBookings() {
        try{
            Assert.assertEquals(ActiveBooking.bookingStatus(driver),true);
        }catch (Exception e){
            System.out.println(driver.getCurrentUrl());
        }
        Baseclass.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    }
    @AfterTest
    public void kill () {
        Baseclass.driver.close();
    }
}
