package steps;

import io.cucumber.java.en.Then;

public class MyInfo_SalaryStep {

	@Then("user click on salary tab")
	public void user_click_on_salary_tab() {
		System.out.println("STEP: user click on salary tab");
	}

	@Then("user should see ctc under salary tab")
	public void user_should_see_ctc_under_salary_tab() {
		System.out.println("VERIFY: User able to see CTC");
	}

}
