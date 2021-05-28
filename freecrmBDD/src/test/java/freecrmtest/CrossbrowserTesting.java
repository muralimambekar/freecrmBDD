package freecrmtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossbrowserTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\T\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

	}

}
