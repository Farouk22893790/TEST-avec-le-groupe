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

// attendre 2 seconds
   Thread.sleep(2000);
   
   // ecrire mon mail
   
   WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]")); 
   JavascriptExecutor ADD_MAIL= (JavascriptExecutor) driver;
   ADD_MAIL.executeScript("arguments[0].value='trabelsifarou9@gmail.com';", email);

// attendre 2 seconds
   Thread.sleep(2000);
   
   // ecrire mon mot de passe
   
   WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]")); 
   JavascriptExecutor PAS = (JavascriptExecutor) driver;
   PAS.executeScript("arguments[0].value='12345';", password);

   //Click sur le  button MONTRER
   
   WebElement montrer = driver.findElement(By.xpath("//button[@class=\"btn\"]"));
   JavascriptExecutor MONT_button = (JavascriptExecutor) driver;  
   MONT_button.executeScript("arguments[0].click();", montrer);

 
   
// attendre 4 seconds
   Thread.sleep(4000);
   
//Click sur le  button cacher
   
   WebElement cacher = driver.findElement(By.xpath("//button[@class=\"btn\"]"));
   JavascriptExecutor CACH_button = (JavascriptExecutor) driver;  
   CACH_button.executeScript("arguments[0].click();", cacher);

   
   
   // ecrire ma date de naissance
   WebElement birthday = driver.findElement(By.xpath("//input[@name=\"birthday\"]")); 
   JavascriptExecutor D_Birthday = (JavascriptExecutor) driver;
   D_Birthday.executeScript("arguments[0].value='24/01/1995';", birthday);

//Click sur le  button enregistrer
   
   WebElement enregistrer = driver.findElement(By.xpath("//button[@data-link-action=\"save-customer\"]"));
   JavascriptExecutor ENREG_button = (JavascriptExecutor) driver;  
   ENREG_button.executeScript("arguments[0].click();", enregistrer);
	}
}
