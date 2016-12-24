package jenkins.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkinclass {

	//public static void main(String[] args) {

	@Test
	public void test1()
	{
	DesiredCapabilities caps = new DesiredCapabilities();
	// declaration and instantiation of objects/variables
	System.setProperty        
	("webdriver.gecko.driver","C:\\Users\\lethi\\Desktop\\web drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe"); 
	caps=DesiredCapabilities.firefox();
	caps.setCapability("marionette", true);

	WebDriver driver = new FirefoxDriver(caps);
	String baseUrl = "http://newtours.demoaut.com";
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = "";

	// launch Firefox and direct it to the Base URL
	driver.get(baseUrl);

	// get the actual value of the title
	actualTitle = driver.getTitle();

	/*
	 * compare the actual title of the page witht the expected one and print
	 * the result as "Passed" or "Failed"
	 */
	if (actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	} else {
		System.out.println("Test Failed");
	}

	//close Firefox
	driver.close();

	//		// exit the program explicitly
	//		System.exit(0);
}
}
