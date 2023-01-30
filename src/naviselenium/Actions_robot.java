package naviselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_robot {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		//actions and robot
		Actions ac= new Actions(driver);
		Robot rt= new Robot();
		//drag&drop
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dex = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dex).build().perform();
		//mouse over
		driver.navigate().to("https://www.amazon.in/");
		WebElement prim = driver.findElement(By.id("nav-link-amazonprime"));
		ac.moveToElement(prim).perform();
		//right-context click
		WebElement elec = driver.findElement(By.linkText("Electronics"));
		ac.contextClick(elec).perform();
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		
		File ds=new File("C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\screenshots\\Amazonaction.png");
			FileUtils.copyFile(sc, ds);	
			System.out.println("trial done");
	}		
		
	}


