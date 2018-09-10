package pak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\$ure$h\\Desktop\\vijay\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text()=\"REGISTER\"]")).click();
		driver.findElement(By.name("email")).sendKeys("vijay krishna");
		driver.findElement(By.name("password")).sendKeys("vijayeee");
		driver.findElement(By.name("confirmPassword")).sendKeys("vijayeee");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.xpath("//a[text()=\"Flights\"]")).click();
		List<WebElement>radio=driver.findElements(By.name("tripType"));
		radio.get(1).click();
		Select pascnt=new Select(driver.findElement(By.name("passCount")));
		pascnt.selectByIndex(3);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
	}

}
