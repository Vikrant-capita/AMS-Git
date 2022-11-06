package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.List;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePageObject;

public class ValidateHomepageLinks {
	public WebDriver driver;
	 SoftAssert sa;
	public HomePageObject hp;
	
	@Test
	public void homepageLink() throws InterruptedException, IOException, MalformedURLException{
		
		LoginPage lp=new LoginPage();
		lp.validatelogin();
		driver = lp.driver;
		hp=new HomePageObject(driver);
		//List<WebElement> links=hp.getMainMenuLink();
		//List<WebElement> links=menudriver.findElements(By.tagName("a"));
		sa=new SoftAssert();
		
		
		
		
//		private void brokenLink() {
//			List<WebElement> links=hp.getMainMenuLink();
//		int k=0;
//		for(WebElement link:links) {
//			String key= Keys.chord(Keys.CONTROL,Keys.ENTER);
//			link.sendKeys(key);
//			k++;
//			System.out.println(k+" : "+link.getText());
//			
//		}
//		Set<String> windowhandle = driver.getWindowHandles();
//		Iterator<String> it = windowhandle.iterator();
//		while (it.hasNext()) 
//		{
//			
//			driver.switchTo().window(it.next());
//			System.out.println("Tab Title : "+driver.getTitle());
//			
//		}
//		
//		//To get Response code
//		/*	String url=link.getAttribute("href");
//		System.out.println(url);
//		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
//		//URL obj=new URL(url);
//		//HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode=conn.getResponseCode();
//		System.out.println(respCode);
//		sa.assertTrue(respCode>400,"This is broken link : "+link.getText()+" with code "+respCode);*/
//			sa.assertAll();	
//	}
	}
	

	
	

	private void brokenLink1() {
		// TODO Auto-generated method stub
		
		List<WebElement> links=hp.getMainMenuLink();
		int k=0;
		for(WebElement link:links) {
			String key= Keys.chord(Keys.CONTROL,Keys.ENTER);
			link.sendKeys(key);
			k++;
			System.out.println(k+" : "+link.getText());
			
		}
		Set<String> windowhandle = driver.getWindowHandles();
		Iterator<String> it = windowhandle.iterator();
		while (it.hasNext()) 
		{
			
			driver.switchTo().window(it.next());
			System.out.println("Tab Title : "+driver.getTitle());
			
		}
		
		//To get Response code
		/*	String url=link.getAttribute("href");
		System.out.println(url);
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		//URL obj=new URL(url);
		//HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode=conn.getResponseCode();
		System.out.println(respCode);
		sa.assertTrue(respCode>400,"This is broken link : "+link.getText()+" with code "+respCode);*/
			sa.assertAll();	
	}
	
		
		
	


	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
}
