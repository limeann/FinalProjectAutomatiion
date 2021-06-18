
Scenario: 1. Verify addition of product to Bag negative
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to DRESSES
And I navigated to chosen dress
And I tried to add dress to bag
Then message 'Please select from the available colour and size options' displayed

Scenario: 2. Verify addition of product to Bag positive
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to DRESSES
And I navigated to chosen dress
And I select 32 size of dress
And I tried to add dress to bag
Then Bag icon became filled with '1'

Scenario: 3. Verify deleting product from Bag
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to DRESSES
And I navigated to chosen dress
And I select 32 size of dress
And I tried to add dress to bag
And I tried to remove dress from bag
Then Bag icon became unfilled

Scenario: 4. Verify searching product
Given I navigated to url = 'https://www.asos.com/women/'
When I clicked on searching bar
And I entered 'Scirt' and clicked ENTER
Then banner should contains 'Your search results for:'"Scirt"''

Scenario: 5. Verify searching product by filters
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to DRESSES
And I clicked on Style filter
And I chose A Line dress
And I clicked on Dress Type filter
And I chose Going Out dress
And I clicked on Neckline filter
And I chose High Neck dress
Then dress with such filters exist


Scenario: 6. Verify serching product by Brand
Given I navigated to url = 'https://www.asos.com/women/'
When I clicked on Brands
And I clicked on Monkis
Then go to Monkis brand page

Scenario: 7. Verify Sign In positive
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to My Account
And I set 'anna_melnychuk@gmail.com' into EMAIL ADDRESS field
And I set '46c_JFdVhH!R3tS' into PASSWORD field
And I click on SIGN IN button
Then My Account Item became filled
And I clicked on sign out button

Scenario: 8. Verify adding product to favourite
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to DRESSES
And I clicked on heart of chosen dress to add to favourite
Then heart icon is filled

Scenario: 9. Verify negative registration
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to 'Join'
And I set 'testAutomationtest111@gmail.com' to EMAIL ADDRESS field
And I set 'Anna' to FIRST NAME field
And I set 'Melnychuk' to LAST NAME field
And I set 'passwordTest' to PASSWORD field
And I set '10' to DAY field
And I set 'September' to MONTH field
And I set '2000' to YEAR field
And I click on JOIN ASOS button
Then Message Account cannot be created right now displayed


Scenario: 10. Verify negative sign in
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to My Account
And I set 'testAutomationtest@gmail.com' into EMAIL ADDRESS field
And I set 'passwordTestWrong' into PASSWORD field
And I click on SIGN IN button
Then a massage 'Looks like either your email address or password were incorrect. Wanna try again?' should pop up
