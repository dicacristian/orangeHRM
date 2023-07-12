package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ContactDetails extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Contact Details']")
    private WebElement contactDetailsField;
    @FindBy(xpath = "(//input)[2]")
    private WebElement streetOneAddress;
    @FindBy(xpath = "(//input)[3]")
    private WebElement streetTwoAddress;
    @FindBy(xpath = "(//input)[4]")
    private WebElement city;
    @FindBy(xpath = "(//input)[5]")
    private WebElement state;
    @FindBy(xpath = "(//input)[6]")
    private WebElement postalCode;
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    private WebElement chooseCountry;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[177]")
    private WebElement choosenCountry;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
    private WebElement homeNumber;
    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[2]//div[1]//div[2]//input[1]")
    private WebElement mobile;
    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[3]//div[1]//div[2]//input[1]")
    private WebElement workMobile;
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[2]//input[1]")
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
