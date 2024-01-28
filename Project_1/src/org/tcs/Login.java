package org.tcs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Basic details

		WebElement login = driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']"));
		login.click();

		driver.findElement(By.xpath("//label[normalize-space()='REGISTER']")).click();

		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("Enter your user name");

		WebElement pass = driver.findElement(By.id("usrPwd"));
		pass.sendKeys("Enter your password");

		WebElement confirmpass = driver.findElement(By.id("cnfUsrPwd"));
		confirmpass.sendKeys("ReEnter your password");

		driver.findElement(
				By.xpath("//div[@class='ng-tns-c65-16 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();

		driver.findElement(By.xpath("//span[text()='English']")).click();

		driver.findElement(
				By.xpath("//div[@class='ng-tns-c65-17 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();

		driver.findElement(By.xpath("//span[text()='Where did you first meet your spouse?']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).sendKeys("Enter city");

		driver.findElement(By.xpath("//button[@label='Continue']")).click();

		// Personal details

		driver.findElement(By.id("firstName")).sendKeys("Enter your first name");

		driver.findElement(
				By.xpath("//div[@class='ng-tns-c65-18 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();

		driver.findElement(By.xpath("//span[text()='PRIVATE']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']")).click();

		driver.findElement(By.xpath("//select[@class='ui-datepicker-month ng-tns-c58-19 ng-star-inserted']")).click();

		driver.findElement(By.xpath("//option[text()='September']")).click();

		driver.findElement(By.xpath("//select[@class='ui-datepicker-year ng-tns-c58-19 ng-star-inserted']")).click();

		driver.findElement(By.xpath("//option[text()='2001']")).click();

		driver.findElement(By.xpath("//a[text()='14']")).click();
		driver.findElement(By.xpath("ui-radiobutton-box ui-widget ui-state-default")).click();

		driver.findElement(By.xpath("(//option[text()='India'])[2]")).click();

		driver.findElement(By.xpath("//span[text()='Female']")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("Enter your mail id");

		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.click();
		mobile.sendKeys("Enter your phone nmbr");

		driver.findElement(By.xpath("//select[@formcontrolname='nationality']")).click();

		driver.findElement(By.xpath("//option[text()='India']")).click();

		driver.findElement(By.xpath("//button[@label='Continue']")).click();

		// Address

		WebElement doornmbr = driver.findElement(By.xpath("//input[@id='resAddress1']"));
		doornmbr.click();
		doornmbr.sendKeys("Enter your address");

		WebElement pincode = driver.findElement(By.name("resPinCode"));
		pincode.click();
		pincode.sendKeys("Enter your pincode");

		driver.findElement(By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"))
				.click();

		driver.findElement(By.xpath("//option[text()='Select city']")).click();

		WebElement state = driver.findElement(By.id("resState"));
		state.click();
		state.sendKeys("tamilnadu");

		driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']")).click();

		driver.findElement(By.xpath("//option[text()='Select a Post Office']")).click();

		WebElement phone = driver.findElement(By.id("resPhone"));
		phone.click();
		phone.sendKeys("Enter your phone nmbr");

		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-clickable'])[2]")).click();

		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-invalid']")).click();

		driver.findElement(By.xpath("REGISTER")).click();

	}

}
