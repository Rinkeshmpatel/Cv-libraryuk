Feature: Job Serch
  As a User i want to Search job into CVlibrary website

  Scenario Outline: Verify Jobsearch Result using differentdataset
    Given I am on Home Page
    When I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I verify the result "<result>"
Examples:
  |jobTitle          |location   | distance      |salaryMin |salaryMax |salaryType |jobType    |result                                     |
  |Tester            |Harrow     | up to 5 miles |30000     |500000    |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
  |Productmanger     |Croydon    |up to 7 miles  |28000     |52000     |per annum  | Permanent |Permanent full time in east croydon        |
  |Retail Assistance |Green park |up to 3 miles  |18000     | 25000    |Per annum  |Permanent  |Permanent full time in east london         |
  |Customeradviser   |Kingstone  |up to 5 miles  |24000     |29000     |per annum  |Permanent  |Permanent customer advise Kingstone        |
  |Bus Driver        |Uxbridge   |up to 10 miles |28000     |35000     |Per annum  |Permanent  |Permanenr bus driver full time Uxbridge    |
  |Javadevloper      |Sutton     |up to 14 miles |45000     |65000     |Per annum  |Permanent  |Permanent java devloper Sutton             |
  |It Project manager|Northcheam |up to 20 miles |42000     |58000     |Per annum  |Permanent  |Permanenr It Project manager Northcheam    |


