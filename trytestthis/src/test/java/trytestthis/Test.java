package trytestthis;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		
		//Initialization
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				
				driver.get("https://trytestingthis.netlify.app/");
				driver.manage().window();
				
				//time delay for 1s
				Thread.sleep(1000);
				
				//input firstname & lastname
				driver.findElement(By.id("fname")).sendKeys("Md Aminul");
				
				//time delay for 1s
				Thread.sleep(1000);
				
				driver.findElement(By.id("lname")).sendKeys("Islam");
				
				//time delay for 1s
				Thread.sleep(1000);
				
				//Selecting Gender from the radiobutton
				WebElement radiobutton = driver.findElement(By.id("male"));
				radiobutton.click();
				
				//check radiobutton is selected
				assert radiobutton.isSelected();
				System.out.print("Radiobutton = ");
				System.out.println(radiobutton.isSelected());
				
				
				//Selecting options from dropdown
				WebElement testdropdown = driver.findElement(By.id("option"));
				Select dropdown = new Select(testdropdown);
				
				//time delay for 1s
				Thread.sleep(1000);
				
				//choose by index from dropdown
				dropdown.selectByIndex(2);
				
		
				
				//Selecting options from multiple choice
				WebElement testmultiple = driver.findElement(By.id("owc"));
				Select multiple = new Select(testmultiple);
				
				//time delay for 1s
				Thread.sleep(1000);
				
				//choose by index from multiple choices
				multiple.selectByIndex(1);
				
				//time delay for 1s
				Thread.sleep(1000);
			
				multiple.selectByIndex(3);
				
				//Selecting options from checkbox
				WebElement checklist = driver.findElement(By.name("option3"));
				checklist.click();
				
				//check checkbox is selected
				assert checklist.isSelected();
				System.out.print("CheckBox = ");
				System.out.println(checklist.isSelected());
				
	}

}
