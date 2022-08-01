package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_search {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement room_Type;
	@FindBy(id = "room_nos")
	private WebElement no_ofRooms;
	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	@FindBy(id = "child_room")
	private WebElement childRoom;
	@FindBy(id = "Submit")
	private WebElement search;

	public Hotel_search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNo_ofRooms() {
		return no_ofRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;
	}

}
