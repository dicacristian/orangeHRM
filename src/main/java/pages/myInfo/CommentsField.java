package pages.myInfo;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentsField extends BaseTest {
    @FindBy(xpath = "//textarea[@placeholder='Type comment here']")

    private WebElement commentSection;
    @FindBy(xpath = "//textarea[@placeholder='Type Comments here']")
    private WebElement commentsSection;
    @FindBy(xpath = "(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]")
    private WebElement commentFieldEmpty;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[2]/div/div/div/div[2]/textarea")
    private WebElement secondCommentFieldEmpty;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[2]/div/div/div/div[2]/textarea")
    private WebElement thirdCommentFieldEmpty;
    public void addCommentSection(String commentSection) {
        addText(commentSection, this.commentSection);
    }
    public void addCommentsSection(String commentsSection) {
        addText(commentsSection, this.commentsSection);
    }
    public void addCommentFieldEmpty(String commentFieldEmpty) {
        addText(commentFieldEmpty, this.commentFieldEmpty);
    }
    public void addAnotherCommentFieldEmpty(String secondCommentFieldEmpty) {
        addText(secondCommentFieldEmpty, this.secondCommentFieldEmpty);
    }
    public void addThirdCommentFieldEmpty(String thirdCommentFieldEmpty){
        addText(thirdCommentFieldEmpty,this.thirdCommentFieldEmpty);
    }
}
