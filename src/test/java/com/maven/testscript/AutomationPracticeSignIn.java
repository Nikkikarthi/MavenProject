package com.maven.testscript;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.maven.baseclass.BaseClass;
import com.maven.pom.AddToCartPage;
import com.maven.pom.HomePage;
import com.maven.pom.SignInPage;


public class AutomationPracticeSignIn extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = getBrowser("chrome");

		getUrl("http://automationpractice.com/index.php");

		HomePage hp = new HomePage(driver);
		SignInPage sp = new SignInPage(driver);
		AddToCartPage ac = new AddToCartPage(driver);

		clickonWebelement(hp.getSignInLink());
		inputValuestoWebelement(sp.getEmailFeild(), "klvn19@gmail.com");
		inputValuestoWebelement(sp.getPasswordFeild(), "vignesh");
		Thread.sleep(3000);
		clickonWebelement(sp.getSignInBtn());
		
		String text = getTextinWebelement(ac.getAccountName());
		Assert.assertEquals("Nikkitha Karthik", text);
		System.out.println("Test passed");
		
		inputValuestoWebelement(ac.getSearchBox(), "dresses");
		clickonWebelement(ac.getSearchButton());
		
		mouseHoverToElement(ac.getDressChoice());
		clickonWebelement(ac.getAddToCart());
		 
		clickonWebelement(ac.getProceedbtn());
		clickonWebelement(ac.getIncrement());
			
		clickonWebelement(ac.getProceedbtn2());
		clickonWebelement(ac.getUpdatebtn());
		
		inputValuestoWebelement(ac.getAddressUpdate(), "chennai");
		clickonWebelement(ac.getSaveUpdate());
		
		inputValuestoWebelement(ac.getCommentBox(), "Beautiful dress");
		clickonWebelement(ac.getProceedbtn3());
		
		clickonWebelement(ac.getTickBox());
		clickonWebelement(ac.getProceedbtn4());
		
		clickonWebelement(ac.getPayment());
		clickonWebelement(ac.getOrderbtn());
		
		clickonWebelement(ac.getSignOutBtn());
		
		
	}
}
