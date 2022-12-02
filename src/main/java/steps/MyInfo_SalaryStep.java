package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.MyInfo_SalaryPage;

public class MyInfo_SalaryStep {

    MyInfo_SalaryPage myInfo_salaryPage = MyInfo_SalaryPage.getObject();

    @Given("user should see salary is non zero")
    public void user_should_see_salary_is_non_zero() {
        String ctc = myInfo_salaryPage.getCostToCompany();

        Assert.assertTrue( "Actual ctc displayed as : " + ctc, ctc.startsWith("$"));
        ctc = ctc.replace("$", "").replace(",", "");
        System.out.println(ctc);
        double d = Double.parseDouble(ctc);
        Assert.assertTrue( "ctc value was : " + d, d>0);
    }

}
