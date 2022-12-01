package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DashboardPage;

public class DashboardStep {

    DashboardPage dashboardPage = DashboardPage.getObject();

    @Given("user should see {string} title on dashboard page")
    public void user_should_see_title_on_dashboard_page(String expectedTitle) {
        String actualTitle = dashboardPage.getPageTitle();
        Assert.assertEquals("Expected title was " + expectedTitle + " but actual title was " + actualTitle, actualTitle, expectedTitle);
    }

    @Given("user click on my info tab on dashboard page")
    public void user_click_on_my_info_tab_on_my_info_page() {
        dashboardPage.gotoMenu(DashboardPage.Menu.MYINFO);
    }

}
