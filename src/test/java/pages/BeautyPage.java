package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BeautyPage {
   //WebDriver driver;
   public BeautyPage(WebDriver driver)
   {
       PageFactory.initElements(driver, this);
   }
//   @FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[4]")
//   //html/body/div[2]/div[1]/div/ul/li[4]/a
//   WebElement beautydropdown;
   @FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[3]/a")
   WebElement beautydropdown;
//   @FindBy(xpath="//*[@id=\"category_filter\"]/div/ul/li[1]/div/div/label/input")
// //*[@id="category_filter"]/div/ul/li[1]/div/div/label/input
//   WebElement cat_filter;
//   @FindBy(xpath="//*[@id=\"stock_filter\"]/div/ul/li/div/div/div/label/input")
//   WebElement filter_stock;
//   @FindBy(xpath="//*[@id=\"algolia_hits\"]/div/div/ol/li[1]/div/form/button")
//   WebElement addedcart;
   
   //new
   @FindBy(xpath="//*[@id=\"algolia_filter\"]/div[15]/h2")
   WebElement scrollproduct;
  // @FindBy(xpath="//*[@id=\"category_filter\"]/div/ul/li[1]/div/div/label/input")
   
   //  WebElement cat_filter;
     @FindBy(xpath="//*[@id=\"stock_filter\"]/div/ul/li/div/div/div/label/input")
   
     WebElement filter_stock;
//   
   @FindBy(xpath = "//*[@id=\"algolia_hits\"]/div/div/ol/li[1]/div/a[1]/span[1]/img")
   //*[@id=\"algolia_hits\"]/div/div/ol/li[1]/div/a[1]/span[3]
 //*[@id="algolia_hits"]/div/div/ol/li[9]/div/a[1]/span[2]
   WebElement hair_care_product;
   @FindBy(xpath = "//*[@id=\"algolia_box\"]/div/h2")
   WebElement hair_care_product1;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[1]/h1")
   WebElement scrollcart;
   
   @FindBy(xpath="//*[@id=\"pincode\"]")
   ////*[@id="pincode"]
   WebElement pinCodechange;
   
   @FindBy(xpath="//*[@id=\"check_expiry_btn\"]/i")
   WebElement arrowBtnbeauty;
   
   @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[8]/form/div/button/span[1]")
   WebElement addToCartproduct;
   
   //new end
   
   public void clickdropdown(WebDriver driver)
   {
       Actions act=new Actions(driver);
       WebElement beautymainMenu= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]"));
       act.moveToElement(beautymainMenu).perform();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       beautydropdown.click();
   }
   public void scrollingHairProduct(WebDriver driver)
   {
         JavascriptExecutor js = (JavascriptExecutor) driver; 
         WebElement element2 = scrollproduct;
         js.executeScript("arguments[0].scrollIntoView();", element2);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }
//  
   public void check_exclude_out_of_stock(WebDriver driver)
   {
//       JavascriptExecutor js = (JavascriptExecutor) driver; 
//       WebElement element3 = filter_stock;
//       js.executeScript("arguments[0].scrollIntoView();", element3);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //element3.sendKeys(Keys.ENTER);
       //Assert.assertTrue(ExpectedConditions.titleContains("exclude out of stock").apply(driver).booleanValue());
       filter_stock.click();   



   }
  
   public void clickProduct(WebDriver driver)
   {
       JavascriptExecutor js = (JavascriptExecutor) driver; 
       WebElement element2 = hair_care_product1;
       js.executeScript("arguments[0].scrollIntoView();", element2);
       hair_care_product.click();
   }
   public void scrollingcart(WebDriver driver)
   {
         JavascriptExecutor js = (JavascriptExecutor) driver; 
         WebElement element2 = scrollcart;
         js.executeScript("arguments[0].scrollIntoView();", element2);
   }
   
   public void selectPinCode1()
   {
         WebElement web = pinCodechange;
         web.clear();
         web.sendKeys("110044");
   }
   
   public void clickArrowBtn1()
   {
       arrowBtnbeauty.click();
   }
   
   public void clickAddToCart1()
   {
       addToCartproduct.click();
   }
}
