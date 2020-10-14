package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		System.out.print("https://www.discoveryplus.in/");
		System.out.print(""+driver.manage().getCookieNamed("st"));
		
	}

}
