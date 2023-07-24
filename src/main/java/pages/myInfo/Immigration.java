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
//    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[5]/div/div[2]/div/div[2]/div[177]/span")
//    private WebElement countryChoosen;
    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> countryChoosen;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[3]")
    private WebElement eligibleReviewDate;
    @FindBy(xpath = "(//textarea[@placeholder='Type Comments here'])[1]")
    private WebElement immigrationComment;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement addFileButton;
    @FindBy(xpath = "//textarea[@placeholder='Type comment here']")
    private WebElement commentSection;

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

    public void addEligibleReviewDate(String eligibleReviewDate) {
        addText(eligibleReviewDate, this.eligibleReviewDate);
    }

    public void addImmigrationComment(String immigrationComment) {
        addText(immigrationComment, this.immigrationComment);
    }

    public void addFile(int x, int y) {
        javascriptExecutor(x, y);
        uploadDoc(addFileButton, "E:\\orangeHRM\\Immigration.txt");
    }

    public void addCommentSection(int x, int y, String commentSection) {
        javascriptExecutor(x, y);
        addText(commentSection, this.commentSection);
    }
}
