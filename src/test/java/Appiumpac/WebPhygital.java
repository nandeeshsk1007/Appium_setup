package Appiumpac;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class WebPhygital {
private AndroidDriver android;

@Test
public void browser() throws Exception {
	
//	DesiredCapabilities cap = new DesiredCapabilities();
//	DriverManagerType driverType = DriverManagerType.CHROME;
//    WebDriverManager.getInstance(driverType).setup();
//	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//  cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0"); // Set your device's platform version
//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "two");
//	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("two");
	options.setCapability("chromedriverExecutableDir", "C:\\Users\\HI\\Downloads\\chromedriver_win32 (2)");
	options.setCapability("browserName", "Chrome");
	android=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	android.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	android.get("http://phygital.xircular.io/");
	Thread.sleep(2000);
	WebElement bhima = android.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[10]/a/div/div[2]/h2"));
	Point loc = bhima.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	((JavascriptExecutor) android).executeAsyncScript("windows.scrollBy("+x+","+y+")");
	Thread.sleep(2000);
}
}
