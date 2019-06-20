package guruday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guru99day1 {

	public static void main(String[] args) throws InterruptedException {
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
		// Manager id mngr203540
		//checking the title of the page
		String expTitle = "Guru99 Bank Manager HomePage";
		String actTitle = "";
		actTitle = driver.getTitle();
		if(actTitle.contentEquals(expTitle)) {
			System.out.println("Passed the test");
		}
		else {
			System.out.println("Failed");
		}
	}

}
