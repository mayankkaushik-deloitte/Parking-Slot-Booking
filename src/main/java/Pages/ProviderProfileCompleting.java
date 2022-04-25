package Pages;

import Pages.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProviderProfileCompleting extends Baseclass {

    public void AlreadyHaveAnAccount(){
        WebElement acc = driver.findElement(By.xpath("//*[@id='signUpModal']/div/div/div[2]/main/div/form/div[3]/div/a"));
        acc.click();
    }
    public void EnterMail(){
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        String email_Val = sheet.getRow(1).getCell(3).getStringCellValue();
        email.sendKeys(email_Val);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void EnterPassword(){
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        String password_Val = sheet.getRow(1).getCell(4).getStringCellValue();
        password.sendKeys(password_Val);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void EnterLogin(){
        WebElement login = driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[2]/main/div/form/div[3]/div[2]"));
        login.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void EnterFname(){
        WebElement fname = driver.findElement(By.xpath("//*[@id='fname']"));
        String passVal = sheet.getRow(2).getCell(5).getStringCellValue();
        fname.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void Enterlname(){
        WebElement lname = driver.findElement(By.xpath("//*[@id='lname']"));
        String passVal = sheet.getRow(2).getCell(6).getStringCellValue();
        lname.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void MobileNumber(){
        WebElement phno = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/form/div[3]/div[1]"));
        String passVal = sheet.getRow(2).getCell(7).getStringCellValue();
        phno.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void Address(){
        WebElement add = driver.findElement(By.xpath("//*[@id='address1']"));
        String passVal = sheet.getRow(2).getCell(8).getStringCellValue();
        add.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void PinCode(){
        WebElement pin = driver.findElement(By.xpath("//*[@id='pincode']"));
        String passVal = sheet.getRow(2).getCell(9).getStringCellValue();
        pin.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void District(){
        WebElement dist = driver.findElement(By.xpath("//*[@id='district']"));
        String passVal = sheet.getRow(2).getCell(10).getStringCellValue();
        dist.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void State(){
        WebElement state = driver.findElement(By.xpath("//*[@id='state']"));
        String passVal = sheet.getRow(2).getCell(11).getStringCellValue();
        state.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void Country(){
        WebElement country = driver.findElement(By.xpath("//*[@id='country']"));
        String passVal = sheet.getRow(2).getCell(12).getStringCellValue();
        country.sendKeys(passVal);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void SaveProfile(){
        WebElement profile = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/form/div[4]/button"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", profile);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
