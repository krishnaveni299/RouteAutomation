package utils;
import  java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;

public final class ConfigReader {

    private ConfigReader() {
    }

    public static Properties initProperties() {
        Properties prop = new Properties();
        String resourceName = "config.properties";

        // 1) Try loading from classpath (works for tests and packaged runs)
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName)) {
            if (is != null) {
                prop.load(is);
                return prop;
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config properties from classpath: " + resourceName, e);
        }

        // 2) Fallback to file system path (useful when running from IDE)
//        String path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", resourceName).toString();
//        try (FileInputStream fis = new FileInputStream(path)) {
//            prop.load(fis);
//        } catch (IOException e) {
//            throw new RuntimeException("Failed to load config properties from " + path, e);
//        }
        return prop;
    }
}

