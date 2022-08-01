package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_type")
	private WebElement creditCard;
	@FindBy(id = "cc_num")
	private WebElement ccNum;
	@FindBy(id = "cc_exp_month")
	private WebElement ExpMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement ExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement CvvNumber;
	@FindBy(id = "book_now")
	private WebElement BookNow;

	public Book_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return ccNum;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}

}
