package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.myInfo.ContactDetails;

public class ContactDetailsTest extends BasePage {

    public ContactDetails contactDetails() {
        return new ContactDetails();
    }

    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Test(description = "Test the Contact Details Field")
    @Parameters({"username", "password", "streetOneAddress", "streetTwoAddress", "city", "state", "postalCode", "homeNumber", "mobile", "workMobile", "workEmail","comment"})
    public void contactDetailsTest(String username, String password, String streetOneAddress, String streetTwoAddress, String city, String state, String postalCode, String homeNumber, String mobile, String workMobile, String workEmail,String comment) {
        loginPage().addUsername(username);
        loginPage().addPassword(password);
        loginPage().clickLoginButton();
        contactDetails().clickMyInfoSection();
        contactDetails().clickContactDetails();
        contactDetails().addStreetOneAddress(streetOneAddress);
        contactDetails().addStreetTwoAddress(streetTwoAddress);
        contactDetails().addCity(city);
        contactDetails().addState(state);
        contactDetails().addPostalCode(postalCode);
        contactDetails().clickChooseCountry();
        contactDetails().addHomeNumber(homeNumber, 0, 200);
        contactDetails().addMobile(mobile);
        contactDetails().addWorkMobile(workMobile);
        contactDetails().addWorkEmail(workEmail);
        contactDetails().clickSaveButton();
        contactDetails().addFile(0, 200);
        contactDetails().addComment(comment);
        contactDetails().clickSecondSaveButton();

    }
}
