package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dependents extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Dependents']")
    private WebElement dependentsButton;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]//input")
    private WebElement nameField;
    @FindBy(xpath = "//div[@class='oxd-select-wrapper']//div[@tabindex='0']")
    private WebElement selectRelationship;
    @FindBy(xpath = "//span[contains(text(),'Other')]")
    private WebElement chooseRelationshipStatus;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[3]//input")
    private WebElement specifyField;
    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    private WebElement dateOfBirth;


    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickDependents() {
        click(dependentsButton);
    }

    public void addNameField(String nameField) {
        addText(nameField, this.nameField);
    }

    public void addRelationship() {
        click(selectRelationship);
        click(chooseRelationshipStatus);
    }

    public void addSpecifyField(String specifyField) {
        addText(specifyField, this.specifyField);
    }

    public void addDateOfBirth(String dateOfBirth) {
        addText(dateOfBirth, this.dateOfBirth);
    }


}
