package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {


public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			//Maximize
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			
			Thread.sleep(5000);
			
			Actions a=new Actions(driver);
			
			//Move to Electronics --> DSLR --> Click
			WebElement elec = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
			WebElement dslr = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[4]/ul/li[10]/a"));
			
			a.moveToElement(elec).pause(2000).moveToElement(dslr).pause(2000).click().build().perform();
			
			
			
			
			
			
			
	}

}
