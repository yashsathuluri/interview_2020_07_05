package stepDef;

import Stepexecution.EnqureStepExec;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Enquirestepdef {
    EnqureStepExec e1=new EnqureStepExec();

    @Given("^User is on the home URL$")
    public void user_is_on_the_home_URL()
    {
        e1.user_is_on_the_home_URL();
    }

    @When("^User clicks on the button Add a new Computer\\.$")
    public void user_clicks_on_the_button_Add_a_new_Computer()
    {
        e1.user_clicks_on_the_button_Add_a_new_Computer();
    }



    @Then("^Useris taken to add a New Computer Page\\.\"$")
    public void useris_taken_to_add_a_New_Computer_Page()
    {
        e1.useris_taken_to_add_a_New_Computer_Page();
    }


    @Given("^\"Given  Given User is now on Computer page\\.$")
    public void given_Given_User_is_now_on_Computer_page()  {
        e1.given_Given_User_is_now_on_Computer_page();
    }

    @When("^User enters the ComputerName\\.$")
    public void user_enters_the_ComputerName()  {
        e1.user_enters_the_ComputerName();
    }

    @When("^User enters the Introduced date \\('yyyy-MM-dd'\\) format\\.$")
    public void user_enters_the_Introduced_date_yyyy_MM_dd_format(){
        e1.user_enters_the_Introduced_date_yyyy_MM_dd_format();
    }

    @When("^User enters the Discontinued date \\('yyyy-MM-dd'\\) format\\.$")
    public void user_enters_the_Discontinued_date_yyyy_MM_dd_format()  {
        e1.user_enters_the_Discontinued_date_yyyy_MM_dd_format();
    }

    @When("^User picks the Company from the drop down list$")
    public void user_picks_the_Company_from_the_drop_down_list()
    {
        e1.user_picks_the_Company_from_the_drop_down_list();
    }
    @Then("^Click create this computer button\\.$")
    public void click_create_this_computer_button()   {
         e1.click_create_this_computer_button();
    }


    @Then("^User shoulld be able to add the Computer Name\\. \"$")
    public void user_shoulld_be_able_to_add_the_Computer_Name()  {
        e1.user_shoulld_be_able_to_add_the_Computer_Name();
    }

}
