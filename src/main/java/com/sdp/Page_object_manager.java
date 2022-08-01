package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Hotel;
import com.pom.Hotel_search;
import com.pom.Login_page;
import com.pom.Logout;
import com.pom.Select_Hotel;

public class Page_object_manager {
	public static WebDriver driver;
	private Login_page lp;
	private Hotel_search hs;
	private Select_Hotel sh;
	private Book_Hotel bh;
	private Logout lg;

	public Page_object_manager(WebDriver driver_pom) {
		this.driver = driver_pom;
		PageFactory.initElements(driver, this);

	}

	public Login_page getInstanceLp() {
		lp = new Login_page(driver);
		return lp;
	}

	public Hotel_search getInstanceHs() {
		hs = new Hotel_search(driver);
		return hs;
	}

	public Select_Hotel getInstanceSh() {
		sh = new Select_Hotel(driver);
		return sh;
	}

	public Book_Hotel getInstanceBh() {
		bh = new Book_Hotel(driver);
		return bh;
	}

	public Logout getInstanceLg() {
		lg = new Logout(driver);
		return lg;
	}

}
