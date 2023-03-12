package com.test.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.IOSFunctions;

import io.appium.java_client.ios.IOSDriver;

public class IosNative extends IOSFunctions {

	IOSDriver driver;

	@FindBy(how = How.ID, using = "")
	static WebElement element1;

	@FindBy(xpath = "")
	static WebElement element2;

	@FindBy(name = "")
	static WebElement element3;

	static By element4 = By.className("");

	static By element5 = By.name("");

	public IosNative(IOSDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Functions

}
