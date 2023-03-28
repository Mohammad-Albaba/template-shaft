package shaft.Base;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    public static String TestRole=faker.random().hex();
    public class ManagerData{
        static String name= faker.random().hex();

      //  static String name="ManagerTest";
      static String email= faker.internet().emailAddress();

        //static String email="manager@gmail.com";
         static String password="123456";
         static String nameRole="Super admin";
    }

    public class UserData{
         static String numberUser="2050";
         static String firstName="test";
         static String middleName="test";
         static String lastName="test";
         static String email="user@gmail.com";
         static String telephone="082565290";
         static String mobile="+966 56 464 6577";
         static String password="123456";
         static String country="";
         static String city="";
         static String company="";
         static String branch="";
         static String department="";
         static String position="";
         static String groups="";
         static String successMessage="شكراً لك. لقد تم الإرسال بنجاح.";
    }
}

