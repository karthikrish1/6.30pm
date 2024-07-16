package seleniumcookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class m1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().deleteAllCookies();
		Set<Cookie> s = driver.manage().getCookies();
		System.out.println("Number of coookies "+ s.size());
		driver.quit();
	}
}
