# Object Oriented Thinking

## Class Abstraction and Encapsulation

Class abstraction is separation of class implementation from the use of a class. The details of implementation are encapsulated and hidden from the user. This is known as class encapsulation.

Java provides many levels of abstraction, and *class abstraction* separates class implementation from how the class is used. The creator of a class describes the functions of the class and lets the user know how the class can be used. The collection of public constructors, methods, and fields that are accessible from outside the class, together with the description of how these members are expected to behave, serves as the *class’s contract*. The user of the class does not need to know how the class is implemented. The details of implementation are encapsulated and hidden from the user. This is called *class encapsulation*. For example, you can create a Circle object and find the area of the circle without knowing how the area is computed. For this reason, a class is also known as an *abstract data type (ADT)*.

Class abstraction and encapsulation are two sides of the same coin. Many real-life examples illustrate the concept of class abstraction. Consider, for instance, building a computer system. Your personal computer has many components—a CPU, memory, disk, motherboard, fan, and so on. Each component can be viewed as an object that has properties and methods. To get the components to work together, you need to know only how each component is used and how it interacts with the others. You don’t need to know how the components work internally. The internal implementation is encapsulated and hidden from you. You can build a computer without knowing how a component is implemented.

The computer-system analogy precisely mirrors the object-oriented approach. Each com- ponent can be viewed as an object of the class for the component. For example, you might have a class that models all kinds of fans for use in a computer, with properties such as fan size and speed and methods such as start and stop. A specific fan is an instance of this class with specific property values.

As another example, consider getting a loan. A specific loan can be viewed as an object of a Loan class. The interest rate, loan amount, and loan period are its data properties and computing the monthly and total payments are its methods. When you buy a car, a loan object is created by instantiating the class with your loan interest rate, loan amount, and loan period. You can then use the methods to find the monthly payment and total payment of your loan. As a user of the Loan class, you don’t need to know how these methods are implemented.

ComputeLoan.java, presented a program for computing loan payments. That program cannot be reused in other programs because the code for computing the payments is in the main method. One way to fix this problem is to define static methods for computing the monthly payment and the total payment. However, this solution has limitations. Suppose that you wish to associate a date with the loan. There is no good way to tie a date with a loan without using objects. The traditional procedural programming paradigm is action-driven, and data are separated from actions. The object-oriented programming paradigm focuses on objects, and actions are defined along with the data in objects. To tie a date with a loan, you can define a loan class with a date along with the loan’s other properties as data fields. A loan object now contains data and actions for manipulating and processing data, and the loan data and actions are integrated in one object. 

<pre><code>
–annualInterestRate: double // The annual interest rate of the loan (default: 2.5). 
–numberOfYears: int // The number of years for the loan (default: 1). 
–loanAmount: double // The loan amount (default: 1000).
–loanDate: java.util.Date // The date this loan was created.
 +Loan() // Constructs a default Loan object.
 +Loan(annualInterestRate: double, numberOfYears: int, loanAmount: double) // Constructs a loan with specified interest rate, years, and loan amount.
 +getAnnualInterestRate(): double // Returns the annual interest rate of this loan.  
 +getNumberOfYears(): int // Returns the number of years of this loan. 
 +getLoanAmount(): double // Returns the amount of this loan. 
 +getLoanDate(): java.util.Date // Returns the date of the creation of this loan. 
 +setAnnualInterestRate(annualInterestRate: double): void // Sets a new annual interest rate for this loan.
 +setNumberOfYears(numberOfYears: int): void // Sets a new number of years for this loan. 
 +setLoanAmount(loanAmount: double): void // Sets a new amount for this loan.
 +getMonthlyPayment(): double // Returns the monthly payment for this loan.
 +getTotalPayment(): double // Returns the total payment for this loan.
</code></pre>

From a class developer’s perspective, a class is designed for use by many different customers. In order to be useful in a wide range of applications, a class should provide a variety of ways for customization through constructors, properties, and methods.

The Loan class contains two constructors, four getter methods, three setter methods, and the methods for finding the monthly payment and the total payment. You can construct a Loan object by using the no-arg constructor or the constructor with three param- eters: annual interest rate, number of years, and loan amount. When a loan object is created, its date is stored in the `loanDate` field. The getLoanDate method returns the date. The methods—`getAnnualInterest`, `getNumberOfYears`, and `getLoanAmount`—return the annual interest rate, payment years, and loan amount, respectively. All the data properties and methods in this class are tied to a specific instance of the `Loan` class. Therefore, they are instance variables and methods.

## Thinking in Objects

The procedural paradigm focuses on designing methods. The object-oriented paradigm couples data and methods together into objects. Software design using the object-oriented paradigm focuses on objects and operations on objects.

ComputeAndInterpretBMI.java, presented a program for computing the body mass index (BMI). The code cannot be reused in other programs, because the code is in the main method. To make it reusable, define a static method to compute body mass index as follows:

> `public static double getBMI(double weight, double height);`

This method is useful for computing body mass index for a specified weight and height. How- ever, it has limitations. Suppose you need to associate the weight and height with a person’s name and birth date. You could declare separate variables to store these values, but these values would not be tightly coupled. The ideal way to couple them is to create an object that contains them all. Since these values are tied to individual objects, they should be stored in instance data fields. 

This example demonstrates the advantages of the object-oriented paradigm over the proce- dural paradigm. The procedural paradigm focuses on designing methods. The object-oriented paradigm couples data and methods together into objects. Software design using the object- oriented paradigm focuses on objects and operations on objects. The object-oriented approach combines the power of the procedural paradigm with an added dimension that integrates data with operations into objects.
In procedural programming, data and operations on the data are separate, and this meth- odology requires passing data to methods. Object-oriented programming places data and the operations that pertain to them in an object. This approach solves many of the problems inherent in procedural programming. The object-oriented programming approach organizes programs in a way that mirrors the real world, in which all objects are associated with both attributes and activities. Using objects improves software reusability and makes programs easier to develop and easier to maintain. Programming in Java involves thinking in terms of objects; a Java program can be viewed as a collection of cooperating objects.

## Class Relationships

To design classes, you need to explore the relationships among classes. The common relationships among classes are association, aggregation, composition, and inheritance.

### Association

*Association* is a general binary relationship that describes an activity between two classes. For example, a student taking a course is an association between the Student class and the Course class, and a faculty member teaching a course is an association between the Faculty class and the Course class. These associations can be represented in UML graphical notation.

Each class involved in an association may specify a *multiplicity*, which is placed at the side of the class to specify how many of the class’s objects are involved in the relationship in UML. A multiplicity could be a number or an interval that specifies how many of the class’s objects are involved in the relationship. The character `*` means an unlimited number of objects, and the interval `m..n` indicates that the number of objects is between `m` and `n`, inclusively. Each student may take any number of courses, and each course must have at least 5 and at most 60 students. Each course is taught by only one faculty member, and a faculty member may teach from 0 to 3 courses per semester.

In Java code, you can implement associations by using data fields and methods. The relation “a student takes a course” is implemented using the `addCourse` method in the Student class and the `addStudent` method in the Course class. The relation “a faculty teaches a course” is implemented using the `addCourse` method in the `Faculty` class and the `setFaculty` method in the `Course` class. The `Student` class may use a list to store the courses that the student is taking, the `Faculty` class may use a list to store the courses that the faculty is teaching, and the `Course` class may use a list to store students enrolled in the course and a data field to store the instructor who teaches the course.

<pre><code>
public class Student { 
    private Course[] 
        courseList;
    
    public void addCourse(Course c) { ... }
}
</code></pre>

<pre><code>
public class Course { 
    private Student[]
        classList;
    private Faculty faculty;

    public void addStudent(Student s) { ... }

    public void setFaculty(Faculty faculty) { ... }
}
</code></pre>

<pre><code>
public class Faculty { 
    private Course[]
        courseList;

    public void addCourse(Course c) { ... }
}
</code></pre>

### Aggregation and Composition

*Aggregation* is a special form of association that represents an ownership relationship between two objects. Aggregation models *has-a* relationships. The owner object is called an *aggregating object*, and its class is called an *aggregating class*. The subject object is called an *aggregated object*, and its class is called an *aggregated class*.

We refer aggregation between two objects as *composition* if the existence of the aggregated object is dependent on the aggregating object. In other words, if a relationship is composition, the aggregated object cannot exist on its own. For example, “a student has a name” is a composition relationship between the Student class and the Name class because Name is dependent on Student, whereas “a student has an address” is an aggregation relationship between the Student class and the Address class because an address can exist by itself. Composition implies exclusive ownership. One object owns another object. When the owner object is destroyed, the dependent object is destroyed as well. In UML, a filled diamond is attached to an aggregating class (in this case, Student) to denote the composition relationship with an aggregated class (Name), and an empty diamond is attached to an aggregating class (Student) to denote the aggregation relationship with an aggregated class (Address).

An aggregation relationship is usually represented as a data field in the aggregating class.

## Processing Primitive DataType Values as Objects

A primitive-type value is not an object, but it can be wrapped in an object using a wrapper class in the Java API.

Owing to performance considerations, primitive data type values are not objects in Java. Because of the overhead of processing objects, the language’s performance would be adversely affected if primitive data type values were treated as objects. However, many Java methods require the use of objects as arguments. Java offers a convenient way to incorporate, or wrap, a primitive data type value into an object (e.g., wrapping an int into an Integer object, wrapping a double into a Double object, and wrapping a char into a Character object). By using a wrapper class, you can process primitive data type values as objects. Java provides Boolean, Character, Double, Float, Byte, Short, Integer, and Long wrapper classes in the java.lang package for primitive data types. The Boolean class wraps a Boolean value true or false. This section uses Integer and Double as examples to introduce the numeric wrapper classes.

Numeric wrapper classes are very similar to each other. Each contains the methods `doubleValue()`, `floatValue()`, `intValue()`, `longValue()`, `shortValue()`, and `byteValue()`. These methods “convert” objects into primitive-type values. 

## Automatic Conversion between Primitive Types and Wrapper Class Types

A primitive-type value can be automatically converted to an object using a wrapper class, and vice versa, depending on the context.

Converting a primitive value to a wrapper object is called *boxing*. The reverse conversion is called *unboxing*. Java allows primitive types and wrapper classes to be converted automatically. The compiler will automatically box a primitive value that appears in a context requiring an object, and unbox an object that appears in a context requiring a primitive value. This is called *autoboxing* and *autounboxing*.

## The bigInteger and BigDecimal Classes

The BigInteger and BigDecimal classes can be used to represent integers or
decimal numbers of any size and precision.
If you need to compute with very large integers or high-precision floating-point values, you can use the BigInteger and BigDecimal classes in the java.math package. Both are immutable. The largest integer of the long type is Long.MAX_VALUE (i.e., 9223372036854775807). An instance of BigInteger can represent an integer of any size. You can use new BigInteger(String)andnew BigDecimal(String to create an instance of BigInteger and BigDecimal, use the add, subtract, multiply, divide, and remainder methods to perform arithmetic operations, and use the compareTo method to compare two big numbers. 

There is no limit to the precision of a BigDecimal object. The divide method may throw
an ArithmeticException if the result cannot be terminated. However, you can use the over- loaded divide(BigDecimal d, int scale, int roundingMode) method to specify a scale and a rounding mode to avoid this exception, where scale is the maximum number of digits after the decimal point. For example, the following code creates two BigDecimal objects and performs division with scale 20 and rounding mode BigDecimal.ROUND_UP.

## The String Class

A String object is immutable; its contents cannot be changed once the string is created.

You know strings are objects. You can invoke the charAt(index) method to obtain a character at the specified index from a string, the length() method to return the size of a string, the substring method to return a substring in a string, the indexOf and lastIndexOf methods to return the first or last index of a matching character or a substring, the equals and compareTo methods to compare two strings, and the trim() method to trim whitespace characters from the two ends of a string, and the toLowerCase() and toUpperCase() methods to return the lowercase and uppercase from a string. We will take a closer look at strings in this section.

The String class has 13 constructors and more than 40 methods for manipulating strings. Not only is it very useful in programming, but it is also a good example for learning classes and objects.

## Constructing a String

You can create a string object from a string literal or from an array of characters. To create a string from a string literal, use the syntax:

> `String newString = new String(stringLiteral);`

The argument stringLiteral is a sequence of characters enclosed in double quotes. The following statement creates a String object message for the string literal "Welcome to Java":

> `String message = new String("Welcome to Java");`

### Immutable Strings and Interned Strings

A String object is immutable; its contents cannot be changed. Does the following code change the contents of the string?

<pre><code>
String s = "Java"; 
s = "HTML";
</code></pre>

The answer is no. The first statement creates a String object with the content "Java" and assigns its reference to s. The second statement creates a new String object with the content "HTML" and assigns its reference to s. The first String object still exists after the assignment, but it can no longer be accessed, because variable s now points to the new object.

### Matching, Replacing, and Splitting by Patterns

Often you will need to write code that validates user input, such as to check whether the input is a number, a string with all lowercase letters, or a Social Security number. How do you write this type of code? A simple and effective way to accomplish this task is to use the regular expression.

A regular expression (abbreviated regex) is a string that describes a pattern for matching a set of strings. You can match, replace, or split a string by specifying a pattern. This is an extremely useful and powerful feature.

Let us begin with the matches method in the String class. At first glance, the matches method is very similar to the equals method. For example, the following two statements both evaluate to true:

<pre><code>
"Java".matches("Java"); 
"Java".equals("Java");
</code></pre>

However, the matches method is more powerful. It can match not only a fixed string, but also a set of strings that follow a pattern. For example, the following statements all evaluate to true:

<pre><code>
"Java is fun".matches("Java.*") 
"Java is cool".matches("Java.*") 
"Java is powerful".matches("Java.*")
</code></pre>

Java.* in the preceding statements is a regular expression. It describes a string pattern that begins with Java followed by any zero or more characters. Here, the substring matches any zero or more characters.

### Conversion between Strings and Arrays

Strings are not arrays, but a string can be converted into an array and vice versa. To convert a string into an array of characters, use the `toCharArray` method.

### Converting Characters and Numeric Values to Strings

You can use Double.parseDouble(str) or Integer.parseInt(str) to convert a string to a double value or an int value", and you can convert a character or a number into a string by using the string concatenating operator. Another way of converting a number into a string is to use the overloaded static valueOf method. This method can also be used to convert a character or an array of characters into a string.

### The StringBuilder and StringBuffer Classes

The StringBuilder and StringBuffer classes are similar to the String class except that the String class is immutable.

In general, the StringBuilder and StringBuffer classes can be used wherever a string is used. StringBuilder and StringBuffer are more flexible than String. You can add, insert, or append new contents into StringBuilder and StringBuffer objects, whereas the value of a String object is fixed once the string is created.

The StringBuilder class is similar to StringBuffer except that the methods for modifying the buffer in StringBuffer are synchronized, which means that only one task is allowed to execute the methods. Use StringBuffer if the class might be accessed by multiple tasks concurrently, because synchronization is StringBuffer. Using StringBuilder is more efficient if it is accessed by just a single task, because no synchronization is needed in this case. The constructors and methods in StringBuffer and StringBuilder are almost the same. This section covers StringBuilder. You can replace StringBuilder in all occurrences in this section by StringBuffer. The program can compile and run without any other changes.
                                                                                                           The StringBuilder class has three constructors and more than 30 methods for managing the builder and modifying strings in the builder. You can create an empty string builder or a string builder from a string using the constructors.

### Modifying Strings in the StringBuilder

You can append new contents at the end of a string builder, insert new contents at a specified position in a string builder, and delete or replace characters in a string builder, using the methods listed.