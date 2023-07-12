package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.SearchJob;
import pages.SearchUsers;

public class SearchJobTest extends BasePage {
    public SearchJob searchJob() {
        return new SearchJob();
    }

    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Test(description = "Testing the Job title section")
    @Parameters({"username", "password"})
    public void searchJob(String username, String password) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        searchJob().clickAdminButton();
        searchJob().clickJobButton();
        searchJob().clickTitleJob();
        searchJob().clickDeleteButton();
        searchJob().clickConfirmDeleteButton();

    }
}
