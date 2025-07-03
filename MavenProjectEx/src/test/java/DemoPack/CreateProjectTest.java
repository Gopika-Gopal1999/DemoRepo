package DemoPack;

import org.testng.annotations.Test;

public class CreateProjectTest {
	@Test
	public void createTest() {
		System.out.println("Run");
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("username"));
		System.out.println("Pass");
}
}
