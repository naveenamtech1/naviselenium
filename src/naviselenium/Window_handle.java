package naviselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handle {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Actions at= new Actions(driver);
	Robot rt= new Robot();
	
	WebElement fe = driver.findElement(By.linkText("Mobiles"));
	at.contextClick(fe).perform();
	rt.keyPress(KeyEvent.VK_DOWN);
	rt.keyRelease(KeyEvent.VK_DOWN);
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);

	WebElement ft = driver.findElement(By.linkText("Electronics"));
	at.contextClick(ft).perform();
	rt.keyPress(KeyEvent.VK_DOWN);
	rt.keyRelease(KeyEvent.VK_DOWN);
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);

	WebElement ff = driver.findElement(By.linkText("Customer Service"));
	at.contextClick(ff).perform();
	rt.keyPress(KeyEvent.VK_DOWN);
	rt.keyRelease(KeyEvent.VK_DOWN);
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);

	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	System.out.println();
	
	for (String id : windowHandles) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);	
	}
	String mystring= "Help - Amazon Customer Service";
	for(String id:windowHandles) {
		if(driver.switchTo().window(id).equals(mystring)) {
			break;
		}
	}
		
}
}

