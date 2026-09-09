package projetselenium.projetselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



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
        
        // Web driver pour acceder au navigateur Firefox
    	 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
    	 WebDriverManager.firefoxdriver().setup();
         WebDriver driverfirefox = new FirefoxDriver();	
        
        // Ouverture du navigateur Firefox puis accession au site web
        driverfirefox.get("https://www.youtube.com");
        
        }
}
