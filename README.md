# Megaventory-Mini-Project



This mini-project was done using Eclipse IDE.

First of all, I have a class for each entity I was asked to Insert to my account via the API. Each class has its own private variables (and respectively their setters and getters, in order to achieve encapsulation). Also, all the classes have a common variable that they need to share (that's why I was asked just to implement insert action) and this is mvRecordAction. For this reason, I created a parent class Insertions. This class is parent to every class-entity I mentioned before and they share the same function toJSON() and Request() (to achieve maximum inheritance possible). 
Except of the classes I have created an interface which has just two functions, the first, converts different Objects (that's why I added the generic type) to JSON data, and the second method, sents a request to the given address with the given content (both are parameters of the method).

PS: I was trying to find how to to enable the tax/discount for the sales order, in order to check my results, and I could not find how to. Although, I implemented it and it may work correct(because there is no big difference comparetively with the other classes).
