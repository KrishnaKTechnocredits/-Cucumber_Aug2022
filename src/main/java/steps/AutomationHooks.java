package steps;

import base.PredefinedActions;
import constant.ConstantValue;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.PropertyFileOperations;

import java.io.IOException;

public class AutomationHooks {


    @Before
    public void beforeScenario(Scenario scenario) throws IOException {
        PropertyFileOperations fileOperations = new PropertyFileOperations(ConstantValue.CONFIGFILEPATH);
        String url = fileOperations.getValue("url");
        PredefinedActions.start(url);
    }

    @After
    public void afterScenario(Scenario scenario){
        if(scenario.isFailed()){
            //Take Screenshot
        }
        System.out.println("After Scenario");
    }
}
