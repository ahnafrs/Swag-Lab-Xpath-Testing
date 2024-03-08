package swaglabxpath01pack;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwaglabXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		//initialized
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//locator
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		//AbsolutePath
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
	
		//Login by Relative Path
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		
		//Add to cart by Absolute path
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		
		//Cart Icon by Relative path
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		
		//Checkout by relative path
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(3000);
		
		//Details by relative path
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Jack");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Bay");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1123");
		
		
		//Confirm by Absolute Path
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
		
		//Confirm by Relative Path
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		
		//Finish by Absolute path
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
		
	}

}
