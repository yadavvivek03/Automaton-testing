package redio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 
	  driver.manage().window().maximize(); Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id=\"log In\"]")).click();
	  driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Vivek");
	  driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Yadav");
	  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys( "yadavvivekkumar8097@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("vk@7398");
	  driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	  driver.findElement(By.xpath("//button[@id=\"add-contact\"]")).click();
	  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("yadavvivekkumar8097@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("vk@7398");
	  driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("add-contact")).click();
	  driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Vivek");
	  driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Yadav");
	  driver.findElement(By.xpath("//input[@id=\"birthdate\"]")).sendKeys(  "2003/09/14");
	  driver.findElement(By.xpath("//input[@placeholder=\"example@email.com\"]")).sendKeys("yadavvivekkumar8097@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("8097138626");
	  driver.findElement(By.xpath("//input[@id=\"street1\"]")).sendKeys("Chandrangan residency");
	  driver.findElement(By.xpath("//input[@id=\"street2\"]")).sendKeys("Chandrangan residency Diva east");
	  driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Thane");
	  driver.findElement(By.xpath("//input[@id=\"stateProvince\"]")).sendKeys("Maharastra");
	  driver.findElement(By.xpath("//input[@id=\"postalCode\"]")).sendKeys("400612"  );
	  driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
	  driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	  driver.findElement(By.id("logout")).click(); Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("yadavvivekkumar8097@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("vk@7398"); 
	  driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	  Thread.sleep(3000); File f =
	  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new
	  File("C:\\Users\\Krih\\Desktop\\screen short demo.png"));
	  
	  
	  
	  
	  
	 	}

}
