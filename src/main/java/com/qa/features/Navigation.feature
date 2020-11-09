Feature: Navigation


Scenario: Navigation Bar Test
   Given User opens Chrome browser and enter URL
   When  User clicks on Home link
   Then User should successfully move to Home page 
   And  User clicks on Find a Job link
   Then User should successfully move to jobs page
   And  User clicks on Job alerts link
   Then User should successfully move to newalert page
   And  User clicks on Search recruiters link
   Then User should successfully move to employers page
   And  User clicks on Jobs blog link
   Then User should successfully move to careers page
   Then User should close the browser
   