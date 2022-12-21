package Tests;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Functions;

import Pages.AddingCustomer1;
import Pages.Base1;
import Pages.Customers1;
import Pages.Functions1;
import Pages.Home1;
import Pages.OpenAccounts1;
import Pages.Roles1;


public class FirstScenario1 {
	
	AddingCustomer1 addingCustomer;
	Base1 base;
	Customers1 customer;
	Functions1 function;
	Home1 home;
	OpenAccounts1 openAccounts;
	Roles1 roles;
	
	
	
	
	
	ChromeDriver driver;
	
	public void Installations() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/ChromeSource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	
	public void First1(){
		
		roles.ManagerLogin();
		
		
		
	
		
		
	}


	
}
