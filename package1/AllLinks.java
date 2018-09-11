package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		//Provide the path of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//List<WebElement> Alllinks = driver.findElements(By.tagName("a"));

		List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("Total no of links "+ Alllinks.size());
		
		for(int i=0;i<Alllinks.size();i++)
		{
			System.out.println("Link text is "+ Alllinks.get(i).getText());
		}
	}

}
