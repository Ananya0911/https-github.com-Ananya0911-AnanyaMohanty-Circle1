Feature: Booking

  @chrome
  Scenario: Choosing Consultant  in Chrome
    Given User Launches Chrome Browser
    When User Opens URL
    And User Accepts Cookies
    Then User clicks on Book Appointment
    And User selects Knee replacement Surgery from dropdown
    And User selects location as CB19SB
    Then User is able to click on Search button
    And User selects Date
    And Choose the available Consultant
    And Validate the available time slots
    And Close the browser

  @firefox
  Scenario: Choosing Consultant in Firefox
    Given User Launches Firefox Browser
    When User Opens URL
    And User Accepts Cookies
    Then User clicks on Book Appointment
    And User selects Knee replacement Surgery from dropdown
    And User selects location as CB19SB
    Then User is able to click on Search button
    And User selects Date
    And Choose the available Consultant
    And Validate the available time slots
    And Close the browser