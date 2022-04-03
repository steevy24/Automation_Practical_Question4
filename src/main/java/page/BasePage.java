package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitForElement(WebDriver driver, int waitTime, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}




	public void selectFromDropdown(WebElement element, String visibleText) {

		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
}
