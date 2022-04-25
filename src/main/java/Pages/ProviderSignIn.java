package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProviderSignIn extends Baseclass{
    @FindBy(xpath = "//*[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[2]/main/div/form/div[3]/div[2]/button")
    public static WebElement loginBtn;
    @FindBy(xpath = "//*[@id='mobile']/li[3]/button")
    public static WebElement signInBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div/section[1]/div/div[2]/span/a")
    public static WebElement registerHere;
    public ProviderSignIn() throws IOException {
        PageFactory.initElements(driver,this);
    }
    public static void clickRegisterHere()
    {
        registerHere.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void clickSignInForm() {
        signInBtn.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void addEmail() {
        String emailVal = sheet.getRow(1).getCell(0).getStringCellValue();
        email.sendKeys(emailVal);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void addPassword() {
        String passVal = sheet.getRow(1).getCell(1).getStringCellValue();
        password.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void clickSignIn() {
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}