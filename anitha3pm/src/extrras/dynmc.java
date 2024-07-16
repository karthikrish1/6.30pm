package extrras;

import org.openqa.selenium.chrome.ChromeDriver;

public class dynmc {
public static void main(String[] args) {
	/*
	 * following 
	 * preceding 
	 * 
	 * parent 
	 * child
	 * 
	 following sibling
	 preceding sibling 
	 * * */
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.mycontactform.com");
    
    //username => xpath:    login
    //ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
    
    //login : => xpath=> usernametxt box
    //ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hi");
    
    
    // child=> parent
    
  // System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[3]//parent::div").getLocation());

//parent=> dchild
    
  //  System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[1]").getText());

    
    //following-sibling
    //System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[2]").getText());

    System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::p[2]").getText());
}
}
