package DemoPac3;

import org.testng.annotations.Test;

public class DeeleTest {
	@Test
	public void detMeTest() {
		System.out.println("Run");
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		System.out.println("Pass");
}
}
