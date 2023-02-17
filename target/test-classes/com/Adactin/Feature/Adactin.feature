Feature: Hotel Booking In Adactin Applicatin
Scenario: User Lanching The Application
Given  user Launching The Url Adactin Application
When user Enter The User Name In User Field
When User  Enter The Password in password field
Then User Click On Submit Button It Navigates To Search Hotel Page
Scenario: User Filling Search Hotel 
Given user Must Select Options
When user Select The Location  Field
When user Select The Hotels Field
When user Select The Room Type Field
When user Select The Number Of Rooms Field
When user Enter The Check In Date field And Clear Datepick_In Field
When user Enter The Datepick_In And Pass The Send Keys In Check In Date Filed 
When user Enter The Check Out Date field And Clear Datepick_Out Field
When user Enter The Datepick_Out And Pass The Send Keys In Check Out Date Filed
When user Select The Adults per Room Field
When user Select The Children per Room Field
Then User Click On Search Button It Navigates To Select Hotel Page
Scenario: Select The Page Fuctionality
Given user Must Select The Page Options
When user Click On Radio  Button
Then user Click On Continue Button It Navigates To Book  Hotel Page
Scenario: Booking Page Fuctionality
Given Enter The Options
When user Enter The  First Name field
When user Enter The Last Name Field
When user Enter The Billing Address Field
When user Enter The Credit Card No Filed
When user Select The Credit Card Type Field
And user Select Expiry Date Select  Field Of Month
And user Select Expiry Date Select  Field Of  Year
When user Enter The  CVV Number Field
Then user Click The Book Now Button
Then user click On Logout Button And Exit the Application
Then To Tack Screen Shot
