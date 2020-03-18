package com.jbk.Eproc.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.alsis.TestBase.TestBase;
import com.alsis.Util.ExtentLogsReport;
import com.jbk.Eproc.Pages.LoginPage;
import com.jbk.Eproc.Pages.RegistrationPage;

public class RegistrationPageTest extends TestBase {
	

//	@Test(priority=1)
//	public void clickNewRegister(){
//	}
	
	@Test(priority=0)
	public void checkRegistrationPageTitleTest(){
		System.out.println("1r");
		LoginPage loginPage=new LoginPage(driver, test1);
		RegistrationPage registrationPage=new RegistrationPage(driver, test1);
		
		loginPage.regester();
		ExtentLogsReport.info(test1, "Checking for Tittle");
		ExtentLogsReport.IExtentResult(test1, registrationPage.validateRegistrationPageTitle(),"checkRegistrationPageTitleTest is passed", "checkRegistrationPageTitleTest is failed", "checkRegistrationPageTitleTest is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "RegistrationLogin Page tittle test completed");
		AssertJUnit.assertTrue(registrationPage.validateRegistrationPageTitle());
	}
	
	@Test(priority=0)
	public void checkRegistrationPageHeaderTest(){
		System.out.println("2r");
		LoginPage loginPage=new LoginPage(driver, test1);
		RegistrationPage registrationPage=new RegistrationPage(driver, test1);
		
		loginPage.regester();
		ExtentLogsReport.info(test1, "Checking for PageHeader");
		ExtentLogsReport.IExtentResult(test1, registrationPage.validateRegistrationPageHeader(), "checkRegistrationPageHeaderTest is passed", "checkRegistrationPageHeaderTest is filed", "checkRegistrationPageHeaderTest is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "PageHeader is completed");
		AssertJUnit.assertTrue(registrationPage.validateRegistrationPageHeader());
		}
	
	@Test(priority=0)
	public void registerPageTest(){
		System.out.println("3r");
		LoginPage loginPage=new LoginPage(driver, test1);
		RegistrationPage registrationPage=new RegistrationPage(driver, test1);
		
		loginPage.regester();
		registrationPage.enterName("kiran");
		ExtentLogsReport.info(test1, "Entered name");
		registrationPage.enterMobile("9876543210");
		ExtentLogsReport.info(test1, "Entered mobile number");
		registrationPage.enterEmail("kiran@gmail.com");
		ExtentLogsReport.info(test1, "Entered email");
		registrationPage.enterPassword("123456");
    	ExtentLogsReport.info(test1, "Entered password");
		registrationPage.clickSigninButton();
		ExtentLogsReport.pass(test1, "Submitting details successfully");
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
	}
	
//	@Test
//	public void clickAlreadyHaveAccountTest(){
//	 registrationPage.clickHaveAccount();
//	 System.out.println(driver.getTitle());
//		
//	}
	
	


}
