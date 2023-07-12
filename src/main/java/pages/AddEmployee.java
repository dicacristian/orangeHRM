package pages;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee extends BaseTest {
    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    private WebElement pimButton;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
    private WebElement addEmployeeButton;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleName;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    private WebElement employeeID;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button")
    private WebElement filePhoto;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
    private WebElement loginDetails;
    @FindBy(xpath = "//label[normalize-space()='Disabled']")
    private WebElement statusDetails;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
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

    public void addPhoto() {
        String photo = "C:\\SkillBrain\\orangeHRM\\orangeHRM\\images\\photo2.jpg";
        filePhoto.sendKeys(photo);
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
        javascriptExecutor(x,y);
        click(saveButton);
    }


}
