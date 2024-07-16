package seleniumbris;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class res {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	//size: dimension
	//create an object for dimension class
	// pass desired height and width in it
	/// apply it on 
	
	Dimension d= new Dimension(300,400);
	driver.manage().window().setSize(d);
}
}
