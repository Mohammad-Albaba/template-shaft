package shaft;

import com.shaft.driver.SHAFT;
import io.restassured.http.ContentType;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.HashMap;


public class Api {

    @Test
    public void verifyLoginAPI(){
        SHAFT.API api = new SHAFT.API("https://dx.cyberx.world:9020");
        HashMap<String, String> loginBody = new HashMap<>();
        loginBody.put("email","info@cyberx.com");
        loginBody.put("password","123456");

        System.out.println(loginBody);

        api.post("/api/auth/login")
                .setRequestBody(loginBody).setContentType(ContentType.JSON).perform();
        String Status = api.getResponseJSONValue("status");
        System.out.println(Status);

        api.assertThatResponse().body().isNotNull();
    }


    }

