@MMSUserProfile @Phase1
Feature: User Profile

  @check1 @check3 @MMSUserProfile-001
  Scenario: Navigate to Exception Review.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User navigate through configuration.
    And User selects System and clicks My user profile.
    Then User lands to My User Profile Page.

  @MMSUserProfile-002
  Scenario: Edit Cancel User Information
    Given User is on My User Profile Page.
    And User can see the User Details displayed such as "Username","First Name","Last Name","Email" ,"Password","Roles"
    And User can see that the field Username is not Editable
    When User makes changes to any of the fields such as "First Name","Last Name","Email" ,"Password","Roles"
    And clicks on Cancel option
    Then User lands to User Manager Page.
    And there are no changes to the User Profile

  @MMSUserProfile-003
  Scenario: Edit Save User Information
    Given User is on My User Profile Page.
    And User can see the User Details displayed such as "Username","First Name","Last Name","Email" ,"Password","Roles"
    And User can see that the field Username is not Editable
    When User makes changes to any of the fields such as "K","admin","eysupport1@ge.com" ,"Password","Roles"
    And clicks on Save option
    #Then User can see the "Saved successfully" message in "Green"
    Then User lands to My User Profile Page.

  @MMSUserProfile-004
  Scenario: "Cancel" Change Password
    Given User is on My User Profile Page.
    And User has clicked on the Change Password link
    And User can see the Editable Text boxes such as "Current Password","New Password","Confirm Password"
    When User enters "Current Password", "New Password","Confirm Password"
    And clicks on Cancel option
    Then User lands to User Manager Page.
    And there are no changes to the User Password

  @MMSUserProfile-005
  Scenario: "Save" Change Password
    Given User is on My User Profile Page.
    And User has clicked on the Change Password link
    And User can see the Editable Text boxes such as "Current Password","New Password","Confirm Password"
    When User enters "admin", "transGE216@s","transGE216@s"
    And clicks on Save option
    #Then User can see the "Saved Successfully" message in "Green"
    Then User lands to My User Profile Page.
    And Password is changed
    And User is on Home Page.
