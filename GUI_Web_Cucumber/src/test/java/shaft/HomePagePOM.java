package shaft;

import org.openqa.selenium.By;

public class HomePagePOM {


    static public By getEmailItem(){

        return By.name("email");
    }
    static public By getPasswordItem(){

        return By.name("password");
    }


    static public By getLoginButtonItem(){

        return By.xpath("//*[@id=\"btnSubmit\"]");
    }

    static public By getLoginSuccessfully(){
        return By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div/h1");
    }
}
