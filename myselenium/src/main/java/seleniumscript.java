
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\seleneium webdriver\\chromedriver-win64\\chromedriver.exe");
ChromeOptions cop = new ChromeOptions();
cop.setBinary("C:\\Users\\shree\\Desktop\\AI -2\\chrome-win64\\chrome.exe");
WebDriver driver = new ChromeDriver(cop);
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/");

 WebElement username = driver.findElement(By.id("user-name"));
 username.isDisplayed();
 username.isEnabled();
 username.sendKeys("standard_use");
 
 WebElement password = driver.findElement(By.id("password"));
 password.isDisplayed();
 password.isEnabled();
 password.sendKeys("secret_sauce");
 
 
 WebElement loginButton = driver.findElement(By.id("login-button"));
 loginButton.isDisplayed();
 loginButton.isEnabled();
 loginButton.click();
 
 
 
 
 

	}

}
