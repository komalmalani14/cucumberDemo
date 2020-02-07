Feature: Pixel Store

 Background: 
  Given App is opened

  @Regression @Smoke
  Scenario: User login
    When Executive enter their userid as "Alice9999"
    Then System should accept her ID

  @FunctionalTest
  Scenario Outline: Refund of a microwave1 of <price>$
    Given Alice purchased microwave for <price>
    And Alice has a receipt
    When Alice returns the microwave
    Then Alice should get refund of <price>

    Examples: 
      | price |
      |   500 |
      |   600 |

  @dataDriven
  Scenario: Data regression
    Given user is at registration page
    When user enters the credentials
      | ToGo   | John | Piper | Piper |
      | Israel | Jane | Mary  | Mary  |
      | India  | ABC  | XYZ   | XYZ   |
     Then Registration is successfull
     

  @Smoke
  Scenario: Executive Login
    When Executive logs in
    Then Login successful
    
  @Regression2
  Scenario: Demo Webshop Registration
  Given Demo Webshop Registration is opened
  When user enters details
  |Lina|AzMa|lina.azma@xyz.com|LinaAzMa|LinaAzMa|
  |Mina|KzMa|Mina.kzma@xyz.com|MinaKzMa|MinaKzMa|
  |Zina|MzMa|Zina.Mzma@xyz.com|ZinaMzMa|ZinaMzMa|
  And user clicks on Registration
  And User gets Regitration Completed message
  Then Registration is successful
    
   #dsdadabd
