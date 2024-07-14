package redio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_practice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver*", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    Thread.sleep(2000);
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
    dropdown.selectByVisibleText("India");
    Thread.sleep(2000);
    driver.close();
    
	}

}
	