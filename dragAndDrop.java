package redio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	WebElement from = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement to = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	Thread.sleep(2000);
	WebElement from1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement to1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	Actions act = new Actions(driver);
	act.dragAndDrop(from,to).build().perform();
	act.dragAndDrop(from1, to1).build().perform();
	
	}

}
