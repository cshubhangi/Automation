package seleniumjava.testcomponents;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
public WebDriver InitilizeDriver () throws IOException {

	Properties prop= new Properties();
	FileInputStream fis = new FileInputStream ("\\Users\\Dhananjay Gavali\\eclipse-workspace\\Automation\\src\\test\\java\\seleniumjava\\resourses\\globaldata.properties");
prop.load(fis);
String browsername=prop.getProperty("browser");
if(browsername.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhananjay Gavali\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
}
else if(browsername.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Dhananjay Gavali\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
	}
else if(browsername.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dhananjay Gavali\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
return driver;
}
@BeforeMethod
public void lounchapp() throws IOException {
	 driver=InitilizeDriver (); 
	 
}
@AfterMethod
public void closeapp() {
	driver.close();
}
}