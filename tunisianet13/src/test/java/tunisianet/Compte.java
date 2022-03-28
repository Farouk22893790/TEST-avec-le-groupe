package tunisianet;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Compte extends Tunisia_NET{
	

	  
	@Test
	
	public void TNISIA_NET() throws InterruptedException{
			
		driver.get("https://www.tunisianet.com.tn/connexion?create_account=1");
		
  //Click on button titre 
    
    WebElement titre = driver.findElement(By.xpath("//input[@value=\"1\"]"));
    JavascriptExecutor T = (JavascriptExecutor) driver;  
    T.executeScript("arguments[0].click();", titre);

 // attendre 2 seconds
    Thread.sleep(2000);
  
    // Write my First name 
   
   WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]")); 
   JavascriptExecutor F_Name = (JavascriptExecutor) driver;
   F_Name.executeScript("arguments[0].value='Farouk';", firstName);
   
// attendre 2 seconds
   Thread.sleep(2000);

  // ecrire mon nom
   
   WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]")); 
   JavascriptExecutor L_Name = (JavascriptExecutor) driver;
   L_Name.executeScript("arguments[0].value='Trabelsi';", lastname);

}
}