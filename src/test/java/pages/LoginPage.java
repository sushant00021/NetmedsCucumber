package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Sign in / Sign up")
	WebElement Signup;
	
	@FindBy(id="loginfirst_mobileno")
	WebElement telNumber;
	
	@FindBy(xpath="//*[@id='app']/main/app-login/div[1]/div/div[1]/div[2]/div/div[1]/form/div[2]/button")
	WebElement SendOtpBtn;
	
	@FindBy(xpath="//*[@id='app']/main/app-login/div[1]/div/div/div[2]/div[1]/form/div[2]/div/button")
	WebElement VerifyBtn;
	public void clickSignIn() {
		Signup.click();
	}
	public void enterTel(String tel) {
		telNumber.sendKeys(tel);
	}
	public void OtpBtn() {
		SendOtpBtn.click();
	}
	public void VerifyBtn() {
		VerifyBtn.click();
	}
}
