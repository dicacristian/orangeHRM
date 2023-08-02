package base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BaseTest extends BasePage {
    protected WebDriver driver;

    private static final Random random;

    static{
        random = new Random();
    }
    Actions action;

    public BaseTest() {
        driver = BasePage.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    protected WebDriverWait waitPage() {
        return new WebDriverWait(driver, Duration.ofSeconds(5));
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
    protected void action(WebElement locator) {
        action.moveToElement(locator).click().perform();
    }
    protected void click(WebElement locator) {
        clickAble(locator).click();
    }
    public static int randomElement(int number){
        return random.nextInt(number);
    }
    protected WebElement sortRandomElem(List<WebElement> list) {
        WebElement elem = null;
        elem = list.get(randomElement(list.size() - 1));
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
    public void addTextToDisabledTextBox(String text, WebElement locator) {
        if (locator.isEnabled()|| locator.isDisplayed()) {
            addText(text, locator);
        }
    }
    public void clickWithRetries(WebElement element) {
        int retryCount = 0;
        boolean actionSuccessful = false;

        while (retryCount < 5 && !actionSuccessful) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                click(element);
                actionSuccessful = true;
            } catch (Exception e) {
                retryCount++;
            }
        }
    }

}
