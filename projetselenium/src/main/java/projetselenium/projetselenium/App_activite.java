package projetselenium.projetselenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App_activite {

	public static void main(String[] args) {
		
		// Afficher une alerte au déclenchement d'un bouton 
//		WebDriverManager.firefoxdriver().setup();
//        WebDriver Driverfirefox = new FirefoxDriver();	
//        Driverfirefox.get("https://the-internet.herokuapp.com/javascript_alerts");
//        
//        Driverfirefox.findElement(By.xpath("//button [@Onclick ='jsConfirm()']")).click();
//        
//        Alert alertJbtn = Driverfirefox.switchTo().alert();
//        
//        // obtenir le libele du bouton
//        alertJbtn.getText();
//         
//        System.out.println("le libele du bouton est : " + alertJbtn.getText());	
//        alertJbtn.accept();
//        // si le bouton contien ce libele alors afficher le message dans la console
//        if(Driverfirefox.getPageSource().contains("You clicked: Ok")) {
//        	System.out.println("Very Good bon bouton");	
//        }
        
		WebDriverManager.firefoxdriver().setup();
        WebDriver Driverfirefox = new FirefoxDriver();
        Driverfirefox.get("https://the-internet.herokuapp.com/checkboxes");
        
        final int checkboxe_one = 0;
        final int checkboxe_two = 1;
        final By Selectorchk = By.cssSelector("[type ='checkbox']");
        
        // verification
        List<WebElement> chkboxgroup = Driverfirefox.findElements(Selectorchk);
        
        WebElement testElement1 = chkboxgroup.get((checkboxe_one));
        WebElement testElement2 = chkboxgroup.get(checkboxe_two);
        
        System.out.print("\n checkbox numero 1 est " + testElement1.isSelected());
        System.out.println("\n checkbox numero 2 est " + testElement2.isSelected());
         
	}

}
