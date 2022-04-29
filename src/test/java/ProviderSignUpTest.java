import Pages.Baseclass;
import Pages.ProviderSignUp;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProviderSignUpTest extends Baseclass {
    public ProviderSignUpTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();
        ProviderSignUp ProviderSignUpObj = new ProviderSignUp();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void validDetails() {
        ProviderSignUp.clickRegisterHere();

    }
    @Test(priority = 2)
    public void signInButton() {
        ProviderSignUp.click_signIn();
        ProviderSignUp.error_signIn();

    }
    @Test(priority = 3)
    public void createAccount()
    {
        ProviderSignUp.create_new_account();
        ProviderSignUp.error_createAccount();

    }
    @Test(priority = 4)
    public void sign_up_form()
    {
        ProviderSignUp.enter_username();
        ProviderSignUp.error_username();
        ProviderSignUp.enter_email();
        ProviderSignUp.error_username();
        ProviderSignUp.enter_password();
        ProviderSignUp.error_password();
        ProviderSignUp.click_signup();
        ProviderSignUp.error_signUp();
//
    }
    @Test(priority = 5)
    public void entering_onlyUserName()
    {
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        ProviderSignUp.click_signIn();
        ProviderSignUp.create_new_account();
        ProviderSignUp.enter_username();
        ProviderSignUp.setError_check();

    }
    @Test(priority = 6)
    public void entering_onlyEmail()
    {
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        ProviderSignUp.click_signIn();
        ProviderSignUp.create_new_account();
        ProviderSignUp.enter_email();
        ProviderSignUp.setError_check();

    }
    @Test(priority = 7)
    public void entering_onlyPassword()
    {
        driver.navigate().refresh();

        ProviderSignUp.click_signIn();
        ProviderSignUp.create_new_account();
        ProviderSignUp.enter_password();
        ProviderSignUp.setError_check();

    }


    @AfterTest
    public void kill() {
        Baseclass.driver.close();
    }
}