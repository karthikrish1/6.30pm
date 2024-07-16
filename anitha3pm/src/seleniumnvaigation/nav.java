package seleniumnvaigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.get("http:\\www.google.com");
    driver.manage().window().maximize();
    
   //open seleniumeasy.com in new tab   
 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
 
 

 //step2: fetching the controls
 // getting control of first tab:    parent
 // getting control of tabs     : s1={google.com, seleniueasy.com}
 
 String parent=driver.getWindowHandle();// control will be in the parent window //google
 // collecting all the handle
  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
 
  
  
  
  //step3: itearte through the set
  //hasnext
  // next
 
  Iterator<String> I1 = s1.iterator();  // hasNext , next()

  // hasnext=> whether content is there
  // next -> read the content 
  
 
 while(I1.hasNext())// whether any content is there 
    {
      String child_window=I1.next();
      if(!parent.equals(child_window))// picking the seleniumeasy.com
    	  { // control is moved to child window 
        driver.switchTo().window(child_window);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElementByLinkText("Maven").click();
        Thread.sleep(4000);
        driver.close();
      } 
       
     /*parent=google
      *s1={google.com, seleniumeasy.com}
      *
      *first iteration: I1 points to first element in set
      * I1,hasnext=> havng content
      *        I1.next reads google.com and store in child_window
      *        cchild_window=google.com
      *        if(pare!=child_windw
      *          google!=google
      *          
      *second iteration: I1 points to second element in set
      *I1.hasnext=> having content
      *     I1. next reads seleniumeasy.com and store in child_Window
      *     child_Window=seleniumeasy.com
      *     parent!=child_window
      *     google!=seleniumeasy.com
      *     
      *         switching control to child_window
      *          moving cursor to seleniumeasy.co
      *          fetching the title
      *          4 seconds
      *          Maven 
      *          4 seconds
      *          close ; seleniumeasy.com will be closed
      *          
      * Third iteration: 
      * loop terminates
      * 
      * */
    //switching control back to google
      // title
      // 5 seconds
      // Images
      // 5 seconds
      // close 
      
  }

    driver.switchTo().window(parent);//google 
    System.out.println(driver.getTitle());// google
  
    Thread.sleep(5000);
    driver.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    driver.quit();
}
}



 





