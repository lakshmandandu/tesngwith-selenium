package package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"WebPartWPQ4\"]/div[1]/div/a[9]")).click();
		
		//Get the alert text
		String alertext = driver.switchTo().alert().getText();
		
		System.out.println("ALert text is "+ alertext);
		
		//ok button
		driver.switchTo().alert().accept();
		
		//windows
		String mainWindow = driver.getWindowHandle();
		System.out.println("Parent window handle is "+ mainWindow);
		List<String> Allwindows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("All windows size is "+ Allwindows.size());

	}

}
