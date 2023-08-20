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
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[1]")
    private WebElement fromDate;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
    private WebElement toDate;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[4]/div/div[3]")
    private WebElement closeButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div/div/div/div[2]/textarea")
    private WebElement workExperienceComment;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement selectLevel;
    @FindBy(xpath = "//span[contains(text(),'High School Diploma')]")
    private WebElement choosenSelectLevel;


    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[7]//input")
    private WebElement institute;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[8]//input")
    private WebElement specialization;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[9]//input")
    private WebElement year;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[10]//input")
    private WebElement gpaScore;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[3]")
    private WebElement startDate;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[4]")
    private WebElement endDate;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]//div[@tabindex='0']")
    private WebElement selectSkill;
    @FindBy(xpath = "(//div[@role='option'])[2]")
    private WebElement selectedSkill;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement yearsOfExperience;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement selectLanguage;
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[3]")
    private WebElement choosenLanguage;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
    private WebElement chooseFluency;
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    private WebElement choosenFluency;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[5]")
    private WebElement chooseCompetency;
    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> choosenCompetency;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[6]//div[@tabindex='0']")
    private WebElement selectLicenseType;
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[4]")
    private WebElement selectedLicenseType;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement licenseNumber;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[1]")
    private WebElement issuedDate;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
    private WebElement expiryDate;

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
        action(sortRandomElem(choosenCompetency));

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


}
