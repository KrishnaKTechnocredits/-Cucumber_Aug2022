package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    @Given("user is on application login page")
    public void user_is_on_application_login_page() {
        System.out.println("STEP: User on login page");
    }

    @When("user enters user and password on login page")
    public void user_enters_user_and_password_on_login_page() {
        System.out.println("STEP: User able to enter user and password");
    }

    @When("user click on login button on login page")
    public void user_click_on_login_button_on_login_page() {
        System.out.println("STEP: User click on login button");
    }

    @When("user enter userName as {string} and password as {string}")
    public void user_enter_user_name_as_and_password_as(String userName, String pwd) {
        System.out.println(userName + " : " + pwd);
    }

    @When("user enter {int} in ctc")
    public void user_enter_in_ctc(Integer ctc) {
    }
}
