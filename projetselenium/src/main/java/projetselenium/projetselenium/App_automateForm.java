package projetselenium.projetselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App_automateForm {

	public static void main(String[] args) {
		
		// Instruction pour naviguer sur Firefox 
		WebDriverManager.firefoxdriver().setup();
        WebDriver Driverfirefox = new FirefoxDriver();
        Driverfirefox.get("https://www.qualitelogiciel.com/contactez-nous");
        
        // automatisation de formulaire avec Selenium Driver
        
        Driverfirefox.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/form/div[1]/input")).sendKeys("test1 Emmanuel");
        Driverfirefox.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/form/div[2]/input")).sendKeys("test2champsmail@gmail.com");
        Driverfirefox.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/form/div[3]/textarea")).sendKeys("Formation en automatisation sur Selenium avec java");
        Driverfirefox.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/form/div[6]/button/div")).submit();
        
	}

}
