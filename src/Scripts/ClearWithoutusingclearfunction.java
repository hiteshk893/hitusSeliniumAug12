package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearWithoutusingclearfunction {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("CourseCube");
		Thread.sleep(3000);
		//ele.clear();
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		ele.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		driver.close();

	}

}