package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Functions1 {
	
WebDriver driver;
	
	public Functions1(WebDriver driver){
		this.driver= driver;
	}
	
	By AddCustomer= By.xpath("//button[@ng-class='btnClass1']");
	
	public WebDriver AddCustomer(WebDriver driver) {
		return (WebDriver) driver.findElement(AddCustomer);
		
	
	}
	
	By OpenAccount= By.xpath("//button[@ng-class='btnClass2']");
	
	public WebDriver OpenAccount(WebDriver driver) {
		return (WebDriver) driver.findElement(OpenAccount);
		
	
	}
	
	By Customers= By.xpath("//button[@ng-class='btnClass3']");
	
	public WebDriver Customers(WebDriver driver) {
		return (WebDriver) driver.findElement(Customers);
		
	
	}


}
