package testJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class test
{
	
	
	public static void tt(String[] args) 
	//public class test2
	{
		WebDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		driver.get("C:\\Demo2\\index.html");
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/div")).click();
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/ul/li[2]/a")).click();
		//WebElement frame=driver.findElement(By.xpath( ".//*[@id='lay-top-wrap']/div[1]" ));

		driver.switchTo().frame("lay-main");

		String buttonname=driver.findElement(By.xpath(".//*[@id='lay-top-wrap']/div[2]/button[1]")).getText();
		System.out.println(buttonname);
		buttonname=driver.findElement(By.xpath(".//*[@id='lay-top-wrap']/div[2]/button[2]")).getText();
		System.out.println(buttonname);
		buttonname=driver.findElement(By.xpath(".//*[@id='lay-top-wrap']/div[2]/button[3]")).getText();
		System.out.println(buttonname);
		driver.close();
	}


}

