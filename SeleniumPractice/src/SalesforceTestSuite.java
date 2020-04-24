import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceTestSuite {

	public static void main(String[] args) 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				path+"/src/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Succesfully open the salesforce page");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("65768");
		driver.findElement(By.id("loginbutton")).click();

	}

}
