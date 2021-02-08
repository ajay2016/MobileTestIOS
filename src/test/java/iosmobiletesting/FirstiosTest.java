package iosmobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class FirstiosTest {

	public static void main(String[] args) throws MalformedURLException {
		
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("platformName", "iOS");
		  cap.setCapability("platformVersion", "12.1");
		  cap.setCapability("deviceName", "iPhone 7");
		  //cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		  cap.setCapability("app", 
				  "/Users/ajayajha/Library/Developer/Xcode/DerivedData/WebDriverAgent-alwvnomvwrdtzoaxbbkniqrpcdpp/Build/Products/Debug-iphonesimulator/IntegrationApp.app");

		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(url, cap);
		  driver.findElementById("Touch").click();
		  	




		  


		
	}

}
	