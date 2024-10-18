package newone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class order10product {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		String url ="https://www.amazon.in/";
		driver.get(url);
		
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9353804347");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harish@6");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	
		
		
		// searing navbar step
	
		        // Search for a product
		        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		        searchBox.sendKeys("Samsung Galaxy S23 Ultra 5G AI Smartphone");
		        searchBox.submit();
		        
		        // add to card 
		        
		       WebElement ele= driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
		       ele.click();
		       
		       // see that succesfull added or not
		       String str=ele.getText();
		       System.out.println("succesfully added to cart "+str);
		       
              // seeing the discount
		       
		  WebElement offer= driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[contains(text(),'(49% off)')]"));
		  System.out.println("UP to offer is ="+offer.getText());
		        
		 //  got to the cart 
		        
		       WebElement gotcart=driver.findElement(By.xpath("(//a[@class='a-button-text'])[1]"));
		       gotcart.click();
		       
		       // Go to quantity select 10 product of same one using 
		       
		       driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//a[@id='quantity_9']")).click();
		       
		       // Deleting the product if neccesory
//		     WebElement dele=  driver.findElement(By.xpath("//input[@name='submit.delete.9a996d76-2aae-4454-af73-074530395271']"));dele.click();
//		       System.out.println("deleting the produc"+dele.getText());
		     
		     
		       // update the card
//		      WebElement update= driver.findElement(By.xpath("//a[@id='a-autoid-0-announce']"));update.click();
//		       System.out.println("sucessfully updated "+update.getText());
		       
		       
// 
//		       Select selc  = new Select(driver.findElement(By.xpath("//span[@class='a-dropdown-label']")));
//		       selc.selectByIndex(9);
//		       
		       
		       
		 //  last step 
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//a[@id='add-new-address-popover-link']")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("Harish");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("9353804347");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']")).sendKeys("583232");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']")).sendKeys("58");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']")).sendKeys("vinobangar");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']")).sendKeys("near temple");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressCity']")).sendKeys("Kuknoor");
		       Thread.sleep(1000);
	           driver.findElement(By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")).click();
	           Thread.sleep(6000);
	        //   driver.navigate().back();
		    }

	}


