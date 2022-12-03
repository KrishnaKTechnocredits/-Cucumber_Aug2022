package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectionDemo {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/automationbykrishna", "postgres", "harsh");
        Statement statement = connection.createStatement();
        System.out.println("Connection Done!..");

        int impactRow = statement.executeUpdate("UPDATE public.employee_basic_information SET num=8, firstname='Titiksha', lastname='goel', username='tgoel' WHERE num=9;");
        System.out.println(impactRow);

//        ResultSet resultSet = statement.executeQuery("SELECT num, firstname, lastname, username FROM public.employee_basic_information;");

//        while (resultSet.next()){
//            int empNum= resultSet.getInt("num");
//            String  firstName = resultSet.getString("firstname");
//            String  lastName = resultSet.getString("lastname");
//            String  userName = resultSet.getString("username");
//
//            System.out.println(empNum);
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(userName);
//            System.out.println("-----------------------------");
//
//        }


    }

}
