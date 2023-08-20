package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Memberships extends BaseTest {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoField;
    @FindBy(xpath = "//a[normalize-space()='Memberships']")
    private WebElement membershipsButton;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]//div[@tabindex='0']")
    private WebElement chooseMembership;
    @FindBy(xpath = "//span[contains(text(),'Chartered Institute of Marketing (CIM)')]")
    private WebElement choosenMembership;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]//div[@tabindex='0']")
    private WebElement chooseSubscriptionPaidBy;
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    private WebElement choosenSubcriptionPaidBy;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement subscriptionAmount;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[3]//div[@tabindex='0']")
    private WebElement currency;
    @FindBy(xpath = "//div[@class='oxd-select-option']")
    private List<WebElement> chooseRandom;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[1]")
    private WebElement subcriptionCommerceDate;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
    private WebElement subscriptionRenewalDate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div/div[4]/div/div[3]")
    private WebElement closeSubscriptionRenewalDate;

    public void clickMyInfoSection() {
        click(myInfoField);
    }

    public void clickMembershipButton() {
        click(membershipsButton);
    }


    public void selectChooseMembership() {
        click(chooseMembership);
        click(choosenMembership);
    }

    public void selectSubscriptionPaidBy() {
        click(chooseSubscriptionPaidBy);
        click(choosenSubcriptionPaidBy);
    }

    public void addSubscriptionAmount(String subscriptionAmount) {
        addText(subscriptionAmount, this.subscriptionAmount);
    }

    public void addSelectCurrency() {
        click(currency);
        action(sortRandomElem(chooseRandom));
    }

    public void addSubscriptionCommerceDate(String subcriptionCommerceDate) {
        addText(subcriptionCommerceDate, this.subcriptionCommerceDate);
    }

    public void addSubscriptionRenewalDate(String subscriptionRenewalDate) {
        addText(subscriptionRenewalDate, this.subscriptionRenewalDate);
        click(closeSubscriptionRenewalDate);
    }


}
