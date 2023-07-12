package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.SearchUsers;

public class SearchUsersTests extends BasePage {

    public LoginPage loginPage() {
        return new LoginPage();
    }

    public SearchUsers searchUsers() {
        return new SearchUsers();
    }

    @Test(description = "Search the user")
    @Parameters({"username", "password", "userNameSearch", "employeeName",})
    public void searchUsers(String username, String password, String userNameSearch, String employeeName) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        searchUsers().clickAdminButton();
        searchUsers().addUserNameSearch(userNameSearch);
        searchUsers().clickUserRole();
        searchUsers().clickAdminUserRole();
        searchUsers().addEmployeeName(employeeName);
        searchUsers().clickNameEmployee();
        searchUsers().clickSelectStatus();
        searchUsers().clickSearchButton();

    }

}
