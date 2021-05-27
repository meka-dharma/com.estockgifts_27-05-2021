package Smoke_Test;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.estockgifts.base.base_class;

public class Login extends base_class implements com.estockgifts.base.all_xpaths{
	static WebDriver driver;

	@Test
	public static void Login_Process() throws Exception {

		// To read The Property File
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/data.properties");
		prop.load(ip);

		try {
			// Launching Browser
			launchBrowser(prop.getProperty("Browser"));
			Thread.sleep(5000);

			// passing the URL
			// sendURL(prop.getProperty("DevUrl"));
			System.out.println("Estockgifts Open Successfully");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/app-header/nav/div/div[2]/ul/li[7]/a")).getText();
			//driver.get("https://devbarfa.estockgifts.com/fe/home");
		    driver.findElement(By.linkText("Log In")).click();
		    driver.findElement(By.linkText("Login As Member")).click();
		  
			//click(LoginButton);
			System.out.println("Login page open Successfully");
			click(Login_As_Member);
			
			sendValue(Email_Address, prop.getProperty("Email"));
			System.out.println("Entered Email ID Successfully");
			
			click(Get_OTP);
			System.out.println("OTP Send Successfully");
			
			

			
			} catch (Exception e) {
			/* logger.error("Test Fail", e); */
			//onTestFailure();
			// quitBrowser();
			Assert.fail("");

		}

	}

}