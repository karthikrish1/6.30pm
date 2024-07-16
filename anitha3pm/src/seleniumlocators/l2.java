package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.google.com");
    
    //linktext: word/words-> click=> new url will be opened
    //substring of linktext: partial link text
    
    // no need for inspection
    //ob.findElementByLinkText("About").click();
    
    ob.findElementByPartialLinkText("Ab").click();
}
}
