package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.facebook.com");
    
    //title
    System.out.println(ob.getTitle());
    
    //url
    System.out.println(ob.getCurrentUrl());
    
    //size: height and width // dimension
    System.out.println(ob.manage().window().getSize());
    
    //position: x and y //point
    System.out.println(ob.manage().window().getPosition());
    
    //gettung browser details
    System.out.println(ob.getCapabilities());
}
}
