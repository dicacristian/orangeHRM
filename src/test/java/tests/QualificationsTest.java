package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.Buttons.AddButton;
import pages.myInfo.Buttons.SaveButton;
import pages.myInfo.CommentsField;
import pages.myInfo.Qualifications;

public class QualificationsTest extends BasePage {
    public LoginPage loginPage() {
        return new LoginPage();
    }

    public Qualifications qualifications() {
        return new Qualifications();
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
    @Test(description = "Test the Qualifications Field")
    @Parameters({"username", "password", "companyName", "jobTitle", "fromDate", "toDate", "workExperienceComment", "institute", "specialization", "year", "gpaScore", "startDate", "endDate", "yearsOfExperience", "commentsSkillField", "commentsLanguage", "licenseNumber", "issuedDate", "expiryDate", "commentQualification"})
    public void qualificationsTest(String username, String password, String companyName, String jobTitle, String fromDate, String toDate, String workExperienceComment, String institute, String specialization, String year, String gpaScore, String startDate, String endDate, String yearsOfExperience, String commentsSkillField, String commentsLanguage, String licenseNumber, String issuedDate, String expiryDate, String commentQualification) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        qualifications().clickMyInfoSection();
        qualifications().clickQualifications();
        addButton().clickFirstAddButtonOnThePage();
        qualifications().addCompanyName(companyName);
        qualifications().addJobTitle(jobTitle);
        qualifications().addFromDate(fromDate);
        qualifications().addToDate(toDate);
        qualifications().addWorkExperienceComment(workExperienceComment);
        saveButton().clickFirstSaveButton();
        addButton().clickSecondAddButtonOnThePage();
        qualifications().clickSelectLevel(0, 200);
        qualifications().addInstitute(0, 200, institute);
        qualifications().addSpecialization(specialization);
        qualifications().addYear(year);
        qualifications().addGpaScore(gpaScore);
        qualifications().addStartDate(startDate);
        qualifications().addEndDate(endDate);
        saveButton().clickSecondSaveButton();
        addButton().clickThirdAddButtonOnThePage();
        qualifications().clickSelectSkill();
        qualifications().addYearsOfExperience(yearsOfExperience);
        commentsField().addAnotherCommentFieldEmpty(commentsSkillField);
        saveButton().clickSaveButtonNormalize();
        addButton().clickFourAddButtonOnThePage();
        qualifications().clickSelectLanguage();
        qualifications().clickChooseFluency(0, -100);
        qualifications().clickChooseCompetency();
        commentsField().addThirdCommentFieldEmpty(commentsLanguage);
        saveButton().clickFourSaveButton();
        addButton().clickFiveAddButtonOnThePage();
        qualifications().clickSelectLicenseType();
        qualifications().addLicenseNumber(licenseNumber);
        qualifications().addIssuedDate(issuedDate);
        qualifications().addExpiryDate(expiryDate);
        saveButton().clickFiveSaveButton();
        addButton().clickSixAddButtonOnThePage();
        qualifications().addFile();
        commentsField().addCommentSection(commentQualification);
        saveButton().clickSixSaveButton();
    }
}
