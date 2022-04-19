package fileUpload;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Method3 {
	WebDriver driver;
	String url = "http://automationpractice.com/index.php?controller=contact";
	WebDriverWait wait;	
	
	@Test
	public void usingAutoIT() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(url);
		WebElement fileLink = driver.findElement(By.xpath("//input[@id='fileUpload']"));
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(fileLink).click().perform();
		Runtime.getRuntime().exec("C:\\Users\\AutoITScripts\\File.exe");
	}

}


	
