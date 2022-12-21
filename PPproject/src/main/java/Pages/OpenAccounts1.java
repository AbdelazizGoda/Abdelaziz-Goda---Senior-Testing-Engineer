package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenAccounts1 {
	
WebDriver driver;
	
	public OpenAccounts1(WebDriver driver){
		this.driver= driver;
	}
	
	By CustomerMenu= By.id("userSelect");
	
	public WebDriver CustomerMenu(WebDriver driver) {
		return (WebDriver) driver.findElement(CustomerMenu);
		
	
	}
	
	By Hermoine= By.xpath("//*[@id=\\\"userSelect\\\"]/option[2]");
	
	public WebDriver Hermoine(WebDriver driver) {
		return (WebDriver) driver.findElement(Hermoine);
		
	
	}
	
	By Harry= By.xpath("//*[@id=\\\"userSelect\\\"]/option[3]");
	
	public WebDriver Harry(WebDriver driver) {
		return (WebDriver) driver.findElement(Harry);
		
	
	}
	
	By Ron= By.xpath("//*[@id=\\\"userSelect\\\"]/option[4]");
	
	public WebDriver Ron(WebDriver driver) {
		return (WebDriver) driver.findElement(Ron);
		
	
	}
	
	By Albus= By.xpath("//*[@id=\\\"userSelect\\\"]/option[5]");
	
	public WebDriver Albus(WebDriver driver) {
		return (WebDriver) driver.findElement(Albus);
		
	
	}
	
	By Neville= By.xpath("//*[@id=\\\"userSelect\\\"]/option[6]");
	
	public WebDriver Neville(WebDriver driver) {
		return (WebDriver) driver.findElement(Neville);
		
	
	}
	By Currency= By.id("currency");
	
	public WebDriver Currency(WebDriver driver) {
		return (WebDriver) driver.findElement(Currency);
		
	}
	
	By Dollar= By.xpath("//*[@id=\"currency\"]/option[2]");
	
	public WebDriver Dollar(WebDriver driver) {
		return (WebDriver) driver.findElement(Dollar);
	
	}
	
	By Pound= By.xpath("//*[@id=\"currency\"]/option[3]");
	
	public WebDriver Pound(WebDriver driver) {
		return (WebDriver) driver.findElement(Pound);
	
	}
	
	By Rupee= By.xpath("//*[@id=\"currency\"]/option[4]");
	
	public WebDriver Rupee(WebDriver driver) {
		return (WebDriver) driver.findElement(Rupee);
	
	}
	
	By ProcessButton= By.xpath("//button[text()='Process']");
	
	public WebDriver ProcessButton(WebDriver driver) {
		return (WebDriver) driver.findElement(ProcessButton);
	
	}
	
	
	
	
}
