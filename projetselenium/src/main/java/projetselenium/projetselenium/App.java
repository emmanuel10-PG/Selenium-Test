package projetselenium.projetselenium;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;





public class App 
{
    public static void main( String[] args ) throws IOException
    {
       
    	// Test automatisé ouverture d'une page avec Selenium
    	
       // web dirver pour acceder au nivagateur Google Chrome
         System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        
        // Ouverture du navigateur Chrome puis accession au site web 
         driver.get("https://www.youtube.com");
//    	 driver.findElement(By.cssSelector("ytd-button-renderer.ytd-consent-bump-v2-lightbox:nth-child(2) > yt-button-shape:nth-child(1) > button:nth-child(1)")).click();
     	
        // Web driver pour acceder au navigateur Firefox
    	 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
    	 
    	 // oubien on peut ecrire cette fonction
    	 WebDriverManager.firefoxdriver().setup();
         WebDriver driverfirefox = new FirefoxDriver();	
        
         
         // Temps d'attente 
//         
//        driverfirefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driverfirefox.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
//        driverfirefox.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//        
        // Ouverture du navigateur Firefox puis accession au site web
        driverfirefox.get("https://www.youtube.com");
//    	  driverfirefox.findElement(By.cssSelector("ytd-button-renderer.ytd-consent-bump-v2-lightbox:nth-child(2) > yt-button-shape:nth-child(1) > button:nth-child(1)")).click();
        	
        
        // Web driver pour acceder au navigateur Microsoft Edge
   	    System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
   	    WebDriverManager.edgedriver().setup();
        WebDriver DriverMedge = new EdgeDriver();	
       
       // Ouverture du navigateur Microsoft Edge puis accession au site web
        DriverMedge.get("https://www.youtube.com");
        
        DriverMedge.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        DriverMedge.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
        DriverMedge.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(11));
//        
        
        // reccuperer le titre d'un site web, on fait 
      //  DriverMedge.getTitle();
        
//        // permet de maximiser l'affichage de l'écran
//        DriverMedge.manage().window().maximize();
//        
//        // permet de minimiser l'affichage de l'écran
//        DriverMedge.manage().window().minimize();
//        
//        // permet de plein écran l'affichage de l'écran
//        DriverMedge.manage().window().fullscreen();
        
        
        // effectuer les dimension
        Dimension dims = DriverMedge.manage().window().getSize();
        
        DriverMedge.manage().window().setSize(new Dimension(600, 700));
        
        
        // Obtenir la dimension d'un site et l'afficher
        DriverMedge.manage().window().getSize().getWidth();
        DriverMedge.manage().window().getSize().getHeight();
        
        // Afficher la dimension d'un site sur la console
        System.out.println(dims.getHeight());
        System.out.println(dims.getWidth());
        
        // position d'une page web
        Point positionPage = DriverMedge.manage().window().getPosition();
        
        System.out.println(positionPage.getX());
        System.out.println(positionPage.getY());
        
  //      DriverMedge.manage().window().setPosition(new Point(700, 950));
        
       // Autre méthode d'ouverture du navigateur Microsoft Edge puis accession au site web 
       // Puisque j'ai mis youtube au debut ça rediriger vers www.clubic.com
        DriverMedge.navigate().to("https://www.clubic.com");
        
        DriverMedge.findElement(By.cssSelector("#didomi-notice-agree-button")).click();
        DriverMedge.findElement(By.cssSelector("button.mlnaxt-6:nth-child(1) > svg:nth-child(1)")).click();
        
        // 1ere methode pour ecrire dans un champs puis envoyer
 /*       DriverMedge.findElement(By.cssSelector(".sc-1ws95ck-3 > input:nth-child(2)")).sendKeys("tester clubic");
        DriverMedge.findElement(By.cssSelector(".sc-1ws95ck-3 > input:nth-child(2)")).submit();                        */
        
        // 2e methode pour ecrire dans un champs puis envoyer avec WebElement
        
     // Ecrire sur les champs sans avoir faire inspecter le champs puis l'inserer un mot above : avant
        // on cherche d'abors l'element d'en bas puis on ecrit en fonction pour avoir le composant du haut
        WebElement elementRecherche = DriverMedge.findElement(By.cssSelector(".sc-1ws95ck-3 > input:nth-child(2)"));
//      elementRecherche.sendKeys(" testeur");
//      elementRecherche.submit();  
        elementRecherche.findElement(RelativeLocator.with(By.tagName("input")).above(elementRecherche)).sendKeys("test donnees avant");
        
        // Ecrire sur les champs sans avoir faire inspecter le champs puis l'inserer un mot below : apres
        // on cherche d'abors l'element d'en haut puis on ecrit en fonction pour avoir le composant du bas
        WebElement elementRecherches = DriverMedge.findElement(By.cssSelector(".sc-1ws95ck-3 > input:nth-child(2)")); 
        elementRecherches.findElement(RelativeLocator.with(By.tagName("input")).below(elementRecherche)).sendKeys("test donnees apres");
        
        
        // Capture d'ecran via le navigateur
 /*       File scrFile = (File)(((TakesScreenshot) DriverMedge).getScreenshotAs(OutputType.FILE));
        FileUtils.copyFile(scrFile,new File("./img1.png"));                                                  */
        
        
        // cliquer sur le bouton
//        DriverMedge.findElement(By.cssSelector("ytd-button-renderer.ytd-consent-bump-v2-lightbox:nth-child(2) > yt-button-shape:nth-child(1) > button:nth-child(1)")).click();
        
        
    }
}