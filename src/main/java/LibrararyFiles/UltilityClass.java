package LibrararyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UltilityClass {
	
	public static String getpropfile(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\FBVersion11\\TestData\\facebookkey.properties");
		Properties pro = new Properties();
		pro.load(file);
		String value = pro.getProperty(key);
		return value;
	}
	public static String getexceldatafacebook(int row , int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\FBVersion11\\TestData\\FacebookLogin.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("facebook");
		String value = sheet1.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
}
