package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.Buttons.AddButton;
import pages.myInfo.Buttons.SaveButton;
import pages.myInfo.CommentsField;
import pages.myInfo.PersonalDetails;

public class PersonalDetailsTest extends BasePage {
    public PersonalDetails personalDetails() {
        return new PersonalDetails();
    }

    public LoginPage loginPage() {
        return new LoginPage();
    }

    public CommentsField comments() {
        return new CommentsField();
    }

    public AddButton addButton() {
        return new AddButton();
    }

    public SaveButton saveButton() {
        return new SaveButton();
    }
    @Test(description = "Test the Personal Details Field")
    @Parameters({"username", "password", "firstName", "middleName", "lastName", "nickName", "employeeId", "driverLicenseNumber", "licenseExpiryDate", "ssnNumber", "sinNumber", "dateOfBirth", "militaryService", "commentSection"})
    public void personalDetailsTest(String username, String password, String firstName, String middleName, String lastName, String nickName, String employeeId, String driverLicenseNumber, String licenseExpiryDate, String ssnNumber, String sinNumber, String dateOfBirth, String militaryService, String commentSection) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        personalDetails().clickMyInfoSection();
        personalDetails().clickPersonalDetailsButton();
        personalDetails().addFirstName(firstName);
        personalDetails().addMiddleName(middleName);
        personalDetails().addLastName(lastName);
        personalDetails().addNickName(nickName);
        personalDetails().addExmployeeId(employeeId);
        personalDetails().addDriverLicenseNumber(driverLicenseNumber);
        personalDetails().addLicenseExpiryDate(licenseExpiryDate);
        personalDetails().addSsnNumber(ssnNumber);
        personalDetails().addSinNumber(sinNumber);
        personalDetails().clickChooseNationality(0, 400);
        personalDetails().clickRelationShipStatus();
        personalDetails().addDateOfBirth(dateOfBirth);
        personalDetails().clickChooseDateOfBirth();
        personalDetails().addMilitaryService(militaryService);
        saveButton().clickFirstSaveButton();
        personalDetails().clickSelectBloodType();
        saveButton().clickSecondSaveButton();
        addButton().clickAddButton();
        personalDetails().addFile();
        comments().addCommentSection(commentSection);
        saveButton().clickThirdSaveButton();
    }

}
