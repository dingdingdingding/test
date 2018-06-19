package com.glen.demo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

//import org.junit.Test;

public class runDingDing {
    private static AppiumDriver driver;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addContact()throws Exception{
        //设置apk的路径,如果appium中设置后不需设置
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "com.alibaba.android.rimet-1.apk");

        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");

        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "4.3");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);

        //设置app的主包名和主类名
//        capabilities.setCapability("appPackage", "com.alibaba.android.rimet");
//        capabilities.setCapability("appActivity", ".rimet");

        //初始化
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        WebDriverWait wait = new WebDriverWait(driver, 100);
//        WebElement el = driver.findElement(By.className("android.widget.RelativeLayout"));
//        WebElement element = driver.findElement(By.id("com.alibaba.android.rimet:id/home_bottom_tab_text"));
//        element.click();


//        driver.findElementById("com.alibaba.android.rimet:id/home_bottom_tab_text[1]").click();

//        driver.findElementByAccessibilityId("").click();
//        el.click();
//        List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("Some Name");
//        textFieldsList.get(2).sendKeys("Some@example.com");
//        driver.swipe(100, 500, 100, 100, 2);
//        driver.findElementByName("Save").click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
