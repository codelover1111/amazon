package framwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	public static void main(String  [] args)  {
		
		   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.com/");
	       
	       WebElement departments= driver.findElement(By.xpath("//span[text()='Departments']"));
	       JavascriptExecutor js=(JavascriptExecutor) driver;
	       js.executeScript("arguments[0].style.border='3px solid red'", departments);
	       departments.click();
	       System.out.println("print departments " );
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       WebElement Recomendations= driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
	       js.executeScript("arguments[0].style.border='3px solid green'", Recomendations);
	       Recomendations.click();
	       System.out.println("print Recomendations ");
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       

//	       WebElement yourAmazon= driver.findElement(By.xpath("//a[text()='Your Amazon.com']	"));
//	       js.executeScript("arguments[0].style.border='3px solid green'", yourAmazon);
//	       yourAmazon.click();
//	       System.out.println("print yourAmazon ");
//	       driver.navigate().back();
//	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	       
	       WebElement todaysDeals= driver.findElement(By.xpath("//a[@class='nav-a']"));
	       js.executeScript("arguments[0].style.border='3px solid blue'", todaysDeals);
	       todaysDeals.click();
	       System.out.println("print  todaysDeals " );
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       WebElement gCards= driver.findElement(By.xpath("//a[text()='Gift Cards']"));
	       js.executeScript("arguments[0].style.border='3px solid green'", gCards);
	       gCards.click();
	       System.out.println("print gCards");
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       WebElement registry= driver.findElement(By.xpath("//a[text()='Registry']"));
	       js.executeScript("arguments[0].style.border='3px solid red'", registry);
	       registry.click();
	       System.out.println("print registry ");
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       WebElement acclist= driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	       js.executeScript("arguments[0].style.border='3px solid red'", acclist);
	       acclist.click();
	       System.out.println("print acclist ");
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       WebElement orders= driver.findElement(By.xpath("//span[text()='Orders']"));
	       js.executeScript("arguments[0].style.border='3px solid green'", orders);
	       orders.click();
	       System.out.println("print orders" );
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       WebElement prime= driver.findElement(By.xpath("//span[text()='Try Prime']"));
	       js.executeScript("arguments[0].style.border='3px solid red'", prime);
	       prime.click();
	       System.out.println("print prime " );
	       driver.navigate().back();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	}

}
