package seleniumbris;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class rep {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	// repositioning : moving window to a point
	
	//point
	Point pt= new Point(300,400);
	driver.manage().window().setPosition(pt);
}
}
