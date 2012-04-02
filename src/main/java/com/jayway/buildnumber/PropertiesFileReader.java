package com.jayway.buildnumber;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * A property file reader that is implemented by using standard Java SE components. We could have used Spring's
 * {@link org.springframework.beans.factory.annotation.Value},
 * {@link org.springframework.beans.factory.config.PlaceholderConfigurerSupport} and friends, but this approach let us
 * reuse it in any Java environment.
 *
 * @author Mattias Severson, Jayway
 */
public class PropertiesFileReader {

    private static final Properties properties;

    /**
     * Use a static initializer to read the properties file.
     */
    static {
        InputStream inputStream = PropertiesFileReader.class.getResourceAsStream("/buildNumber.properties");
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read properties file", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }
    }

    /**
     * Hide default constructor.
     */
    private PropertiesFileReader() {}

    /**
     * Gets the Git SHA-1.
     * @return A {@code String} with the Git SHA-1.
     */
    public static String getGitSha1() {
        return properties.getProperty("git-sha-1");
    }
}
