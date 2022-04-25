import Pages.Baseclass;
import Pages.ProviderMyProfile;
import Pages.ProviderSignIn;
import Pages.ProviderSignUp;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Pages.Baseclass.driver;

public class ProviderMyProfileTest {
    public ProviderMyProfileTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void valid_details() throws IOException, InterruptedException {
        ProviderMyProfile ProviderMyProfileObj = new ProviderMyProfile();
        ProviderSignIn ProviderSignInObj = new ProviderSignIn();
        ProviderSignIn.clickRegisterHere();
        ProviderSignIn.clickSignInForm();
        ProviderSignIn.addEmail();
        ProviderSignIn.addPassword();
        ProviderSignIn.clickSignIn();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        ProviderMyProfileObj.profile_pic();
        ProviderMyProfileObj.Click_on_myProfile();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Thread.sleep(3000);
        ProviderMyProfileObj.jsClick(driver);
        /*ProviderMyProfileObj.valid_first_name();
        ProviderMyProfileObj.valid_last_name();
        ProviderMyProfileObj.address();
        ProviderMyProfileObj.getAddress2();
        ProviderMyProfileObj.validPincode();
        ProviderMyProfileObj.valid_district();
        ProviderMyProfileObj.validState();
        ProviderMyProfileObj.validCountry();*/
        ProviderMyProfileObj.js1Click(driver);
    }
    @AfterTest
    public  void close_Browser()
    {
   driver.quit();
    }
}
