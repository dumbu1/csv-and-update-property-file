Feature: feature2
Background: for second page
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on "Selenium Example Page"


Scenario: scenario1
Given user is in "Selenium Test Example Page" page
When user enters "mohan" on "Form Elements"


Scenario Outline: scenario2
Given user is in "Selenium Test Example Page" page
When user enters "<name>" on "Form Elements"
Examples:
|name|
|krishna|
|raghu|
|satya|
|mohan|

