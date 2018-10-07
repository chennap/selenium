package automation.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	public static WebDriver driver=null;
@Test
public static void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "E:\\selenium tools\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://facebook.com/");
	driver.close();
}
}
