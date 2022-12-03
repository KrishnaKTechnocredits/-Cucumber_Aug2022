package steps.automationbykrishna;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.automationbykrishna.HomePage;

public class HomeStep {

    HomePage homePage = HomePage.getInstance();

    @Given("user is on application home page")
    public void user_is_on_application_home_page() {
        Assert.assertTrue("Home Page is not displayed", homePage.isHomePageDisplayed());
    }

    @Given("user click on Demo table tab")
    public void user_click_on_demo_table_tab() {
        homePage.clickOnDemoTableTab();
    }
}
