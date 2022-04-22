package Utils;

import Pages.Baseclass;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileReading extends Baseclass {
    public static void read() throws IOException {
        FileInputStream inputStream =new FileInputStream("credentials/credentials.xlsx");
        wbook = new XSSFWorkbook(inputStream);
        sheet = wbook.getSheet("Sheet1");
    }
}
