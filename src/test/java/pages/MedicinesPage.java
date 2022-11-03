package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicinesPage {
   // WebDriver driver;
    public MedicinesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[1]/a")
//    ///html/body/div[2]/div[1]/div/ul/li[1]
//    ///html/body/div[2]/div[1]/div/ul/li[1]/a
    WebElement medicineDropDown;
    
    @FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[1]/ul/li[1]/a")
    ///html/body/div[2]/div[1]/div/ul/li[1]/ul/li[1]/a
    WebElement allMedicine;
    
    @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/h1")
    WebElement scroll;
    
    @FindBy(xpath="//*[@id=\"list-nav\"]/div[1]/ul/li[2]/a")
    WebElement selectAcne;

    @FindBy(xpath="//*[@id=\"list-nav-nav\"]/div/a[4]")
    WebElement selectCategory;

    @FindBy(linkText = "D Acne Soap 75gm")
    WebElement acneSoap;
    
    @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[1]/h1")
    WebElement scroll1;
    
    @FindBy(xpath="//*[@id=\"pincode\"]")
    ////*[@id="pincode"]
    WebElement pinCode;
    
    @FindBy(xpath="//*[@id=\"check_expiry_btn\"]/i")
    WebElement arrowBtn;
    
    @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[8]/form/div/button/span[1]")
    WebElement addToCart;
    
    public void clickMedicine(WebDriver driver)
    {
          Actions act = new Actions(driver);
          WebElement mainMenu = medicineDropDown;
          act.moveToElement(mainMenu).build().perform();
    }
    
    public void clickAllMedicine()
    {
        allMedicine.click();
    }
    
    public void scrolling(WebDriver driver)
    {
         JavascriptExecutor j = (JavascriptExecutor) driver; 
         WebElement element1 =scroll;
         j.executeScript("arguments[0].scrollIntoView();", element1);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    
    public void productAcne(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        selectAcne.click();
    }
    
    public void click_D_Cat()
    {
        selectCategory.click();
    }
    
    public void clickSoap()
    {
        acneSoap.click();
    }
    
    public void scrolling2(WebDriver driver)
    {
          JavascriptExecutor js = (JavascriptExecutor) driver; 
          WebElement element2 = scroll1;
          js.executeScript("arguments[0].scrollIntoView();", element2);
    }
    
    public void selectPinCode()
    {
          WebElement web = pinCode;
          web.clear();
          web.sendKeys("110044");
    }
    
    public void clickArrowBtn()
    {
        arrowBtn.click();
    }
    
    public void clickAddToCart()
    {
        addToCart.click();
    }
}

