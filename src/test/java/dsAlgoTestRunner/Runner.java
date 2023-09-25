package dsAlgoTestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@CucumberOptions(
		features = {"src\\test\\resources\\DsAlgoFeature\\homePage.feature"},//it will show all the scenario
		glue={"stepDefinition","parallel"},
		//tags= "@Smoke or @Regression",
		plugin = {"pretty"}
		)*/

//  @CucumberOptions(
//		features = {"src\\test\\resources\\DsAlgoFeature\\dataStructure.feature"},//it will show all the scenario
//		glue={"stepDefinition","parallel"},
//		dryRun=false,
//		//tags= "@Smoke 
//or @Regression",
//		plugin = {"pretty"}
//		)

@CucumberOptions(features = { "src\\test\\resources\\DsAlgoFeature\\Array_pg.feature" }, // it will show all the
																							// scenario
		glue = { "stepDefinition", "parallel" },
		dryRun = false,
	 tags= "@Smoke ",
		plugin = { "pretty" }
    
		
		)
public class Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
