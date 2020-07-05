package Stepexecution;
import CommonFunction.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class EnqureStepExec extends FunctionLibrary {





    public void user_is_on_the_home_URL()
    {
        driver.get("http://computer-database.herokuapp.com/computers ");

    }


    public void user_clicks_on_the_button_Add_a_new_Computer()
    {
         driver.findElement(By.id("add")).click();
    }




    public void useris_taken_to_add_a_New_Computer_Page()
    {
        String EX="Add a computer";
        String AC= driver.findElement(By.xpath("//h1[contains(text(),'Add a computer')]")).getText();
        assertEquals(EX,AC);  // This will confirm that the user is on the add the computer page by grabing the text.
        System.out.println(AC);
        System.out.println(EX);
    }


    public void given_Given_User_is_now_on_Computer_page()  {
        driver.get("http://computer-database.herokuapp.com/computers/new");

    }


    public void user_enters_the_ComputerName()  {
        driver.findElement(By.id( "name")).sendKeys( "Yash1");
    }


    public void user_enters_the_Introduced_date_yyyy_MM_dd_format(){
        driver.findElement(By.id( "introduced")).sendKeys( "2020-02-01");
//*[@id="introduced"]
    }


    public void user_enters_the_Discontinued_date_yyyy_MM_dd_format()  {
        driver.findElement(By.id( "discontinued")).sendKeys( "2028-02-01");

    }


    public void user_picks_the_Company_from_the_drop_down_list()
    {
        Select Company = new Select(driver.findElement(By.id("company")));
        Company.selectByVisibleText("Apple Inc.");
    }

    public void click_create_this_computer_button()   {
        driver.findElement(By.xpath( "//input[@class='btn primary']")).click();
    }



    public void user_shoulld_be_able_to_add_the_Computer_Name()  {
        String EX="Done! Computer Yash1 has been created";
        String AC= driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
        assertEquals(EX,AC); //Confirms that the Yash1 computer is created.
        System.out.println(AC);
        System.out.println(EX);




    }


}
