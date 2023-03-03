package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {
        String dosyaYolu = "target/configuration.properties";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("ERROR");

        }

    }
    public static String getProperty(String Key){
        return properties.getProperty(Key);
    }


}
