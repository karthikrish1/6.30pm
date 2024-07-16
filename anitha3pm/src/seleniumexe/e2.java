package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.seleniumeasy.com");//1
	
	//alert: popup, message box
	
	//driver.executeScript("alert('time out')");
	
	driver.executeScript("window.confirm('time out')");
	
	Thread.sleep(3000);
	
	//switch our control to alert
	
	Alert al = driver.switchTo().alert();
	al.accept();
}
}
