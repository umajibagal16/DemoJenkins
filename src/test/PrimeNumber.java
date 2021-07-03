package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeNumber {
	public static void main(String[] args) {
		checkPrimeIsNumber();
	}
	
	public void loginTest() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("userName")).sendKeys("admin");
		driver.findElement(By.xpath("password")).sendKeys("admin@1231");
		driver.findElement(By.xpath("login")).click();
		
		
	}
	
	
	static void checkPrimeIsNumber() {
		int num = 3;

		int f = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				f = 1;
		}

		if (f == 0)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");

	}

}
