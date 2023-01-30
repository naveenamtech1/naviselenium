package naviselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdn {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("mojo");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("jojo");
		WebElement numb = driver.findElement(By.name("reg_email__"));
		numb.sendKeys("8072422988");
		WebElement pwd = driver.findElement(By.id("password_step_input"));
		pwd.sendKeys("mojojojo123");
		WebElement day = driver.findElement(By.id("day"));
		Select d1=new Select(day);
		d1.selectByValue("11");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select d2=new Select(month);
		d2.selectByIndex(6);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select d3=new Select(year);
		d3.selectByVisibleText("1991");
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		}

}
