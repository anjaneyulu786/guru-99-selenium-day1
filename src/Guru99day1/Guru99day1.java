package Guru99day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99day1 {

	private static final CharSequence Window = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// setting the firefox location
		System.setProperty("webdriver.gecko.driver", "F:\\work Space\\Selenium drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Enter the link
		driver.navigate().to("http://www.demo.guru99.com/V4/");
		// enter mail mngr203540
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr203540");
		Thread.sleep(1000);
		//Password yzuzyqu
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("yzuzyqu");
		Thread.sleep(1000);
		// click on login
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(4000);
		// Manger Id : mngr203540
		WebElement tableData = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
		//checking the title of the page
		String expData = "Manger Id : mngr203540";
		String actData = "";
		actData = ((tableData).getText());
		if(actData.contentEquals(expData)) {
			System.out.println("Passed the test" +"\n" + actData);
		}
		else {
			System.out.println("Failed, Expected is: " + expData);
		}
		
				} 
 
}
