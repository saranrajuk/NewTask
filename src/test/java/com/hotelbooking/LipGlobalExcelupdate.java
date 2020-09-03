package com.hotelbooking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LipGlobalExcelupdate {
	static WebDriver driver;
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

}
	public static void loadurl(String text) {
driver.get(text);
driver.manage().window().maximize();
	}
	public static void textbox(WebElement element,String data) {
element.sendKeys(data);
}
	public static  void btnclk(WebElement element) {
element.click();
}	
	public static void selectTextByDropDown(WebElement element,String text) {
new Select(element).selectByVisibleText(text);
	}
	public static void quitBrowser() {
driver.quit();
	}
	public static String getExcelData(int rowNo,int cellNo) throws IOException {
		String name=null;
		File excel=new File(System.getProperty("user.dir")+"\\Data\\Hotelbooking.xlsx");
		FileInputStream stream=new FileInputStream(excel);
		Workbook wb=new XSSFWorkbook(stream);
		Sheet sh = wb.getSheet("Data");
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		
		int cellType = c.getCellType();
		if (cellType==1) {
		name = c.getStringCellValue();
		}
		if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				name=new SimpleDateFormat("dd/mm/yy").format(c.getDateCellValue());
			}else {
				double d=c.getNumericCellValue();
				long l=(long)d;
				name=String.valueOf(l);
			}
		}
		
		
		return name;

	}
	public static void createExcelData(WebElement element,int rowNo,int cellNo,String name) throws IOException {
File f=new File(System.getProperty("user.dir")+"\\Data\\Hotelbooking.xlsx");
FileInputStream Stream2=new FileInputStream(f);
Workbook w=new XSSFWorkbook(Stream2);
Sheet sh1 = w.getSheet("Data");
	Row r1 = sh1.createRow(rowNo);
	Cell c1 = r1.createCell(cellNo);
	c1.setCellValue(element.getAttribute("value"));
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	System.out.println("Order No Printed successfully");
	
	
	
	}
	
}
