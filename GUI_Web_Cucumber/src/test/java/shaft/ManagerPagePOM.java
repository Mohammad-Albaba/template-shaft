package shaft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ManagerPagePOM {

    static public By getSectionManager(){

        return By.xpath("//*[@id=\"#kt_header_menu\"]/div[5]/span/span[2]");
    }

    static public By getSubSectionManager(){

        return By.xpath("//*[@id=\"#kt_header_menu\"]/div[5]/div/div/a/span[2]");
    }
    static public By getAddManagerButton(){

        return By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div/a");
    }
    static public By getNameManagerField(){
        return By.xpath("//*[@id=\"modalAdd\"]/div/div/div[2]/form/div[2]/div[1]/div/input");
    }
    static public By getEmailManagerField(){
        return By.xpath("//*[@id=\"modalAdd\"]/div/div/div[2]/form/div[2]/div[2]/div/input");
    }
    static public By getPasswordManagerField(){
        return By.xpath("//*[@id=\"modalAdd\"]/div/div/div[2]/form/div[2]/div[3]/div/input");
    }
    static public By getRoleManagerField(){
        return By.xpath("//*[@id=\"modalAdd\"]/div/div/div[2]/form/div[2]/div[4]/div/div");
    }
    static public By getNameRoleManagerField(){
        return By.xpath("//*[@id=\"pv_id_2_0\"]");
    }
    static public By getCancelManagerRole(){
        return By.xpath("//*[@id=\"kt_body\"]/div[3]/div[1]/button");
    }
    static public By getSaveManagerButton(){
        return By.xpath("//*[@id=\"modalAdd\"]/div/div/div[2]/form/div[3]/button[1]/span[1]");
    }
    static public By getSuccessAddManager(){
        return By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/h3/span[1]");
    }


}
