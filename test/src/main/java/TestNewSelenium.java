package main.java;

import java.io.File;
import java.net.ServerSocket;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

public class TestNewSelenium {
	public  Boolean PlayBack() throws Exception {

		System.setProperty("webdriver.firefox.bin", "/home/wu/Downloads/firefox/firefox");
	//	String env = System.getProperty("webdriver.firefox.bin");
	//	System.out.println(env);
	//	System.setProperty("webdriver.gecko.driver","/home/wu/Downloads/geckodriver");
		String url = "http://localhost:4444/wd/hub";
		DesiredCapabilities desigiredCapabilities = DesiredCapabilities.firefox();
		RemoteControlConfiguration rcc = new RemoteControlConfiguration();
		rcc.setPort(RemoteControlConfiguration.DEFAULT_PORT);
		SeleniumServer server = new SeleniumServer(false, rcc);
		server.start();
	    RemoteWebDriver driver = new RemoteWebDriver(new URL(url),desigiredCapabilities);
		driver.get("https://www.baidu.com");
		System.out.println("Application title is ============="+driver.getTitle());
		driver.quit();
		server.stop();
		server = null;
		return true;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
			ServerSocket serverSocket = new ServerSocket(RemoteControlConfiguration.DEFAULT_PORT);
			serverSocket.close();
	
			System.setProperty("webdriver.firefox.bin", "/home/wu/Downloads/firefox/firefox");
		//	String env = System.getProperty("webdriver.firefox.bin");
		//	System.out.println(env);
		//	System.setProperty("webdriver.gecko.driver","/home/wu/Downloads/geckodriver");
			String url = "http://localhost:4444/wd/hub";
			DesiredCapabilities desigiredCapabilities = DesiredCapabilities.firefox();
			RemoteControlConfiguration rcc = new RemoteControlConfiguration();
			rcc.setPort(RemoteControlConfiguration.DEFAULT_PORT);
			SeleniumServer server = new SeleniumServer(false, rcc);
			server.start();
		    RemoteWebDriver driver = new RemoteWebDriver(new URL(url),desigiredCapabilities);
			driver.get("https://www.baidu.com");
			System.out.println("Application title is ============="+driver.getTitle());
			driver.quit();
			server.stop();
			server = null;
			
		
		
	}

}
