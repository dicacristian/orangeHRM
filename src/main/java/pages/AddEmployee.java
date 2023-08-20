package pages;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='PIM']")
    private WebElement pimButton;
    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    private WebElement addEmployeeButton;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleName;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]//input")
    private WebElement employeeID;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement filePhoto;
    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    private WebElement loginDetails;
    @FindBy(xpath = "//label[normalize-space()='Disabled']")
    private WebElement statusDetails;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]//input")
    private WebElement usernameLoginDetails;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement passwordLoginDetails;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPasswordLoginDetails;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement saveButton;

    public void clickPIMBUTTON() {
        click(pimButton);
    }

    public void clickAddEmployeeButton() {
        click(addEmployeeButton);
    }

    public void addFirstName(String firstName) {
        addText(firstName, this.firstName);
    }

    public void addMiddleName(String middleName) {
        addText(middleName, this.middleName);
    }

    public void addLastName(String lastName) {
        addText(lastName, this.lastName);
    }

    public void addEmployeeID(String employeeID) {
        addText(employeeID, this.employeeID);
    }


    public void clickLoginDetails() {
        click(loginDetails);
    }

    public void clickStatusDetails() {
        click(statusDetails);
    }

    public void addUsernameLoginDetails(String usernameLoginDetails) {
        addText(usernameLoginDetails, this.usernameLoginDetails);
    }

    public void addPasswordLoginDetails(String passwordLoginDetails) {
        addText(passwordLoginDetails, this.passwordLoginDetails);
    }

    public void addConfirmPasswordLoginDetails(String confirmPasswordLoginDetails) {
        addText(confirmPasswordLoginDetails, this.confirmPasswordLoginDetails);
    }

    public void clickSaveButton(int x, int y) {
        javascriptExecutor(x, y);
        click(saveButton);
    }


}
