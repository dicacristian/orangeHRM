package pages.myInfo.Buttons;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddButton extends BaseTest {
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[1]")
    private WebElement firstAddButtonOnThePage;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[2]")
    private WebElement secondAddButtonOnThePage;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[3]")
    private WebElement thirdAddButtonOnThePage;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[4]")
    private WebElement fourAddButtonOnThePage;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[5]")
    private WebElement fiveAddButtonOnThePage;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[6]")
    private WebElement sixAddButtonOnThePage;
    public void clickAddButton() {
        click(addButton);
    }
    public void clickFirstAddButtonOnThePage(){
        click(firstAddButtonOnThePage);
    }
    public void clickSecondAddButtonOnThePage(){
        click(secondAddButtonOnThePage);
    }
    public void clickThirdAddButtonOnThePage(){
        click(thirdAddButtonOnThePage);
    }
    public void clickFourAddButtonOnThePage(){
        click(fourAddButtonOnThePage);
    }
    public void clickFiveAddButtonOnThePage(){
        click(fiveAddButtonOnThePage);
    }
    public void clickSixAddButtonOnThePage(){
        click(sixAddButtonOnThePage);
    }


}
