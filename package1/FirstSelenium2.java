package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium2 {
	static boolean status;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("It is my first program");
		
		//Provide the path of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		Thread.sleep(5000);
		
		System.out.println("my title is "+ driver.getTitle());
		
		//Verify Google text field is displaying
		status = driver.findElement(By.id("lst-ib")).isDisplayed();
		
		System.out.println(" Verify google textfield "+ status);
		
		status = driver.findElement(By.id("lst-ib")).isEnabled();
		System.out.println("Google textfiled is enabled or not "+ status);
		
		
		//Enter the data into google text field
		driver.findElement(By.id("lst-ib")).sendKeys("Venkata Krishna");
		
		//Enter key
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
		//Need to verify the entered text in that field
		Thread.sleep(3000);
		
		//Store the value
		String value=driver.findElement(By.id("lst-ib")).getAttribute("value");
		
		System.out.println("Text field value is "+ value);
		
		//Store all the links
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='rc']/h3/a"));
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("Link text is "+ l1.get(i).getText());
		}
	}

}
