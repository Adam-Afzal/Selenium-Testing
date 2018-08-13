package com.qa.DemoQATest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTest {
	
static WebDriver myDriver;
	
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver","C://Users//Admin//Downloads//chromedriver_win32/chromedriver.exe");
	}
	
	@Before
	public void setup()	{
		myDriver = new ChromeDriver();
		myDriver.manage().window().maximize();
	}
	
//	
//	 @Test
//	 public void droppableTest() {
//		 
//		 myDriver.get("http://demoqa.com/");
//		 WebElement droppableButton = myDriver.findElement(By.id("menu-item-141"));
//		 droppableButton.click();
//		 Actions act = new Actions(myDriver);
//		 WebElement From = myDriver.findElement(By.id("draggableview"));
//		 WebElement To = myDriver.findElement(By.id("droppableview"));
//		 act.dragAndDrop(From, To).build().perform();
//		 assertEquals("Error","Dropped!",To.getText());
//	 }
	 
	 
	 @Test
	 public void selectableTest() {
		
		 myDriver.get("http://demoqa.com/");
		 WebElement selectableButton = myDriver.findElement(By.id("menu-item-142"));
		 selectableButton.click();
		 WebElement selectItem = myDriver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		 selectItem.click();
		
		 
		 assertEquals("Error","ui-widget-content ui-corner-left ui-selectee ui-selected",selectItem.getAttribute("class"));
		 
	 }
	 @After
	 public void close() {
		 
		 myDriver.close();
	 }

}
