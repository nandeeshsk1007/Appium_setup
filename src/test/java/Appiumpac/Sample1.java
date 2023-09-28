package Appiumpac;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample1 {

	@Test
	public void sam() throws MalformedURLException, InterruptedException
	{
//		AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HI\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("one");
		options.setApp("D:\\javanew\\Appium_setup\\src\\test\\java\\utilities\\phygital_kiosk_app_build_v1..0_22_June_2023 (1)(1).apk");
		AndroidDriver android=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		android.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("device", "Android");
//		cap.setCapability("deviceName", "two");
//		cap.setCapability("app", "D:\\javanew\\Appium_setup\\src\\test\\java\\utilities\\cc_test_build_v_6.9.apk");
//		cap.setCapability("automationName", "UiAutomator2");
//		AndroidDriver android=new AndroidDriver(new URL("http://127.0.1.1:4723/wd/hub"), cap);
//		android .quit();
//		service.stop();
//		android.findElement(AppiumBy.accessibilityId("App")).click();
		System.out.println("A");
//		android.findElement(AppiumBy.id("com.consciouscreatures.app:id/btn_skip_welcome")).click();
//		System.out.println("B");
//		android.findElement(AppiumBy.id("com.consciouscreatures.app:id/et_phone_number")).sendKeys("8050373728");
//		android.findElement(AppiumBy.id("com.consciouscreatures.app:id/et_password")).sendKeys("123456789");
		
		
		android.findElement(AppiumBy.id("com.phygital.app:id/spnr_events")).click();
		android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Style tribute expo']")).click();
		android.findElement(AppiumBy.id("com.phygital.app:id/btn_continue")).click();
		WebElement organztn = android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Style tribute']"));
		Assert.assertTrue(organztn.isDisplayed(), "true");
		organztn.click();
	}
}