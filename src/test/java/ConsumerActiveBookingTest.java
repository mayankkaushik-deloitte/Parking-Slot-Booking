
import Pages.Baseclass;
import Pages.ConsumerActiveBooking;
import Pages.ConsumerSignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ConsumerActiveBookingTest extends Baseclass {
    public ConsumerActiveBookingTest() throws IOException {
        super();
    }
    @BeforeSuite
    public void setUp() throws IOException {
        Baseclass.init();
        ConsumerSignIn consumerSignIn=new ConsumerSignIn();
        ConsumerActiveBooking consumerActiveBooking = new ConsumerActiveBooking();
        Baseclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void signInButton() {
        try {
            ConsumerSignIn.clickSignInForm();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }
    @Test(priority = 2)
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
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
    }
    @Test(priority = 3)
    public void ProfileAndDashboard() {
        try {
            ConsumerActiveBooking.clickProfile();
        } catch (Exception e) {
            System.out.println("Problem in clicking on profile" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.clickDashboard();
        } catch (Exception e) {
            System.out.println("Problem in opening the dashboard" + e.getMessage());
        }
    }
    @Test(priority = 4)
    public void ActiveBookingBtn() {
        try {
            ConsumerActiveBooking.clickActiveBooking();
        } catch (Exception e) {
            System.out.println("Problem in clicking the active booking button" + e.getMessage());
        }
    }
    @Test(priority = 5)
    public void MoreInfoAndPayment() {
        try {
            ConsumerActiveBooking.clickMoreInfo();
        } catch (Exception e) {
            System.out.println("Problem in clicking the more information button" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.clickPayOption();

        } catch (Exception e) {
            System.out.println("Problem in clicking the pay option" + e.getMessage());
        }
        try {
            Actions act=new Actions(driver);
//            driver.navigate().refresh();
            WebElement el=driver.findElement(By.xpath("//div[@class='card-payment-button']/button"));
            act.moveToElement(el).click().perform();
            Thread.sleep(5000);
//            act.click(driver.findElement(By.xpath("//div[@class='card-payment-button']/button"))).perform();
//            System.out.println("Hi");

//            ConsumerActiveBooking.clickProceedToPayment();
//            Thread.sleep(5000);

//            System.out.println("Bye");


        } catch (Exception e) {
            System.out.println("This Page is not implemented yet" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addPaymentEmail();
        } catch (Exception e) {
            System.out.println("Problem in entering email" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addCardNo();
        } catch (Exception e) {
            System.out.println("Problem in entering card no" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addMMYY();
        } catch (Exception e) {
            System.out.println("Problem in entering expiry month and year" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addCvv();
        } catch (Exception e) {
            System.out.println("Problem in entering cvv" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addNameOnCard();
        } catch (Exception e) {
            System.out.println("Problem in entering the name" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addCountry();
        } catch (Exception e) {
            System.out.println("Problem in entering the country" + e.getMessage());
        }
        try {
            ConsumerActiveBooking.addPaymentPayBtn();
        } catch (Exception e) {
            System.out.println("Problem in payment" + e.getMessage());
        }
    }
    @AfterSuite
    public void kill() {
        Baseclass.driver.close();
    }



}