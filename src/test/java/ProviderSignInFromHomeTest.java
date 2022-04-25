import Pages.Baseclass;
import Pages.ProviderSignInFromHome;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Pages.Baseclass.driver;
import static Pages.ProviderSignInFromHome.clickOnSignIn;

public class ProviderSignInFromHomeTest {
    public ProviderSignInFromHomeTest () {
        super();
    }
    @BeforeTest
    public void setUp () throws IOException {
        Baseclass.init();
        ProviderSignInFromHome providerSignInFromHome = new ProviderSignInFromHome();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    @Test (priority = 1)
    public void clickSignIn() {
        try{
            clickOnSignIn();
        }catch (Exception e){
            System.out.println("Problem in clicking on sign in button.. " + e.getMessage());
        }
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }
    }
    @Test (priority = 2)
    public void addEmail() {
        try{
            ProviderSignInFromHome.addEmail();
        }catch (Exception e){
            System.out.println("Problem in adding values to the email... " + e.getMessage());
        }finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        }
    }
    @Test (priority = 3)
    public void addPassword() {
        try{
            ProviderSignInFromHome.addPassword();
        }catch (Exception e){
            System.out.println("Problem in adding values to the password... " + e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    @Test (priority = 4)
    public void clickOnLogin(){
        try{
            ProviderSignInFromHome.clickLogin();
        }catch (Exception e){
            System.out.println("Problem in clicking on login... " + e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    @AfterTest
    public void kill () {
        driver.close();
    }
}
