package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {
	static boolean status;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("It is my first program");
		
		//Provide the path of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Click on register link
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		//Select the item from dropdown
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("INDIA");
		
		//Get al the countries from the dropdown
		List<WebElement> allitems = dropdown.getOptions();
		
		//size of the list
		System.out.println("List size is "+ allitems.size());
		
		int j;
//		//List all the items
//		for(int i=0;i<allitems.size();i++)
//		{
//			j=i+1;
//			System.out.println("The item "+ j +" value is"+ allitems.get(i).getText());
//		}
		
		
		//Select first 10 values one by one
		for(int i=0;i<10;i++) {
			dropdown.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		
		
	}

}
