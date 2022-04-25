package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Utils.ExcelFileReading.sheet;
public class ConsumerSignIn extends Baseclass {
    @FindBy(xpath = "//*[@id='mobile']/li[4]/button")
    public static WebElement signin_btn;
    @FindBy(xpath = "//*[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[2]/main/div/form/div[3]/div[2]/button")
    public static WebElement loginBtn;
    public ConsumerSignIn() throws IOException {
        PageFactory.initElements(driver,this);
    }

    public static void clickSignInForm() {
        signin_btn.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void addEmail() {
        String emailVal = sheet.getRow(2).getCell(0).getStringCellValue();
        email.sendKeys(emailVal);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void addPassword() {
        String passVal = sheet.getRow(2).getCell(1).getStringCellValue();
        password.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static void clickSignIn() {
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}

