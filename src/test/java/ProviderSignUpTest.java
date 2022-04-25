import Pages.Baseclass;
import Pages.ProviderSignIn;
import Pages.ProviderSignUp;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.Assert;
import java.io.IOException;
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
    public void registerClick() {
        ProviderSignUp.clickRegisterHere();
    }
    @Test(priority = 2)
    public void signInButton() {
        ProviderSignUp.click_signIn();
        try {
            ProviderSignUp.click_signIn();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }
    @Test(priority = 3)
    public void createAccount()
    {
        ProviderSignUp.create_new_account();
        try {
            ProviderSignUp.create_new_account();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }
   @Test(priority = 4)
    public void sign_up_form()
    {
        try{
            ProviderSignUp.enter_username();
        }catch (Exception e){
            System.out.println("Problem in adding the email...." + e.getMessage());
        }
        try {
            ProviderSignUp.enter_email();
        }catch (Exception e){
            System.out.println("Problem in adding the password... " + e.getMessage());
        }
        try {
            ProviderSignUp.enter_password();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
        try {
            ProviderSignUp.click_signup();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
    }
    @Test(priority = 5)
    public void invalidUserName()
    {
        driver.navigate().refresh();
        registerClick();
        createAccount();
        sign_up_form();
        ProviderSignUp.create_new_account();
        ProviderSignUp.enter_username();
        ProviderSignUp.enter_email();
        ProviderSignUp.click_signIn();
        String expected ="Password cannot be empty";
        String actual = driver.switchTo().alert().getText();
        Assert.assertEquals(expected,actual);
    }
    @AfterTest
    public void kill() {
        Baseclass.driver.close();
    }
}