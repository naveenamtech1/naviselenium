package naviselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_dd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement multi = driver.findElement(By.id("superheros"));
		Select s1 = new Select(multi);
		s1.selectByValue("am");
		s1.selectByVisibleText("Batwoman");
		s1.selectByValue("ek");
		s1.selectByValue("ff");
		s1.selectByVisibleText("Green Lantern");
		s1.selectByVisibleText("Ghost Rider");

		s1.deselectByValue("ff");
		s1.deselectByVisibleText("Batwoman");

		System.out.println("getoptions");
		System.out.println();
		List<WebElement> alloption = s1.getOptions();
		for (WebElement opt : alloption) {
			System.out.println(opt.getText());
		}
		System.out.println();
		System.out.println("getallselectedoption");
		System.out.println();
		List<WebElement> geta = s1.getAllSelectedOptions();
		for (WebElement getf1 : geta) {
			System.out.println(getf1.getText());
		}
		System.out.println();
		System.out.println("getfirst");
		System.out.println();
		WebElement firstsel = s1.getFirstSelectedOption();
		System.out.println(firstsel.getText());
		s1.deselectAll();
		driver.close();
	}

}
