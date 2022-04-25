package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ConsumerActiveBooking extends Baseclass{
    @FindBy(xpath = "//*[@id='mobile']/li[4]/button")
    public static WebElement signin_btn;
    @FindBy(xpath = "//*[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[2]/main/div/form/div[3]/div[2]/button")
    public static WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"mobile\"]/li[4]/div/span/img")
    public static WebElement profile;
    @FindBy(xpath = "//a[contains(text(), 'My Dashboard')]")
    public  static WebElement dashBoard;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/a[1]/p/span")
    public static WebElement Active_booking_btn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/ul/li[2]/button[1]")
    public static WebElement More_information;
    @FindBy(xpath = "//*[@id=\"sh21\"]/div/p[4]/button")
    public static WebElement pay;
    @FindBy(xpath = "//button[contains(text(),'Proceed to Payment')]")
    public static WebElement Proceed_to_payment;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public static WebElement Payment_email;
    @FindBy(xpath = "//*[@id=\"cardNumber\"]")
    public static WebElement Payment_cardNo;
    @FindBy(xpath = "//*[@id=\"cardExpiry\"]")
    public static WebElement Payment_MMYY;
    @FindBy(xpath = "//*[@id=\"cardCvc\"]")
    public static WebElement Payment_cvv;
    @FindBy(xpath = "//*[@id=\"cardCvc\"]")
    public static WebElement Payment_NameOnCard;
    @FindBy(xpath = "//*[@id=\"cardCvc\"]")
    public static WebElement Payment_country;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")
    public static WebElement Payment_pay_btn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[4]/button")
    public static WebElement Cancel_order;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/ul/li[2]/button[3]")
    public static WebElement Extend_btn;
    public ConsumerActiveBooking() throws IOException {
        PageFactory.initElements(driver,this);
    }
    public static void clickSignInForm() {
        signin_btn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    public static void addEmail() {
        String emailVal = sheet.getRow(2).getCell(0).getStringCellValue();
        email.sendKeys(emailVal);

    }
    public static void addPassword() {
        String passVal = sheet.getRow(2).getCell(1).getStringCellValue();
        password.sendKeys(passVal);

    }
    public static void clickSignIn() {
        loginBtn.click();

    }
    public static void clickProfile(){
        profile.click();

    }
    public static void clickDashboard(){
        dashBoard.click();

    }
    public static void clickActiveBooking() {
        Active_booking_btn.click();

    }
    public static void clickMoreInfo() {
        More_information.click();

    }
    public static void clickPayOption() {
        pay.click();

    }
    public static void clickProceedToPayment() throws InterruptedException {
        Proceed_to_payment.click();
        Thread.sleep(5000);

    }
    public static void addPaymentEmail() {
        String emailVal = sheet.getRow(8).getCell(0).getStringCellValue();
        Payment_email.sendKeys(emailVal);

    }
    public static void addCardNo() {
        String emailVal = sheet.getRow(8).getCell(1).getStringCellValue();
        Payment_cardNo.sendKeys(emailVal);

    }
    public static void addMMYY() {
        String emailVal = sheet.getRow(8).getCell(2).getStringCellValue();
        Payment_MMYY.sendKeys(emailVal);

    }
    public static void addCvv() {
        String emailVal = sheet.getRow(8).getCell(3).getStringCellValue();
        Payment_cvv.sendKeys(emailVal);

    }
    public static void addNameOnCard() {
        String emailVal = sheet.getRow(8).getCell(4).getStringCellValue();
        Payment_NameOnCard.sendKeys(emailVal);

    }
    public static void addCountry() {
        String emailVal = sheet.getRow(8).getCell(5).getStringCellValue();
        Payment_country.sendKeys(emailVal);

    }
    public static void addPaymentPayBtn() {
        String emailVal = sheet.getRow(2).getCell(0).getStringCellValue();
        Payment_pay_btn.sendKeys(emailVal);

    }
}
