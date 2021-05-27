package com.estockgifts.base;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class implements all_xpaths{

	
	
public static WebDriver driver;

	

//Method to Lauch Browser 


		 public static void launchBrowser(String browser) throws IOException {		
			 try{	
				if (browser.equalsIgnoreCase("IE")) {
					
					WebDriverManager.iedriver().setup();
					InternetExplorerOptions options =new InternetExplorerOptions();
					driver = new InternetExplorerDriver(options);
					System.out.println("IE Browser Opened Sucessfully");
				} else if (browser.equalsIgnoreCase("Chrome")) {
			
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
			                options.addArguments("--headless");
			                driver = new ChromeDriver(options);
					System.out.println("Chrome Browser Opened Sucessfully");
				}
				else if(browser.equalsIgnoreCase("Firefox")){
					
					WebDriverManager.firefoxdriver().setup();
					FirefoxOptions options = new FirefoxOptions();
			                options.addArguments("--headless");
			                driver = new FirefoxDriver(options);
					System.out.println("Firefox Browser Opened Sucessfully");
				}
			 }catch(Exception e){
				 System.out.println("Failed to launch Browser.");
			 }
			 
		
		 }
	//Method to launch application URL
		public static void sendURL(String url) {
			
			driver.navigate().to(url);
			driver.manage().window().maximize();
			System.out.println("Passing URL ");
		}
		//Method to  Close  Browser 
		public static void quitBrowser(){
			try{
				driver.close();
				//driver.quit();
				System.out.println("Browser Quit Sucessfully");
				
			}catch(Exception e){
				System.out.println("Failed to Quite Browser.");
			}
			
		}
		
		//Method to perform click operation
		public static void click(String contactus){
			
				driver.findElement(By.xpath(contactus)).click();
				System.out.println("Click Operation Performed Sucessfully");
			
		}
		
		//Method to perform sending value to a Textbox
		public static void sendValue(String locator, String testdata) {

			try {			
				driver.findElement(By.xpath(locator)).clear();
				driver.findElement(By.xpath(locator)).sendKeys(testdata);
				System.out.println("Data is Passed Sucessfully to the field");
			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate and pass the data");
			System.out.println("Unable to locate and pass the data");
			}
		}
		
		public static void Payment_Type(String Payment) throws IOException {
			// To read The Property File 
			Properties prop=new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
			prop.load(ip);
			try {
				if (Payment.equalsIgnoreCase("creditcard")) {
					click(CreditCard);
					System.out.println("Credit/Debit card Selected. ");
					sendValue(Name_On_card, prop.getProperty("Name"));
					sendValue(Card_Number, prop.getProperty("Card_Num"));
					sendValue(Expiry_Date, prop.getProperty("Expiry"));
					sendValue(CVV_Number, prop.getProperty("CVV"));
					click(Terms_Conditions);
					click(Purchase);

				} else if (Payment.equalsIgnoreCase("Paypal")) {
					click(Paypal);
					System.out.println("Paypal Selected. ");
					click(Terms_Conditions);
					click(paypal_Checkout);
				} else if (Payment.equalsIgnoreCase("Estockgifts_Payment")) {
					click(Estockgifts_Payment);
					System.out.println("Estockgifts payment gateway Selected. ");
					click(Terms_Conditions);
					click(Purchase);

				}

			} catch (Exception e) {
				System.out.println("Failed to Select Payment option.");
				System.out.println("Failed to select payment option ");
			}

		}

		public static void Crypto_Type(String Cryptocard) throws IOException {
			try {
				if (Cryptocard.equalsIgnoreCase("Bitcoin")) {
					click(Bitcoin);
					System.out.println("Bitcoin Selected. ");

				} else if (Cryptocard.equalsIgnoreCase("Ethereum")) {
					click(Ethereum);
					System.out.println("Ethereum Selected. ");

				} else if (Cryptocard.equalsIgnoreCase("Ripple")) {
					click(Ripple);
					System.out.println("Ripple Selected. ");

				}
			} catch (Exception e) {
				System.out.println("Failed to Select Crypto type options.");
				System.out.println("Failed to Select Crypto type options. ");
			}

		}

		// Locating upload image
		public static void Uploadimage(String locator, String image) {

			try {
				driver.findElement(By.xpath(locator)).sendKeys(image);

			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate and pass the data");
				System.out.println("Unable to locate image and pass the data");
			}
		}
		// Method to Upload Files
				public static void Upload(String Locator, String File) throws Exception {

					try {
//						driver.findElement(By.name(Locator));
						driver.findElement(By.xpath(Locator)).click();
						Thread.sleep(10000);
						StringSelection IMGsrc = new StringSelection(File);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(IMGsrc, null);
						Robot r = new Robot();
						r.keyPress(KeyEvent.VK_CONTROL);
						r.keyPress(KeyEvent.VK_C);
						r.keyRelease(KeyEvent.VK_CONTROL);
						r.keyRelease(KeyEvent.VK_C);
						r.keyPress(KeyEvent.VK_CONTROL);
						r.keyPress(KeyEvent.VK_V);
						r.keyRelease(KeyEvent.VK_CONTROL);
						r.keyRelease(KeyEvent.VK_V);
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);			
						
					} catch (Exception e) {
						System.out.println("Unable to Upload File ");
					}

				}

		public static void Select_Dropdown(String locator, String id) throws IOException {
			try {

				driver.findElement(By.xpath(locator)).click();
				driver.findElement(By.xpath(id)).click();

			} catch (Exception exp) {
				System.out.println("cause is:" + exp.getCause());
				System.out.println("Select Expire Date Faild");
				

			}
		}


}
