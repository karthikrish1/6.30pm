package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.google.com");
	    
	    // number of images, elements with div , input
	    
	   List<WebElement> l1 = ob.findElementsByTagName("img");
	   System.out.println("Numbe f images "+ l1.size());
	   
	   List<WebElement> l2 = ob.findElementsByTagName("a");
	   System.out.println("Numbe f links "+ l2.size());
	   
	   List<WebElement> l3 = ob.findElementsByTagName("input");
	   System.out.println("Numbe f elemnts with input "+ l3.size());
	   
	   List<WebElement> l4 = ob.findElementsByTagName("div");
	   System.out.println("Numbe f elements with div tag "+ l4.size());
	   ob.quit();
	}

}
