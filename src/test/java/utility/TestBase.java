package utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			InputStream inputStream = TestBase.class.getClassLoader().getResourceAsStream("config/config.properties");
			prop.load(inputStream);
		} catch (IOException e) {
			e.getMessage();

		}

	}
}
