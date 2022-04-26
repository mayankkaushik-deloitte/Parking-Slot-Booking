import Pages.Baseclass;
import Pages.ConsumerSignup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ConsumerSignupTest extends Baseclass {
    public ConsumerSignupTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();
        ConsumerSignup consumer = new ConsumerSignup();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void registerClick() throws InterruptedException {
        ConsumerSignup.click_signIn();
    }
    @Test(priority = 2)
    public void signInButton() {
        try {
            ConsumerSignup.click_register();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }
    @Test(priority = 3)
    public void sign_up_form()
    {
        try{
            ConsumerSignup.enter_username();
        }catch (Exception e){
            System.out.println("Problem in adding the email...." + e.getMessage());
        }
        try {
            ConsumerSignup.enter_email();
        }catch (Exception e){
            System.out.println("Problem in adding the password... " + e.getMessage());
        }
        try {
            ConsumerSignup.enter_password();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
        try {
            ConsumerSignup.signup();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
    }

}
