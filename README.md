# Java-Project-1
**My First Java Project**

This goal of this project is to create an employee record system. There are three classes: Employee, Salary and Company Position. This is the class diagram to describe the project:

![alt text](https://github.com/pearepeater30/Java-Project-1/blob/master/Capture1.PNG)

The Employee class contains attributes that describe the ID of an Employee, their forename and surname, their salary and their companyPosition which is of type CompanyPosition. It also contains getters for the attributes above and a method that determines if they are eligible for a bonus which applies to Employees who earn over £40000. There is also a toString() method that returns a summary of an Employee. For example, an employee, 'Sid James', who is a 'Director' on a salary of £100000, the string is of the format (precisely):

James, Sid (1234):  Director at £100000:0 (£29822:0 tax) and is eligible for bonus

The Salary class contains a single attribute salary which also contains a getter and setter for this attribute. It also contains a method that calculates the amount of tax to be deducted from someones salary. The tax rules provide for a personal allowance of £9440 which is not taxed. Once this sum is deducted from the gross salary, then up to £32010 is taxed at 20%. Anything above that amount will be taxed at 40%. Here is an example for a calculation:



