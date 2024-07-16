package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.mycontactform.com");
    
    //css: casecade style sheet
    // manual: 7 manual ways
    // shortcut
    
    //1.tagname and id     syntax: tagname#id
   // ob.findElementByCssSelector("input#user").sendKeys("hi");
    
    //2. tangme and classname    syntax: tagname.classname
    //ob.findElementByCssSelector("input.txt_log").sendKeys("hello");
    
    //3. tagname and attribute    syntax: tagname[attribute='value']
    //ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
    
    //4.tagname and prefix of attribute    syntax: tagname[attribute^='prefix value']
    //ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
    
    //5. tagname and suffix of attribute    syntax: tagname[attribute$='suffix value']
   // ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
    
    //6.tagname and substring of attribute    syntax: tagname[attribute*='substringvalue']
   // ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
    
    //7. tagname.classname and attribute    syntax: tagname.classname[attribute='value']
   // ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
    
    ob.findElementByCssSelector("#user").sendKeys("hi");
    Thread.sleep(3000);
    ob.quit();
    
}
}
