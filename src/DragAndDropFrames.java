import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//		Actions action= new Actions(driver);
//		WebElement source= driver.findElement(By.id("draggable"));
//		WebElement target= driver.findElement(By.id("droppable"));
//		Thread.sleep(5000);
//		Actions action= new Actions(driver);
//		action.dragAndDrop(source, target);
	}

}
