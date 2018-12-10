@CarConfiguartion
Feature: Car Configuration

@LogintoMMSApplication
Scenario: Login to MMS application.
Given User is logged in as 'kcsadmin' and 'admin' as password.
When User Clicks on MMS Login Button.
Then User navigates to mms home page.

@NavigationtoCarConfigurationPage
Scenario: Navigate to Car Configuration Page
Given User navigate through configuration.
When User selects Car configuration
Then User is on Car Configuration wizard
And By default the user should see the tab Car Details Fields opened
And User should see Grid with three columns
|checkbox|Car Kind|fields|
And above the grid , there should be three buttons -Add, Edit, Delete
And there are other two tabs - Fleet Grid Fields, Define Custom Fields

@FleetGridFields
Scenario: Navigation to the Fleet Grid Fields on click of the tab 
Given User is on Car Configuration wizard
When User clicks the tab Fleet Grid Fields
Then User is on Fleet Grid Fields tab
And User can see list all the categories on Left panel 
And User can see a container showing Selected Fields on the right
And User see Add Selected, Reset button between the panels
And User can see Save button at the right corner below the selected fields panel

@SelectBehaviorCategoryAvailableFields 
Scenario: Click of the Category fields
Given User is on Fleet Grid Fields tab
When User clicks the Category Others for Custom Fields
Then User see below custom fields present
|test2|
|test|
|test1|
And User can see an option to select all on the top


@SelectBehaviorMoveAvailableFields 
Scenario: Move custom fields to the selected fields 
Given User is on Fleet Grid Fields tab
And User clicks the Category Others for Custom Fields
When User selects below fields 
|test2|
|test|
And User clicks on Add selected
Then User can see below fields under Selected Fields
|test2|
|test|
And User cannot see below fields under Available Fields
|test2|
|test|
And User can see Remove and Order icon for custom fields at the right
And User can see Save button as enabled

@DefineCustomFieldswithNoData
Scenario: Navigating to Define-Custom fields page
Given User was on Configure- Details page once he landed
And two other tabs were present Select- Grid, Define -custom
When user cicks on the Define-custom tab 
#Then User will land to the Define-custom page
And it will have a grid with three columns - checkbox control, Field Name and Data type with a search panel tagged to the column
And There will be three buttons - Add, Edit, Delete over the grid
And Grid will just say "Please Add Custom Fields" as there was no data initially


@SelectSave
Scenario: Save after selecting fields
Given User is on Fleet Grid Fields tab
And User can see Save button as enabled
When User clicks on Save
Then Selected fields are saved
|test2|
|test|
And User can see Save button as disabled
And User will see a notification on the top right corner.
And on Clicking the notification, panel opens to show the success message.


@SelectSaveAfterNavigation
Scenario: Verify fields are saved after moving to other tab 
Given User is on Fleet Grid Fields tab 
And Selected fields are saved
|test2|
|test|
And User navigates to Car Details Fields tab
When User clicks the tab Fleet Grid Fields
Then User is on Fleet Grid Fields tab
And Selected fields are saved
|test2|
|test|
And User can see Save button as disabled

@SelectReset 
Scenario: Reset button behavior
Given User is on Fleet Grid Fields tab 
And User clicks the Category Others for Custom Fields
When User selects All checkbox from Available category
And User clicks on Add selected
And User can see "Currently No Available Fields For Selected Category" under Available fields
And User clicks on Reset button
Then User can see All checkbox under Available category

@CarDetailsFields 
Scenario: Configure page navigation
Given User is on Fleet Grid Fields tab
When User navigates to Car Details Fields tab
Then User can see "No data available in table."
And User should see Grid with checkbox, Car Kind ,fields columns
And above the grid there should be three buttons Add, Edit, Delete

@ConfigureAddPage
Scenario: Add a Car kind to fields mapping 
Given User is on Car Configuration wizard
When User clicks on Add button over the grid
Then User will land to the configure wizard with a car kind label and drop down with the list of all car kinds
And User can see list all the categories on Left panel 
And User can see a container showing Selected Fields on the right
And User see Add Selected, Reset button between the panels
And User can see Save button at the right corner below the selected fields panel
And User can see Cancel button next to Save button below the selected fields panel

@configureBehaviorCategoryAvailableFields 
Scenario: click of the Category fields
Given User can see list all the categories on Left panel
When User clicks the Category Others for Custom Fields
Then User see below custom fields present under category
|test2|
|test|
|test1|
And User can see an option to select all on the top under category

@ConfigureBehaviorMoveAvailableFields 
Scenario: Move to the selected fields 
Given User can see an option to select all on the top under category
When User selects below fields Under Car Details Fields
|test2|
|test|
And User clicks on Add selected
Then User can see below fields under Selected Fields of Car Details Fields
|test2|
|test|
And User cannot see below fields under Available Fields of Car Details Fields
|test2|
|test|
And User can see Remove and Order icon for custom fields at the right of Car Details Fields
And User can see Save button as enabled

@ConfigureResetofCarDetailsFields
Scenario: Reset button behavior of Car Details Fields tab
Given User can see Remove and Order icon for custom fields at the right of Car Details Fields
When User selects All fields from Available field
And User clicks on Add selected
And User can see "Currently No Available Fields For Selected Category" under Available fields
And User clicks on Reset button
Then User can see an option to select all on the top under category

@ConfigureSaveWithoutCarKind
Scenario: Save after selecting fields without selecting car kind
Given  User will land to the configure wizard with a car kind label and drop down with the list of all car kinds
When User clicks the Category Others for Custom Fields
When User selects below fields Under Car Details Fields
|test2|
|test|
And User clicks on Add selected
And User clicks on Save
Then User gets alert  message "Please Select Car Kind"
And User clicks on OK button of popup

@ConfigureSave
Scenario: Save after selecting fields
Given User can see Save button as enabled
When User selects car kind "Box"
And User clicks on Save
Then User is on Car Configuration wizard
And User will see a notification on the top right corner.
And on Clicking the notification, panel opens to show the success message.
And User can see new row added to the grid
And User can see column car kind as "Box"
And User can see column selected fields as "Others-test2 Others-test" in tabs

@ConfigureEditCarDetailsFields
Scenario: Edit behavior of the configure wizard 1 
Given User navigates to Car Details Fields tab
When User selects checkbox for "Box" car kind
And User clicks on Edit button over the grid
Then User will land to the configure wizard with a car kind label and drop down with the list of all car kinds
And User can see Car Kind dropdown as READ Only 
And User can see below fields under Selected Fields of Car Details Fields
|test2|
|test|
And User clicks the Category Others for Custom Fields
And User can see an option to select all on the top under category

@ConfigureEditSave
Scenario: Modify value for Car kind and Save
Given User can see an option to select all on the top under category
When User selects All fields from Available field
And User clicks on Add selected
And User clicks on Save
Then User is on Car Configuration wizard
And User will see a notification on the top right corner.
And on Clicking the notification, panel opens to show the success message.
And User can see new row added to the grid
And User can see column car kind as "Box"
And User can see column selected fields as "Others-test2 Others-test Others-test1" in tabs

@ConfigureDelete
Scenario: Delete behavior of the configure wizard
Given User is on Car Configuration wizard
And User selects checkbox for "Box" car kind
When User clicks on Delete button present on the top of the grid
Then user will get a confirmation box "Are you sure to delete this item"
And User can see Cancel,Ok button
And User clicks on Ok button
And User can see "No data available in table."
And User will see a notification on the top right corner.
And on Clicking the notification, panel opens to show the success message.

@AddingFieldValidationBehavior1 
Scenario Outline: Add button validation behavior for Define Custom fields
Given User has clicked the Add button over Custom fields grid
When User enters Field Name <Field Name>
And User selects Data Type <Data Type>
Then User can see CustomField EditBox text as "VaLIDationTest_-1234"
And Save /Cancel button should  be enabled
Examples:
| Field Name              | Data Type |
| VaLIDationTest%$^_-+1234| Boolean   |


@AddingFieldBehavior
Scenario Outline: Add button behavior for Define Custom fields 
Given User has clicked the Add button over Custom fields grid
When User enters Field Name <Field Name>
And User selects Data Type <Data Type>
And clicks on Save
Then Record should be successfully added on the grid
And the Activity summary should show a alert in Green and message on the box
And the grid should should number of records as per the pagination message
And Checkbox should appear beside the record added
And Save and Cancel button should not be present 
Examples:
| Field Name       | Data Type |
| CustomFieldone   | Boolean   |
| CustomFieldtwo   | Date      |
| CustomFieldthree | Number    |
| CustomFieldfour  | Text      |


@AddingFieldValidationBehavior-Duplicate 
Scenario Outline: Add button duplicate validation behavior for Define Custom fields 
Given User has clicked the Add button over Custom fields grid
When User enters Field Name <Field Name>
And User selects Data Type <Data Type>
Then User gets popup stating as "This field name already exists. Please use a different name."
And User click on OK Button 
And the field name text box should be highlighted
Examples:
| Field Name       | Data Type |
| CustomFieldone   | Boolean   |


@AddDeletCustomFieldsAtSameTime
Scenario Outline: Add and Delete Custom fields at same time
Given User has clicked the Add button over Custom fields grid
When User enters Field Name <Field Name>
And User selects Data Type <Data Type>
When clicks on Delete  
Then User will get a confirmation box stating as "Only one operation is allowed at a time. Please complete/cancel this Add operation"
And user can see OK Button
And on click of Ok user is on Define Custom fields tab
Examples:
| Field Name       | Data Type |
| CustomFieldsix   | Boolean   |


@EditFieldBehavior
Scenario: Edit button behavior for Define Custom fields 
Given User selects a row from the Custom Field Grid
Given User has clicked the Edit button over Custom fields grid
And has already changed the values for the CustomFieldone as "CustomFieldFive" 
And selects data type as "Date"
When user clicks on save
Then Record should be successfully updated on the grid
And the Activity summary should show a alert in Green and message on the box


@DeleteCustomFields
Scenario: Delete button behavior for Define Custom fields 
Given User is on the define custom fields tab
When user selects few of the rows on the grid 
And clicks on Delete 
Then User will get a confirmation box stating "Are you sure to delete this/these item ? This/These will be removed from the system ."
And There will be two buttons Ok and Cancel
When user clicks on Ok
Then the data will be removed 
And user will see the alert message in Green 
And Activity summary will also be updated with the deleted records

@AddingFieldBehavior
Scenario Outline: Add button behavior for Define Custom fields 
Given User has clicked the Add button over Custom fields grid
When User enters Field Name <Field Name>
And User selects Data Type <Data Type>
And clicks on Save
Then Record should be successfully added on the grid 
Examples:
| Field Name       | Data Type |
| test2            | Boolean   |
| test             | Date      |
| test1            | Number    |
