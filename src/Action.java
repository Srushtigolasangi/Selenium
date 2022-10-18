import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.interactions.Actions;
 

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
		a.click(e).keyDown(Keys.SHIFT).sendKeys("Ethnic wear").build().perform();
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(ele).contextClick().build().perform();
		
	}

}
