package Scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		driver.findElement(By.id("username")).sendKeys("riteshvivian");
		driver.findElement(By.name("pwd")).sendKeys("ka03je1659");
		driver.findElement(By.id("loginButton")).click();
		/*Wait wait=new FluentWait(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(Exception.class);
		String title1="actiTime - Enter Time-Track";
		wait.until(ExpectedConditions.titleContains(title1));
		String title = driver.getTitle();
		System.out.println(title);*/
		driver.close();
				
	}

}

