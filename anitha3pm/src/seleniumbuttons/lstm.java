package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lstm {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("https://www.letskodeit.com/practice");
    
    WebElement ele = ob.findElementById("multiple-select-example");
    //create an object for select class
    // pass list box as input to the select object
    // select the options => index/value/visible text
    Select s= new Select(ele);
    s.selectByIndex(0);
    s.selectByValue("orange");
    s.selectByVisibleText("Peach");
    Thread.sleep(3000);
    s.deselectByIndex(1);
}
}
