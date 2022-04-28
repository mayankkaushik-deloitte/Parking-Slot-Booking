package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public  class ConsumerParkingSlotBooking extends Baseclass{

    @FindBy(xpath = "//*[@id=\"mui-4\"]")
    public static WebElement location;

    @FindBy(xpath="//*[@id=\"posj\"]/div/form/div[2]/div[1]/div[1]/input")

    public static WebElement entryDate;

    @FindBy(xpath="//*[@id=\"posj\"]/div/form/div[2]/div[1]/div[2]/select/option[4]")
    public static WebElement entryTime;

    @FindBy(xpath = "//*[@id=\"posj\"]/div/form/div[2]/div[2]/div[1]/input")
    public static WebElement exitDate;

    @FindBy(xpath="//*[@id=\"posj\"]/div/form/div[2]/div[2]/div[2]/div/select/option[19]")
    public static WebElement exitTime;

    @FindBy(xpath = "//*[@id=\"posj\"]/div/form/div[3]/button[1]")
    public static WebElement checkSlot;
    @FindBy(xpath = "//*[@id='mobile']/li[4]/button")
    public static WebElement signin_btn;
    @FindBy(xpath = "//*[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[2]/main/div/form/div[3]/div[2]/button")
    public static WebElement loginBtn;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public static WebElement Book_Now;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public static WebElement addVehicle;
    @FindBy(xpath = "//input[@id='vehicleNumber']")
    public static WebElement addvehicleNumber;
    @FindBy(xpath = "//input[@id='manufacturer']")
    public static WebElement manufacturer;
    @FindBy(xpath = "//button[@class='btn btn-primary mx-2']")
    public static WebElement submit;
    @FindBy(xpath = "//*[@id=\"vbutton\"]")
    public  static WebElement reserve;


    public ConsumerParkingSlotBooking() throws IOException {
        PageFactory.initElements(driver,this);
    }
     public  void signinForm()
     {
         signin_btn.click();
     }
     public void enter_Email()
     {
         String location_1 = sheet.getRow(2).getCell(0).getStringCellValue();
         email.sendKeys(location_1);
     }
     public void enter_password()
     {
         String location_1 = sheet.getRow(2).getCell(1).getStringCellValue();
         password.sendKeys(location_1);
     }
     public void click_signIn()
     {
         loginBtn.click();
     }
    public  void selectLocation() throws InterruptedException {
//        String location_1 = sheet.getRow(1).getCell(5).getStringCellValue();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//        location.sendKeys(location_1);
//
//        location.sendKeys(Keys.ARROW_DOWN);
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//        location.sendKeys(Keys.ENTER);
        String location_1 = sheet.getRow(1).getCell(5).getStringCellValue();
        Thread.sleep(5000);
        location.sendKeys(location_1);
        Thread.sleep(5000);
        location.sendKeys(Keys.DOWN);
        location.sendKeys(Keys.ENTER);
    }
    public  void enter_entryTime()
    {
       entryTime.click();
    }

    public  void enter_entryDate()
    {
        //String data= String.valueOf(sheet.getRow(1).getCell(6).getNumericCellValue());
        //int date1= Integer.parseInt(data);
        //String date1 = String.valueOf(sheet.getRow(1).getCell(6).getNumericCellValue());
        entryDate.sendKeys("4262023");
    }
    public  void enter_exitDate()
    {
        //String date2 = String.valueOf(sheet.getRow(1).getCell(8).getNumericCellValue());
        exitDate.sendKeys("12122023");
    }
    public   void enter_exitTime()
    {
        exitTime.click();
    }
//    public  void click_checkslot()
//    {
//        checkSlot.click();
//    }

    public  void js1Click(WebDriver driver) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        executor.executeScript("arguments[0].click();", checkSlot);
    }
    public  void bookSlot(WebDriver driver) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        executor.executeScript("arguments[0].click();", Book_Now);
    }
//    public void bookSlot()
//    {
//        Book_Now.click();
//    }
public  void Add_Vehicle(WebDriver driver) throws InterruptedException {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    Thread.sleep(5000);
    executor.executeScript("arguments[0].click();", addVehicle);
}
//    public void Add_Vehicle()
//    {
//        addVehicle.click();
//    }
    public void addVehicleNumber()
    {
        String  data = sheet.getRow(5).getCell(1).getStringCellValue();
       addvehicleNumber.sendKeys(data);
    }
   public void addManufacturer()
   {
       String  data = sheet.getRow(5).getCell(2).getStringCellValue();
       manufacturer.sendKeys(data);

   }
    public  void click_submit(WebDriver driver) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        executor.executeScript("arguments[0].click();", submit);

    }
    public void checkAfter_invalidDetails()
    {
        try {
            if (Book_Now.isEnabled()) {
                System.out.println("Book Slot present");
            }
        } catch (Exception e) {
            System.out.println("Book Slot not present");
        }
    }
    public  void addreserve(WebDriver driver) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        executor.executeScript("arguments[0].click();", reserve);

    }
    public  void check_reseve()
    {
        if(reserve.isDisplayed()){

            System.out.println("Element is Present");

        }

        else{

            System.out.println("Element is Absent");

        }
    }
// public void click_submit()
// {
//     submit.click();
// }


}
