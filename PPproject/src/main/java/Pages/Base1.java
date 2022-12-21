package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;


public class Base1 {
	
	public Actions actions;
	public TouchActions action;
	
	//Super constructor
		public Base1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

}
