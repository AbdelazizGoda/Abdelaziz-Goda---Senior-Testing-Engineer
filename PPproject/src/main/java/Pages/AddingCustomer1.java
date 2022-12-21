package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddingCustomer1 {
	
WebDriver driver;
	
	public AddingCustomer1(WebDriver driver){
		this.driver= driver;
	}
	
	By FirstName= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input");
	
	public WebDriver FirstName(WebDriver driver) {
		return (WebDriver) driver.findElement(FirstName);
		
	
	}
	
	By LastName= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input");
	
	public WebDriver LastName(WebDriver driver) {
		return (WebDriver) driver.findElement(LastName);
		
	
	}
	
	By PostCode= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input");
	
	public WebDriver PostCode(WebDriver driver) {
		return (WebDriver) driver.findElement(PostCode);
		
	
	}
	
	By AddCustomer= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button");
	
	public WebDriver AddCustomer(WebDriver driver) {
		return (WebDriver) driver.findElement(AddCustomer);
		
	
	}
	

}
