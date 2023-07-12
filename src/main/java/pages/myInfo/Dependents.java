package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dependents extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Dependents']")
    private WebElement dependentsButton;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement nameField;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement selectRelationship;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]")
    private WebElement chooseRelationshipStatus;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
    private WebElement specifyField;
    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    private WebElement dateOfBirth;


    @FindBy(xpath = "//input[@type='file']")
    private WebElement addFileButton;
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
        addTextToDisabledTextBox(specifyField, this.specifyField);
    }

    public void addDateOfBirth(String dateOfBirth) {
        addText(dateOfBirth, this.dateOfBirth);
    }

    public void addFile(int x, int y) {
        javascriptExecutor(x, y);
        uploadDoc(addFileButton, "E:\\orangeHRM\\Dependents.txt");
    }
}
