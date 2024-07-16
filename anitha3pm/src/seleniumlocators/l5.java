package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.mycontactform.com");
	    
	    //xpath: xml path language
	    // relative
	    //absolute xoath
	    
	    //absolute xpath:  start with /
	    // copy=> copy full xpath
	    
	   // ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
	    
	    //relative: start with //
	    // shortcut: copy-> copy xpath
	  //  ob.findElementByXPath("//*[@id=\"user\"]").sendKeys("hi");
	    
	    //relative xpath: //*[@loc/attribute='value']   or //tagname[@loc/att='value']
	    ob.findElementByXPath("//*[@id='user']").sendKeys("hi");
	    
	    ob.findElementByXPath("//*[@type='password']").sendKeys("hello");
	}

}
