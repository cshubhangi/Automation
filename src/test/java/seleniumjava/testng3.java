package seleniumjava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumjava.testcomponents.Baseclass;

public class testng3 extends Baseclass {
@Test	
	public void yahoo1() throws IOException, InterruptedException {
		lounchapp();
	
		String url= "https://in.search.yahoo.com/";
		driver.navigate().to(url);
System.out.println(driver.findElement(By.tagName("h4")).getText());
Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"Trending searches");
WebElement td=driver.findElement (By.xpath("//div[@class='compList lh-l fz-s pl-10 pr-10']"));
System.out.println(td.findElements(By.tagName("a")).size());
	
for(int i=0;i<td.findElements(By.tagName("a")).size(); i++)
{
//= Keys.BACK_SPACE;
	td.findElements(By.tagName("a")).get(i);
}	
     td.getText();
	System.out.println(td.getText());
	
for(int i=0;i<td.findElements(By.tagName("a")).size(); i++)
	    {
		Keys linkTab=Keys.BACK_SPACE;
		td.findElements(By.tagName("a")).get(i).sendKeys(linkTab);
		Thread.sleep(500);
	    }

	 driver.navigate().to ("https://in.search.yahoo.com/");
	 driver.findElement(By.xpath("//div[@class='compList lh-l fz-s pl-10 pr-10'][1]")).click();	
	}
}
