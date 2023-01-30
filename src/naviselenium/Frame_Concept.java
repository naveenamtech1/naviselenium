package naviselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		 driver.switchTo().frame("firstFr");
		 driver.findElement(By.name("fname")).sendKeys("Naveena");
		 driver.findElement(By.name("lname")).sendKeys("mathiv");
		 
		 WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		 driver.switchTo().frame(innerframe);
		 driver.findElement(By.name("email")).sendKeys("naveenam@gmail.com");
		 driver.switchTo().defaultContent();
		 driver.close();
	}
}
