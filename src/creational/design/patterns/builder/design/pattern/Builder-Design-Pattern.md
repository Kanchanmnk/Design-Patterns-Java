#Builder Design Pattern 

1. Creational Design patterns 
2. Step by step creation of object 

### Definition 
Builder pattern encapsulates or hides the process of building a complex object and separates the representation of the object and its construction. 

The separation allows us to construct different representations using the same construction process. 

In Java speak, different representations implies creating objects of different classes that may share the same construction process.

###Class Diagram
The class diagram consists of the following entities

1. Product 

    This is the actual product which we are trying to create. 
2. Builder 
    
    This is an abstract class or an interface which will have all the methods defined to set/create the product
3. Concrete Builder

    This will implement/extend the builder class and override the only methods which are required for its construction. 
4. Director

    This class is responsible to create the final object by calling the methods of concrete builder passed to it via client 
   
ProductClass Diagram

```
```

###When to use 
```
1. When we have many/large number of optional fields
```

###What problem does it solve 
```
1. If we have so many optional param, we might end up creating constructor with different combination of fields, or creating 
a single constructor with so many params
2. Which internally sometimes created problem if the field type and number is same however it represents different fields (Complile time issue : Method-Overload)
3. Complex code and not easy to read
```
###Disadvantage of using it 
```
1. Code duplicacy as same set of fields need to be present in builder and product
```
###Any library using this design pattern
####StringBuilder
```
1. StringBuilder is an example where we get the final object i.e string by calling toString() method
2. StringBuilder has append method which 
```

###Builder Pattern vs Abstract Factory Pattern
```
One difference is that the builder pattern creates an object step by step whereas the abstract factory pattern returns 
the object in one go.
```

###Builder Pattern vs Decorator Pattern
```
1. Decorator is structural design pattern however builder is creational design pattern
2. Decorator pattern has ability to create different/dynamic object at runtime however builder pattern can create predefined objects only
```



