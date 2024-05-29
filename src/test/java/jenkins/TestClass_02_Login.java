package jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass_02_Login {
	WebDriver driver;
	By myAccountPage = By.xpath("//div[@class='footer']//a[text()='My Account']");
	By emailTextbox = By.xpath("//input[@id='email']");
	By passwordTextbox = By.xpath("//input[@id='pass']");
	By loginButton = By.xpath("//button[@id='send2']");
		
	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void runForEachTest() {
		driver.get("http://live.techpanda.org/index.php/");
		driver.findElement(myAccountPage).click();
		driver.findElement(loginButton).click();
	}
	
	@Test
	public void TC_001_LoginWithEmailAndPassEmpty() {
		String emailErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(emailErrorMessage, "This is a required field.");
		
		String passwordErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(passwordErrorMessage, "This is a required field.");
	}
	
	@Test
	public void TC_002_LoginWithEmailAndPassEmpty() {
		String emailErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(emailErrorMessage, "This is a required field.");
		
		String passwordErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(passwordErrorMessage, "This is a required field.");
	}
	
	@Test
	public void TC_003_LoginWithEmailAndPassEmpty() {
		String emailErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(emailErrorMessage, "This is a required field.");
		
		String passwordErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(passwordErrorMessage, "This is a required field.");
	}
	
	@Test
	public void TC_004_LoginWithEmailAndPassEmpty() {
		String emailErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(emailErrorMessage, "This is a required field.");
		
		String passwordErrorMessage = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(passwordErrorMessage, "This is a required field.");
	}
	
	@AfterClass (alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}
	
}
