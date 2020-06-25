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

## Using Classes from the Java Library

The Java API contains a rich set of classes for developing Java programs.

Defined the Circle class and created objects from the class. You will frequently use the classes in the Java library to develop programs. This section gives some examples of the classes in the Java library.

### The Date Class

ShowCurrentTime.java, you learned how to obtain the current time using System.currentTimeMillis(). You used the division and remainder operators to extract the current second, minute, and hour. Java provides a system-independent encapsulation of date and time in the java.util.Date class.

You can use the no-arg constructor in the Date class to create an instance for the current date and time, the getTime() method to return the elapsed time in milliseconds since January 1, 1970, GMT, and the toString() method to return the date and time as a string. For example, the following code:

<pre><code>
java.util.Date date = new java.util.Date(); 
System.out.println("The elapsed time since Jan 1, 1970 is " +
    date.getTime() + " milliseconds"); 
System.out.println(date.toString());
</code></pre>

displays the output as follows:

> `The elapsed time since Jan 1, 1970 is 1324903419651 milliseconds Mon Dec 26 07:43:39 EST 2011`

The Date class has another constructor, Date(long elapseTime), which can be used to construct a Date object for a given time in milliseconds elapsed since January 1, 1970, GMT.

### The Random Class

You have used Math.random() to obtain a random double value between 0.0 and 1.0 (excluding 1.0). Another way to generate random numbers is to use the java.util.Random class, which can generate a random int, long, double, float, and boolean value.

When you create a Random object, you have to specify a seed or use the default seed. A seed is a number used to initialize a random number generator. The no-arg constructor creates a Random object using the current elapsed time as its seed. If two Random objects have the same seed, they will generate identical sequences of numbers. For example, the following code creates two Random objects with the same seed, 3:

<pre><code>
Random generator1 = new Random(3); 
System.out.print("From generator1: "); 
for (int i = 0; i < 10; i++)
    System.out.print(generator1.nextInt(1000) + " ");
    
Random generator2 = new Random(3); 
System.out.print("\nFrom generator2: "); 
for (int i = 0; i < 10; i++)
    System.out.print(generator2.nextInt(1000) + " ");
</code></pre>

### The Point2D Class

Java API has a convenient Point2D class in the javafx.geometry package for representing
a point in a two-dimensional plane. 

You can create a Point2D object for a point with the specified x- and y-coordinates, use the distance method to compute the distance from this point to another point, and use the toString() method to return a string representation of the point.

## Static Variables, Constants, and Methods

A static variable is shared by all objects of the class. A static method cannot access instance members (i.e., instance data fields and methods) of the class.

 The data field radius in the circle class is known as an instance variable. An instance variable is tied to a specific instance of the class; it is not shared among objects of the same class. For example, suppose that you create the following objects:
 
 <pre><code>
 Circle circle1 = new Circle(); 
 Circle circle2 = new Circle(5);
 </code></pre>
 
 The radius in circle1 is independent of the radius in circle2 and is stored in a different memory location. Changes made to circle1’s radius do not affect circle2’s radius, and vice versa.
 
 If you want all the instances of a class to share data, use *static variables*, also known as *class variables*. Static variables store values for the variables in a common memory location. Because of this common location, if one object changes the value of a static variable, all objects of the same class are affected. Java supports static methods as well as static variables. *Static methods* can be called without creating an instance of the class.
 
 Let’s modify the Circle class by adding a static variable numberOfObjects to count the number of circle objects created. When the first object of this class is created, numberOfObjects is 1. When the second object is created, numberOfObjects becomes 2. The Circle class defines the instance variable radius and the static variable numberOfObjects, the instance methods getRadius, setRadius, and getArea, and the static method getNumberOfObjects.
 
 To declare a static variable or define a static method, put the modifier static in the vari- able or method declaration. The static variable numberOfObjects and the static method getNumberOfObjects() can be declared as follows:

<pre><code>
static int numberOfObjects;

static int getNumberObjects() { 
    return numberOfObjects;
}
</code></pre> 

Constants in a class are shared by all objects of the class. Thus, constants should be declared as final static. For example, the constant PI in the Math class is defined as follows:

> `final static double PI = 3.14159265358979323846;`

Method getNumberOfObjects() in Circle is a static method. All the methods in the Math class are static. The main method is static, too.

Instance methods (e.g., getArea()) and instance data (e.g., radius) belong to instances and can be used only after the instances are created. They are accessed via a reference variable. Static methods (e.g., getNumberOfObjects()) and static data (e.g., numberOfObjects) can be accessed from a reference variable or from their class name.

When you compile `TestCircleWithStaticMembers.java`, the Java compiler automatically compiles `Circle.java` if it has not been compiled since the last change.

An instance method can invoke an instance or static method, and access an instance or static data field. A static method can invoke a static method and access a static data field. However, a static method cannot invoke an instance method or access an instance data field, since static methods and static data fields don’t belong to a particular object. 

## Visibility Modifiers

Visibility modifiers can be used to specify the visibility of a class and its members.

You can use the public visibility modifier for classes, methods, and data fields to denote they can be accessed from any other classes. If no visibility modifier is used, then by default the classes, methods, and data fields are accessible by any class in the same package. This is known as *package-private* or *package-access*.

Packages can be used to organize classes. To do so, you need to add the following line as the first noncomment and nonblank statement in the program:
> `package packageName;`

If a class is defined without the package statement, it is said to be placed in the default
package.

Java recommends that you place classes into packages rather than using a default package.

In addition to the public and default visibility modifiers, Java provides the private and protected modifiers for class members. The `private` modifier makes methods and data fields accessible only from within its own class. 

If a class is not defined as public, it can be accessed only within the same package.

A visibility modifier specifies how data fields and methods in a class can be accessed from outside the class. There is no restriction on accessing data fields and methods from inside the class.  

## Data Field Encapsulation

Making data fields private protects data and makes the class easy to maintain.

The data fields `radius` and `numberOfObjects` in the `Circle` class can be modified directly (e.g., c1.radius = 5 or Circle.numberOfObjects = 10). This is not a good practice—for two reasons:

1. Data may be tampered with. For example, `numberOfObjects` is to count the number of objects created, but it may be mistakenly set to an arbitrary value (e.g., Circle. numberOfObjects = 10).

2. The class becomes difficult to maintain and vulnerable to bugs. Suppose that you want to modify the Circle class to ensure that the radius is nonnegative after other programs have already used the class. You have to change not only the Circle class but also the programs that use it because the clients may have modified the radius directly (e.g., c1.radius = –5).

To prevent direct modifications of data fields, you should declare the data fields private, using the private modifier. This is known as *data field encapsulation*.

A private data field cannot be accessed by an object from outside the class that defines the
private field. However, a client often needs to retrieve and modify a data field. To make a
private data field accessible, provide a getter method to return its value. To enable a private  data field to be updated, provide a setter method to set a new value. A getter method is also referred to as an accessor and a setter to a mutator. A getter method has the following
signature:

> `public returnType getPropertyName()`

If the returnType is boolean, the getter method should be defined as follows by convention:

> `public boolean isPropertyName()`

A setter method has the following signature:

> `public void setPropertyName(dataType propertyValue)`

## Passing Objects to Methods

Passing an object to a method is to pass the reference of the object.
You can pass objects to methods. Like passing an array, passing an object is actually passing the reference of the object. The following code passes the myCircle object as an argument to the printCircle method:

<pre><code>
public class Test {

    public static void main(String[] args) { 
        Circle myCircle = new Circle(5.0);
        printCircle(myCircle);
        
    public static void printCircle(Circle c) { 
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
</code></pre>

Java uses exactly one mode of passing arguments: pass-by-value. In the preceding code, the value of myCircle is passed to the printCircle method. This value is a reference to a Circle object.

When passing an argument of a reference type, the reference of the object is passed. In this case, `c` contains a reference for the object that is also referenced via `myCircle`. Therefore, changing the properties of the object through c inside the printAreas method has the same effect as doing so outside the method through the variable myCircle. Pass-by-value on references can be best described semantically as pass-by-sharing; that is, the object referenced in the method is the same as the object being passed.

## Array of Objects

An array can hold objects as well as primitive-type values.

Single-Dimensional Arrays, described how to create arrays of primitive-type elements. You can also create arrays of objects. For example, the following statement declares and creates an array of 10 Circle objects:

> `Circle[] circleArray = new Circle[10];`

To initialize circleArray, you can use a for loop as follows:

<pre><code>
for (int i = 0; i < circleArray.length; i++) {
    circleArray[i] = new Circle();
}
</code></pre>

The pro- gram summarizes the areas of an array of circles. The program creates circleArray, an array composed of five Circle objects; it then initializes circle radii with random values and displays the total area of the circles in the array.

## Immutable Objects and Classes

You can define immutable classes to create immutable objects. The contents of immutable objects cannot be changed.

Normally, you create an object and allow its contents to be changed later. However, occasion- ally it is desirable to create an object whose contents cannot be changed once the object has been created. We call such an object as *immutable object* and its class as *immutable class*. The String class, for example, is immutable.

If a class is immutable, then all its data fields must be private and it cannot contain public setter methods for any data fields. A class with all private data fields and no mutators is not necessarily immutable. For example, the following Student class has all private data fields and no setter methods, but it is not an immutable class: 

<pre><code>
public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;
    
    public Student(int ssn, String newName) { 
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}
</code></pre>

As shown in the following code, the data field dateCreated is returned using the get- DateCreated() method. This is a reference to a Date object. Through this reference, the content for dateCreated can be changed.

<pre><code>
public class Test {
    public static void main(String[] args) {
        Student student = new Student(111223333, "John");
        java.util.Date dateCreated = student.getDateCreated(); 
        dateCreated.setTime(200000); // Now dateCreated field is changed!
    } 
}
</code></pre>

## The Scope of Variables

The scope of instance and static variables is the entire class, regardless of where the variables are declared.

We discussed local variables and their scope rules. Local variables are declared and used inside a method locally. This section discusses the scope rules of all the variables in the context of a class.

Instance and static variables in a class are referred to as the *class’s variables* or *data fields*. A variable defined inside a method is referred to as a *local variable*. The scope of a class’s variables is the entire class, regardless of where the variables are declared. A class’s variables and methods can appear in any order in the class, as shown in Figure 9.20a. The exception is when a data field is initialized based on a reference to another data field. In such cases, the other data field must be declared first.

You can declare a class’s variable only once, but you can declare the same variable name in a method many times in different nonnesting blocks.

If a local variable has the same name as a class’s variable, the local variable takes prece- dence and the class’s variable with the same name is *hidden*. For example, in the following program, x is defined both as an instance variable and as a local variable in the method:

<pre><code>
public class F {
    private int x = 0; // Instance variable 
    private int y = 0;
    
    public F() { 
    }
    
    public void p() {
    int x = 1; // Local variable 
    System.out.println("x = " + x); 
    System.out.println("y = " + y);
    } 
}
</code></pre>

* x is declared as a data field with the initial value of 0 in the class, but it is also declared in the method p() with an initial value of 1. The latter x is referenced in the System.out.println statement.

* y is declared outside the method p(), but y is accessible inside the method.

## The this Reference

The keyword this refers to the object itself. It can also be used inside a constructor to
invoke another constructor of the same class.

The this keyword is the name of a reference that an object can use to refer to itself. You can use the this keyword to reference the object’s instance members. For example, the following code in (a) uses this to reference the object’s radius and invokes its getArea() method explicitly. The this reference is normally omitted for brevity as shown in (b). However, the this reference is needed to reference a data field hidden by a method or constructor parameter, or to invoke an overloaded constructor.

a.
<pre><code>
public class Circle { 
    private double radius;
    
    ...

    public double getArea() {
    return this.radius * this.radius * Math.PI;
    }

    public String toString() {
    return "radius: " + this.radius + "area: " + this.getArea();
    } 
}
</code></pre>

is equivalent to b.

<pre><code>
public class Circle { 
    private double radius;
    
    ...

    public double getArea() {
    return radius * radius * Math.PI;
    }

    public String toString() {
    return "radius: " + radius + "area: " + getArea();
    } 
}
</code></pre>

### Using this to Reference Data Fields

It is a good practice to use the data field as the parameter name in a setter method or a con- structor to make the code easy to read and to avoid creating unnecessary names. In this case, you need to use the this keyword to reference the data field in the setter method. For exam- ple, the setRadius method can be implemented as shown in (a). It would be wrong if it is implemented as shown in (b).

a. 
<pre><code>
private double radius;

public void setRadius(double radius) { 
    this.radius = radius;
}
</code></pre>

b.
<pre><code>
private double radius = 1;

public void setRadius(double radius) { 
    this.radius = radius;
}
</code></pre>

The data field radius is hidden by the parameter radius in the setter method. You need to reference the data field name in the method using the syntax `this.radius`. A hidden static variable can be accessed simply by using the ClassName.staticVariable reference. A hidden instance variable can be accessed by using the keyword `this`.

a.
<pre><code>
public class F {
    private int i = 5;
    private static double k = 0;

    public void setI(int i) { 
    this.i = i;
    }
    
    public static void setK(double k) { 
    F.k = k;
    }
    
  // other methods omitted
}
</code></pre>

b.
<pre><code>
Suppose that f1 and f2 are two objects of F. 

Invoking f1.setI(10) is to execute 
    this.i = 10, where this refers f1 

Invoking f2.setI(45) is to execute
    this.i = 45, where this refers f2

Invoking F.setK(33) is to execute 
    F.k = 33. setK is a static method
</code></pre>

The this keyword gives us a way to reference the object that invokes an instance method. To invoke `f1.setI(10)`, `this.i = i` is executed, which assigns the value of parameter i to the data field `i` of this calling object f1. The keyword `this` refers to the object that invokes the instance method `setI`. The line `F.k = k` means the value in parameter `k` is assigned to the static data field `k` of the class, which is shared by all the objects of the class.

### Using this to Invoke a Constructor

The this keyword can be used to invoke another constructor of the same class. For example,
you can rewrite the Circle class as follows:

<pre><code>
public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle() {
        this(1.0)
    }
    
    ...
    
}
</code></pre>

The line this(1.0) in the second constructor invokes the first constructor with a double value argument.