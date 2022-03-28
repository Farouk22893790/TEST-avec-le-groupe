package tunisianet;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;





public class Achat1 extends Tunisia_NET {
	


	   
	
	
	@Test


	
	public void runTunisianet() throws InterruptedException{
		
		 driver.get("https://www.tunisianet.com.tn/");

       // attendre 2 seconds
      
		 Thread.sleep(2000);
   	
      //mouseover informatique *****
        
       
       WebElement Informatique_Link = driver.findElement(By.xpath("//span[contains(text () ,' Informatique')]"));
       Actions actionProvider = new Actions(driver);
       // Performs mouse move action onto the element
       actionProvider.moveToElement(Informatique_Link).build().perform();
     
            // attendre 2 seconds
            Thread.sleep(2000);
           
            
   //Click sur le  button pc portable :: //a[@href=\"https://www.tunisianet.com.tn/301-pc-portable-tunisie\"]
            
         
            WebElement pc_portable = driver.findElement(By.xpath("//a[contains(text () ,'Pc Portable')]"));
            JavascriptExecutor pc_button = (JavascriptExecutor) driver;  
            pc_button.executeScript("arguments[0].click();", pc_portable);
            
  
            
            //Click sur le  button chariot
            
           
            WebElement chariot = driver.findElement(By.xpath("//button[@class=\"cartb  btn-product add-to-cart wb-bt-cart wb-bt-cart_54073 wb-enable\"]"));
            JavascriptExecutor chariot_button = (JavascriptExecutor) driver;  
            chariot_button.executeScript("arguments[0].click();", chariot);
            
         
            
           
}

}
