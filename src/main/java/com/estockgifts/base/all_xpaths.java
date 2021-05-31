package com.estockgifts.base;

public interface all_xpaths {
	
/*Login Xpath's */
   	
 String LoginButton = "//*[@id='myNavbar']/ul/li[7]/a";
 String Login_As_Member = "/html/body/div[1]/app-root/div[1]/div/app-choose-login-account/div/div/div[1]/a";
 String Email_Address = "//*[@id='email_phone']/input";
 String Get_OTP = "/html/body/div[1]/app-root/div[1]/div/app-signin/div/div/div/div/div/div/form/button";
	
/*single card creation   Xpath's */
   	
 String CustomGiftcard = "/html/body/div[1]/app-root/div[1]/app-header/nav/div/div[2]/ul/li[3]/a";  	
 String RedeemGiftcard= "/html/body/div[1]/app-root/div[1]/app-header/nav/div/div[2]/ul/li[4]/a";
 String Event = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[1]/div[1]/div/input"; 
 String Sender_FirstName = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[5]/div/div[1]/div/input";  
 String Sender_LastName = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[5]/div/div[2]/div/input";
 String Sender_Email = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[5]/div/div[4]/div/input";
 String Sender_PhoneNo = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[5]/div/div[5]/div/div/input";
 String Recipient_FirstName = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[6]/div/div[1]/div/input";
 String Recipient_LastName = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[6]/div/div[2]/div/input";
 String Recipient_Email = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[6]/div/div[4]/div/input";
 String Recipient_PhoneNo = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[6]/div/div[5]/div/div/input";

 String Front_Image = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[7]/div[1]/label";
 String Back_Image = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[8]/div[1]/label";
 String Redeem_Image = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[9]/div[1]/label";
 String front_OK = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[4]/div[3]/button";
 String back_OK = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[6]/div[3]/button";
 String redeem_Ok = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[7]/div[3]/button";
 String Ok_Button = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[4]/div[3]/button";
 String Message = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/div[1]/div/textarea";
 
 String Amount = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[5]/div/div[2]/input";
 String Expire = "//*[@id='expiry']";
 
 String CreditCard = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[14]/ul/li[1]/div/label";
 String Name_On_card = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[15]/div[1]/input";
 String Card_Number = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[15]/div[2]/input";
 String Expiry_Date = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[15]/div[3]/div[1]/div/input";
 String CVV_Number = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[15]/div[3]/div[2]/div/input"; 
 String Terms_Conditions = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[17]/div";
 String Purchase = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[18]/button"; 
 String Paypal = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[14]/ul/li[2]/div/label";
 String paypal_Checkout = "//*[@id='paypal-animation-content']/div[1]/div[1]";
 String Estockgifts_Payment = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[14]/ul/li[1]";
 
 String Add_Crypto = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[2]/label/span";
 String Bitcoin = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[3]/div/ul/li[1]/div/img";
 String Ethereum = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[3]/div/ul/li[2]/div/img";
 String Ripple = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[3]/div/ul/li[3]/div/img";
 
 
//Bulk card Xpath's
 
 String BulkCard_Button = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[1]/ul/li[2]/div/label/span";
 String Business_Name = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[4]/div/div/div[1]/div[1]/input";
 String First_Image = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[5]/div[1]/label";
 String Second_Image = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[6]/div[1]/label";
 String Redeem = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[6]/div[1]/label0";
 String Number_Of_Cards = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/input";
 
//Marketing Flyers Xpath's
 
 String Marketing_Flyer_Button = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[1]/ul/li[3]/div/label/span";
 String Giftcard_Message = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/div[4]/div/textarea";
 String Address = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/div[6]/div/div[1]";
 String Eamil = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/div[6]/div/div[2]/div/input";
 String Phone_Number = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/div[6]/div/div[3]/div/input"; 
 
//Certicate Xpath's
 
 String Certificate_Button = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[1]/ul/li[4]/div/label/span";
 String Bitcoin_Certificate = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[1]/div[1]/div/div/ul/li[1]/div/img";
 String Ethereum_Certificate = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[1]/div[1]/div/div/ul/li[2]/div/img";
 String Ripple_Certificate = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[1]/div[1]/div/div/ul/li[3]/div/img";  
 String Enter_Amount = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[1]/div[2]/div[1]/div/div[2]/input";
 String Upload_Signature = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[7]/div[1]/label";
 String Disclaimer_Message = "/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/div[3]/div/div/input";
 
 
 
 
 
   	}
