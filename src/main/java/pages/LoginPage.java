package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {
    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void addUsername(String username) {
        addText(username, this.username);
    }

    public void addPassword(String password) {
        addText(password, this.password);
    }
    public void clickLoginButton(){
        click(loginButton);
    }

}
