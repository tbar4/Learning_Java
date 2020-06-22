# Objects and Classes

Object-oriented programming enables you to develop large-scale software and GUIs effectively.

Object-oriented programming is essentially a technology for developing reusable software. You are able to solve many programming problems using selections, loops, methods, and arrays. However, these Java features are not sufficient for developing graphical user interfaces and large-scale software systems.

## Defining Classes for Objects

A class defines the properties and behaviors for objects.

Object-oriented programming (OOP) involves programming using objects. An *object* represents an entity in the real world that can be distinctly identified. For example, a student, a desk, a circle, a button, and even a loan can all be viewed as objects. An object has a unique identity, state, and behavior.

* The state of an object (also known as its properties or attributes) is represented by data fields with their current values. A circle object, for example, has a data field radius, which is the property that characterizes a circle. A rectangle object, for example, has the data fields width and height, which are the properties that characterize a rectangle.

* The behavior of an object (also known as its actions) is defined by methods. To invoke a method on an object is to ask the object to perform an action. For example, you may define methods named getArea() and getPerimeter() for circle objects. A circle object may invoke getArea() to return its area and getPerimeter() to return its perimeter. You may also define the setRadius(radius) method. A circle object can invoke this method to change its radius.

Objects of the same type are defined using a common class. A *class* is a template, blueprint, or *contract* that defines what an object’s data fields and methods will be. An object is an instance of a class. You can create many instances of a class. Creating an instance is referred to as *instantiation*. The terms *object* and *instance* are often interchangeable. The relationship between classes and objects is analogous to that between an apple-pie recipe and apple pies: You can make as many apple pies as you want from a single recipe. 

A Java class uses variables to define data fields and methods to define actions. In addition, a class provides methods of a special type, known as *constructors*, which are invoked to create a new object. A constructor can perform any action, but constructors are designed to perform initializing actions, such as initializing the data fields of objects. Figure 9.3 shows an example of defining the class for circle objects.

The Circle class is different from all of the other classes you have seen thus far. It does not have a main method, and therefore cannot be run; it is merely a definition for circle objects. The class that contains the main method will be referred to in this book, for convenience, as the main class.

The illustration of class templates and objects can be standardized using Unified Modeling Language (UML) notation. This notation, is called a UML class diagram, or simply a class diagram. In the class diagram, the data field is denoted as:

> `dataFieldName: dataFieldType`

The constructor is denoted as: 

> `ClassName(parameterName: parameterType)`

The method is denoted as: 

> `methodName(parameterName: parameterType): returnType`

# Example: Defining Classes and Creating Objects

This section gives two examples of defining classes and uses the classes to create objects. The program constructs three circle objects with radius 1, 25, and 125 and displays the radius and area of each of the three circles. It then changes the radius of the second object to 100 and displays its new radius and area.

The program contains two classes. The first of these, TestCircle, is the main class. Its sole purpose is to test the second class, Circle. Such a program that uses the class is often referred to as a *client* of the class. When you run the program, the Java runtime system invokes the main method in the main class.

You can put the two classes into one file, but only one class in the file can be a *public class*. Furthermore, the public class must have the same name as the file name. Therefore, the file name is TestCircle.java, since TestCircle is public. Each class in the source code is com- piled into a .class file. When you compile TestCircle.java, two class files TestCircle.class and Circle.class are generated.

The main class contains the main method (line 3) that creates three objects. As in creating an array, the new operator is used to create an object from the constructor: new Circle() creates an object with radius 1 (line 5), new Circle(25) creates an object with radius 25 (line 10), and new Circle(125) creates an object with radius 125 (line 15).

These three objects (referenced by circle1, circle2, and circle3) have different data but the same methods. Therefore, you can compute their respective areas by using the getArea() method. The data fields can be accessed via the reference of the object using circle1.radius, circle2.radius, and circle3.radius, respectively. The object can invoke its method via the reference of the object using circle1.getArea(), circle2. getArea(), and circle3.getArea(), respectively.

These three objects are independent. The radius of circle2 is changed to 100 in line 20. The object’s new radius and area are displayed in lines 21 and 22.

There are many ways to write Java programs. For instance, you can combine the two classes in the preceding example into one.

## Constructing Objects Using Constructors

A constructor is invoked to create an object using the new operator. 

Constructors are a special kind of method. They have three peculiarities:
* A constructor must have the same name as the class itself.
* Constructors do not have a return type—not even void.
* Constructors are invoked using the new operator when an object is created. Constructors play the role of initializing objects.

The constructor has exactly the same name as its defining class. Like regular methods, con- structors can be overloaded (i.e., multiple constructors can have the same name but different signatures), making it easy to construct objects with different initial data values.

It is a common mistake to put the void keyword in front of a constructor. For example,

> ` public void Circle() {}`

In this case, Circle() is a method, not a constructor.

Constructors are used to construct objects. To construct an object from a class, invoke a
constructor of the class using the new operator, as follows:

> `new ClassName(arguments)`

For example, new Circle() creates an object of the Circle class using the first constructor defined in the Circle class, and new Circle(25) creates an object using the second constructor defined in the Circle class.

A class normally provides a constructor without arguments (e.g., Circle()). Such a constructor is referred to as a *no-arg* or *no-argument constructor*.

A class may be defined without constructors. In this case, a public no-arg constructor with an empty body is implicitly defined in the class. This constructor, called a default constructor, is provided automatically *only if no constructors are explicitly defined in the class*.

## Accessing Objects via Reference Variables

An object’s data and methods can be accessed through the dot (.) operator via the object’s reference variable.

Newly created objects are allocated in the memory. They can be accessed via reference variables. 

### Reference Variables and Reference Types

Objects are accessed via the object’s reference variables, which contain references to the objects. Such variables are declared using the following syntax:

> `ClassName objectRefVar;`

A class is essentially a programmer-defined type. A class is a *reference type*, which means that a variable of the class type can reference an instance of the class. The following statement declares the variable myCircle to be of the Circle type:

> `Circle myCircle;`

The variable myCircle can reference a Circle object. The next statement creates an object and assigns its reference to myCircle:

> `myCircle = new Circle();`

You can write a single statement that combines the declaration of an object reference variable, the creation of an object, and the assigning of an object reference to the variable with the following syntax:

> `ClassName objectRefVar = new ClassName();`

Here is an example:

> `Circle myCircle = new Circle();`

The variable myCircle holds a reference to a Circle object.

### Accessing an Object's Data and Methods

In OOP terminology, an object’s member refers to its data fields and methods. After an object is created, its data can be accessed and its methods can be invoked using the dot operator (.), also known as the object member access operator:

* objectRefVar.dataField references a data field in the object.
* objectRefVar.method(arguments) invokes a method on the object.

For example, myCircle.radius references the radius in myCircle and myCircle .getArea() invokes the getArea method on myCircle. Methods are invoked as operations on objects.

The data field radius is referred to as an *instance variable* because it is dependent on a specific instance. For the same reason, the method getArea is referred to as an *instance method* because you can invoke it only on a specific instance. The object on which an instance method is invoked is called a *calling object*.

### Reference Data Fields and the null Value

The data fields can be of reference types. For example, the following Student class contains
a data field name of the String type. String is a predefined Java class.

<pre><code>
class Student {
    String name; // name has the default value null
    int age; // age has the default value 0
    boolean isScienceMajor; // isScienceMajor has default value false 
    char gender; // gender has default value '\u0000'
}
</code></pre>

If a data field of a reference type does not reference any object, the data field holds a special Java value, null. null is a literal just like true and false. While true and false are Boolean literals, null is a literal for a reference type.

The default value of a data field is null for a reference type, 0 for a numeric type, false for a boolean type, and \u0000 for a char type. However, Java assigns no default value to a local variable inside a method. The following code displays the default values of the data fields name, age, isScienceMajor, and gender for a Student object:

<pre><code>
class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(); 
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age); 
        System.out.println("isScienceMajor? " + student.isScienceMajor); 
        System.out.println("gender? " + student.gender);
    } 
}
</code></pre>

The following code has a compile error, because the local variables x and y are not initialized:

<pre><code>
class TestLocalVariables {
    public static void main(String[] args) {
        int x; // x has no default value 
        String y; // y has no default value 
        System.out.println("x is " + x); 
        System.out.println("y is " + y);
    } 
}
</code></pre>

NullPointerException is a common runtime error. It occurs when you invoke a method on a reference variable with a null value. Make sure you assign an object reference to the variable before invoking the method through the reference variable. 

### Difference between Variables of Primitive Types and Reference Types

Every variable represents a memory location that holds a value. When you declare a variable, you are telling the compiler what type of value the variable can hold. For a variable of a primi- tive type, the value is of the primitive type. For a variable of a reference type, the value is a reference to where an object is located. The value of int variable i is int value 1, and the value of Circle object c holds a reference to where the contents of the Circle object are stored in memory.

A variable of a primitive type holds a value of the primitive type, and a variable of a reference type holds a reference to where an object is stored in memory.

When you assign one variable to another, the other variable is set to the same value. For a variable of a primitive type, the real value of one variable is assigned to the other variable. For a variable of a reference type, the reference of one variable is assigned to the other vari- able. The assignment statement i = j copies the contents of j into i for primitive variables. The assignment statement c1 = c2 copies the reference of c2 into c1 for reference variables. After the assignment, variables c1 and c2 refer to the same object.