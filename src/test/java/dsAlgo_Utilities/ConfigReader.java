package dsAlgo_Utilities;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
 Properties properties;

public ConfigReader() {
    properties = new Properties();
    try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
        if (input == null) {
            throw new FileNotFoundException("config.properties file not found in resources");
        }
        properties.load(input);
    } catch (Exception e) {
        System.out.println("Config not found: " + e.getMessage());
    }
}

public String getUsername()  {
		return properties.getProperty("username");      
}
public String getPassword() {
	return properties.getProperty("password");	
}
public String getBrowser()  {
	return properties.getProperty("browser");
}
public String getUrl()  {
	return properties.getProperty("url");
	
}

}
