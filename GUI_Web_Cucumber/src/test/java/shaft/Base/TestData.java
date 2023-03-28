package shaft.Base;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    public static String TestRole=faker.random().hex();
    public class ManagerData{
        public static String name= faker.random().hex();

      //  static String name="ManagerTest";
        public static String email= faker.internet().emailAddress();

        //static String email="manager@gmail.com";
        public static String password="123456";
        public static String nameRole="Super admin";
    }

    public class UserData{
        public static String numberUser="2050";
        public static String firstName="test";
        public static String middleName="test";
        public static String lastName="test";
        public  static String email="user@gmail.com";
        public static String telephone="082565290";
        public static String mobile="+966 56 464 6577";
        public static String password="123456";
        public  static String country="";
        public static String city="";
        public static String company="";
        public static String branch="";
        public static String department="";
        public  static String position="";
        public static String groups="";
        public static String successMessage="شكراً لك. لقد تم الإرسال بنجاح.";
    }
}

