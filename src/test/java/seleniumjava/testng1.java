package seleniumjava;

import java.io.IOException;

import org.testng.annotations.Test;

import seleniumjava.testcomponents.Baseclass;

public class testng1 extends Baseclass {
	@Test
	public void Title() throws IOException {
		lounchapp();
	driver.get("https://qatechhub.com/");


	System.out.println("Page title is : " + driver.getTitle());
	System.out.println("Page title is : " + driver.getCurrentUrl());

	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	System.out.println("Page title is : " + driver.getCurrentUrl());
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
}