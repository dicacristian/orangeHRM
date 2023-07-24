package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Qualifications extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Qualifications']")
    private WebElement qualificationButton;
    @FindBy(xpath = "(//input)[2]")
    private WebElement companyName;
    @FindBy(xpath = "(//input)[3]")
    private WebElement jobTitle;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
    private WebElement fromDate;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    private WebElement toDate;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[4]/div/div[3]")
    private WebElement closeButton;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div/div/div/div[2]/textarea")
    private WebElement workExperienceComment;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement selectLevel;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[5]")
    private WebElement choosenSelectLevel;
    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> chooseRandom;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement institute;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
    private WebElement specialization;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement year;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
    private WebElement gpaScore;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
    private WebElement startDate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    private WebElement endDate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement selectSkill;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[8]")
    private WebElement selectedSkill;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement yearsOfExperience;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement selectLanguage;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[4]")
    private WebElement choosenLanguage;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement chooseFluency;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement choosenFluency;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div")
    private WebElement chooseCompetency;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[3]")
    private WebElement choosenCompetency;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement selectLicenseType;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[6]")
    private WebElement selectedLicenseType;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement licenseNumber;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
    private WebElement issuedDate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    private WebElement expiryDate;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement addFileButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[2]/div/div/div/div[2]/textarea")
    private WebElement commentQualification;

    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickQualifications() {
        click(qualificationButton);
    }

    public void addCompanyName(String companyName) {
        addText(companyName, this.companyName);
    }

    public void addJobTitle(String jobTitle) {
        addText(jobTitle, this.jobTitle);
    }

    public void addFromDate(String fromDate) {
        addText(fromDate, this.fromDate);
    }

    public void addToDate(String toDate) {
        addText(toDate, this.toDate);
        click(closeButton);
    }

    public void addWorkExperienceComment(String workExperienceComment) {
        addText(workExperienceComment, this.workExperienceComment);
    }

    public void clickSelectLevel(int x, int y) {
        javascriptExecutor(x, y);
        click(selectLevel);
        click(choosenSelectLevel);
    }

    public void addInstitute(int x, int y, String institute) {
        javascriptExecutor(x, y);
        addText(institute, this.institute);
    }

    public void addSpecialization(String specialization) {
        addText(specialization, this.specialization);
    }

    public void addYear(String year) {
        addText(year, this.year);
    }

    public void addGpaScore(String gpaScore) {
        addText(gpaScore, this.gpaScore);
    }

    public void addStartDate(String startDate) {
        addText(startDate, this.startDate);
    }

    public void addEndDate(String endDate) {
        addText(endDate, this.endDate);
    }


    public void clickSelectSkill() {
        click(selectSkill);
        click(selectedSkill);
    }

    public void addYearsOfExperience(String yearsOfExperience) {
        addText(yearsOfExperience, this.yearsOfExperience);
    }

    public void clickSelectLanguage() {
        click(selectLanguage);
        click(choosenLanguage);
    }

    public void clickChooseFluency(int x, int y) {
        javascriptExecutor(x, y);
        click(chooseFluency);
        click(choosenFluency);
    }

    public void clickChooseCompetency() {
        click(chooseCompetency);
        action(sortRandomElem(chooseRandom));
    }

    public void clickSelectLicenseType() {
        click(selectLicenseType);
        click(selectedLicenseType);
    }

    public void addLicenseNumber(String licenseNumber) {
        addText(licenseNumber, this.licenseNumber);
    }

    public void addIssuedDate(String issuedDate) {
        addText(issuedDate, this.issuedDate);
    }

    public void addExpiryDate(String expiryDate) {
        addText(expiryDate, this.expiryDate);
    }

    public void addFile() {
        uploadDoc(addFileButton, "E:\\orangeHRM\\Qualifications.txt");
    }


}
