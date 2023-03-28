package shaft.ManagerPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import shaft.Base.Setup;
import shaft.Base.TestData;

public class ManagerPage {


    @Test(priority = 1)
    public void getSectionManagerPage(){
        By clickSectionManager = ManagerPagePOM.getSectionManager();
        Setup.driver.element().click(clickSectionManager);
        By clickSubSectionManager = ManagerPagePOM.getSubSectionManager();
        Setup.driver.element().click(clickSubSectionManager);

    }

    @Test(priority = 2)
    public void getManagerPage(){
        By addManagerButton =ManagerPagePOM.getAddManagerButton();
        Setup.driver.element().click(addManagerButton);
    }

    @Test(priority = 3)
    public void AddManger() {

        By addNameManager = ManagerPagePOM.getNameManagerField();
        Setup.driver.element().waitToBeInvisible(addNameManager);
        Setup.driver.element().type(addNameManager, TestData.ManagerData.name);

        By addEmailManager = ManagerPagePOM.getEmailManagerField();
        Setup.driver.element().type(addEmailManager, TestData.ManagerData.email);

        By addPasswordManager = ManagerPagePOM.getPasswordManagerField();
        Setup.driver.element().type(addPasswordManager, TestData.ManagerData.password);

        By getRoleManagerField = ManagerPagePOM.getRoleManagerField();
        Setup.driver.element().click(getRoleManagerField);
        By getNameRoleManagerField = ManagerPagePOM.getNameRoleManagerField();
        Setup.driver.element().click(getNameRoleManagerField);

        By getCancelManagerRole = ManagerPagePOM.getCancelManagerRole();
        Setup.driver.element().click(getCancelManagerRole);

        By getSaveManagerButton = ManagerPagePOM.getSaveManagerButton();
        Setup.driver.element().click(getSaveManagerButton);

    }

    @Test(priority = 4)
    public void VerifiedSuccessAddManager(){
        By getSuccessAddManager = ManagerPagePOM.getSuccessAddManager();
        String textSuccessAddManager = Setup.driver.element().getText(getSuccessAddManager);
        Assert.assertEquals(textSuccessAddManager,"إدارة المسؤولين");
    }
}
