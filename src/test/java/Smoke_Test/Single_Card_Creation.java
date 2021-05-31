package Smoke_Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.estockgifts.base.base_class;

import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Single_Card_Creation extends base_class implements com.estockgifts.base.all_xpaths{
	static WebDriver driver;

	@Test
	public static void Single_Card() throws Exception {

		// To read The Property File
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/data.properties");
		prop.load(ip);

		try {
			// Launching Browser
			launchBrowser(prop.getProperty("Browser"));

			// passing the URL
			 sendURL(prop.getProperty("QAUrl"));
			System.out.println("Estockgifts Open Successfully");
			
			Thread.sleep(5000);
			
			// clcking on Create giftcard
		/*	WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CustomGiftcard)));
			click(CustomGiftcard);
		*/
			//driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/app-header/nav/div/div[2]/ul/li[3]/a")).click();
			
			//click(RedeemGiftcard);
			click(RedeemGiftcard);
			
			Thread.sleep(5000);

			
			click(CustomGiftcard);
			
			Thread.sleep(15000);
			
			/*
			// Passing event name
			 WebDriverWait wait1 = new WebDriverWait(driver,30);
			 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Event)));
			 sendValue(Event, prop.getProperty("EventName"));
			*/
			
			

			sendValue(Event, prop.getProperty("EventName"));
			System.out.println("Enter event name Successfully");
			
			sendValue(Sender_FirstName, prop.getProperty("SenderFName"));
			sendValue(Sender_LastName, prop.getProperty("SenderLName"));
			sendValue(Sender_Email, prop.getProperty("SenderEmail"));
			sendValue(Sender_PhoneNo, prop.getProperty("SenderPhoneNum"));

			sendValue(Recipient_FirstName, prop.getProperty("RecipientFName"));
			sendValue(Recipient_LastName, prop.getProperty("RecipientLName"));
			sendValue(Recipient_Email, prop.getProperty("RecipientEmail"));
			sendValue(Recipient_PhoneNo, prop.getProperty("RecipientPhoneNum"));
			
//                      driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
// 			WebElement img= driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[7]/div[1]/label"));
//           		img.click();
// 			Thread.sleep(5000);
// 			img.sendKeys(System.getProperty("user.dir") + "/src/main/images/flower.jpg");
// 			click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[4]/div[3]/button")			

// 			Uploadimage(Front_Image, prop.getProperty("Front_Image"));
// 			click(Ok_Button);
// 			Thread.sleep(5000);
// 			Uploadimage(Back_Image, prop.getProperty("Back_Image"));
// 			click(Ok_Button);
// 			Thread.sleep(5000);
// 			Uploadimage(Redeem_Image, prop.getProperty("Redeem_Image"));
// 			click(Ok_Button);
// 			//String abc = System.getProperty("user.dir")+"/images/frontimage.jpeg";
// // 			Upload(Front_Image,prop.getProperty("Front_Image1"));
// // 			click(front_OK);
// // 			System.out.println("Images upload Successfully");
			
			Thread.sleep(5000);
			sendValue(Message, prop.getProperty("Message"));
			System.out.println("Enter text Successfully");

			sendValue(Amount, prop.getProperty("Crypto_Value"));
			System.out.println("Enter crypto value Successfully");

			Payment_Type(prop.getProperty("Payment_Method"));
			System.out.println("Gift Card created Successfully...");
			

		} catch (Exception e) {
			/* logger.error("Test Fail", e); */
			//onTestFailure();
			// quitBrowser();
			Assert.fail("");

		}

	}

}
