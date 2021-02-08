package iosmobiletesting;

import java.net.MalformedURLException;


import org.testng.annotations.Test;

import com.iostestimobile.base.BaseBrowser;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SafariBrowser extends BaseBrowser{
	
	@Test
	public void safariBrowserTest() throws MalformedURLException, InterruptedException{
		
		IOSDriver<IOSElement> driver	=  desiredcapability();
		driver.get("http://www.gmail.com");
		//driver.findElementByXPath("//*[text()='Sign in']");
		Thread.sleep(10000L);
		driver.findElementByName("identifier").sendKeys("ajay");
		driver.findElementByXPath("//*[text() = 'Next']").click();

		
	}

}
