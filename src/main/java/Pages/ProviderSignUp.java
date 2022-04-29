package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProviderSignUp extends Baseclass{

    @FindBy(xpath= "//*[@id='userName']")
    public static WebElement userName;
    @FindBy(xpath = "//*[@id=\"mui-1\"]")
    public static WebElement providerEmail;
    @FindBy(xpath = "//*[@id=\"mui-2\"]")
    public static WebElement providerPassword;
    @FindBy(xpath = "//*[@id=\"signUpModal\"]/div/div/div[2]/main/div/form/div[2]/div[2]/button")

    public static WebElement signUpButton;
    @FindBy(xpath = "//*[@id='mobile']/li[3]/button")
    public static WebElement signInBtn;
    @FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[2]/main/div/form/div[4]/div[2]/a")
    public static WebElement createNewAccount;
    @FindBy(xpath = "/html/body/div[1]/div/div/section[1]/div/div[2]/span/a")
    public static WebElement registerHere;
    @FindBy( xpath = "/*[@id=\"signUpModal\"]/div/div/div[2]/main/div/form/div[2]/div[2]")
    public static WebElement error_check;
    public ProviderSignUp() throws IOException {
        PageFactory.initElements(driver,this);
    }
    public static void clickRegisterHere() {
        registerHere.click();
    }
    public static void click_signIn()
    {
        signInBtn.click();
    }
    public static void create_new_account()
    {
        createNewAccount.click();
    }
    public static void enter_username()
    {
        String user_Val = sheet.getRow(8).getCell(0).getStringCellValue();
        //userName.sendKeys("provider99990");
        userName.sendKeys(user_Val);
    }
    public static void enter_email()
    {
        String email_Val = sheet.getRow(3).getCell(0).getStringCellValue();
        //providerEmail.sendKeys("provider99990@gmail.com");
        providerEmail.sendKeys(email_Val);
    }
    public static void enter_password()
    {
        String password_Val = sheet.getRow(3).getCell(0).getStringCellValue();
        providerPassword.sendKeys(password_Val);
    }
    public static void click_signup()
    {
        signUpButton.click();
    }

    public static  void setError_check()
    {
        try {
            if (driver.findElement(By.xpath("(///*[@id=\\\"signUpModal\\\"]/div/div/div[2]/main/div/form/div[2]/div[2]")).isEnabled()) {
                System.out.println("SignUp Button  Enabled");
            }
        } catch (Exception e) {
            System.out.println("SignUp Button not Enabled");
        }
    }
    public static void error_username()
    {
        try{
            enter_username();
        }catch (Exception e){
            System.out.println("Problem in adding the email...." + e.getMessage());
        }
    }
    public static void error_email()
    {
        try {
            ProviderSignUp.enter_email();
        }catch (Exception e){
            System.out.println("Problem in adding the password... " + e.getMessage());
        }

    }
    public static void error_password()
    {
        try {
            ProviderSignUp.enter_password();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }

    }
    public static void error_signUp()
    {
        try {
            ProviderSignUp.click_signup();
        }catch (Exception e){
            System.out.println("Problem in clicking the login button... " + e.getMessage());
        }
    }
    public static void error_createAccount()
    {
        try {
            ProviderSignUp.create_new_account();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }
    public static void error_signIn()
    {
        try {
            ProviderSignUp.click_signIn();
        }catch (Exception e){
            System.out.println("Problem in clicking the signing form... " + e.getMessage());
        }
    }





}
