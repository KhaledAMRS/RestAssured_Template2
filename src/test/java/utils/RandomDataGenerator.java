package utils;

import com.github.javafaker.Faker;

public class RandomDataGenerator {

    public static Faker faker = new Faker();

    public static String getRandomDataFor(RandomDataTypeNames dataTypeNames)
    {
        switch (dataTypeNames) {
            case FIRSTNAME:
                return faker.name().firstName();
            case LASTNAME:
                return faker.name().lastName();
            case FULLNAME:
                return faker.name().fullName();
            default:
                return "Data type name not available";
        }

    }

        public static String getRandomDataForEmail()
    {
        return faker.internet().safeEmailAddress();
    }

    public static String getRandomDataForPhoneNumber()
    {
        return String.valueOf(faker.number().digits(8));
    }

    
}
