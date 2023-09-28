package Appiumpac;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Phygital {

	static AndroidDriver android;
	static int x1;
	static int y1;
	static int x2;
	static int y2;
	@SuppressWarnings("deprecation")
	public static void easy(int initialX, int initialY, int finalX, int finalY) {
		Dimension size = android.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		initialX=(int) (width*0.425);
		initialY=(int) (height*0.56);
		finalX=(int) (width*0.15);
		finalY=(int) (height*0.56);
		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(android);
		touchAction.press(PointOption.point(initialX, initialY)).waitAction().moveTo(PointOption.point(finalX, finalY)).release().perform();
		//		((JavascriptExecutor) android).executeScript("mobile: swipeGesture", ImmutableMap.of(
		//				"left", 1000, "top", 1000, "width", h, "height", w,
		//			    "direction", "left",
		//			    "percent", 0.2
		//			));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void sample() throws MalformedURLException, InterruptedException, AWTException{

		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Tablet v11");
		options.setApp("D:\\javanew\\Appium_setup\\src\\test\\java\\utilities\\Phygital_app_build_v1.0_03_July_2023_for_tab.apk");
		android=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		android.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Event selection screen
		//				android.findElement(AppiumBy.id("com.phygital.app.t1:id/spnr_events")).click();
		//				android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Style tribute expo']")).click();
		//				android.findElement(AppiumBy.id("com.phygital.app.t1:id/btn_continue")).click();

		//"com.phygital.app:id/spnr_events"
		//Oraganizations screen
		WebElement organztn = android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Style tribute']"));
		Assert.assertTrue(organztn.isDisplayed(), "true");
		organztn.click();

		//If content update available
		WebElement ok_button = android.findElement(AppiumBy.id("android:id/button1"));
		if(ok_button.isDisplayed()) {
			ok_button.click();
		}

		//		//Home screen or categories screen
		//		WebElement brand_story_button = android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Brand Story']"));
		//		Assert.assertTrue(brand_story_button.isDisplayed(), "true");
		//		brand_story_button.click();
		//
		//		//Click on a story
		//		//System.out.println(android.findElement(By.id("com.phygital.app:id/tv_tool_bar_title")).getText());
		//		//new WebDriverWait(android, Duration.ofSeconds(10)).until(ExpectedConditions.attributeContains(brand_story_title,"text", String.valueOf("Brand Story")));
		//		//System.out.println("A");
		//		//Thread.sleep(2000);
		//		//Assert.assertTrue(brand_story_title.getAttribute("text").contains("Brand Story"));
		//		//Thread.sleep(2000);
		//
		//		android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='STEPHANIE CRESPIN LEADS A TEAM']")).click();
		//		android.findElement(AppiumBy.id("com.phygital.app:id/img_list_thumbnail")).click();
		//		Thread.sleep(2000);
		////		Dimension size = android.manage().window().getSize();
		////		int height = size.getHeight();
		////		int width = size.getWidth();
		////		int x1=(int) (width*0.425);
		////		int y1=(int) (height*0.56);
		////		int x2=(int) (width*0.15);android
		////		int y2=(int) (height*0.56);
		//		easy(x1, y1, x2, y2);
		//		System.out.println("Scrolling passed");
		////		Robot robot = new Robot();
		////		robot.keyPress(java.awt.event.KeyEvent.VK_ESCAPE);
		////		robot.keyRelease(java.awt.event.KeyEvent.VK_ESCAPE);
		//		android.findElement(AppiumBy.id("com.phygital.app:id/img_back")).click();
		//		android.findElement(AppiumBy.id("com.phygital.app:id/img_back")).click();

		//Gallery
		android.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(4000);
		@SuppressWarnings({ "rawtypes" })
		

		//		


		WebElement ele3 = android.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.ImageView"));


		//ele3.click();
		//			}

		//		WebElement ele9 = android.findElement(By.xpath("(//android.widget.ImageView)[5]"));
		//		Point position3 = ele3.getLocation();
		//		System.out.println(position3.getX());
		//		System.out.println(position3.getY());
		//		Point position9 = ele9.getLocation();
		//		System.out.println(position9.getX());
		//		System.out.println(position9.getY());
		do{
			@SuppressWarnings("rawtypes")
			TouchAction touchAction = new TouchAction(android);
			touchAction.press(PointOption.point(1000, 1000))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
			.moveTo(PointOption.point(1000, 500))
			.release()
			.perform();
		}
		while(ele3.isDisplayed());
//		if(ele3.isDisplayed()) {
//			ele3.click();
//		}
//		else {
//			@SuppressWarnings("rawtypes")
//			TouchAction touchAction = new TouchAction(android);
//			touchAction.press(PointOption.point(1000, 1000))
//			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
//			.moveTo(PointOption.point(1000, 500))
//			.release()
//			.perform();
//		}
		//		while(ele9.isDisplayed()==false) {
		//			((JavascriptExecutor) android).executeScript("mobile: scrollGesture", ImmutableMap.of(
		//					"left", 200, "top", 200, "width", 400, "height", 400,
		//					"direction", "down",
		//					"percent", 3.0
		//					));
		//		}
		//ele9.click();
		//		easy(position3.getX(), position3.getY(), position9.getX(), position9.getY());
		//		AndroidTouchAction ta = new AndroidTouchAction(android);
		//		ta.press(ElementOption.element(ele9)).waitAction().moveTo(PointOption.point(position3.getX(),position3.getY())).release().perform();
		//		@SuppressWarnings("rawtypes")
		//		TouchAction touchAction = new TouchAction(android);
		//	    touchAction.press(PointOption.point(position3.getX(), position3.getY()))
		//	            .waitAction()
		//	            .moveTo(PointOption.point(position9.getX(), position9.getY()))
		//	            .release()
		//	            .perform();

		//allimages.get(3).click();
		Thread.sleep(4000);

		//		WebElement gallery_images = android.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));	
		//		System.out.println(gallery_images.getLocation().getY());
		//		boolean canScrollMore;
		//		do {
		//			canScrollMore = (Boolean) ((JavascriptExecutor) android).executeScript("mobile: scrollGesture", ImmutableMap.of(
		//					"left", 100, "top", 100, "width", 200, "height", 200,
		//					"direction", "down",
		//					"percent", 3.0
		//					));
		//		}
		//		while(gallery_images.isDisplayed());
		//		try
		//        {
		//            JavascriptExecutor js = (JavascriptExecutor) android;    
		//            js.executeScript("arguments[0].scrollIntoView();", gallery_images);
		//        }
		//        catch (Exception e)
		//        {
		//            System.err.println("Unable to scroll to webelement.  WebElement is not visible.");
		//        }
		//		android.findElement(AppiumBy.androidUIAutomator(
		//	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		//		Thread.sleep(2000);
		//				Dimension size = android.manage().window().getSize();
		//		        int screenWidth = size.getWidth();
		//		        int screenHeight = size.getHeight();
		//		        System.out.println(screenWidth);
		//		        System.out.println(screenHeight);
		//
		//				Point loc = gallery_images.getLocation();
		//				int x = loc.getX();
		//				int y = loc.getY();


		//android.quit();

	}



}