$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/forsalefeature/IMMJ.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "IMMJ Adding a new computer",
  "description": "",
  "id": "immj-adding-a-new-computer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 53072002800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User being taken from the homepage to add a new computer page.",
  "description": "",
  "id": "immj-adding-a-new-computer;user-being-taken-from-the-homepage-to-add-a-new-computer-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on the home URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the button Add a new Computer.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Useris taken to add a New Computer Page.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Enquirestepdef.user_is_on_the_home_URL()"
});
formatter.result({
  "duration": 24480600900,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.user_clicks_on_the_button_Add_a_new_Computer()"
});
formatter.result({
  "duration": 5860875600,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.useris_taken_to_add_a_New_Computer_Page()"
});
formatter.result({
  "duration": 1133104700,
  "status": "passed"
});
formatter.after({
  "duration": 10293149300,
  "status": "passed"
});
formatter.before({
  "duration": 31478303600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Adding a new computer to the table",
  "description": "",
  "id": "immj-adding-a-new-computer;adding-a-new-computer-to-the-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "\"Given  Given User is now on Computer page.",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enters the ComputerName.",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters the Introduced date (\u0027yyyy-MM-dd\u0027) format.",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters the Discontinued date (\u0027yyyy-MM-dd\u0027) format.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User picks the Company from the drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Click create this computer button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User shoulld be able to add the Computer Name. \"",
  "keyword": "Then "
});
formatter.match({
  "location": "Enquirestepdef.given_Given_User_is_now_on_Computer_page()"
});
formatter.result({
  "duration": 5725563100,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.user_enters_the_ComputerName()"
});
formatter.result({
  "duration": 6439814800,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.user_enters_the_Introduced_date_yyyy_MM_dd_format()"
});
formatter.result({
  "duration": 5409095000,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.user_enters_the_Discontinued_date_yyyy_MM_dd_format()"
});
formatter.result({
  "duration": 1233853300,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.user_picks_the_Company_from_the_drop_down_list()"
});
formatter.result({
  "duration": 1270776100,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.click_create_this_computer_button()"
});
formatter.result({
  "duration": 3840611000,
  "status": "passed"
});
formatter.match({
  "location": "Enquirestepdef.user_shoulld_be_able_to_add_the_Computer_Name()"
});
formatter.result({
  "duration": 603795200,
  "status": "passed"
});
formatter.after({
  "duration": 37138947400,
  "status": "passed"
});
});