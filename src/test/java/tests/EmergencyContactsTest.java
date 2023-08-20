package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.Buttons.AddButton;
import pages.myInfo.Buttons.SaveButton;
import pages.myInfo.CommentsField;
import pages.myInfo.EmergencyContacts;

public class EmergencyContactsTest extends BasePage {
    public LoginPage loginPage() {
        return new LoginPage();
    }

    public EmergencyContacts emergencyContacts() {
        return new EmergencyContacts();
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

    @Test(description = "Test the contact Details Field")
    @Parameters({"username", "password", "saveEmergencyContactName", "saveEmergencyContactRelationship", "saveEmergencyContactHomeTelephone", "saveEmergencyContactMobile", "saveEmergencyContactWorkTelephone", "commentSection"})
    public void emergencyContactsTest(String username, String password, String saveEmergencyContactName, String saveEmergencyContactRelationship, String saveEmergencyContactHomeTelephone, String saveEmergencyContactMobile, String saveEmergencyContactWorkTelephone, String commentSection) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        emergencyContacts().clickMyInfoSection();
        emergencyContacts().clickEmergencyContacts();
        addButton().clickFirstAddButtonOnThePage();
        emergencyContacts().addSaveEmergencyContactName(saveEmergencyContactName);
        emergencyContacts().addSaveEmergencyContactRelationship(saveEmergencyContactRelationship);
        emergencyContacts().addSaveEmergencyContactHomeTelephone(saveEmergencyContactHomeTelephone);
        emergencyContacts().addSaveEmergencyContactMobile(saveEmergencyContactMobile);
        emergencyContacts().addSaveEmergencyContactWorkTelephone(saveEmergencyContactWorkTelephone);
        saveButton().clickFirstSaveButton();
        addButton().clickSecondAddButtonOnThePage();
        commentsField().addCommentSection(commentSection);
        saveButton().clickSecondSaveButton();

    }
}
