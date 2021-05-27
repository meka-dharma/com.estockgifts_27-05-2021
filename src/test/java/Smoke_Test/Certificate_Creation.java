package Smoke_Test;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.estockgifts.base.base_class;


public class Certificate_Creation extends base_class implements com.estockgifts.base.all_xpaths{
	static WebDriver driver;
	
	@Test
	public static void Certificate() throws Exception{

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
		 
		 click(Certificate_Button);
		 sendValue(Amount, prop.getProperty("Crypto_Value"));
		 System.out.println("Enter crypto value Successfully");
		 
		 sendValue(Recipient_FirstName, prop.getProperty("RecipientFName"));
		 sendValue(Recipient_LastName, prop.getProperty("RecipientLName"));
		 sendValue(Recipient_Email, prop.getProperty("RecipientEmail"));
		 sendValue(Recipient_PhoneNo, prop.getProperty("RecipientPhoneNum"));

		 
           

			 Uploadimage(Upload_Signature, prop.getProperty("Front_Image"));
			 click(Ok_Button);
			 
			 System.out.println("Signature upload Successfully");


			 sendValue(Message, prop.getProperty("Message"));
			 System.out.println("Enter text Successfully");
			 
			 sendValue(Disclaimer_Message, prop.getProperty("Message"));
			 System.out.println("Enter text Successfully");
			
			 Payment_Type(prop.getProperty("Payment_Method"));


			

		} catch (Exception e) {

				/* logger.error("Test Fail", e); */
			    //onTestFailure();
				//quitBrowser();
				Assert.fail("");

			}
		 
		 
	}

}