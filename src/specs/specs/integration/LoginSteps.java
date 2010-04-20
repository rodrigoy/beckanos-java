package specs.integration;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;
import org.junit.Assert;

public class LoginSteps extends Steps {

	String username;
	
	@Given("I am not logged in")
	public void logOut() {
		System.out.println("logout");
	}

	@When("I log in as $username with a password $password")
	public void logIn(String username, String password) {
		this.username = username;
	}

	@Then("I should see a message, $message")
	public void checkMessage(String message) {
		System.out.println(message);
		Assert.assertEquals("Welcome, " + username + "!", message);
	}

}
