package pages;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchJob extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Admin']")
    private WebElement adminButton;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
    private WebElement jobButton;
    @FindBy(xpath = "(//a[@role='menuitem'])[1]")
    private WebElement jobTitle;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    private WebElement confirmDeleteButton;

    public void clickAdminButton() {
        click(adminButton);
    }

    public void clickJobButton() {
        click(jobButton);
    }

    public void clickTitleJob() {
        click(jobTitle);
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public void clickConfirmDeleteButton() {
        click(confirmDeleteButton);
    }
}
