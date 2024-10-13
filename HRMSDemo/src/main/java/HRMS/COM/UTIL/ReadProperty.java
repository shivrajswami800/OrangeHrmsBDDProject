package HRMS.COM.UTIL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty 
{
	//public static String endpoint;
	public static String browser;
	
	public void readProperty() throws IOException
	{

	 File file=new File("C:/Users/HP_PC/eclipse-workspace/HRMSDemo/src/main/java/HRMS/COM/CONFIG/config.properties");
	 FileReader reader=new FileReader(file);
	 Properties prop = new Properties();
	 prop.load(reader);
	 
	 String endpoint = prop.getProperty("url");
	 
	 System.out.println("The end Point is"+endpoint);
	
	} 
	
	
}
