package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class dps {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("https://jqueryui.com/datepicker/");
    //weblements: inside the frame
    // switch ur control to that frame
    
    // id, name, index
    ob.switchTo().frame(0);
    
    //date box
    
    ob.findElementById("datepicker").click();
    
    for(int i=0;i<3;i++)
    {
    	ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
    }
    
    ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a").click();
}
}
