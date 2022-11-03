package StepDefinition;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage1;
import pages.LoginPage;
import pages.BeautyPage;
import pages.MedicinesPage;
import pages.Logout;

public class Test_Steps {
LoginPage loginpg;
BeautyPage beautypg;
MedicinesPage Medipg;
CartPage1 CP; 
Logout LP;
	WebDriver driver;
		@Given("User is on Netmeds homepage")
		public void user_is_on_netmeds_homepage() {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\drivers\\chromedriver.exe");
			    driver=new ChromeDriver();
				driver.get("https://www.netmeds.com/");
				driver.manage().window().maximize();
		}

		@When("user enters PhoneNUmber")
		public void user_enters_phone_n_umber() throws InterruptedException {
			loginpg=new LoginPage(driver);
			loginpg.clickSignIn();
			Thread.sleep(5000);
			loginpg.enterTel("8003886177");
			
//			driver.findElement(By.linkText("Sign in / Sign up")).click();
//		      
//		      WebElement telNumber = driver.findElement(By.id("loginfirst_mobileno"));
//		      
		      //telNumber.sendKeys("9121862790");
		      //telNumber.sendKeys("9686266442");
		      //telNumber.sendKeys("7411920347");
		      //telNumber.sendKeys("8003886177")
		}

		@When("User clicks sendOtp")
		public void user_clicks_send_otp() {
			loginpg.OtpBtn();
			
			//driver.findElement(By.xpath("//*[@id='app']/main/app-login/div[1]/div/div[1]/div[2]/div/div[1]/form/div[2]/button")).click();
			
			}

		@When("user enters Otp and clicks on Verify")
		public void user_enters_otp_and_clicks_on_verify() throws InterruptedException {
			Thread.sleep(45000);
			loginpg.VerifyBtn();
		      //driver.findElement(By.xpath("//*[@id='app']/main/app-login/div[1]/div/div/div[2]/div[1]/form/div[2]/div/button")).click();
		}

		@Then("Login is Successful if Otp is correct")
		public void login_is_successful_if_otp_is_correct() {
			 String ExpectedTitle ="Netmeds Sign In / Sign Up";
			 String actualTitle=driver.getTitle();
			 System.out.println(actualTitle);
			 Assert.assertEquals(ExpectedTitle,actualTitle);
		}
		@Then("user add Medicine to cart")
		public void user_add_medicine_to_cart() throws InterruptedException {
			Medipg=new MedicinesPage(driver);
			Thread.sleep(5000);
//			 Actions act = new Actions(driver);
//		   WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]"));
//		  act.moveToElement(mainMenu).build().perform();
			Medipg.clickMedicine(driver);
			Medipg.clickAllMedicine();
			Thread.sleep(5000);
			Medipg.scrolling(driver);
			Medipg.productAcne(driver);
			Thread.sleep(5000);
			Medipg.click_D_Cat();
			Medipg.clickSoap();
			Thread.sleep(5000);
			Medipg.scrolling2(driver);
			Medipg.selectPinCode();
			Medipg.clickArrowBtn();
			Medipg.clickAddToCart();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//			  
//			  Actions act = new Actions(driver);
//			  WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]"));
//			  act.moveToElement(mainMenu).build().perform();
//			  
//			  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]/ul/li[1]/a")).click();	
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			 
//			  
//			  JavascriptExecutor j = (JavascriptExecutor) driver; 
//			  WebElement element1 =driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/h1"));
//			  j.executeScript("arguments[0].scrollIntoView();", element1);
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			  driver.findElement(By.xpath("//*[@id=\"list-nav\"]/div[1]/ul/li[2]/a")).click();		
//			  driver.findElement(By.xpath("//*[@id=\"list-nav-nav\"]/div/a[4]")).click();	
//			  driver.findElement(By.linkText("D Acne Soap 75gm")).click();	
//			  
//			  JavascriptExecutor js = (JavascriptExecutor) driver; 
//			  WebElement element2 =driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[1]/h1"));
//			  js.executeScript("arguments[0].scrollIntoView();", element2);
//
//			  WebElement web = driver.findElement(By.xpath("//*[@id=\"pincode\"]"));
//			  web.clear();
//			  web.sendKeys("110044");
//			  driver.findElement(By.xpath("//*[@id=\"check_expiry_btn\"]/i")).click();
//			
//			 
//			 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[8]/form/div/button/span[1]")).click();
			 driver.navigate().to("https://www.netmeds.com/");
		}

		@Then("user adds beauty product to cart")
		public void user_adds_beauty_product_to_cart() throws InterruptedException {
			
			beautypg=new BeautyPage(driver);
            Thread.sleep(5000);
//             Actions act = new Actions(driver);
//           WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]"));
//          act.moveToElement(mainMenu).build().perform();
            beautypg.clickdropdown(driver);
            Thread.sleep(30000);
            //driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"] "));
            //Thread.sleep(15000);
            beautypg.scrollingHairProduct(driver);
            Thread.sleep(10000);
            // beautypg.choose_haircare();
            beautypg.check_exclude_out_of_stock(driver);
            Thread.sleep(5000);
        //    beautypg.();
            beautypg.clickProduct(driver);
            Thread.sleep(5000);
            beautypg.scrollingcart(driver);
            beautypg.selectPinCode1();
            beautypg.clickArrowBtn1();
            beautypg.clickAddToCart1();
		}
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//			  
//			  Actions act=new Actions(driver);
//		      WebElement beautymainMenu= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]"));
//		      act.moveToElement(beautymainMenu).perform();
//		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		      WebElement SubList=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[3]/a "));
//		      act.moveToElement(SubList).perform();
//		      SubList.click();
//		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		      driver.findElement(By.xpath("//*[@id=\"category_filter\"]/div/ul/li[1]/div/div/label/input")).click();
//		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		      driver.findElement(By.xpath("//*[@id=\"stock_filter\"]/div/ul/li/div/div/div/label/input")).click();
//		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		     JavascriptExecutor js=(JavascriptExecutor) driver;
//		      
//		     WebElement discount= driver.findElement(By.xpath("//*[@id=\"sort_container\"]/button[4]"));
//		      js.executeScript("arguments[0].scrollIntoView()", discount);
//		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		      WebElement filters= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div[2]/div/h2/span"));
//		      js.executeScript("arguments[0].scrollIntoView()", filters);
//		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		      driver.findElement(By.xpath("//*[@id=\"algolia_hits\"]/div/div/ol/li[1]/div/form/button")).click();
		    
		//}

		

		@When("Order is placed")
        public void order_is_placed() {
            System.out.println("Oder places SuccessFully");
        }
        @When("User is on the cart page")
        public void user_is_on_the_cart_page() throws InterruptedException {
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
              //CartPage c1=PageFactory.initElements(driver, CartPage.class);
              CP=new CartPage1(driver);
              CP.Carlinkclick();
//              Screenshot s=new AShot().takeScreenshot(driver);
//                try {
//                    ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\Administrator\\JavaWorkspace\\NetMedsProject\\target\\img3.png"));
//                }catch (IOException e) {
//                    e.printStackTrace();
//                }
//                test.pass(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Administrator\\JavaWorkspace\\NetMedsProject\\target\\img3.png").build());
//                String actualoutput = "Netmeds.com: Indian Online Pharmacy | Buy Medicines Online, Fast Delivery";
//                ExpectedOutput=driver.getTitle();
//                Assert.assertEquals(ExpectedOutput, actualoutput);
        }

        @When("User clicks on Proceed button and navigates to cartpage")
        public void user_is_navigated_to_cart_review_page() throws InterruptedException {            
          
            CP.ProceedBtnclick(driver);
            CP.GenericPlaceClick();
            //Navigating to Cartpage
            driver.navigate().to("https://www.netmeds.com/checkout/cart");
              
             
        }
        @Then("Removes Items in the cart and Logsout")
        public void Removes_Items_in_the_cart_and_Logsout() throws InterruptedException {
            
              Thread.sleep(5000);
              CP.Removebutton2Click();
              driver.navigate().refresh();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
              CP.Removebutton1Click();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));                    
              LP=new Logout(driver);
              Thread.sleep(5000);
              LP.userLogoutClick();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
              Thread.sleep(5000);
              LP.logoutClick(driver);
//              String actualoutput = "Netmeds Sign In / Sign Up";
//              ExpectedOutput=driver.getTitle();
//              Assert.assertEquals(ExpectedOutput, actualoutput);
              driver.quit();
              //report.flush();
        }




	}

