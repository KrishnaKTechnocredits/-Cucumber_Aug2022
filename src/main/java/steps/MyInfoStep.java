package steps;

import io.cucumber.java.en.Given;
import pages.MyInfoPage;

public class MyInfoStep {

    MyInfoPage myInfoPage = MyInfoPage.getObject();


    @Given("user click on salary tab on my info page")
    public void user_click_on_salary_tab_on_my_info_page() {
        myInfoPage.gotoMenu(MyInfoPage.MyInfoMenu.SALARY);
    }

}
