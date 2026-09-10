package projetselenium.projetselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;





public class App 
{
    public static void main( String[] args )
    {
       
    	// Test automatisé ouverture d'une page avec Selenium
    	
       // web dirver pour acceder au nivagateur Google Chrome
         System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        
        // Ouverture du navigateur Chrome puis accession au site web 
         driver.get("https://www.youtube.com");
    	 driver.findElement(By.cssSelector("ytd-button-renderer.ytd-consent-bump-v2-lightbox:nth-child(2) > yt-button-shape:nth-child(1) > button:nth-child(1)")).click();
     	
        // Web driver pour acceder au navigateur Firefox
    	 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
    	 WebDriverManager.firefoxdriver().setup();
         WebDriver driverfirefox = new FirefoxDriver();	
        
        // Ouverture du navigateur Firefox puis accession au site web
        driverfirefox.get("https://www.youtube.com");
    	  driverfirefox.findElement(By.cssSelector("ytd-button-renderer.ytd-consent-bump-v2-lightbox:nth-child(2) > yt-button-shape:nth-child(1) > button:nth-child(1)")).click();
        	
        
        // Web driver pour acceder au navigateur Microsoft Edge
   	    System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
   	    WebDriverManager.edgedriver().setup();
        WebDriver DriverMedge = new EdgeDriver();	
       
       // Ouverture du navigateur Microsoft Edge puis accession au site web
        DriverMedge.get("https://www.youtube.com");
        
        // cliquer sur le bouton
        DriverMedge.findElement(By.cssSelector("ytd-button-renderer.ytd-consent-bump-v2-lightbox:nth-child(2) > yt-button-shape:nth-child(1) > button:nth-child(1)")).click();
        
        
    }
}
