Feature: search and place the order for products
 
Scenario: Search Experience for product search in both home and offers page
 
Given User is on Green cart Landing page
When User searched with Shortname "Tom" and extract actual name of product
Then User searched for "Tom" Shortname in offers page
And validate product name in offers page matches with landing page
  
 