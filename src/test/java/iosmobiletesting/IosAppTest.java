package iosmobiletesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.iostestimobile.base.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import  static io.appium.java_client.touch.offset.ElementOption.element;



public class IosAppTest  extends Base{
	
	@Test
	public void touchEventTest() throws MalformedURLException, InterruptedException {
		
	IOSDriver<IOSElement> driver	=  desiredcapability();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//TouchActions action = new TouchActions(driver);
	//action.click(driver.findElementByAccessibilityId("Toolbars")).perform();
	//IOSElement e = driver.findElementByAccessibilityId("Toolbars");
	//Thread.sleep(5000L);
	//e.click();
	
	//TouchAction action = new TouchAction(driver);
	//action.tap(tapOptions().withElement(element(e))).perform();
	//driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Okay / Cancel\"]\n"
		//	+ "").click();
	//  driver.findElementById("Touch").click();
	driver.findElementByAccessibilityId("Alerts").click();
	driver.findElementByAccessibilityId("textField").clear();
	driver.findElementByAccessibilityId("textField").setValue("Ajay");
	driver.findElementByAccessibilityId("Create App Alert").click();
	driver.switchTo().alert();
	driver.findElementByAccessibilityId("Will do").click();
	//driver.findElementByAccessibilityId("Create Notification Alert").click();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	acceptAlert("Create Notification Alert");
	dismissAlert("Create Camera Roll Alert");

		
	}

}
