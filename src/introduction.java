import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String password=getPassword( driver);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("srushti");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("srushti");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	String password1=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String[]parray1=password1.split("'");
	//0th index= Please use temporary password
	//1st index= rahulshettyacademy' to Login
	String password=parray1[1].split("'")[0];
	//0th index =rahulshettyacademy
	// 1st index= to Login
	driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
	 return password;
	}

}
