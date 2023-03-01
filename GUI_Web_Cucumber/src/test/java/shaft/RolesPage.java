package shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RolesPage {

    @Test(priority = 1)
    public void getSectionRolesPage(){
        By clickSection = RolesPagePOM.getSectionRoles();
        Setup.driver.element().click(clickSection);
        By clickSubSection = RolesPagePOM.getSubSectionRoles();
        Setup.driver.element().click(clickSubSection);

    }
    @Test(priority = 2)
    public void getRolesPage(){
        By addRoleButton =RolesPagePOM.getAddRoleButton();
        Setup.driver.element().click(addRoleButton);
    }

    @Test(priority = 3)
    public void AddRole(){

        By addNameRole =RolesPagePOM.getNameRole();
        Setup.driver.element().type(addNameRole,TestData.TestRole);

        Setup.driver.assertThat().element(addNameRole).isDisabled();

        By addPermissionRole = RolesPagePOM.getPermissionRole();
        Setup.driver.element().click(addPermissionRole);

        By getSaveRoleButton = RolesPagePOM.getSaveRoleButton();
        Setup.driver.element().click(getSaveRoleButton);


    }
    @Test(priority = 4)
    public void VerifiedSuccessAddRole(){
        By getSuccessAddRoleText = RolesPagePOM.getSuccessAddRole();
        String textSuccessAddedRole = Setup.driver.element().getText(getSuccessAddRoleText);
        Assert.assertEquals(textSuccessAddedRole,"الاسم");
    }




//    @Test(priority = 2)
//    public void verifyClickingJoinAsSpecialistOpensTheFormjhg() {
//        Setup.wait.until(ExpectedConditions.elementToBeClickable(JoinFormPOM.getNameField()));
//        JoinFormPOM.getNameField().sendKeys(TestData.NewSpecialistData.name);
//        JoinFormPOM.getMobileField().sendKeys(TestData.NewSpecialistData.mobile);
//        JoinFormPOM.getAcademicDegreeField().sendKeys(TestData.NewSpecialistData.academicDegree);
//        JoinFormPOM.getSpecialityField().sendKeys(TestData.NewSpecialistData.specialization);
//        JoinFormPOM.getYearsOfExperienceField().sendKeys(TestData.NewSpecialistData.yearsOfExperience);
//        JoinFormPOM.getSocialAccountField().sendKeys(TestData.NewSpecialistData.socialAccount);
//        JoinFormPOM.getSendFormButtontField().click();
//        Setup.wait.until(ExpectedConditions.visibilityOf(JoinFormPOM.getSuccessLabel()));
//        Assert.assertEquals(JoinFormPOM.getSuccessLabel().getText(), TestData.NewSpecialistData.successMessage);
//    }
}
