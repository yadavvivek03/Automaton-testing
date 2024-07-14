package redio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krih\\eclipse-workspace\\Radio\\Chromepath\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/text-box/");
    List<WebElement> allButtonElements = driver.findElements(By.tagName("button"));
    if(allButtonElements.size() != 0) 
	{
		System.out.println(allButtonElements.size() + " Elements found by TagName as button \n");
					
		for(WebElement ButtonElement : allButtonElements) 
		{
			System.out.println(ButtonElement.getAttribute("placeholder"));
		 }
	}

   }

 }