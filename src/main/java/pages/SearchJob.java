package pages;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchJob extends BaseTest {

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    private WebElement adminButton;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
    private WebElement jobButton;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]")
    private WebElement jobTitle;


    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    private WebElement deleteButton;
    @FindBy(xpath = "//*[@id='app']/div[3]/div/div/div/div[3]/button[2]")
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
