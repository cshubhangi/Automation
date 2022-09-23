package seleniumjava;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import seleniumjava.testcomponents.Baseclass;

public class testng4 extends Baseclass  {
	@Test
	public void myntra() throws IOException, InterruptedException {
		lounchapp();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//div[@class='desktop-navLinks']/div[1]")).click();
		driver.navigate().to("https://www.myntra.com/men-topwear");
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("div.sort-sortBy")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-list'] //li['2'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='brand-list'] // li //label)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='vertical-filters-filters'] //ul //li //label[@class='common-customRadio vertical-filters-label'][1])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='results-base'] //li[1]")).click();
		      
		       Set<String>w=driver.getWindowHandles();
		       Iterator<String> it= w.iterator();
		      
		       while(it.hasNext())
		      {
			
		        driver.switchTo().window(it.next());
		       }
		    
		 System.out.println (driver.findElement(By.cssSelector("h1.pdp-title")).getText());

		driver.findElement(By.cssSelector(".size-buttons-buttonContainer:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".pdp-add-to-bag")).click();
		driver.findElement(By.cssSelector(".myntraweb-sprite.desktop-iconBag.sprites-headerBag")).click();
		driver.findElement(By.cssSelector(".itemBlock-base-leftBlock:nth-child(1)")).click();
		driver.findElement(By.xpath("//div //button[text()='MOVE TO WISHLIST']")).click();
		driver.findElement(By.xpath("(//div[@role='dialog'] //div)[8]")).click();

			}

	

	
}
