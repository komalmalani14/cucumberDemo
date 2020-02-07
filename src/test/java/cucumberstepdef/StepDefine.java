package cucumberstepdef;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {
	WebDriver driver;
	
	@Given("App is opened")
	public void app_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Application is opened");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komal.malani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}
	
	@Given("user is at registration page")
	public void user_is_at_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User is at regis page");
		
	}

	@When("user enters the credentials")
	public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<String> dt_lst = dataTable.asList();
		System.out.println(dt_lst.size());
		for(String temp: dt_lst)
		{
			System.out.println(temp);
		}
		//throw new cucumber.api.PendingException();
	}

	@Then("Registration is successfull")
	public void registration_is_successfull() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Registration success!");
	}

	
	@When("Executive logs in")
	public void executive_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Executive Logged in");
	}

	@Then("Login successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Login succes!!!");
	}
	
	@When("Executive enter their userid as {string}")
	public void executive_enter_their_userid_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("ID is "+string);
		
		//assertEquals("abc","abc");
		
		//driver.findElement(By.id("gb_70")).click();
	}

	@Then("System should accept her ID")
	public void system_should_accept_her_ID() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.id("identifierId")).sendKeys("IDDDDDD");
		//Thread.sleep(4000);
		//driver.findElement(By.className("RveJvd snByac")).click();
		System.out.println("Accepted");
	}
	
	@Given("Alice purchased microwave for {int}")
	public void alice_purchased_microwave_for(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Purchased microwave for "+int1+"$");
	}
	
	@Given("Alice has a receipt")
	public void alice_has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Has a receipt");
	}

	@When("Alice returns the microwave")
	public void alice_returns_the_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Returned the microwave");
	}

	@Then("Alice should get refund of {int}")
	public void alice_should_get_refund_of(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Got refund of "+int1+"$");
	}
	/*
	@Given("Alice purchased microwave for $200")
	public void alice_purchased_microwave_for_$200() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Purchased microwave for $200");
	}

	@Given("Alice has a receipt of $200")
	public void alice_has_a_receipt_of_$200() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Has receipt of $200");
	}

	@When("Alice returns the microwave of $200")
	public void alice_returns_the_microwave_of_$200() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Returned the microwave of $200");
	}
	@Then("Alice should get refund of $200")
	public void alice_should_get_refund_of_$200() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Got refund of $200");
	}
	*/
	
	@Given("Demo Webshop Registration is opened")
	public void demo_Webshop_Registration_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komal.malani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
	    //driver.findElement(By.linkText("/register")).click();
	    //System.out.println(driver.getCurrentUrl());
	}

	@When("user enters details")
	public void user_enters_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println(dataTable.height());
		for(int i=0; i<dataTable.height(); i++)
		{
		List<String> lst = dataTable.rows(i,i+1).asList();
		System.out.println(lst.get(0));
		driver.findElement(By.id("FirstName")).sendKeys(lst.get(0));
		driver.findElement(By.id("LastName")).sendKeys(lst.get(1));
		driver.findElement(By.id("Email")).sendKeys(lst.get(2));
		driver.findElement(By.id("Password")).sendKeys(lst.get(3));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(lst.get(4));
		//throw new cucumber.api.PendingException();
		user_clicks_on_Registration();
		driver.get("http://demowebshop.tricentis.com/register");
		}
	}

	@When("user clicks on Registration")
	public void user_clicks_on_Registration() {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		driver.findElement(By.id("register-button")).click();
	}

	@When("User gets Regitration Completed message")
	public void user_gets_Regitration_Completed_message() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Registration is successful")
	public void registration_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
}


