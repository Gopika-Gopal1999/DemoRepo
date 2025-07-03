package DemoPck2;

import org.testng.annotations.Test;

public class ConfigTest {
	@Test
	public void cofigMeTest() {
		System.out.println("Run");
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		System.out.println("Pass");
}
}
