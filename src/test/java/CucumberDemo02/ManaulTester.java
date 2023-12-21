package CucumberDemo02;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManaulTester {
	
	//^ $ used to define the exact match - Ex: "I am employee" in CTS
	
@Given("^I am Manual Tester$")
public void I_am_Manual_Tester() {
    // Express the Regexp above with the code you wish you had
	System.out.println("I am Manual Tester");	
}

@When("^I started my career as Fresher$")
public void I_started_my_career_as_Fresher() {
    // Express the Regexp above with the code you wish you had
	System.out.println("I started my career as Fresher");
    
}

@Then("^I am having Less Experience in Programming$")
public void I_am_having_Less_Experience_in_Programming() {
    // Express the Regexp above with the code you wish you had
	System.out.println("I am having Less Experience in Programming");
}

@And("^Manual Testing$")
public void Manual_Testing() {
    // Express the Regexp above with the code you wish you had
	System.out.println("Manual Testing");
}

@But("^I am happy with my position$")
public void I_am_happy_with_my_position() {
    // Express the Regexp above with the code you wish you had
	System.out.println("I am happy with my position");
}



}
