package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Home1 {
	
	WebDriver driver;
	
	public Home1(WebDriver driver){
		this.driver= driver;
	}
	
	By BankButton= By.xpath("//button[text()='Bank Manager Login']");
	
	public WebDriver BankButton(WebDriver driver) {
		return (WebDriver) driver.findElement(BankButton);
		
	
	}
	
}
