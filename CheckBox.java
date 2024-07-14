	package redio;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	try
	{
	  driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-1\"][1]")).click();
	  driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-3\"][1]")).click();
	}
	catch (Exception e) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-1\"][1]")));
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-3\"][1]")));
	}

	
	  
	}

	}


