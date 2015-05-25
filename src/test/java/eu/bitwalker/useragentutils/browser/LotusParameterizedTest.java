package eu.bitwalker.useragentutils.browser;

import static java.util.Arrays.asList;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import eu.bitwalker.useragentutils.Browser;

public class LotusParameterizedTest extends AbstractUserAgentParameterizedTest {

	public LotusParameterizedTest(String userAgentValue,
			Browser expectedBrowser, String browserVersionExpected,
			String osExpected) {
		super(userAgentValue, expectedBrowser, browserVersionExpected,
				osExpected);
	}

	@Parameters
	public static Collection<Object[]> testData() {
		return asList(new Object[][] {
				// lotusNotes
				{ "Mozilla/4.0 (compatible; Lotus-Notes/5.0; Windows-NT)",
						Browser.LOTUS_NOTES, "5.0", "WINDOWS" },
				{ "Mozilla/4.0 (compatible; Lotus-Notes/6.0; Windows-NT)",
						Browser.LOTUS_NOTES, "6.0", "WINDOWS" } });
	}
}
