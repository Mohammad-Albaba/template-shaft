package shaft.HomePage;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static shaft.Base.Setup.setUp;


public class HomePage {


//        By seleniumButton = By.id("selenium");
//        By appiumButton = By.name("appium");
//        By cypressButton = By.cssSelector("[data-testid=cypress]");
//
//        String text = driver.element().getText(seleniumButton);
//        System.out.println(text);
//
//        By firstNameInput = By.name("firstname");
//        By lastNameInput = By.name("lastname");
//        By levelDropDown = By.name("level");
//        By webRadio = By.id("web");
//        By submit = By.id("actions-button");
//
//        // assertion
//        driver.assertThat().element(firstNameInput);
//        //driver.assertThat().browser().equals();
//
//        // input
//        driver.element().type(firstNameInput,"test");
//        driver.element().type(lastNameInput,"test");
//        // dropdown
//        driver.element().select(levelDropDown,"Junior");
//        // select or click
//        driver.element().click(webRadio);
//        driver.element().click(submit);
//
//        // explain wait
//        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
//
//        By primary = By.className("primary");
//        By cover = By.className("cover");
//        By secondary = By.className("secondary");
//
//        driver.element().click(primary);
//        driver.element().click(secondary);
//
//        // API
//        SHAFT.API api = new SHAFT.API("https://todo.qacart.com");
//
//        HashMap<String, String> loginBody = new HashMap<>();
//        loginBody.put("email","hatem@example.com");
//        loginBody.put("password","123456");
//
//        System.out.println(loginBody);
//
//        api.post("api/v1/users/login")
//                .setRequestBody(loginBody).setContentType(ContentType.JSON).perform();
//
//        String firstName = api.getResponseJSONValue("firstName");
//        System.out.println(firstName);
//
//        api.assertThatResponse().body().isNotNull();
//    }

    public  SHAFT.GUI.WebDriver driver1;

    @Test
    public void verifyThatLoginEmailSuccessfully(){
        driver1 = setUp("https://dx.cyberx.world/#/sign-in");
        By loginItem = HomePagePOM.getEmailItem();
        driver1.element().type(loginItem, "info@cyberx.com");
        driver1.assertThat().element(loginItem).isDisabled();
    }

    @Test
    public void verifyThatLoginPasswordSuccessfully(){
        By loginItem =HomePagePOM.getPasswordItem();
        driver1.element().type(loginItem, "123456");
        driver1.assertThat().element(HomePagePOM.getPasswordItem()).isDisabled();
    }
    @Test
    public void verifyThatLoginSuccessfully(){
        By loginItem =HomePagePOM.getLoginButtonItem();
        driver1.element().click(loginItem);
        String expectedString= "الرئيسية";
        driver1.assertThat().element(HomePagePOM.getLoginSuccessfully()).text().equals(expectedString);
    }
}
