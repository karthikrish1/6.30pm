package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
public static void main(String[] args) {
	
	/*8 locators
	 * 
	 * id
	 * name
	 * classname: not prefered
	 * 
	 * linktext
	 * partial linktext
	 * tagname
	 * xpath
	 * css
 * * 
	 * */
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.mycontactform.com");
    //id
    ob.findElementById("user").sendKeys("Dhivyakarthi123");
    
    //name
    ob.findElementByName("pass").sendKeys("12345");
    
    ob.findElementByClassName("btn_log").click();
    
    
    
}
}
