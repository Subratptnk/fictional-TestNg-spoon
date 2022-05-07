package gloabalproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// by this code- Data.properties is get connected with this java code
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("D:\\Subrat2022\\SELENIUM\\workspace-selenium\\TestNg_Framework\\src\\gloabalproperties\\data.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos =new FileOutputStream("D:\\Subrat2022\\SELENIUM\\workspace-selenium\\TestNg_Framework\\src\\gloabalproperties\\data.properties");
		prop.store(fos, null);
		
	}

}
