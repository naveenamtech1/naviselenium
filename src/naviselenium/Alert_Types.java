package naviselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert/");

		driver.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("..simple alert..");
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("..confirm alert..");
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("prompt alert");
		prompt.accept();
		System.out.println("..prompt alert..");
		
		driver.close();
	}

}
