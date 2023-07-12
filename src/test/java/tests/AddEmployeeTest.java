package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AddEmployee;
import pages.BasePage;
import pages.LoginPage;

public class AddEmployeeTest extends BasePage {

    public AddEmployee addEmployee() {
        return new AddEmployee();
    }

    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Test(description = "Testing the add emoployee section")
    @Parameters({"username", "password", "firstName", "middleName", "lastName", "employeeID", "usernameLoginDetails", "passwordLoginDetails", "confirmPasswordLoginDetails"})
    public void addEmployee(String username, String password, String firstName, String middleName, String lastName, String employeeID, String usernameLoginDetails, String passwordLoginDetails, String confirmPasswordLoginDetails) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        addEmployee().clickPIMBUTTON();
        addEmployee().clickAddEmployeeButton();
        addEmployee().addFirstName(firstName);
        addEmployee().addMiddleName(middleName);
        addEmployee().addLastName(lastName);
        addEmployee().addEmployeeID(employeeID);
        addEmployee().addPhoto();
        addEmployee().clickLoginDetails();
        addEmployee().clickStatusDetails();
        addEmployee().addUsernameLoginDetails(usernameLoginDetails);
        addEmployee().addPasswordLoginDetails(passwordLoginDetails);
        addEmployee().addConfirmPasswordLoginDetails(confirmPasswordLoginDetails);
        addEmployee().clickSaveButton(0,700);
    }
}



