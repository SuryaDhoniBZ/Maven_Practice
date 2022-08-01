package com.maven_pract;

import org.openqa.selenium.WebDriver;
import com.base_class.Base_class;
import com.sdp.Page_object_manager;

public class Runner_class extends Base_class {
	public static WebDriver driver = Base_class.getBrowser("chrome");
	public static Page_object_manager pom = new Page_object_manager(driver);
	
	public static void main(String[] args) throws Throwable {
		driver = getUrl("https://adactinhotelapp.com/");
		waits("implicit", null);
		inputValueElement(pom.getInstanceLp().getUsername(), "surya1350");
		inputValueElement(pom.getInstanceLp().getPassword(), "MSD@007");
		clickOnElement(pom.getInstanceLp().getLogin_btn());
		dropDown(pom.getInstanceHs().getLocation(), "selectbyvalue", "New York");
		dropDown(pom.getInstanceHs().getHotels(), "selectbyvalue", "Hotel Creek");
		dropDown(pom.getInstanceHs().getRoom_Type(), "selectbyvalue", "Double");
		dropDown(pom.getInstanceHs().getNo_ofRooms(), "selectbyvalue", "3");
		inputValueElement(pom.getInstanceHs().getCheckIn(), "08/07/2022");
		inputValueElement(pom.getInstanceHs().getCheckOut(), "10/07/2022");
		dropDown(pom.getInstanceHs().getAdultRoom(), "selectbyvalue", "3");
		dropDown(pom.getInstanceHs().getChildRoom(), "selectbyvalue", "1");
		clickOnElement(pom.getInstanceHs().getSearch());
		clickOnElement(pom.getInstanceSh().getRadioButton());
		clickOnElement(pom.getInstanceSh().getContinueBtn());
		inputValueElement(pom.getInstanceBh().getFirstname(), "Surya");
		inputValueElement(pom.getInstanceBh().getLastname(), "Dhoni");
		inputValueElement(pom.getInstanceBh().getAddress(), "no.4478,6th avenue,Manhatten,NY");
		inputValueElement(pom.getInstanceBh().getCreditCardNumber(), "1234567891234567");
		dropDown(pom.getInstanceBh().getCreditCard(), "selectbyvalue", "AMEX");
		dropDown(pom.getInstanceBh().getExpYear(), "selectbyvisibletext", "2022");
		dropDown(pom.getInstanceBh().getExpMonth(), "selectbyvalue", "8");
		inputValueElement(pom.getInstanceBh().getCvvNumber(), "123");
		clickOnElement(pom.getInstanceBh().getBookNow());
		clickOnElement(pom.getInstanceLg().getLogout());
		getScreenshotAs("C:\\Users\\WL01_ChargeInc\\eclipse-workspace\\Maven_Practice\\Screenshots\\adactin.png");
		
	}
}
