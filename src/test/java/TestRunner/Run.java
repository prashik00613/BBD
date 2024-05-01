package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {".//features/login.feature",".//features/Customers.feature"},
				glue="Step_Def",
				dryRun = true,
				plugin={"pretty","html:target/cucumber-reports/reports_html.html"},
				snippets = SnippetType.CAMELCASE ,
				monochrome = true
				)




	//@CucumberOptions(
			
			//features = {".//features/login.feature"},
		//	glue="Step_Def",
			//dryRun = true,
			//monochrome = true,
		//	tags = "@Sanity",//scenarios under @sanity tag will be executed
		//	plugin = {"pretty"}
			//)
//"html:target/cucumber-reports/reports_html.html
	//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//			plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

	public class Run extends AbstractTestNGCucumberTests{
}
