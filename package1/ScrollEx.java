package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollEx {

		public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://www.jabong.com");
			
			//Maximize
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("watches");
			
			driver.findElement(By.xpath("//*[@id=\"top-search-input\"]/div[1]/span")).click();
			
			/*//Scroll down
			for(int i=0;i<=10;i++)
			{
				((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(1000);
			}
			
			//Scroll up
			for(int i=0;i<=10;i++)
			{
				((RemoteWebDriver)driver).executeScript("window.scrollBy(0,-200)", "");
				Thread.sleep(1000);
			}*/
			
			//Scroll down
			for(int i=0;i<=10;i++)
			{
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)", "");
			}
			
			
		}

}
