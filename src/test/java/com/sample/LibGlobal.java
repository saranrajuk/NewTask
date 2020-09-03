package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	static WebDriver driver;
public static WebDriver getDriver(){
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\\\chromedriver.exe");
	
driver =new ChromeDriver();
	return driver;
	}
public static void loadUrl(String data) {
driver.get(data);
}
public static void textbox(WebElement element,String data) {
	element.sendKeys(data);

}
public static void clikBtn(WebElement element) {
element.click();
}
public static void quitBrowser() {
driver.quit();
}
}
