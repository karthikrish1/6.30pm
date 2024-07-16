package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("https://www.letskodeit.com/practice");
	    
	    WebElement ele = ob.findElementById("carselect");
	    //create an object for select class
	    // pass dropdown box as input to the select object
	    // select the options => index/value/visible text
	    Select s= new Select(ele);
	    //s.selectByIndex(1);
	    //s.selectByValue("benz");
	    s.selectByVisibleText("Benz");
	    
	    
	}
}
