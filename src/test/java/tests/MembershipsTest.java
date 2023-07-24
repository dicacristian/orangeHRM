package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.Buttons.AddButton;
import pages.myInfo.Buttons.SaveButton;
import pages.myInfo.CommentsField;
import pages.myInfo.Memberships;

public class MembershipsTest extends BasePage {
    public LoginPage loginPage() {
        return new LoginPage();
    }

    public Memberships memberships() {
        return new Memberships();
    }

    public CommentsField commentsField() {
        return new CommentsField();
    }

    public AddButton addButton() {
        return new AddButton();
    }

    public SaveButton saveButton() {
        return new SaveButton();
    }

    @Test(description = "Test the Memberships Field")
    @Parameters({"username", "password", "subscriptionAmount", "subcriptionCommerceDate", "subscriptionRenewalDate", "commentAddAttachmentMemberships"})
    public void membershipsTest(String username, String password, String subscriptionAmount, String subcriptionCommerceDate, String subscriptionRenewalDate, String commentAddAttachmentMemberships) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        memberships().clickMyInfoSection();
        memberships().clickMembershipButton();
        addButton().clickFirstAddButtonOnThePage();
        memberships().selectChooseMembership();
        memberships().selectSubscriptionPaidBy();
        memberships().addSubscriptionAmount(subscriptionAmount);
        memberships().addSelectCurrency();
        memberships().addSubscriptionCommerceDate(subcriptionCommerceDate);
        memberships().addSubscriptionRenewalDate(subscriptionRenewalDate);
        saveButton().clickFirstSaveButton();
        addButton().clickSecondAddButtonOnThePage();
        memberships().addFile(0, 100);
        commentsField().addCommentSection(commentAddAttachmentMemberships);
        saveButton().clickSecondSaveButton();
    }
}
