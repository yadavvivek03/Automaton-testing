package redio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromedriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Vivek");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Yadav");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name=\"chkbox\"]")).click();
	 try {
	     driver.findElement(By.name("male")).click();
	  } catch (Exception e) {
	     JavascriptExecutor executor = (JavascriptExecutor) driver;
	     executor.executeScript("arguments[0].click();", driver.findElement(By.name("male")));
	  }
	//Age
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name=\"age\"]")).sendKeys("21");
	//BirthDate
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("14/09/2003");
	//DropdownIDProof
		Select dropdown = new Select (driver.findElement(By.xpath("//*[@id=\"post-body-5864649494765988891\"]/div[1]/form/select")));
        dropdown.selectByIndex(3);
	//CountryName
	  Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name=\"country\"]")).sendKeys("India");
      Thread.sleep(1000);
     //UploadFile
   		WebElement browse =driver. findElement(By.id("uploadfile"));
          browse.sendKeys("D:\\vivekyadav@123\\uploadfile.txt");
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//input[@name=\"female\"])[4]")).click();
        //DragAndDrop
          WebElement from = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));

          WebElement to = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
             
          Actions act = new Actions(driver);  
             
          act.dragAndDrop(from,to).build().perform();  
          
    
	  }
    
    
	}


