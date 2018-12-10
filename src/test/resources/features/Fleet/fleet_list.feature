@MMSLOGIN
@Phase1
Feature: Fleet list

@MMSLOGIN-001
Scenario: Log into MMS application.
Given User is logged in as 'kcsadmin' and 'admin' as password.
When User Clicks on MMS Login Button.
Then User navigates to mms home page.

@MMSLOGIN-002
Scenario: Click on Fleet List.
Given User navigate through configuration.
When User selects fleets and clicks fleets list.
Then User navigates to fleets list page.

@MMSLOGIN-003
Scenario: Click on Filter Button.
Given User clicks on filter button.
When User enters car initial 'KCS' and click on save.
Then filter should apply and verify results.


@MMSLOGIN-004
Scenario: Details of the fleet

Given user is already on the Fleet page
When User has selected a fleet with Car initial "KCS" and "000470"
And User clicks on the Details under Action column
Then user will navigate to the car details page 

@MMSLOGIN-005
Scenario: delete a row of the fleet list

Given User has selected a fleet with Car initial AOK and 013788
And user is already on the Car details page
When User clicks on the delete under Action column of the car history
Then confirmation pop up appears 
And Car history grid is empty "No data available in the table"
And Finally it disappears from the main fleet list grid as well

#@MMSLOGIN-006
#Scenario: Deactivate cars in the fleet list (negative scenario)
#Given user is already on the Fleet list page
#When User selects few cars
#And clicks on Deactivate
#And clicks on save after providing an end date as '8/2/2016'
#Then Error appears stating that the end date is already set

#@MMSLOGIN-007
#Scenario: End date less than start date (negative scenario)
#Given user is on the Fleet list page
#And has a car with no end date
#When User clicks on deactivate
#And enters the end date as '1/1/2007' lesser than start date
#And user Click on Save
#Then error message appears Car could not be deactivated

