package br.com.selenium_cucumber_java;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features", tags = "@CadastrarConta", glue = "steps"

)


public class TestRunner {

}
