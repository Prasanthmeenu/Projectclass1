package Org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
	
		switch(browserName) {
		
		case"Chrome":
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHAMNATH\\Desktop\\PhotonWorkspace\\Projectclass\\Drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			break;
		
		}
		return driver;	
		}
	
	public static void launchurl(String url) {
		driver.get(url);
		
	driver.manage().window().maximize();
	}
	
	
	public static void filltextbox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void selectValue(WebElement element, String value ) {
	Select s = new Select(element);
	s.selectByValue(value);
	}
	public static void btnclick(WebElement e) {
		e.click();
	}
	public static String getAttribute(WebElement e) {
		
		String sat= e.getAttribute("NH7XK3L6LZ");
		return sat;
		
	}


public static void main(String[] args) {
}

}
		
	