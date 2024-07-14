package redio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdrive.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.name("cusid")).sendKeys("809715");	
    Thread.sleep(2000);
    driver.findElement(By.name("submit")).submit();		
    Thread.sleep(2000);
    Alert alert = driver.switchTo().alert();
    String alertMessage= driver.switchTo().alert().getText();
    System.out.println(alertMessage);	
    Thread.sleep(2000);
     alert.accept();		
   
	}

}
