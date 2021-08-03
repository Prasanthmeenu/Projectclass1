package Org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Loginpage extends Baseclass {
@BeforeClass
		private void beforeclass() { 
		browserLaunch("Chrome");
		launchurl("https://www.amazon.in/");
		}
@Test
		private void Test() { 
		Projectobject p= new Projectobject();
		filltextbox(p.getSearch(), "iphone 12 pro");
		p.getBtnclick().click();
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement q: element) {
			System.out.println(q.getText());
		 }
		List<WebElement> element1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement q: element1) {
		String text =q.getText();
		int parseint =	 Integer.parseInt(text.replaceAll(",", ""));
		System.out.println(parseint);
		}}}














//driver.get("https://www.amazon.in/");
//Search.sendKeys("iphone 12 pro");
//WebElement Btnclick = driver.findElement(By.id("nav-search-submit-button"));
//Btnclick.click();

