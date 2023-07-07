package com.Basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sun.swing.internal.plaf.basic.resources.basic;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Basicclass extends BasePage {

	@Test
	public void Appiumtest() throws MalformedURLException, InterruptedException {
		
//		JavascriptExecutor js = (JavascriptExecutor) mobiledriver;
//		HashMap<String, String> scrollObject = new HashMap<String, String>();
//		scrollObject.put("direction", "down");
//		js.executeScript("mobile: scroll", scrollObject);
//		System.out.println("Printing the Value Before Method");
	
//		Thread.sleep(20000);
//		mobiledriver.findElement(AppiumBy.id("com.haulhub.android.dotslips.staging:id/activity_landing_btn_log_in"))
//				.click();
//		mobiledriver.findElement(AppiumBy.id("com.haulhub.android.dotslips.staging:id/login_username_edit_text"))
//				.sendKeys("6173132589");
//		mobiledriver.findElement(AppiumBy.id("com.haulhub.android.dotslips.staging:id/login_password_edit_text"))
//				.sendKeys("Dreams@2016*");
//		mobiledriver.findElement(AppiumBy.id("com.haulhub.android.dotslips.staging:id/login_btn_log_in")).click();
//		// mobiledriver.quit();
//		// service.stop();
		
		
		
//		System.out.println("Printing the Value After Method");

		
		mobiledriver.findElement(AppiumBy.id("android:id/text1")).click();
		scrollAndClick("Cameroon");
		//mobiledriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Algeria']")).click();
		mobiledriver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("ABHILASH");
		
		//mobiledriver.findElement(AppiumBy.accessibilityId("Test"));
		mobiledriver.findElement(AppiumBy.xpath("//*[@text='Male']")).click();
		//mobiledriver.findElement(AppiumBy.ByAndroidUIAutomator.
		mobiledriver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
	}
	
	

	public void scrollAndClick(String visibleText) {
		mobiledriver.findElement(ByAndroidUIAutomator.androidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true).instance(0))."
						+ "scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))")).
		click();
	        }
	    }


