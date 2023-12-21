package CucumberDemo05;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManaulTester {
	
	//^ $ used to define the exact match - Ex: "I am employee" in CTS
	
@Given("^I am (.*) Tester$")
public void I_am_Manual_Tester(String type) {
    // Express the Regexp above with the code you wish you had
	System.out.println("Results ");
	System.out.println("******* \n");
	System.out.println("I am "+type+ " Tester");	
}

@When("^I started my career as (.*)$")
public void I_started_my_career_as_Fresher(String Career) {
    // Express the Regexp above with the code you wish you had
	System.out.println("I started my career as "+Career);
    
}

@Then("^I am having (.*) Experience in Programming$")
public void I_am_having_Less_Experience_in_Programming(String Exp) {
    // Express the Regexp above with the code you wish you had
	System.out.println("I am having "+Exp+ " Experience in Programming and");
}

@And("^(.*) Testing$")
public void Manual_Testing(String type) {
    // Express the Regexp above with the code you wish you had
	System.out.println(type+" Testing");
}

@But("^I am (.*) with my position$")
public void I_am_happy_with_my_position(String Sat) {
    // Express the Regexp above with the code you wish you had
	System.out.println("I am "+Sat+" with my position");

}

@And("^Getting Good Salary as (.*) Tester$")
public void Getting_Good_Salary(String saltype, DataTable salary) {
    // Express the Regexp above with the code you wish you had
	
	System.out.print("Getting Good Salary as "+saltype+" Tester with pacakage as Rs. ");
	List<List<String>> data = salary.raw();
	if (saltype.equals("Manual"))
	{
		System.out.println(data.get(0).get(0));
	}
	else if (saltype.equals("Automation"))
	{
		System.out.println(data.get(0).get(1));
	}
	
	System.out.println("\n************************* \n");
}

}
