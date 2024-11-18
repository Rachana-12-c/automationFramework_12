package genericUtility;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public WebDriver driver;// declaring here as global variable instead of in every method
	public Actions act;

	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

	/**
	 * This method is used to maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to get height and width of the window
	 * 
	 * @param driver
	 * @return
	 * @return
	 */
	public Dimension getSizeOfWindow() {
		return driver.manage().window().getSize();
	}

	/**
	 * This method is used to switch from one window to another window
	 * 
	 * @param driver
	 */
	public void swithToWindow() {
		// Step-1: capture all window id's
		Set<String> allids = driver.getWindowHandles();
		// Step-2: Navigate through all the windows
		for (String id : allids) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(acturl))
				break;
		}
	}

	/**
	 * This method is used right click on the element
	 * 
	 * @param driver
	 */

	public void rightClick() {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * This method is used to click and hold on the webElement
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * This method is used to mouseHover on the webElement
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		// Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void mouseHOver(int x, int y) {
		// Actions act=new Actions(driver);
		act.moveByOffset(x, y).perform();
		;
	}

	/**
	 * This method is used to drag the element and drop the element
	 * 
	 * @param element
	 */
	public void dragAndDrop(WebElement element) {
		// Actions act=new Actions(driver);
		act.dragAndDrop(element, element).perform();
	}

	public void doubleClick(WebElement element) {
		act.doubleClick(element);
	}

	/**
	 * This method is used to switch the frame by index
	 * 
	 * @param index
	 */
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch the frame by the framename
	 * 
	 * @param name
	 */
	public void switchToFrame(String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * This method is used to switch the frame by using frame element
	 * 
	 * @param element
	 */
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This method is used to switch back to the parent frame
	 */
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	/**
	 * This method is used to select the dropDown or listBox by index
	 * 
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void switchToAlert() {
		driver.switchTo().alert();
	}

	public void switchToAlertAndAccept() {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertAndDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void switchToAlertAndSendkeys(String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	public void switchToAlertAndGetText() {
		driver.switchTo().alert().getText();
	}
}
