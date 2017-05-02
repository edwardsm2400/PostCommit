$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login into USAC",
  "description": "User will be able access the system.",
  "id": "login-into-usac",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Correct username and password",
  "description": "",
  "id": "login-into-usac;correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@positive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user navigates to application",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clicks agree button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters username \"test.pa1@itgfirm.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters password \"usac123!\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters submit",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user is able to log into system",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.openBroswer()"
});
formatter.result({
  "duration": 5570562544,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.navigateToApp()"
});
formatter.result({
  "duration": 1402396218,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.clickAgree()"
});
formatter.result({
  "duration": 368369860,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test.pa1@itgfirm.com",
      "offset": 22
    }
  ],
  "location": "TestSteps.enterUsername(String)"
});
formatter.result({
  "duration": 303594366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usac123!",
      "offset": 22
    }
  ],
  "location": "TestSteps.enterPassword(String)"
});
formatter.result({
  "duration": 218238131,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.enterSubmit()"
});
formatter.result({
  "duration": 960449100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verfiyLogin()"
});
formatter.result({
  "duration": 8146530020,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Incorrect username and password",
  "description": "",
  "id": "login-into-usac;incorrect-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user navigates to application",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "clicks agree button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user enters username \"tesirm.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters password \"usa23!\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user enters submit",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user is not able to log into system",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.openBroswer()"
});
formatter.result({
  "duration": 2332904239,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.navigateToApp()"
});
formatter.result({
  "duration": 1119107057,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.clickAgree()"
});
formatter.result({
  "duration": 181924980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tesirm.com",
      "offset": 22
    }
  ],
  "location": "TestSteps.enterUsername(String)"
});
formatter.result({
  "duration": 172565432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usa23!",
      "offset": 22
    }
  ],
  "location": "TestSteps.enterPassword(String)"
});
formatter.result({
  "duration": 133321649,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.enterSubmit()"
});
formatter.result({
  "duration": 876875956,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verfiyNotLogin()"
});
formatter.result({
  "duration": 2352625213,
  "status": "passed"
});
});