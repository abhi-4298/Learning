package com.Basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BasePage {
	public AndroidDriver mobiledriver;

	// public BasePage(AndroidDriver mobiledriver) {
	// this.mobiledriver=mobiledriver;
	// }

	@BeforeMethod
	public void condigdriver() throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("no",true);
        capabilities.setCapability("newCommandTimeout", 100000);
       // capabilities.setCapability("noReset", true);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//        capabilities.setCapability("PlatformName", "ANDROID");
        capabilities.setCapability(CapabilityType.VERSION, "4.9.0");
        capabilities.setCapability("deviceName", "Pixel XL API 33");
        capabilities.setCapability("app", "D:\\Mobile\\General-Store.apk");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noRest", true);
		//UiAutomator2Options option = new UiAutomator2Options();
		//option.setPlatformName("Android");
		//option.setDeviceName("Pixel XL API 33");
		//option.setCapability("noRest", true);
		//option.setApp("D:\\Mobile\\APPIUM\\src\\test\\java\\resources\\Dotslip.apk");

		mobiledriver = new AndroidDriver(new URL("http://0.0.0.0:4723"), capabilities);
		mobiledriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	

		
	}

	//@AfterMethod
	//public void teardown() {
		//mobiledriver.quit();
		// mobiledriver.close();
	//}

}
