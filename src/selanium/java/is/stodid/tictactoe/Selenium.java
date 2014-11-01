package is.stodid.tictactoe;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class title {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.is/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testTitle() throws Exception {
		selenium.open("/?gws_rd=ssl");
		assertEquals("Google", selenium.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
