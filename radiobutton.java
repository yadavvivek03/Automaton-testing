package redio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/radio-button");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("")).click();
    
    
    
    	
    }
	

 }

