package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Immigration extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Immigration']")
    private WebElement immigrationButton;
    @FindBy(xpath = "(//input)[4]")
    private WebElement numberInput;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[1]")
    private WebElement issuedDate;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
    private WebElement expiryDate;
    @FindBy(xpath = "(//input)[7]")
    private WebElement eligibleStatus;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement issuedBy;
    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> countryChoosen;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[3]")
    private WebElement eligibleReviewDate;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement addFileButton;

    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickImmigration() {
        click(immigrationButton);
    }

    public void addNumber(String numberInput) {
        addText(numberInput, this.numberInput);
    }

    public void addIssuedDate(String issuedDate) {
        addText(issuedDate, this.issuedDate);
    }

    public void addExpiryDate(String expiryDate) {
        addText(expiryDate, this.expiryDate);
    }

    public void addEligibleStatus(String eligibleStatus) {
        addText(eligibleStatus, this.eligibleStatus);
    }

    public void addIssuedBy() {
        click(issuedBy);
        action(sortRandomElem(countryChoosen));
    }

    public void addFile(int x, int y) {
        javascriptExecutor(x, y);
        uploadDoc(addFileButton, "E:\\orangeHRM\\Immigration.txt");
    }
}
