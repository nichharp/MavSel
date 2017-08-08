package SelenProject.MavPro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class nClass {


		private WebDriver webDriver;
		
		@Before
		public void B() {
//			webDriver = new ChromeDriver();
			System.out.println("Before");
		}

		@Test
		public void T() {
			webDriver.navigate().to("https://www.amazon.co.uk");
			System.out.println("Test");
		}

		@After
		public void A () {
			webDriver.quit();
			System.out.println("After");
		}
		
	

}
