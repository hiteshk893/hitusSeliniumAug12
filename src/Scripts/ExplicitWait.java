package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("https://online.actitime.com/na2/login.do");
		driver.findElement(By.id("username")).sendKeys("riteshvivian");
		driver.findElement(By.name("pwd")).sendKeys("ka03je1659");
		driver.findElement(By.id("loginButton")).click();
		//WebElement logout=driver.findElement(By.id("logoutLink"));
		//wait.until(ExpectedConditions.visibilityOf(logout));
		String title1="actiTime - Enter Time-Track";
		wait.until(ExpectedConditions.titleContains(title1));
		//Thread.sleep(4000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
