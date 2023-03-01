package shaft;

import org.openqa.selenium.By;

public class RolesPagePOM {

    static public By getSectionRoles(){

        return By.xpath("//*[@id=\"#kt_header_menu\"]/div[4]/span/span[2]");
    }

    static public By getSubSectionRoles(){

        return By.xpath(" //*[@id=\"#kt_header_menu\"]/div[4]/div/div/a/span[2]");
    }
    static public By getAddRoleButton(){

        return By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div/a");
    }
    static public By getNameRole(){

        return By.xpath("//*[@id=\"form_information\"]/div[1]/div/input");
    }
    static public By getPermissionRole(){

        return By.xpath("//*[@id=\"permissions\"]");
    }

    static public By getSaveRoleButton(){
        return By.xpath("//*[@id=\"form_information\"]/div[15]/div/button/span[1]");
    }

    static public By getSuccessAddRole(){
        return By.xpath("//*[@id=\"rolesTB\"]/thead/tr/th[1]");
    }
}
