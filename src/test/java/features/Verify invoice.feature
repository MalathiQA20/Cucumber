Feature: Validating backendlogin feautures

Scenario: Verify invoice can be printed

Given Go to http://live.demoguru99.com/index.php/backendlogin
And Login the credentials provided <user01> <guru99com>
When Go to Sales-> Orders menu
And In the status field select "Canceled". Click Search
And Select the checkbox next to first order
And In Actions, select Print Invoices. Click Submit
And Verify the error message
And In the status field select "Complete". Click Search
And Select the checkbox next to first order
And In Actions, select Print Invoices. Click Submit
Then Error message There are no printable documents related to selected orders is shown
And  Invoice is downloaded
