import Pages.Baseclass;
import Pages.ProviderSignIn;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProviderSignInTest extends Baseclass {
    public ProviderSignInTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();
        ProviderSignIn ProviderSignInObj = new ProviderSignIn();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void registerClick() {
        ProviderSignIn.clickRegisterHere();
    }
    @Test(priority = 2)
    public void signInButton() {
        try {
            ProviderSignIn.clickSignInForm();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
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
    }
    @AfterTest
    public void kill() {
        Baseclass.driver.close();
    }
}
