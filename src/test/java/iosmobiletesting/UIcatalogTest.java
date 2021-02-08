package iosmobiletesting;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iostestimobile.base.Base;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class UIcatalogTest extends Base {
	
	@Test
	public void uiCatalogScrollTest() throws MalformedURLException {
		
		IOSDriver<IOSElement> driver	=  desiredcapability();
		//To Scroll
		//Dimension size =driver.manage().window().getSize();
		//int x = size.getWidth()/2;
		//int starty = (int) (size.getHeight()*0.60);
		//int endy = (int) (size.getHeight()*0.10);
		
		//TouchAction scroll = new TouchAction((PerformsTouchActions)driver);

		
		//scroll.press(PointOption.point(0, starty))
		//.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		//.moveTo(PointOption.point(0, endy))
		//.release().perform();
		scrollDown();
		driver.findElementByAccessibilityId("Web View").click();
		driver.navigate().back();
		
		//scroll.press(PointOption.point(0, starty))
		//.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		//.moveTo(PointOption.point(0, endy))
			//.release().perform();
		
		scrollDown();
		driver.findElementByAccessibilityId("Sliders").click();
		IOSElement slider = driver.findElementByXPath("//XCUIElementTypeSlider");
		//set value takes 0 to 1 
		//0.40 represent 40%
		slider.setValue("0%");
		//Assert.assertEquals("0%", slider.getAttribute("value"), "Value doesnot match");
		//Assert.assertEquals("0%", slider.getAttribute("value"));
		System.out.println("Slide value is  "+slider.getAttribute("value"));
		driver.navigate().back();
		scrollDown();
		driver.findElementByAccessibilityId("Steppers").click();
		driver.findElementByName("Increment").click();
		driver.findElementByName("Increment").click();
		String text = driver.findElementsByClassName("XCUIElementTypeStaticText").get(0).getText();
		System.out.println("Value is  "+text);
		driver.navigate().back();
		scrollDown();
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByName("Green color component value").setValue("215");



		

		
	}

}
