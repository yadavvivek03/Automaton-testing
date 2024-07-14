package redio;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.javatpoint.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	Thread.sleep(3000);
	js.executeScript("scrollBy(0, 5000)");
	
	}

}
