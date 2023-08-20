package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PersonalDetails extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Personal Details']")
    private WebElement personalDetailsButton;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement middleName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;
    @FindBy(xpath = "(//input)[5]")
    private WebElement nickName;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement employeeId;
    @FindBy(xpath = "(//input)[8]")
    private WebElement driverLicenseNumber;
    @FindBy(xpath = "(//input)[9]")
    private WebElement licenseExpiryDate;
    @FindBy(xpath = "(//i)[6]")
    private WebElement chooseDateLicenseExpire;
    @FindBy(xpath = "(//input)[10]")
    private WebElement ssnNumber;
    @FindBy(xpath = "(//input)[11]")
    private WebElement sinNumber;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]//div[@tabindex='0']")
    private WebElement selectNationality;
    @FindBy(xpath = "//span[contains(text(),'Romanian')]")
    private WebElement choosenNationality;
    @FindBy(xpath = "(//i)[8]")
    private WebElement relationshipStatus;
    @FindBy(xpath = "//span[contains(text(),'Married')]")
    private WebElement choosenRelationshipStatus;
    @FindBy(xpath = "(//input)[12]")
    private WebElement dateOfBirth;
    @FindBy(xpath = "(//i)[9]")
    private WebElement chooseDateOfBirth;
    @FindBy(xpath = "//div[@class='oxd-date-input-link --close']")
    private WebElement closeChooseDateOfBirthField;
    @FindBy(xpath = "(//input)[15]")
    private WebElement militaryService;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[3]//div[@tabindex='0']")
    private WebElement selectBloodType;
    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> choosenBloodType;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement addFileButton;


    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickPersonalDetailsButton() {
        click(personalDetailsButton);
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

    public void addNickName(String nickName) {
        addTextToDisabledTextBox(nickName, this.nickName);
    }

    public void addExmployeeId(String employeeId) {
        addText(employeeId, this.employeeId);
    }

    public void addDriverLicenseNumber(String driverLicenseNumber) {
        addText(driverLicenseNumber, this.driverLicenseNumber);
    }

    public void addLicenseExpiryDate(String licenseExpiryDate) {
        addText(licenseExpiryDate, this.licenseExpiryDate);
        click(chooseDateLicenseExpire);
    }

    public void addSsnNumber(String ssnNumber) {
        addText(ssnNumber, this.ssnNumber);
    }

    public void addSinNumber(String sinNumber) {
        addText(sinNumber, this.sinNumber);
    }

    public void clickChooseNationality(int x, int y) {
        javascriptExecutor(x, y);
        click(selectNationality);
        click(choosenNationality);
    }


    public void clickRelationShipStatus() {
        click(relationshipStatus);
        click(choosenRelationshipStatus);
    }

    public void addDateOfBirth(String dateofBirth) {
        addText(dateofBirth, this.dateOfBirth);
    }

    public void clickChooseDateOfBirth() {
        click(chooseDateOfBirth);
        click(closeChooseDateOfBirthField);
    }

    public void addMilitaryService(String militaryService) {
        addText(militaryService, this.militaryService);
    }


    public void clickSelectBloodType() {
        click(selectBloodType);
        action(sortRandomElem(choosenBloodType));
    }

    public void addFile() {
        uploadDoc(addFileButton, "E:\\orangeHRM\\Personal Details.txt");
    }


}
