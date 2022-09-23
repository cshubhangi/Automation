package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1qatech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhananjay Gavali\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://qatechhub.com/");


		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Page title is : " + driver.getCurrentUrl());

		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		System.out.println("Page title is : " + driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();


	}

	}


