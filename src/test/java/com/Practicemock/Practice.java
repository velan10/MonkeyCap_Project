package com.Practicemock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\git\\repo1\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
//		ve.addArguments("incognito");
		driver = new ChromeDriver(ve);
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=15864889326513104701&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-316976916880&hydadcr=5841_2362028&gclid=CjwKCAjwyaWZBhBGEiwACslQo9rPkt5ptjnUdoiIrbGYSJXGGLSjq1JcBNjjszrSpTD7HCQJrZQRcxoCJFIQAvD_BwE");
		System.out.println(driver.findElements(By.xpath("//div[@class='nav-progressive-content']/a")).get(0).isDisplayed());
		// List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='nav-progressive-content']/a"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("href"));
			System.out.println(" ");
		}
		
	}}
