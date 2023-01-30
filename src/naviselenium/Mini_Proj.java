package naviselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Proj {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("naveenamtech1");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Veenasingle@123");
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		
		Thread.sleep(3000);
		
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByVisibleText("New York");
		
		WebElement htl = driver.findElement(By.id("hotels"));
		Select s2 = new Select(htl);
		s2.selectByVisibleText("Hotel Cornice");
		
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s3 = new Select(roomtype);
		s3.selectByValue("Double");
		
		
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(roomnos);
		s4.selectByIndex(2);
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys("31/12/2022");
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("01/12/2023");
		
		WebElement adc = driver.findElement(By.id("adult_room"));
		Select s7 = new Select(adc);
		s7.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s8 = new Select(child);
		s8.selectByValue("1");
		
		WebElement sub = driver.findElement(By.id("Submit"));
		sub.click();
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click();
		
		WebElement ce = driver.findElement(By.id("continue"));
		ce.click();
		
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("naveena");
	
		WebElement ft = driver.findElement(By.id("last_name"));
		ft.sendKeys("mathiv");
		
		
		WebElement ad = driver.findElement(By.id("address"));
		ad.sendKeys("4/30A,mayiladuthurai");
		
		WebElement cd = driver.findElement(By.id("cc_num"));
		cd.sendKeys("4329 3879 3787 3678");
		
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select s9 = new Select(cc);
		s9.selectByValue("VISA");
		
		WebElement cm = driver.findElement(By.id("cc_exp_month"));
		Select s11 = new Select(cm);
		s11.selectByValue("6");
		
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		Select s12 = new Select(yr);
		s12.selectByValue("2022");
		
		WebElement cv = driver.findElement(By.id("cc_cvv"));
		cv.sendKeys("351");
		
		WebElement yn = driver.findElement(By.id("book_now"));
		yn.click();
		Thread.sleep(3000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File ds=new File("C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\screenshots\\Adact.png");
			FileUtils.copyFile(src, ds);	
		//WebElement wn = driver.findElement(By.id("my_itinerary"));
		//wn.click();
	    driver.close();
	}
}
