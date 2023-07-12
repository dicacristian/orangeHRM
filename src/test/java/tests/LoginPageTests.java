package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginPageTests extends BasePage {
    public LoginPage loginPage(){
        return new LoginPage();
    }
    @Test(description = "Test the valid username and password")
    @Parameters({"username","password"})
    public void loginPageValid(String username, String password){
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
    }

    @Test(description = "Test the invalid login")
    @Parameters({"username","password"})
    public void invalidPageLogin(String username, String password){
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
    }
}
