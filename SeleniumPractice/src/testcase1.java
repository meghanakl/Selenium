import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MeghanaRao\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.facebook.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("65768");
		
	}

}
