$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 2,
  "name": "Economic Application",
  "description": "",
  "id": "economic-application",
  "keyword": "Feature"
});
formatter.uri("Navigation.feature");
formatter.feature({
  "line": 1,
  "name": "Navigation",
  "description": "",
  "id": "navigation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Navigation Bar Test",
  "description": "",
  "id": "navigation;navigation-bar-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens Chrome browser and enter URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Home link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should successfully move to Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Find a Job link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should successfully move to jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Job alerts link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should successfully move to newalert page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Search recruiters link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should successfully move to employers page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Jobs blog link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should successfully move to careers page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationSteps.user_opens_Chrome_browser_and_enter_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_clicks_on_Home_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_should_successfully_move_to_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_clicks_on_Find_a_Job_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_should_successfully_move_to_jobs_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_clicks_on_Job_alerts_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_should_successfully_move_to_newalert_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_clicks_on_Search_recruiters_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_should_successfully_move_to_employers_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_clicks_on_Jobs_blog_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.user_should_successfully_move_to_careers_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Registration.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Registration of user",
  "description": "I want to use this template for my feature file",
  "id": "registration-of-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
});