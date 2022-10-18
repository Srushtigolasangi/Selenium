import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumOps {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E:\\Screeshots.png"));
	}
}
		//Auto suggetstive dropdowns
//		1.Inspect the class for all the suggestion
//		2.put them in list
//		3.Iterate one by one using for each loop select the desired one
//		Thread.sleep(4000);
//		driver.findElement(By.cssSelector("select[id*=originStation1")).click();
		//Select originStn = new Select();
		
		
//		driver.findElement(By.xpath("//a[@value=\"IXG\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-highlight\"]")).click();
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		for(int i=1;i<=5;i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
//	}
//	


