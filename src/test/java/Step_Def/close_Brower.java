package Step_Def;

import io.cucumber.java.en.Then;

public class close_Brower  extends Base_Class{
	@Then("close browser")
	public void close_browser() {
		driver.close();
		log.info("Browser closed");

		//driver.quit();
	}
}
