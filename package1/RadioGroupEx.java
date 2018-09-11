package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioGroupEx {

	public static void main(String[] args) throws InterruptedException {
		
		//Provide the path of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Click on register link
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		//Enter the username
		driver.findElement(By.name("email")).sendKeys("krishna");
		
		//Enter the password
		driver.findElement(By.name("password")).sendKeys("krishna");
		
		//Enter confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("krishna");
		
		//click on submit button
		driver.findElement(By.name("register")).click();
		
		//CLick on the flights
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		
		//Store all the radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='tripType']"));

		radios.get(1).click();
		
	}

}
