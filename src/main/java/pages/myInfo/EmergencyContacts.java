package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmergencyContacts extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
    private WebElement emergencyContact;
    @FindBy(xpath = "(//input)[2]")
    private WebElement saveEmergencyContactName;
    @FindBy(xpath = "(//input)[3]")
    private WebElement saveEmergencyContactRelationship;
    @FindBy(xpath = "(//input)[4]")
    private WebElement saveEmergencyContactHomeTelephone;
    @FindBy(xpath = "(//input)[5]")
    private WebElement saveEmergencyContactMobile;
    @FindBy(xpath = "(//input)[6]")
    private WebElement saveEmergencyContactWorkTelephone;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement addFileButton;

    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickEmergencyContacts() {
        click(emergencyContact);
    }


    public void addSaveEmergencyContactName(String saveEmergencyContactName) {
        addText(saveEmergencyContactName, this.saveEmergencyContactName);
    }

    public void addSaveEmergencyContactRelationship(String saveEmergencyContactRelationship) {
        addText(saveEmergencyContactRelationship, this.saveEmergencyContactRelationship);
    }

    public void addSaveEmergencyContactHomeTelephone(String saveEmergencyContactHomeTelephone) {
        addText(saveEmergencyContactHomeTelephone, this.saveEmergencyContactHomeTelephone);
    }

    public void addSaveEmergencyContactMobile(String saveEmergencyContactMobile) {
        addText(saveEmergencyContactMobile, this.saveEmergencyContactMobile);
    }

    public void addSaveEmergencyContactWorkTelephone(String saveEmergencyContactWorkTelephone) {
        addText(saveEmergencyContactWorkTelephone, this.saveEmergencyContactWorkTelephone);
    }
}
