import Pages.Baseclass;
import Pages.ConsumerSignIn;
import org.testng.annotations.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class ConsumerSignInTest extends Baseclass{
    public ConsumerSignInTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        Baseclass.init();
        ConsumerSignIn consumerSignIn = new ConsumerSignIn(driver);
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test(priority = 8)
    public void signInButton() {
        try {
            ConsumerSignIn.clickSignInForm();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }
    @Test(priority = 9)
    public void signInForm() {
        try{
            ConsumerSignIn.addEmail();
        }catch (Exception e){
            System.out.println("Problem in adding the email...." + e.getMessage());
        }
        try {
            ConsumerSignIn.addPassword();
        }catch (Exception e){
            System.out.println("Problem in adding the password... " + e.getMessage());
        }
        try {
            ConsumerSignIn.clickSignIn();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
    }

}




