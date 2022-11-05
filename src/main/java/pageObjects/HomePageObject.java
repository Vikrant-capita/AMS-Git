package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	public WebDriver driver;
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	//Left side of Homepage
	By capitaAMS= By.xpath("//div[@id='logo']//a");
	By mydetails= By.xpath("//a[@id='TreeMenu1_MenuTreeViewt0']");
	By myLeaves= By.xpath("//a[@id='TreeMenu1_MenuTreeViewt4']");
	By userManual= By.xpath("//a[@id='TreeMenu1_MenuTreeViewt9']");
	By giftOfLeave= By.xpath("//a[@id='TreeMenu1_MenuTreeViewt12']");
	
	//Righ-Top of Homepage
	
	By sessionExpiryTime= By.xpath("//table/tbody/tr/td[1]/span[@id='lblSessionTime']");  
	By loggedUserName =By.xpath("//table/tbody/tr/td[2]/span[@id='search_text']");			
	By scheduleTime=By.xpath("//span[@id='ContentPlaceHolderTitle_Lbltopmsg1']");
	
	
	//All Link
	By allLink=By.tagName("a");
	
	//left side links
	By mainMenuLink =By.xpath("//div[@id='TreeMenu1_MenuTreeView']//td//a[@class='TreeMenu1_MenuTreeView_0 groovybutton TreeMenu1_MenuTreeView_1']");
	
	By activeAttendance=By.xpath("//table[@id='ContentPlaceHolderBody_UserStatus1_TStatus_CurrentPayroll_GridViewMyStatus']/tbody/tr/td[4]");
			
	public String getCapitaAMS() {
		String capitaAMSText=driver.findElement(capitaAMS).getText();
		return capitaAMSText;
	}
	
	public String getmyDetails() {
		String mydetailsText=driver.findElement(mydetails).getText();
		return mydetailsText;
	}
	
	public String getmyLeaves() {
		String myLeavesText=driver.findElement(myLeaves).getText();
		return myLeavesText;
	}
	
	public String getUserManual() {
		String userManualText=driver.findElement(userManual).getText();
		return userManualText;
	}
	
	public String getGiftOfLeave() {
		String giftOfText=driver.findElement(giftOfLeave).getText();
		return giftOfText;
	}
	
	public List<WebElement> getAllLink() {
		List<WebElement> links=driver.findElements(allLink);
		return links;
	}
	
	public List<WebElement> getMainMenuLink() {
		List<WebElement> menudriver=driver.findElements(mainMenuLink);
		return menudriver;
	}
	
	public List<WebElement> getActiveAttendance() {
		List<WebElement> activeAttendancedriver=driver.findElements(activeAttendance);
		return activeAttendancedriver;
	}
}
