package HRMS.COM.BASE;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HRMS.COM.UTIL.ReadProperty;

public class TestBase 
{
	public static WebDriver driver;
	
	
	
	

	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:/Software/ChreomDriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	
	}		
	
	public static void launchUrl() throws IOException	
	{
		 File file=new File("C:/Users/HP_PC/eclipse-workspace/HRMSDemo/src/main/java/HRMS/COM/CONFIG/config.properties");
		 FileReader reader=new FileReader(file);
		 Properties prop = new Properties();
		 prop.load(reader);
		 
		 String endpoint = prop.getProperty("url");		 
		 System.out.println("The end Point is"+endpoint);		
		 driver.get(endpoint);
		
	}
	
	public static void closeBrowser()
	{				
		driver.quit();
	}

}
