package shaft.UserPage;

import org.openqa.selenium.By;

public class UsersPagePOM {
    static public By getSectionUsers(){

        return By.xpath("//*[@id=\"#kt_header_menu\"]/div[6]/span");
    }

    static public By getSubSectionUsers(){

        return By.xpath("//*[@id=\"#kt_header_menu\"]/div[6]/div/div[1]/a/span[2]");
    }
    static public By getAddUserButton(){

        return By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div/a");
    }

    static public By getAddNumberUser(){
        return By.xpath("//*[@id=\"employee_id\"]");
    }
    static public By getAddFirstNameUser(){
        return By.xpath("//*[@id=\"first_name\"]");
    }
    static public By getAddMiddleNameUser(){

        return By.xpath("//*[@id=\"middle_name\"]");
    }
    static public By getAddLastNameUser(){

        return By.xpath("//*[@id=\"last_name\"]");
    }
    static public By getAddEmailUser(){

        return By.xpath("//*[@id=\"email\"]");
    }
    static public By getAddTelephoneUser(){

        return By.xpath("//*[@id=\"phone\"]");
    }
    static public By getAddMobileUser(){

        return By.xpath("//*[@id=\"mobile\"]/input");
    }
    static public By getAddPasswordUser(){

        return By.xpath("//*[@id=\"password\"]");
    }
    static public By getAddCountryUser(){

        return By.xpath("//*[@id=\"country_id\"]");
    }
    static public By getAddCityUser(){

        return By.xpath("//*[@id=\"city_id\"]");
    }
    static public By getAddCompanyUser(){

        return By.xpath("//*[@id=\"company_id\"]");
    }
    static public By getAddCBranchUser(){

        return By.xpath("//*[@id=\"branch_id\"]");
    }
    static public By getAddDepartmentUser(){

        return By.xpath("//*[@id=\"department_id\"]a");
    }
    static public By getAddPositionUser(){

        return By.xpath("//*[@id=\"position_id\"]");
    }

    static public By getAddGroupsUser(){

        return By.xpath("//*[@id=\"group_id\"]");
    }
}
