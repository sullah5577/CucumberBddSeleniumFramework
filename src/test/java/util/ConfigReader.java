package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String url;
    private String browser;

    public ConfigReader(){
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            //load a properties file
            prop.load(input);

            // get the property value and print it out
            this.browser=prop.getProperty("browser");
            this.url=prop.getProperty("url");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if (input!=null){
                try {
                    input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl(){
        return url;
    }

    public String getBrowser(){
        return browser;
    }

}
