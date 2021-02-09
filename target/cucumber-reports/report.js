$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Add_Users.feature");
formatter.feature({
  "name": "Add Two Users To User Table And Verify",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add First User To User Table And Verify",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Application Launched And User List Table Is Displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.applicationLaunchedAndUserListTableIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adding First User",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.addingFirstUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Must Be Displayed On The Table",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userMustBeDisplayedOnTheTable()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Second User To User Table And Verify",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Application Already Launched",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.applicationAlreadyLaunched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adding Second User",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.addingSecondUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Second User Must Be Displayed On The Table",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.secondUserMustBeDisplayedOnTheTable()"
});
formatter.result({
  "status": "passed"
});
});