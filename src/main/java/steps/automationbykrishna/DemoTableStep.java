package steps.automationbykrishna;

import constant.SQLQuery;
import entity.Employee;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.automationbykrishna.DemoTablePage;
import utility.DataBaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DemoTableStep {

    DemoTablePage demoTablePage = DemoTablePage.getInstance();

    @Then("user verify employee basic informaiton with database")
    public void user_verify_employee_basic_informaiton_with_database() throws SQLException {
        List<Employee> employeeListUI = demoTablePage.capatureBassicEmployeeDetails();

        DataBaseConnection connection = new DataBaseConnection();
        ResultSet resultSet = connection.execuetSelectQuery(SQLQuery.SELECT_EMPLOYEE_BASIC_INFORMATION);

        List<Employee> dbEmployeeList = new ArrayList<>();
        while (resultSet.next()) {
            String empNum = resultSet.getString("num");
            String firstName = resultSet.getString("firstname");
            String lastname = resultSet.getString("lastname");
            String username = resultSet.getString("username");
            dbEmployeeList.add(new Employee(empNum, firstName, lastname, username));
        }
        connection.closeConnection();
        Assert.assertEquals("Data Base and UI data mismatched", employeeListUI, dbEmployeeList);
    }
}
