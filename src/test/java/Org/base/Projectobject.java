package Org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projectobject extends Baseclass {
	public Projectobject() {
		
	PageFactory.initElements(driver, this);
	}

@FindBy(id= "twotabsearchtextbox")
private WebElement search;

public WebElement getSearch() {
	return search;
}
public WebElement getBtnclick() {
	return Btnclick;
}
public WebElement getPhone1() {
	return phone1;
}
public WebElement getPhone2() {
	return phone2;
}
public WebElement getPhone3() {
	return phone3;
}
public WebElement getPhone4() {
	return phone4;
}
public WebElement getPhone5() {
	return phone5;
}
public WebElement getPhone6() {
	return phone6;
}
public WebElement getPhone7() {
	return phone7;
}
public WebElement getPhone8() {
	return phone8;
}
public WebElement getPhone9() {
	return phone9;
}
public WebElement getPhone10() {
	return phone10;
}
public WebElement getPrice1() {
	return price1;
}
public WebElement getPrice2() {
	return price2;
}
public WebElement getPrice3() {
	return price3;
}
public WebElement getPrice4() {
	return price4;
}
public WebElement getPrice5() {
	return price5;
}
public WebElement getPrice6() {
	return price6;
}
public WebElement getPrice7() {
	return price7;
}
public WebElement getPrice8() {
	return price8;
}
public WebElement getPrice9() {
	return price9;
}
public WebElement getPrice10() {
	return price10;
}

@FindBy(xpath= "//input[@type='submit'][1]")
private WebElement Btnclick;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][1]")
private WebElement phone1;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][2]")
private WebElement phone2;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][3]")
private WebElement phone3;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][4]")
private WebElement phone4;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][5]")
private WebElement phone5;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][6]")
private WebElement phone6;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][7]")
private WebElement phone7;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][8]")
private WebElement phone8;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][9]")
private WebElement phone9;
@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal'][10]")
private WebElement phone10;

@FindBy(xpath= "//span[@class='a-price-whole'][1]")
private WebElement price1;
@FindBy(xpath= "//span[@class='a-price-whole'][2]")
private WebElement price2;
@FindBy(xpath= "//span[@class='a-price-whole'][3]")
private WebElement price3;
@FindBy(xpath= "//span[@class='a-price-whole'][4]")
private WebElement price4;
@FindBy(xpath= "//span[@class='a-price-whole'][5]")
private WebElement price5;
@FindBy(xpath= "//span[@class='a-price-whole'][6]")
private WebElement price6;
@FindBy(xpath= "//span[@class='a-price-whole'][7]")
private WebElement price7;
@FindBy(xpath= "//span[@class='a-price-whole'][8]")
private WebElement price8;
@FindBy(xpath= "//span[@class='a-price-whole'][9]")
private WebElement price9;
@FindBy(xpath= "//span[@class='a-price-whole'][10]")
private WebElement price10;
}



