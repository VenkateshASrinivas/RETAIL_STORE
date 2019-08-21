# The Retail Store

> This Project is a Standalone Project for calculating and Generating the bill based on the Discount strategy and Rules given.
1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

# IMPLEMENTATION STRATEGY

1. The Retail Store is based on a Object Oriented Approach following a famous design pattern "Factory Design Pattern".

        1. Factory Method Pattern allows the sub-classes to choose the type of objects to create.
        2. Here , We have a GetPlanFactory Class which decides Specific Plan , based on the Customer type to return the Affiliate/Customer/Employee
           Object.
        3. Created a Plan abstract class and concrete classes that extends the Plan abstract class. A factory class GetPlanFactory is defined as a next step.
        4. GetPlanFactory to generate object of concrete classes based on given information.
        5. Concrete Classes would be i. Affiliate ii. Customer iii. Default iv. Employee.
        6. Generated Bill by using the GetPlanFactory to get the object of concrete classes by passing an information such as type of plan AFFILIATE PLAN or CUSTOMER PLAN or EMPLOYEE PLAN
        7. Type of the Plan is based on the User information.
        8. Necessary Junit test cases for running different scenarios are created.
        9. Provided Java Doc Comments for all the classes.
        10. Followed Proper Coding Standards for class level , local , and function parameters.
        11. Given Proper Class Names that everyone can easily understand and extend the feature if needed.
        12. Leverage the code as need and created different packages for better understanding.

# DATABASE
>Since it is a standalone am using the mock json data for user and  products.

![DATABSE](/WebContent/resources/images/Database.PNG 'DATABASE')

[PRODUCTS](products.json) (`products.json`) allows to load and display an PRODUCTS .

[USERS](user.json) (`users.json`) allows to load and display an USERS.


## HOW TO RUN THE TEST CASES
![The Retail Store](/WebContent/resources/images/FOLDER_STRUCTURE_TESTS.PNG 'TEST CASES')

> Go to \RetailStore\test  JUNIT TEST folder ,

        > Run the Highlighted test cases of Different user.
        > Update the products list in the Junit Test File (If wanted to test with different Products) from Products.json.
        > For Ex: Right click on file AffiliateBillGenaratorTest --> Run As Junit Test.

 ## RESULTS

# AFFILIATE AS USER BILL
![AFFILIATE AS USER BILL](/WebContent/resources/images/AffilitedUserBill.PNG 'AFFILIATE AS USER BILL')
# CUSTOMER BILL
![CUSTOMER BILL](/WebContent/resources/images/CustomerBill.PNG 'CUSTOMER BILL')
# EMPLOEYEE AS A USER BILL
![EMPLOEYEE AS A USER](/WebContent/resources/images/EmployeeAsUserBill.PNG 'EMPLOEYEE AS A USER')
# GROCERY PRODUCTS BILL
## NOTE : [ * THOUGH DISCOUNT RATE FOR AN EMPLOYEE APPLICABLE BUT FOR GROCERY PRODUCTS NO DISCOUNT APPLICABLE *]
![GROCERY PRODUCTS BILL](/WebContent/resources/images/GroceryProductsBill.PNG 'GROCERY PRODUCTS BILL')

## JAVA DOC

![JAVA DOC](/WebContent/resources/images/javadoc.PNG 'JAVA DOC')

Go to :  /RETAILSTORE/doc/index.html & Open in a Browser for the reference.