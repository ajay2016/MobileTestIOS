package com.iostestimobile.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Base {
	
	static IOSDriver<IOSElement> driver;
	
	public static IOSDriver<IOSElement> desiredcapability() throws MalformedURLException{
		
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("platformName", "iOS");
		  cap.setCapability("platformVersion", "12.1");
		  cap.setCapability("deviceName", "iPhone 7");

		  cap.setCapability("app", 
				  "/Users/ajayajha/Library/Developer/Xcode/DerivedData/UICatalog-cqvpdzugkkunztcbvjulaforbfih/Build/Products/Debug-iphonesimulator/UICatalog.app");

		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  driver = new IOSDriver<IOSElement>(url, cap);

		
		return driver;
		
	}
	
	public static void acceptAlert(String xpath) {
		driver.findElementByAccessibilityId(xpath).click();
		
		new WebDriverWait(driver, 60).ignoring(NoAlertPresentException.class)
		.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
	}
	
	public static void dismissAlert(String xpath) {
		driver.findElementByAccessibilityId(xpath).click();
		new WebDriverWait(driver, 60).ignoring(NoAlertPresentException.class)
		.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();

				
		
	}
	
	
	public static void scrollDown() {
		Dimension size =driver.manage().window().getSize();
		int starty = (int) (size.getHeight()*0.60);
		int endy = (int) (size.getHeight()*0.10);
		TouchAction scroll = new TouchAction((PerformsTouchActions)driver);
		
		scroll.press(PointOption.point(0, starty))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(0, endy))
		.release().perform();


	}

}
