package com.pages;

import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	private By accountSections=By.cssSelector("div#center_column span");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public int getAccountSectionCount() {
		return driver.findElements(accountSections).size();
	}
	
	public List<String> getAccountsSectionList() {
		List<String> accountList=new ArrayList<>();
		List<WebElement> accountHeaderList = driver.findElements(accountSections);
		for(WebElement e:accountHeaderList) {
			String text = e.getText();
			accountList.add(text);
		}
		return accountList;
	}
	
	

}
