package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.Buttons.AddButton;
import pages.myInfo.Buttons.SaveButton;
import pages.myInfo.CommentsField;
import pages.myInfo.Dependents;

public class DependentsTest extends BasePage {
    public LoginPage loginPage() {
        return new LoginPage();
    }

    public Dependents dependents() {
        return new Dependents();
    }

    public CommentsField commentsField() {
        return new CommentsField();
    }

    public AddButton addButton() {
        return new AddButton();
    }

    public SaveButton saveButton() {
        return new SaveButton();
    }

    @Test(description = "Test the Dependents field")
    @Parameters({"username", "password", "nameField", "dateOfBirth", "specifyField", "commentSection"})
    public void dependentsTest(String username, String password, String nameField, String dateOfBirth, String specifyField, String commentSection) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        dependents().clickMyInfoSection();
        dependents().clickDependents();
        addButton().clickFirstAddButtonOnThePage();
        dependents().addNameField(nameField);
        dependents().addRelationship();
        dependents().addSpecifyField(specifyField);
        dependents().addDateOfBirth(dateOfBirth);
        saveButton().clickFirstSaveButton();
        addButton().clickSecondAddButtonOnThePage();
        dependents().addFile(0, 100);
        commentsField().addCommentSection(commentSection);
        saveButton().clickSecondSaveButton();
    }
}
