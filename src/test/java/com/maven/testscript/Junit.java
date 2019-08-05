package com.maven.testscript;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.maven.baseclass.BaseClass;
import com.maven.pom.HomePage;
import com.maven.pom.SignInPage;

public class Junit extends BaseClass{
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
       System.out.println("Driver Initialization");
       driver = getBrowser("chrome");
       getUrl("http://automationpractice.com/index.php");
       }
	
	@Before
	public void before() {
         System.out.println("Login the app");
         HomePage hp = new HomePage(driver);
	     SignInPage sp = new SignInPage(driver);
	     
	     clickonWebelement(hp.getSignInLink());
	     inputValuestoWebelement(sp.getEmailFeild(),"text123@gmail.com");
	     inputValuestoWebelement(sp.getPasswordFeild(), "456789");
	     clickonWebelement(sp.getSignInBtn());
	     //String actual = getTextinWebelement(hp.getSignInLink());
	     //Assert.assertEquals("AUTHENTICATION"+",", actual);
	    }
	
	@Test
	public void test1() {
		System.out.println("Test scenario 1 - place order using search ");
}
	
	@Test
	public void test2() {
        System.out.println("Test scenario 2 - place order using header navigation");
	}
	
	@Test
	public void test3() {
         System.out.println("Test scenario 3 - contact us page automation");
	}
	
	@After
	public void after() {
         System.out.println("Log out the app");
	}
	
	@AfterClass
	public static void afterClass() {
        driver.quit();
        System.out.println("Driver quit");
	}
	}


