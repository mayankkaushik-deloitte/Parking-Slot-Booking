package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProviderMyProfile extends Baseclass {
    @FindBy(xpath = "//button[contains(text(),'Edit Profile')]")
    public static WebElement editButton;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    public static WebElement firstName;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/input")
    public static WebElement lastName;
    @FindBy(xpath = "//input[@name='phone_number']")
    public static WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='address1']")
    public static WebElement address1;
    @FindBy(xpath = "//input[@name='address2']")
    public static WebElement address2;
    @FindBy(xpath = "//input[@name='pincode']")
    public static WebElement pinCode;
    @FindBy(xpath = "//input[@name='district']")
    public static WebElement District;
    @FindBy(xpath = "//input[@name='state']")
    public static WebElement state;
    @FindBy(xpath = "//input[@name='country']")
    public static WebElement country;
    @FindBy(xpath = "//button[@class='btn btn-success mx-2']")
    public static WebElement save;
    @FindBy(xpath = "//*[@id=\"mobile\"]/li[5]/div")
    public static WebElement profile;
    @FindBy(xpath = "//a[contains(text(), 'My Dashboard')]")
    public  static WebElement dashBoard;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/a[5]/p/span")
    public static WebElement Myprofile;

    public ProviderMyProfile() throws IOException {
        PageFactory.initElements(driver,this);
    }
    public void profile_pic()
    {
        profile.click();
        dashBoard.click();



    }
    public  void jsClick(WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", editButton);
    }
    public  void js1Click(WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", save);
    }
    public void Click_on_myProfile()
    {
        Myprofile.click();
    }
    public  void click_on_edit()
    {
        editButton.click();
    }
    public void valid_first_name()
    {
        String name = sheet.getRow(1).getCell(10).getStringCellValue();
        firstName.sendKeys(name);
    }
    public void valid_last_name()
    {
        String lastname= sheet.getRow(1).getCell(11).getStringCellValue();
        lastName.sendKeys(lastname);
    }
    public void address()
    {
        String add= sheet.getRow(1).getCell(12).getStringCellValue();
        address1.sendKeys(add);
    }
    public void getAddress2()
    {
        String add= sheet.getRow(1).getCell(13).getStringCellValue();
        address2.sendKeys(add);
    }
    public  void validPincode()
    {
        String pin= sheet.getRow(1).getCell(14).getStringCellValue();
        address2.sendKeys(pin);
    }
    public void valid_district()
    {
        String district= sheet.getRow(1).getCell(15).getStringCellValue();
        District.sendKeys(district);
    }
    public void validState()
    {
        String st= sheet.getRow(1).getCell(16).getStringCellValue();
        state.sendKeys(st);
    }
    public  void validCountry()
    {
        String Country= sheet.getRow(1).getCell(17).getStringCellValue();
        country.sendKeys(Country);
    }
    public void saveDetails()
    {
        String save_details= sheet.getRow(1).getCell(14).getStringCellValue();
        save.sendKeys(save_details);
    }

}
