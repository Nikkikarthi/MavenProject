package com.maven.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AddToCartPage {
		
		public WebDriver driver;
		
		public AddToCartPage(WebDriver ldriver) {
			this.driver = ldriver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[@title='View my customer account']")
		private WebElement accountName;
		
		@FindBy(id="search_query_top")
		private WebElement searchBox;
		
		@FindBy(name="submit_search")
		private WebElement searchButton;
		
		@FindBy(xpath="(//img[@title='Printed Dress'])[1]")
		private WebElement dressChoice;
		
		@FindBy(xpath="(//a[@title='Add to cart'])[2]")
		private WebElement addToCart;

		@FindBy(xpath="//a[@title='Proceed to checkout']")
		private WebElement proceedbtn;
		
		@FindBy(xpath="(//i[@class='icon-plus'])[1]")
		private WebElement increment;
		
		@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
		private WebElement proceedbtn2;
		
		@FindBy(xpath="(//a[@title='Update'])[1]")
		private WebElement updatebtn;
		
		@FindBy(id="alias")
		private WebElement addressUpdate;
		
		@FindBy(id="submitAddress")
		private WebElement saveUpdate;
		
		@FindBy(name="message")
		private WebElement commentBox;
		
		@FindBy(name="processAddress")
		private WebElement proceedbtn3;
		
		@FindBy(id="uniform-cgv")
		private WebElement tickBox;
		
		@FindBy(name="processCarrier")
		private WebElement proceedbtn4;
		
		@FindBy(xpath="(//p[@class='payment_module'])[1]")
		private WebElement payment;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement orderbtn;
		
		@FindBy(xpath="//a[@class='logout']")
		private WebElement signOutBtn;
		
		
		public WebElement getAccountName() {
			return accountName;
		}

		public WebElement getSearchBox() {
			return searchBox;
		}

		public WebElement getSearchButton() {
			return searchButton;
		}

		public WebElement getDressChoice() {
			return dressChoice;
		}

		public WebElement getAddToCart() {
			return addToCart;
		}

		public WebElement getProceedbtn() {
			return proceedbtn;
		}

		public WebElement getIncrement() {
			return increment;
		}

		public WebElement getProceedbtn2() {
			return proceedbtn2;
		}

		public WebElement getUpdatebtn() {
			return updatebtn;
		}

		public WebElement getAddressUpdate() {
			return addressUpdate;
		}

		public WebElement getSaveUpdate() {
			return saveUpdate;
		}

		public WebElement getCommentBox() {
			return commentBox;
		}

		public WebElement getProceedbtn3() {
			return proceedbtn3;
		}

		public WebElement getTickBox() {
			return tickBox;
		}

		public WebElement getProceedbtn4() {
			return proceedbtn4;
		}

		public WebElement getPayment() {
			return payment;
		}

		public WebElement getOrderbtn() {
			return orderbtn;
		}

		public WebElement getSignOutBtn() {
			return signOutBtn;
		}	
		
		
	}

