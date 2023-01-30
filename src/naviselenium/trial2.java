package naviselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial2 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String curl = driver.getCurrentUrl();
	System.out.println(curl);
	String title = driver.getTitle();
	System.out.println(title);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	
	Thread.sleep(5000);
	
	driver.close();
}
}
