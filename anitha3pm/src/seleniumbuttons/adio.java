package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class adio {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("https://www.letskodeit.com/practice");
    
    //radio: only one button can be selected at a time
    ob.findElementById("bmwradio").click();
    Thread.sleep(3000);
    ob.findElementById("benzradio").click();
    Thread.sleep(3000);
    ob.findElementById("hondaradio").click();
    Thread.sleep(3000);
    ob.quit();
}
}
