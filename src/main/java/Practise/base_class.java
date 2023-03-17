package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--start-maximized");
	    chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://mousetester.com/");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"clickMe\"]/p"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();//Right Click Action
		Thread.sleep(3000);
		driver.quit();		
	}
}
