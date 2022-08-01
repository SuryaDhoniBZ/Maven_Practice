package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Base_class {
	public static WebDriver driver;

//BrowserLaunch
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",
		System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		}

//Close()
	public static WebDriver close() {
		driver.close();
		return driver;
	}

//Quit()
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

//NavigateTo
	public static WebDriver navigateTo(String url) {
		driver.navigate().to(url);
		return driver;
	}

//NavigateBack
	public static WebDriver navigateBack() {
		driver.navigate().back();
		return driver;
	}

//NavigateForward
	public static WebDriver navigateForward() {
		driver.navigate().forward();
		return driver;
	}

//NavigateRefresh
	public static WebDriver navigateRefresh() {
		driver.navigate().refresh();
		return driver;
	}

//Get URL
	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}

//Alert
	public static void alert(String type, String value) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("Accept")) {
			a.accept();
		} else if (type.equalsIgnoreCase("Dismiss")) {
			a.dismiss();
		} else if (type.equalsIgnoreCase("Sendkeys")) {
			a.sendKeys(value);
			a.accept();
		} else if (type.equalsIgnoreCase("GetText")) {
			String getText = a.getText();
			System.out.println(getText);
			a.accept();
		}
	}

//Actions
	public static void actions(String type, WebElement from, WebElement to) {
		Actions action = new Actions(driver);
		if (type.equalsIgnoreCase("Click")) {
			action.click(from).build().perform();
		} else if (type.equalsIgnoreCase("Context_click")) {
			action.contextClick(from).build().perform();
		} else if (type.equalsIgnoreCase("Double_click")) {
			action.doubleClick(from).build().perform();
		} else if (type.equalsIgnoreCase("MoveToElement")) {
			action.moveToElement(from).build().perform();
		} else if (type.equalsIgnoreCase("Dragdown_Drop")) {
			action.dragAndDrop(from, to).build().perform();
		} else if (type.equalsIgnoreCase("ClickAndHold")) {
			action.clickAndHold(from).build().perform();
		} else if (type.equalsIgnoreCase("Release")) {
			action.release(from).build().perform();
		}
	}

//Frames
	public static void frame(String type, String name) {
		if (type.equalsIgnoreCase("Frame_Index")) {
			int index = Integer.parseInt(name);
			driver.switchTo().frame(index);
		} else if (type.equalsIgnoreCase("Frame_name")) {
			driver.switchTo().frame(name);
		} else if (type.equalsIgnoreCase("Default_content")) {
			driver.switchTo().defaultContent();
		}
	}

//Robot
	public static void robot(int type) throws Throwable {
		Robot r = new Robot();
		r.keyPress(type);
		r.keyRelease(type);
	}

//Window handle	
	public static WebDriver windowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		return driver;
	}
  //*Window handles
	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println("total tabs : " + size);
		for (String cp : windowHandles) {
			System.out.println(cp);
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println(title);
		}
	}

//DropDown
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("selectByValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("selectByIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("selectByVisibleText")) {
			s.selectByVisibleText(value);
		}
	}

//CheckBox
	public static void checkBox(WebElement element) {
		element.click();	}

//Is Enable
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Element isEnabled: " + enabled);
	}

//Is Displayed
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("Element isdisplayed: " + displayed);
	}

//Is Selected
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("Element isSelected: " + selected);
	}

//Get Options
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

//Get Title
	public static WebDriver getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return driver;
	}

//Get currentUrl
	public static WebDriver getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return driver;
	}

//Get Text
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

//Get Attribute
	public static void getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

//Wait
	public static void waits(String type, WebElement element) {
		if (type.equalsIgnoreCase("Implicit")) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (type.equalsIgnoreCase("Explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

//Screen_Shot
	public static void getScreenshotAs(String SS_PATH) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SS_PATH);
		FileUtils.copyFile(source, dest);
	}

//ScrollUp And ScrollDown
	public static void scroll(String type, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("Down")) {
			js.executeScript("window.scrollBy(0,500);");
		} else if (type.equalsIgnoreCase("Up")) {
			js.executeScript("window.scrollBy(0,-500);");
		}  else if (type.equalsIgnoreCase("Top")) {
			js.executeScript("window.scroll(0,0)", "");
		} else if (type.equalsIgnoreCase("Bottom")) {
			js.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		} else if (type.equalsIgnoreCase("Click")) {
			js.executeScript("arguments[0].click();", element);
		}
	}

//SendKeys()
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

//Get first selected option
	public static void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelect = s.getFirstSelectedOption();
		String text = firstSelect.getText();
		System.out.println(text);
	}

//Get all selected options
	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

//Is Multiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

//Click()
	public static void clickOnElement(WebElement element) {
		element.click();
	}

//Radio Button
	public static void radioButton(String type, WebElement element) {
		if (type.equalsIgnoreCase("selectRadioButton")) {
			element.click();
		} else if (type.equalsIgnoreCase("findDefaultRadioButton")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
	}
}