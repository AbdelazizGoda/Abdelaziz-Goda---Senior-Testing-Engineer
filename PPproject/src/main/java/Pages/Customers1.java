package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customers1 {
	
WebDriver driver;
	
	public Customers1(WebDriver driver){
		this.driver= driver;
	}
	
	By DeleteButton= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/table/tbody/tr[6]/td[5]/button");
	
	public WebDriver DeleteButton(WebDriver driver) {
		return (WebDriver) driver.findElement(DeleteButton);
		
	
	}

}


