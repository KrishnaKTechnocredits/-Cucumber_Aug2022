package steps;


import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStep {

    LoginPage loginPage = LoginPage.getObject();


    @Given("user enter {string} and pwd as {string} on login page")
    public void user_enter_and_pwd_as_on_login_page(String username, String pwd) {
        loginPage.login(username, pwd);
    }

    @Given("user click on login button on login page")
    public void user_click_on_login_button_on_login_page() {
        loginPage.clickOnLoginBtn();
    }

    
    @Given("{string} and {string} sum is {string}")
    public void sum(String a, String b, String c){
        Assert.fail();
    }
}
