package Pages;

import Pages.Baseclass;
import org.openqa.selenium.By;
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
        fname.sendKeys("Praneeth");
    }
    public void Enterlname(){
        WebElement lname = driver.findElement(By.xpath("//*[@id='lname']"));
        lname.sendKeys("Malyala");
    }
    public void MobileNumber(){
        WebElement phno = driver.findElement(By.xpath("//*[@id='mobile']"));
        phno.sendKeys("123321123321");
    }
    public void Address(){
        WebElement add = driver.findElement(By.xpath("//*[@id='address1']"));
        add.sendKeys("KPHB Colony");
    }
    public void PinCode(){
        WebElement pin = driver.findElement(By.xpath("//*[@id='pincode']"));
        pin.sendKeys("12332");
    }
    public void District(){
        WebElement dist = driver.findElement(By.xpath("//*[@id='district']"));
        dist.sendKeys("Medchal");
    }
    public void State(){
        WebElement state = driver.findElement(By.xpath("//*[@id='state']"));
        state.sendKeys("Telangana");
    }
    public void Cuntry(){
        WebElement country = driver.findElement(By.xpath("//*[@id='country']"));
        country.sendKeys("India");
    }
    public void SaveProfile(){
        WebElement profile = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/form/div[4]/button"));
        profile.click();
    }
}
