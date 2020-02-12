package Autom4.wowhead;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class LardeurTest {
	private String BROWSER=System.getProperty("browser");
	
	String Mob = "Lardeur";
	String Item1 = "Chahuteur";
	String Item2 = "Chausses";
	String Item3 = "Pioche";
	String Item4 = "Grève";
	String Item5 = "Espauliers";
	
	String File1 = "Item1";
	
	public void chooseBrowser() {
		if (BROWSER.equals("Firefox")){
			WebDriver driver = new FirefoxDriver();
			}
			else if (BROWSER.equals("Chrome")) {
			 WebDriver driver = new ChromeDriver();
			}
			else {
			WebDriver driver = new InternetExplorerDriver();
			}

	}
	
	@Test
	public void lardeurStuff() throws InterruptedException, FileNotFoundException {		
PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
PageRecherchePNJ pageRecherchePNJ = pageAccueil.rechercheLardeur(driver, Mob);
PagePNJ pagePNJ = pageRecherchePNJ.resultatLardeur(driver);
PageItemLoot pageItemLoot = pagePNJ.premierItem(driver, Item1);
//pageItemLoot.loadFile(File1);
driver.navigate().back();
	}
	

}
