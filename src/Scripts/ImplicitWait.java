package Scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/na2/login.do");
		driver.findElement(By.id("username")).sendKeys("riteshvivian");
		driver.findElement(By.name("pwd")).sendKeys("ka03je1659");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(4000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
