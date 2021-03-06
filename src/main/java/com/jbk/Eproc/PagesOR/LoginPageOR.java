package com.jbk.Eproc.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.alsis.PageBase.PageBase;
import com.aventstack.extentreports.ExtentTest;

public class LoginPageOR extends PageBase {
	
	public LoginPageOR(WebDriver driver, ExtentTest test) {
		super(driver,test);
	}

		// Object repository of login page(Page Factory)
		@FindBy(id = "email")
		public WebElement email;

		// Another way to find element
		// @FindBy(how=How.ID, using="email")
		// WebElement email1;

		@FindBy(id = "password")
		public WebElement password;

		@FindBy(xpath = "//button[@type='submit']")
		public WebElement submit;

		@FindBy(xpath = "//div[@class='login-logo']//child::b")
		public WebElement loginLogo;

		@FindBy(xpath = "//div[@class='login-logo']//child::h4")
		public WebElement tagLine;

		@FindBy(xpath = "//p[@class='login-box-msg']")
		public WebElement loginBoxMsg;

		@FindBy(xpath = "//img[@src='pages/images/jbk.png']")
		public WebElement logoImg;

		@FindBy(xpath = "//a[@href='pages/examples/register.html']")
		public WebElement regesterPagelink;
		
		@FindBy(xpath="//div[@id='email_error']")
		public WebElement emailError;
		


}
