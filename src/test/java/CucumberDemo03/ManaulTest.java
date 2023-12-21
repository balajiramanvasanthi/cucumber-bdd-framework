package CucumberDemo03;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;

@RunWith(Cucumber.class) 
@Options(
		format = {"html:target/html/Demo3" },
		monochrome = true
	)
public class ManaulTest {

}
