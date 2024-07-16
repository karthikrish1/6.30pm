package selniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {
public static void main(String[] args) throws InterruptedException {
	
	//project=> right click= > properties=> java build path=> libraries
	//             add external jar-> searc jar=> select=> apply and close
	
	
	// configuring the chrome driver 
	//create an object fir chromedriver class
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.facebook.com");
    
    ob.manage().window().maximize();
    
    ob.navigate().refresh();
    
    Thread.sleep(3000);
    
    ob.quit();
}
}
