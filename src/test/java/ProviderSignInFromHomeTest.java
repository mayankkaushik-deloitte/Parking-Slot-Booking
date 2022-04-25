import Pages.Baseclass;
import Pages.ProviderSignInFromHome;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Pages.ProviderSignInFromHome.clickOnSignIn;

public class ProviderSignInFromHomeTest {
    public ProviderSignInFromHomeTest () {
        super();
    }
    @BeforeTest
    public void setUp () throws IOException {
        Baseclass.init();
        ProviderSignInFromHome providerSignInFromHome = new ProviderSignInFromHome();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void clickSignIn() {
        try{
            clickOnSignIn();
        }catch (Exception e){
            System.out.println("Problem in clicking on sign in button.. " + e.getMessage());
        }
        finally {
            Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
    @Test
    public void addEmail() {
        try{
            ProviderSignInFromHome.addEmail();
        }catch (Exception e){
            System.out.println("Problem in adding values to the email... " + e.getMessage());
        }finally {
            Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
    @Test
    public void addPassword() {
        try{
            ProviderSignInFromHome.addPassword();
        }catch (Exception e){
            System.out.println("Problem in adding values to the password... " + e.getMessage());
        }finally {
            Baseclass.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        }
    }
    @Test
    public void clickOnLogin(){
        try{
            ProviderSignInFromHome.clickLogin();
        }catch (Exception e){
            System.out.println("Problem in clicking on login... " + e.getMessage());
        }finally {
            Baseclass.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        }
    }
    @AfterTest
    public void kill () {
        Baseclass.driver.close();
    }
}
