package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class ConsumerSignup extends Baseclass{
    @FindBy(xpath = "//*[@id='mobile']/li[4]/button")
    public static WebElement signin_btn;

    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[2]/main/div/form/div[4]/div[2]")
    public static WebElement register;

    @FindBy(name = "userName")
    public static WebElement username;

    @FindBy(name = "email")
    public static WebElement emailaddress;

    @FindBy(name = "password")
    public static WebElement password;

    @FindBy(xpath = "//*[@id='signUpModal']/div/div/div[2]/main/div/form/div[2]/div[2]/button")
    public static WebElement signup;

    public ConsumerSignup() throws IOException {
        PageFactory.initElements(driver,this);
    }

    public static void click_signIn() throws InterruptedException {
        signin_btn.click();
        sleep(3000);
    }
    public static void click_register() throws InterruptedException {
        register.click();
        sleep(3000);
    }
    public static void enter_username()
    {
        String user_Val = sheet.getRow(2).getCell(2).getStringCellValue();
        username.sendKeys(user_Val);
    }
    public static void enter_email()
    {
        String email_Val = sheet.getRow(2).getCell(3).getStringCellValue();
        emailaddress.sendKeys(email_Val);
    }
    public static void enter_password()
    {
        String password_Val = sheet.getRow(2).getCell(4).getStringCellValue();
        password.sendKeys(password_Val);
    }
    public static void signup()
    {
        signup.click();
    }
}
