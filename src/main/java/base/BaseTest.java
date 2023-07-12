package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;
import java.util.List;

public class BaseTest extends BasePage {
    protected WebDriver driver;

    Actions action;

    public BaseTest() {
        driver = BasePage.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    private WebDriverWait waitPage() {
        return new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    protected WebElement find(WebElement locator) {
        waitPage().until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }

    protected WebElement clickAble(WebElement locator) {
        waitPage().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    protected void addText(String inputText, WebElement locator) {
        clear(locator);
        locator.sendKeys(inputText);
    }

    protected void clear(WebElement locator) {
        click(locator);
        if (getOperationSystem().contains("Windows")) {
            locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        } else if (getOperationSystem().contains("Mac OS X")) {
            locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        }
    }

    protected void click(WebElement locator) {
        clickAble(locator).click();
    }

    protected void movetoElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }

    protected String getPageTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    protected String getText(WebElement locator) {
        return locator.getText();
    }

    protected void valCorrectPage(String searchString) {
        if (!getPageTitle().contains(searchString)) {
            throw new IllegalStateException("This is not " + searchString + " .The actual Url is: " + getUrl());
        }
    }

    protected WebElement listofElements(List<WebElement> list, String text) {
        WebElement elem = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equalsIgnoreCase(text)) {
                elem = list.get(i);
                break;
            }
        }
        return elem;
    }



    private String getOperationSystem() {
        String operateSystem = System.getProperty("os.name");
        return operateSystem;
    }

    protected void javascriptExecutor(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");

    }

    protected void uploadDoc(WebElement element, String path) {
        element.sendKeys(path);
    }

    public void clickWithRetries(WebElement element) {
        int retryCount = 0;
        boolean actionSuccessful = false;

        while (retryCount < 5 && !actionSuccessful) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView();", element);
                click(element);
                actionSuccessful = true;
            } catch (Exception e) {
                retryCount++;
            }
        }
    }
    public void scrollDown() {
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).perform();
    }
    public void scrollUp() {
        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).perform();
    }

}
