package steps;

import io.cucumber.java.en.Then;

public class DashboardStep {

    @Then("user verify dashboard page displayed")
    public void user_verify_dashboard_page_displayed() {
        System.out.println("VERIFY: Dashboard Page displayed");
    }

    @Then("user click on my info tab on darshboard page")
    public void user_click_on_my_info_tab_on_darshboard_page() {
        System.out.println("STEP: User click on my info tab");
    }
}
