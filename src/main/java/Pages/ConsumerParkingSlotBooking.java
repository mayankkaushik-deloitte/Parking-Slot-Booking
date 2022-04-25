package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

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

    public ConsumerParkingSlotBooking() throws IOException {
        PageFactory.initElements(driver,this);
    }

    public  void selectLocation() {
        String location_1 = sheet.getRow(1).getCell(5).getStringCellValue();
        location.sendKeys(location_1);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ENTER);
    }
    public  void enter_entryTime()
    {
       entryTime.click();
    }

    public  void enter_entryDate()
    {
        //String date1 = String.valueOf(sheet.getRow(1).getCell(6).getNumericCellValue());
        entryDate.sendKeys("12122022");
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
    public  void js1Click(WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkSlot);
    }




}
