package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.Buttons.AddButton;
import pages.myInfo.Buttons.SaveButton;
import pages.myInfo.CommentsField;
import pages.myInfo.Immigration;

public class ImigrationTest extends BasePage {
    public LoginPage loginPage() {
        return new LoginPage();
    }

    public Immigration immigration() {
        return new Immigration();
    }
    public CommentsField commentsField(){
        return new CommentsField();
    }
    public AddButton addButton() {
        return new AddButton();
    }

    public SaveButton saveButton(){
        return new SaveButton();
    }

    @Test(description = "Test the Immigration Field")
    @Parameters({"username", "password", "numberInput", "issuedDate", "expiryDate", "eligibleStatus", "immigrationComment", "commentSection"})
    public void immigrationTest(String username, String password, String numberInput, String issuedDate, String expiryDate, String eligibleStatus, String immigrationComment, String commentSection) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        immigration().clickMyInfoSection();
        immigration().clickImmigration();
        addButton().clickFirstAddButtonOnThePage();
        immigration().addNumber(numberInput);
        immigration().addIssuedDate(issuedDate);
        immigration().addExpiryDate(expiryDate);
        immigration().addEligibleStatus(eligibleStatus);
        immigration().addIssuedBy();
        commentsField().addCommentsSection(immigrationComment);
        saveButton().clickFirstSaveButton();
        addButton().clickSecondAddButtonOnThePage();
        immigration().addFile(0, 100);
        commentsField().addCommentSection(commentSection);
        saveButton().clickSecondSaveButton();
    }
}
