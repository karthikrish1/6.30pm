package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("https://jqueryui.com/droppable/");
	    //weblements: inside the frame
	    // switch ur control to that frame
	    
	    // id, name, index
	    ob.switchTo().frame(0);
	    Actions ac= new Actions(ob);
	    WebElement e1 = ob.findElementById("draggable");
	    WebElement e2 = ob.findElementById("droppable");
	    ac.dragAndDrop(e1, e2).build().perform();
	}
}
