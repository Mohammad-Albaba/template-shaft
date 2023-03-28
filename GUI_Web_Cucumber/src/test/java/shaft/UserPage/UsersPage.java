package shaft.UserPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shaft.Base.Setup;
import shaft.Base.TestData;

public class UsersPage {
    @Test(priority = 1)
    public void getSectionUsersPage(){
        By clickSectionUsers = UsersPagePOM.getSectionUsers();
        Setup.driver.element().click(clickSectionUsers);
        By clickSubSectionUsers = UsersPagePOM.getSubSectionUsers();
        Setup.driver.element().click(clickSubSectionUsers);

    }

    @Test(priority = 2)
    public void getAddUserPage(){
        By addUserButton =UsersPagePOM.getAddUserButton();
        Setup.driver.element().click(addUserButton);
    }

    @Test(priority = 3)
    public void AddUser(){

        By addNumberUser = UsersPagePOM.getAddNumberUser();
        Setup.driver.element().type(addNumberUser, TestData.UserData.numberUser);

        By addFirstNameUser = UsersPagePOM.getAddFirstNameUser();
        Setup.driver.element().type(addFirstNameUser, TestData.UserData.firstName);

        By addMiddleNameUser = UsersPagePOM.getAddMiddleNameUser();
        Setup.driver.element().type(addMiddleNameUser, TestData.UserData.middleName);

        By addLastNameUser = UsersPagePOM.getAddLastNameUser();
        Setup.driver.element().type(addLastNameUser, TestData.UserData.lastName);

        By addEmailUser = UsersPagePOM.getAddEmailUser();
        Setup.driver.element().type(addEmailUser, TestData.UserData.email);

        By addTelephoneUser = UsersPagePOM.getAddTelephoneUser();
        Setup.driver.element().type(addTelephoneUser, TestData.UserData.telephone);

        By addPasswordUser = UsersPagePOM.getAddPasswordUser();
        Setup.driver.element().type(addPasswordUser, TestData.UserData.password);

        By addCountryUser = UsersPagePOM.getAddCountryUser();
        Setup.driver.element().type(addCountryUser, TestData.UserData.country);

    }

}
