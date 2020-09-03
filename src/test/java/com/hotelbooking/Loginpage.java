package com.hotelbooking;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends LipGlobalExcelupdate{
public static void main(String[] args) throws IOException {

	WebDriver driver=getdriver();
	loadurl("http://adactinhotelapp.com/");
	
	WebElement texuser = driver.findElement(By.id("username"));
	textbox(texuser,getExcelData(4,1));
	
	WebElement texpass = driver.findElement(By.id("password"));
	textbox(texpass,getExcelData(4,2));
	WebElement clk = driver.findElement(By.id("login"));
	btnclk(clk);
	
	WebElement loction = driver.findElement(By.xpath("//select[@id=\"location\"]"));
	selectTextByDropDown(loction, getExcelData(4,3));
	
	WebElement hotel = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
	selectTextByDropDown(hotel, getExcelData(4,4));
	
	WebElement roomtyp = driver.findElement(By.id("room_type"));
	selectTextByDropDown(roomtyp, getExcelData(4,5));
	WebElement noroom = driver.findElement(By.id("room_nos"));
	selectTextByDropDown(noroom, getExcelData(4,6));
	WebElement chkDate = driver.findElement(By.id("datepick_in"));
	textbox(chkDate, getExcelData(4,7));
	
	WebElement chkOut = driver.findElement(By.id("datepick_out"));
	textbox(chkOut, getExcelData(4,8));
	
	WebElement adltRoom = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
	selectTextByDropDown(adltRoom, getExcelData(4,9));
	WebElement chilRoom = driver.findElement(By.xpath("//select[@name=\"child_room\"]"));
	selectTextByDropDown(chilRoom, getExcelData(4,10));
	WebElement serch = driver.findElement(By.id("Submit"));
	btnclk(serch);
	WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	btnclk(radiobtn);
	WebElement continuebtn = driver.findElement(By.id("continue"));
	btnclk(continuebtn);
	WebElement fistname = driver.findElement(By.id("first_name"));
	textbox(fistname, getExcelData(4,11));
	WebElement lstName = driver.findElement(By.id("last_name"));
	textbox(lstName, getExcelData(4,12));

	WebElement billAddrs = driver.findElement(By.id("address"));
	textbox(billAddrs, getExcelData(4,13));

	WebElement crdDetil = driver.findElement(By.id("cc_num"));
	textbox(crdDetil, getExcelData(4,15));
	WebElement crdTyp = driver.findElement(By.xpath("//select[@name=\"cc_type\"]"));
	selectTextByDropDown(crdTyp, getExcelData(4,16));
	WebElement expMonth = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
	selectTextByDropDown(expMonth, getExcelData(4,17));
	WebElement expYear = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
	selectTextByDropDown(expYear, getExcelData(4,18));

	WebElement cvvno = driver.findElement(By.id("cc_cvv"));
	textbox(cvvno, getExcelData(4,19));
	WebElement bookbtn = driver.findElement(By.id("book_now"));
	btnclk(bookbtn);
WebElement orderNo = driver.findElement(By.id("order_no"));
createExcelData(orderNo, 9, 10, "value");
}
}
