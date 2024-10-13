package HRMS.COM.PAGES;

import java.io.IOException;

import org.openqa.selenium.By;

import HRMS.COM.BASE.TestBase;
import HRMS.COM.UTIL.ReadProperty;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;

public class HrmsLoginPage extends TestBase
{
	By uname = By.xpath("//input[@name=\"username\"]");
	By pwd = By.xpath("//input[@name=\"password\"]");
	By loginbutton = By.xpath("//button[@type=\"submit\"]");
	By title = By.xpath("//title[text()='OrangeHRM']");
	
	public void enterUserName(String username)
	{
		driver.findElement(uname).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickOnLogiButton()
	{
		driver.findElement(loginbutton).click();
	}
	public void checkTitle()
	{
		boolean flag = driver.findElement(title).isEnabled();
		Assert.isTrue(flag,"The Tile is enabale");
	 
	}
	
	

}
