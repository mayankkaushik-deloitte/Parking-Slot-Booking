package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ProviderSignInFromHome extends Baseclass{
    @FindBy(xpath = "//*[@id='mobile']/li[4]/button")
    static
    WebElement signInBtn;
    @FindBy(xpath = "//*[@id='email']")
    static
    WebElement email;
    @FindBy(xpath = "//*[@id='password']")
    static
    WebElement password;
    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[2]/main/div/form/div[3]/div[2]/button")
    static
    WebElement loginBtn;
    public ProviderSignInFromHome() {
        PageFactory.initElements(driver,this);
    }
    public static void clickOnSignIn() {
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
    public static void clickLogin() {
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
