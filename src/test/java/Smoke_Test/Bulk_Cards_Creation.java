package Smoke_Test;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.estockgifts.base.all_xpaths;
import com.estockgifts.base.base_class;



public class Bulk_Cards_Creation extends base_class implements all_xpaths{
	static WebDriver driver;
	
	@Test
	public static void Bulk_Cards() throws Exception{

		// To read The Property File 
				Properties prop=new Properties();
				FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
				prop.load(ip);
	
		 try{		
		 // Launching Browser	
	     launchBrowser(prop.getProperty("Browser"));	
		 Thread.sleep(5000);

	     // passing the URL
	      sendURL(prop.getProperty("DevUrl"));
		 System.out.println("Estockgifts Open Successfully");
		 Thread.sleep(5000);
		 
		     click(BulkCard_Button);
			 sendValue(Event, prop.getProperty("EventName"));
			 System.out.println("Enter event name Successfully");
             sendValue(Business_Name, prop.getProperty("BusinessName"));
			 System.out.println("Enter Business name Successfully");

			 Uploadimage(First_Image, prop.getProperty("Front_Image"));
			 click(Ok_Button);
			 Uploadimage(Second_Image, prop.getProperty("Back_Image"));
			 click(Ok_Button);
             Uploadimage(Redeem, prop.getProperty("Redeem_Image"));
			 click(Ok_Button);
			 System.out.println("Images upload Successfully");


			 sendValue(Message, prop.getProperty("Message"));
			 System.out.println("Enter text Successfully");

			 sendValue(Amount, prop.getProperty("Crypto_Value"));
			 System.out.println("Enter crypto value Successfully");
			 sendValue(Number_Of_Cards, prop.getProperty("Num_Cards"));
			 
			 Payment_Type(prop.getProperty("Payment_Method"));


			

		} catch (Exception e) {

				/* logger.error("Test Fail", e); */
			   // onTestFailure();
				//quitBrowser();
				Assert.fail("");

			}
		 
		 
	}

}