package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
		
		//Maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> Allrows = driver.findElements(By.xpath("//table[@id='GoTProfile']/tbody/tr"));
		System.out.println("Total no of rows are "+ Allrows.size());
		
		List<WebElement> Allcols = driver.findElements(By.xpath("//table[@id='GoTProfile']/tbody/tr[1]/td"));
		System.out.println("Total no of columns are "+ Allcols.size());
		String data;
		
		//Reading the data 
		for(int i=1;i<=Allrows.size();i++)
		{
			for(int j=1;j<=Allcols.size();j++)
			{
				data=driver.findElement(By.xpath("//table[@id='GoTProfile']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Row: "+ i +" and Column: "+j+" is"+ data);
			}
		}
		

	}

}
