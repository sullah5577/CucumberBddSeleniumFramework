$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewCustomer.feature");
formatter.feature({
  "line": 2,
  "name": "Adding new customers",
  "description": "",
  "id": "adding-new-customers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@new_customer"
    }
  ]
});
formatter.before({
  "duration": 5296990986,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 351372260,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "customer can be assigned new account",
  "description": "",
  "id": "adding-new-customers;customer-can-be-assigned-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@acct_1"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user inputs userid and password",
  "rows": [
    {
      "cells": [
        "mngr175171",
        "",
        "AmApere"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user then click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user verifies customer account",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click new account",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user enter account information",
  "rows": [
    {
      "cells": [
        "customer-id",
        "initial-deposit"
      ],
      "line": 27
    },
    {
      "cells": [
        "32638",
        "5000"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user submit the account information",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "new account created",
  "keyword": "Then "
});
formatter.match({
  "location": "NewCustomerSD.userInputsUseridAndPassword(DataTable)"
});
formatter.result({
  "duration": 990978658,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSD.user_then_click_on_login_button()"
});
formatter.result({
  "duration": 924453873,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSD.userVerifiesCustomerAccount()"
});
formatter.result({
  "duration": 1588368593,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSD.userClickNewAccount()"
});
formatter.result({
  "duration": 547074483,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSD.userEnterAccountInformation(DataTable)"
});
formatter.result({
  "duration": 361038799,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSD.userSubmitTheAccountInformation()"
});
formatter.result({
  "duration": 709983998,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSD.newAccountCreated()"
});
formatter.result({
  "duration": 238224161,
  "status": "passed"
});
formatter.after({
  "duration": 1821524186,
  "status": "passed"
});
});