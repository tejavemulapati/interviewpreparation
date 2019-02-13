/**
 * 
 */
package basic.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author etejvem
 *
 */
public class AlertClassDemo {

	//WebDriver driver;
	/**
	 * @param args
	 * @throws  
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\etejvem\\Documents\\browser-drivers\\IEDriverServer.exe");
		//System.setProperty("webdriver.firefox.driver", "C:\\Users\\etejvem\\Documents\\browser-drivers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\etejvem\\Documents\\browser-drivers\\chromedriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		/*
		WebElement customer = driver.findElement(By.name("cusid"));
		customer.sendKeys("22334");
		driver.findElement(By.name("submit")).click();
		
		//capturing alert
		Alert alert = driver.switchTo().alert();

		//To read alert message
		String alertmessage=alert.getText();
		
		//Display alert message
		System.out.println("alertmessage");
		Thread.sleep(5000);
		
		//accept alert
		alert.accept();
		
		driver.close();
		
		Actions action = new Actions(driver);
		
		*/
		
		boolean text;
		try {
			text = driver.findElement(By.name("submit")).isDisplayed();
		}
		catch (NoSuchElementException e){
			text = false;
		}
        
		System.out.println("text");
		
		

	}

}
