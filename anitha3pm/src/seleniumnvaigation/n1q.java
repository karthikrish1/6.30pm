package seleniumnvaigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1q {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.google.com");//1
    
    Thread.sleep(3000);
    
    ob.findElementByLinkText("Images").click();//2
    
    Thread.sleep(3000);
    
    ob.navigate().back();//1
    
    Thread.sleep(3000);
    
    ob.navigate().forward();//2
    
}
}
