package pages.myInfo.Buttons;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveButton extends BaseTest {
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
    private WebElement firstSaveButton;
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[2]")
    private WebElement secondSaveButton;
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[3]")
    private WebElement thirdSaveButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[3]/button[2]")
    private WebElement fourSaveButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[3]/button[2]")
    private WebElement fiveSaveButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[3]/button[2]")
    private WebElement sixSaveButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[3]/button[2]")
    private WebElement savebuttonNormalize;

    public void clickFirstSaveButton() {
        click(firstSaveButton);
    }

    public void clickSecondSaveButton() {
        click(secondSaveButton);
    }

    public void clickThirdSaveButton() {
        click(thirdSaveButton);
    }

    public void clickFourSaveButton() {
        click(fourSaveButton);
    }

    public void clickFiveSaveButton() {
        click(fiveSaveButton);
    }

    public void clickSixSaveButton() {
        click(sixSaveButton);
    }

    public void clickSaveButtonNormalize() {
        click(savebuttonNormalize);
    }
}


