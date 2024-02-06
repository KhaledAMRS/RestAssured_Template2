package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static String configPath = "src/main/resources/files/";

    public static void set(String key, String value) {

        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream(configPath + "config.properties");
            prop.load(fis);
            prop.setProperty(key,value);
            fis.close();
            FileOutputStream fos = new FileOutputStream(configPath + "config.properties");
            prop.store(fos,"");
        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

    public static String get(String key)
    {
        String value;
        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream(configPath + "config.properties");
            prop.load(fis);
            value =  prop.getProperty(key);
            fis.close();
            return value;
        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }
}
