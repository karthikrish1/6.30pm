package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class sc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("https://www.letskodeit.com/practice");
	    
	    //horizontal scroller: move alomg x, y value will be o
	    // vertical scroller: move along y axs , xvalue will be 0
	    
	    /*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(3000);
	    ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	    Thread.sleep(3000);*/
	    
	    
	    ob.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);
	    ob.executeScript("window.scrollBy(0,-500)");
	    Thread.sleep(3000);
	    ob.quit();
	}
}
