package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchUsers extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Admin']")
    private WebElement adminButton;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]//input")
    private WebElement usernameSearch;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement userRole;
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[3]")
    private WebElement choosenUserRole;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeName;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-option']")
    private WebElement nameEmployeeClick;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement selectStatus;
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
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



