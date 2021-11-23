package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	// Define By locators first
	private By emailId=By.id("email");
	private By password=By.id("passwd");
	private By signInButton=By.id("SubmitLogin");
	private By forgotPswdLink=By.linkText("Forgot your password?");
	
	// Define constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Define public page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswdLinkExist() {
		return driver.findElement(forgotPswdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
	public AccountsPage doLogin(String un,String pw) {
		System.out.println("Login with: "+un+" and "+pw);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);
	}

}
