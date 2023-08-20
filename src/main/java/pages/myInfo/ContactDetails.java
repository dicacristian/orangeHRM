package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactDetails extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Contact Details']")
    private WebElement contactDetailsField;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]//input")
    private WebElement streetOneAddress;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[2]//input")
    private WebElement streetTwoAddress;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[3]//input")
    private WebElement city;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[4]//input")
    private WebElement state;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]//input")
    private WebElement postalCode;
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    private WebElement chooseCountry;
    @FindBy(xpath = "//span[contains(text(),'Romania')]")
    private WebElement choosenCountry;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[7]//input")
    private WebElement homeNumber;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[8]//input")
    private WebElement mobile;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[9]//input")
    private WebElement workMobile;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[10]//input")
    private WebElement workEmail;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement browseButton;

    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickContactDetails() {
        click(contactDetailsField);
    }

    public void addStreetOneAddress(String streetOneAddress) {
        addText(streetOneAddress, this.streetOneAddress);
    }

    public void addStreetTwoAddress(String streetTwoAddress) {
        addText(streetTwoAddress, this.streetTwoAddress);
    }

    public void addCity(String city) {
        addText(city, this.city);
    }

    public void addState(String state) {
        addText(state, this.state);
    }

    public void addPostalCode(String postalCode) {
        addText(postalCode, this.postalCode);
    }

    public void clickChooseCountry() {
        click(chooseCountry);
        click(choosenCountry);
    }

    public void addHomeNumber(String homeNumber, int x, int y) {
        javascriptExecutor(x, y);
        addText(homeNumber, this.homeNumber);
    }

    public void addMobile(String mobile) {
        addText(mobile, this.mobile);
    }

    public void addWorkMobile(String workMobile) {
        addText(workMobile, this.workMobile);
    }

    public void addWorkEmail(String workEmail) {
        addText(workEmail, this.workEmail);
    }

    public void addFile() {
        uploadDoc(browseButton, "C:\\Users\\Dicky\\Downloads\\IMG_0500.jpeg");
    }

}
