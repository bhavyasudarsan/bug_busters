package dsAlgo_Utilities;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dsAlgo_DriverFactory.DriverFactory;

public class ConfigReader {

	Properties properties;
	
    private static final Logger logger = LoggerFactory.getLogger(ConfigReader.class);


	public ConfigReader() {
		properties = new Properties();
		try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
			if (input == null) {
				throw new FileNotFoundException("config.properties file not found in resources");
			}
			properties.load(input);
			logger.info("Config properties loaded");
		} catch (Exception e) {
			logger.error("Config not found: " + e.getMessage());
		}
	}

	public String getUsername() {
		return properties.getProperty("username");
	}

	public String getPassword() {
		return properties.getProperty("password");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public String getUrl() {
		return properties.getProperty("url");

	}

}
