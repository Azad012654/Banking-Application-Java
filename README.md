# Banking-Application-Java

***A very basic banking application demonstrating use of Java objects and soring values in the class object****

Explanation :
1. We have created 3 classess , class Bank which will hold the details like Account Number, Customer Name, Balance Amount and Trnsaction types.
2. another class is processing/service which will do all the processing task such as updating balance, updating transaction types and displaying the values. 
   We will use the processing class for all our operations.
3. There is one more class Transactions which will hold values such as transaction types, amount involved in the transaction and date.

So we first get the values in the main class from the user and set them to Bank class member varibales using the object of Processing class (We are using
functions deined in processing class to set all the values to bank class member variables.
And in processing class we will also update the values of Transactions class whenever any traction will occur say Deposit and Withdrawal, it will simply create 
a list using processing class object and set the list to Bank class member variable transactions which is of list type.
