package Pages;

import Utils.ExcelFileReading;
import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Baseclass {
    final static String URL = "https://plb-fe-urtjok3rza-wl.a.run.app/";
    public static WebDriver driver;
    public static XSSFWorkbook wbook;
    public static XSSFSheet sheet;
    public static void init() throws IOException {
        System.setProperty("webdriver.chrome.driver", "DriverDependency/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        try {
            ExcelFileReading.read();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
