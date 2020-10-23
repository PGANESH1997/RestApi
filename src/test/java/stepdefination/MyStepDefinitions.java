package stepdefination;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is in login page$")
    public void user_is_in_login_page() throws Throwable {
       System.out.println("first method");
    }
//with out expression
   // @When("^Enter number and otp$")
    public void enter_number_and_otp() throws Throwable {
        System.out.println("second method");

    }
    //with expression
    @When("^Enter number \"([^\"]*)\" and otp \"([^\"]*)\"$")
    public void enter_number_something_and_otp_something(String strArg1, String strArg2) throws Throwable {
       System.out.println(strArg1+"1"+"2"+strArg2);
    }


    @Then("^Home page is shown$")
    public void home_page_is_shown() throws Throwable {
        System.out.println("third method");

    }

    @And("^cms title is shown$")
    public void cms_title_is_shown() throws Throwable {
        System.out.println("fourth method");

    }

}