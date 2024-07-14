package redio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.id("sampleHeading"));
	Thread.sleep(2000);
	//System.out.println("Element found using text:"+text.getText());
    //driver.quit();
	}

}
