package steps;

import io.cucumber.java.en.Given;
import pages.DashboardPage;

public class DashboardStep {

    DashboardPage dashboardPage = DashboardPage.getObject();



    @Given("user navigate to dashboard page")
    public void user_navigate_to_dashboard_page() {
        dashboardPage.isProfileDisplayed();
    }

}
