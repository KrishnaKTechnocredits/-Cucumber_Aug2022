package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AutomationHooks {


    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println("Before Scenario");
        System.out.println("Scenario Name: "+ scenario.getName());
        System.out.println("Tags: "+scenario.getSourceTagNames());
        //Browser & URL launch
    }

    @After
    public void afterScenario(Scenario scenario){
        if(scenario.isFailed()){
            //Take Screenshot
        }
        System.out.println("After Scenario");
    }
}
