package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
public class ProviderSignUp extends Baseclass{

    @FindBy(xpath= "//*[@id='userName']")
    public static WebElement userName;
    @FindBy(xpath = "//*[@id='mui-1']")
    public static WebElement providerEmail;
    @FindBy(xpath = "//*[@id='mui-2']")
    public static WebElement providerPassword;
    @FindBy(xpath = "//*[@id='signUpModal']/div/div/div[2]/main/div/form/div[2]/div[2]/button")

    public static WebElement signUpButton;
    @FindBy(xpath = "//*[@id='mobile']/li[3]/button")
    public static WebElement signInBtn;
    @FindBy(xpath="//*[@id='signInModal']/div/div/div[2]/main/div/form/div[4]/div[2]/a")
    public static WebElement createNewAccount;
    @FindBy(xpath = "/html/body/div[1]/div/div/section[1]/div/div[2]/span/a")
    public static WebElement registerHere;
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
        String user_Val = sheet.getRow(1).getCell(2).getStringCellValue();
        userName.sendKeys(user_Val);
    }
    public static void enter_email()
    {
        String email_Val = sheet.getRow(1).getCell(3).getStringCellValue();
        providerEmail.sendKeys(email_Val);
    }
    public static void enter_password()
    {
        String password_Val = sheet.getRow(1).getCell(4).getStringCellValue();
        providerPassword.sendKeys(password_Val);
    }
    public static void click_signup()
    {
        signUpButton.click();
    }







}