package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchUsers extends BaseTest {
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    private WebElement adminButton;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement usernameSearch;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement userRole;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")
    private WebElement choosenUserRole;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeName;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div/span")
    private WebElement nameEmployeeClick;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
    private WebElement selectStatus;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]")
    private WebElement enableButton;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchButton;

    public void clickAdminButton() {
        click(adminButton);
    }

    public void addUserNameSearch(String usernameSearch) {
        addText(usernameSearch, this.usernameSearch);
    }

    public void clickUserRole() {
        click(userRole);
    }


    public void clickAdminUserRole() {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MICROSECONDS);
        Actions actions = new Actions(driver);
        actions.moveToElement(userRole).perform();
        click(choosenUserRole);
    }

    public void addEmployeeName(String employeeName) {
        addText(employeeName, this.employeeName);
    }

    public void clickNameEmployee() {
        click(nameEmployeeClick);
    }

    public void clickSelectStatus() {
        click(selectStatus);
        click(enableButton);

    }

    public void clickSearchButton() {
        click(searchButton);
    }
}



