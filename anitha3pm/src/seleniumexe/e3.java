package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");//1
		
		//100-> nrml
		// less than 100- zoom out
		// more than 100- zoom in
		
		driver.executeScript("document.body.style.zoom='200%'");// zoom in
		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='100%'");// nrml
		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='20%'");//zoom out
		Thread.sleep(3000);
	}

}
