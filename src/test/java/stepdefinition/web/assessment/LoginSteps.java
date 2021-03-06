package stepdefinition.web.assessment;

import io.cucumber.java.en.Given;
import web.pageObjects.assessment.LoginPage;

public class LoginSteps extends BaseSteps{

    LoginPage loginPage;

    @Given("^Patient navigate to activity list as \"([^\"]*)\"$")
    public void patient_navigate_to_activity_list_as(String username){
     
    	// creating the login page object
    	loginPage = pageObjectManager.getLoginPage();
        loginPage.login(username);
    }


}
