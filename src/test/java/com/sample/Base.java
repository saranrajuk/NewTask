package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base extends LibGlobal {
public static void main(String[] args) {
	
	getDriver();
	
loadUrl("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtuser = driver.findElement(By.id("email"));
	textbox(txtuser, "saranrajusaran111@gmail.com");

WebElement txtpass = driver.findElement(By.id("pass"));
textbox(txtpass, "485453");
WebElement loginBtn = driver.findElement(By.name("login"));
clikBtn(loginBtn);
quitBrowser();
}
}
