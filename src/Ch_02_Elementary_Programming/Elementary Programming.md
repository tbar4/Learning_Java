# Elementary Programming

## Writing a Simple Program

Writing a program involves designing a strategy for solving the problem and then using a programming language to implement that strategy. 

Writing a program involves designing algorithms and translating algorithms into programming instructions, or code. An *algorithm* describes how a problem is solved by listing the actions that need to be taken and the order of their execution. Algorithms can help the programmer plan a program before writing it in a programming language. Algorithms can be described in natural languages or in *pseudocode* (natural language mixed with some program- ming code). The algorithm for calculating the area of a circle can be described as follows:

1. Read the circle's radius
2. Compute the area using the following formula:
2.1.  area = radius x radius * /pi
3. Display the result

When you *code*—that is, when you write a program—you translate an algorithm into a program. You already know that every Java program begins with a `class` definition in which the keyword class is followed by the class name. Assume that you have chosen `ComputeArea` as the class name. The outline of the program would look like this:

<pre><code>
public class ComputeArea {
// Program will be added here
}
</code></pre>

Java programs must have a `main` method where program execution begins. The program is then expanded as follows:

<pre><code>
public class ComputeArea {
    public static void main(String[] args) {
        // Step 1: Read in Radius
        
        // Step 2: Compute Area
        
        // Step 3: Display the Area
    }
}
</code></pre>


The program needs to read the radius entered by the user from the keyboard. This raises two important issues:
* Reading the radius
* Storing the radius in the program

The program needs to declare a symbol called a *variable*. A variable represents a value stored in the computer’s memory.

Data types are the kind of data stored in a variable, whether integer, real number, or something else. This is known as *declaring variables*. Java provides simple data types for representing integers, real numbers, characters, and Boolean types. These types are known as *primitive data types* or *fundamental types*.

Real numbers (i.e., numbers with a decimal point) are represented using a method known as *floating-point* in computers. So, the real numbers are also called *floating-point numbers*. In Java, you can use the keyword `double` to declare a floating-point variable. Declare `radius` and `area` as `double`. The program can be expanded as follows:

<pre><code>
public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        
        // Step 1: Read in Radius
        radius = 20;
        
        // Step 2: Compute Area
        area = radius * radius * 3.14159;
        
        // Step 3: Display the Area
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
</code></pre>

The method of reviewing how a program works is called *tracing a program*. Tracing programs are helpful for understanding how programs work, and they are useful tools for finding errors in programs.

The plus sign (+) has two meanings: one for addition and the other for concatenating (combining) strings. The plus sign (+) in lines 13–14 is called a `string concatenation operator`. It combines two strings into one. If a string is combined with a number, the number is converted into a string and concatenated with the other string. 

## Read Input from the Console

You can use the `Scanner` class for console input. Java uses `System.out` to refer to the standard output device and `System.in` to the standard input device. By default, the output device is the display monitor and the input device is the keyboard. To perform console output, you simply use the `println` method to display a primitive value or a string to the console. Console input is not directly supported in Java, but you can use the `Scanner` class to create an object to read input from `System.in`, as follows:

> `Scanner input = new Scanner(System.in);`


The syntax `new Scanner(System.in)` creates an object of the `Scanner` type. The syntax `Scanner input` declares that `input` is a variable whose type is Scanner. The whole line `Scanner input = new Scanner(System.in)` creates a `Scanner` object and assigns its reference to the variable `input`. An object may invoke its methods. To invoke a method on an object is to ask the object to perform a task. You can invoke the `nextDouble()` method to read a `double` value as follows:

> `double radius = inout.nextDouble();`

<pre><code>
import java.util.Scanner; 

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();
        
        // Compute Area
        double area = radius * radius * 3.14159;
        
        // Display Results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
</code></pre>

The `Scanner` class is in the `java.util` package. It is imported in line 1. There are two types of `import` statements: *specific import* and *wildcard import*. The *specific import* specifies a single class in the import statement. For example, the following statement imports `Scanner` from the package `java.util`.

> `import java.util.Scanner;`

The *wildcard import* imports all the classes in a package by using the asterisk as the wildcard. For example, the following statement imports all the classes from the package `java.util`.

> `import java.uitl.*;`

The information for the classes in an imported package is not read in at compile time or runtime unless the class is used in the program. The import statement simply tells the compiler where to locate the classes. There is no performance difference between a specific import and a wildcard import declaration.

## Identifiers

Identifiers are the names that identify the elements such as classes, methods, and variables in a program.

`ComputeAverage`, `main`, `input`, `number1`, `number2`, `number3`, and so on are the names of things that appear in the program. In programming terminology, such names are called *identifiers*. All identifiers must obey the following rules:

* An identifier is a sequence of characters that consists of letters, digits, underscores (`_`), and dollar signs (`$`)
* An identifier must start with a letter, an underscore (`_`), or a dollar sign (`$`). It cannot start with a digit
* An identifier cannot be a reserved word
* An identifier cannot be true, false, or null
* An identifier can be of any length

## Variables

Variables are used to represent values that may be changed in the program. The syntax for declaring a variable is:
> `datatype variableName;`

Every variable has a scope. The *scope of a variable* is the part of the program where the variable can be referenced. For now, all you need to know is that a variable must be declared and initialized before it can be used.

## Assignments Statements and Assignment Expressions

An assignment statement designates a value for a variable. An assignment statement can be used as an expression in Java. 

After a variable is declared, you can assign a value to it by using an *assignment statement*. In Java, the equal sign (=) is used as the *assignment operator*. The syntax for assignment state- ments is as follows:

> `variable = expression;`

An *expression* represents a computation involving values, variables, and operators that, taking them together, evaluates to a value. 

In Java, an assignment statement is essentially an expression that evaluates to the value to be assigned to the variable on the left side of the assignment operator. For this reason, an assignment statement is also known as an *assignment expression*.

## Named Constants

A named constant is an identifier that represents a permanent value. The value of a variable may change during the execution of a program, but a *named constant*, or simply *constant*, represents permanent data that never changes. 

## Displaying the Current Time

You can invoke `System.currentTimeMillis()` to return the current time.

The `currentTimeMillis` method in the `System` class returns the current time in mil- liseconds elapsed since midnight, January 1, 1970 GMT. This time is known as the UNIX epoch. The epoch is the point when time starts, and 1970 was the year when the UNIX operating system was formally introduced.

## Numeric Type Conversions

Floating-point numbers can be converted into integers using explicit casting. If an integer and a floating-point number are involved in a binary operation, Java automatically converts the integer to a floating-point value. So, 3 * 4.5 is same as 3.0 * 4.5.
You can always assign a value to a numeric variable whose type supports a larger range of values; thus, for instance, you can assign a *long* value to a *float* variable. You cannot, however, assign a value to a variable of a type with a smaller range unless you use type casting. Casting is an operation that converts a value of one data type into a value of another data type. Casting a type with a small range to a type with a larger range is known as widening a type. Casting a type with a large range to a type with a smaller range is known as narrowing a type. Java will automatically widen a type, but you must narrow a type explicitly.

The syntax for casting a type is to specify the target type in parentheses, followed by the variable’s name or the value to be cast. For example, the following statement:
> `System.out.println((int)1.7);`
displays 1

## Software Development Process

The software development life cycle is a multistage process that includes requirements specification, analysis, design, implementation, testing, deployment, and maintenance.

Developing a software product is an engineering process. Software products, no matter how large or how small, have the same life cycle: requirements specification, analysis, design, implementation, testing, deployment, and maintenance.

*Requirements specification* is a formal process that seeks to understand the problem that the software will address and to document in detail what the software system needs to do. This phase involves close interaction between users and developers. Most of the examples in this book are simple, and their requirements are clearly stated. In the real world, however, problems are not always well defined. Developers need to work closely with their customers (the individuals or organizations that will use the software) and study the problem carefully to identify what the software needs to do.

*System analysis* seeks to analyze the data flow and to identify the system’s input and out- put. When you do analysis, it helps to identify what the output is first, and then figure out what input data you need in order to produce the output.

*System design* is to design a process for obtaining the output from the input. This phase involves the use of many levels of abstraction to break down the problem into manageable components and design strategies for implementing each component. You can view each component as a subsystem that performs a specific function of the system. The essence of system analysis and design is input, process, and output (IPO).

*Implementation* involves translating the system design into programs. Separate programs are written for each component and then integrated to work together. This phase requires the use of a programming language such as Java. The implementation involves coding, self- testing, and debugging (that is, finding errors, called bugs, in the code).

*Testing* ensures that the code meets the requirements specification and weeds out bugs. An independent team of software engineers not involved in the design and implementation of the product usually conducts such testing.

*Deployment* makes the software available for use. Depending on the type of software, it may be installed on each user’s machine or installed on a server accessible on the Internet.

*Maintenance* is concerned with updating and improving the product. A software product must continue to perform and improve in an ever-evolving environment. This requires periodic upgrades of the product to fix newly discovered bugs and incorporate changes.

To see the software development process in action, we will now create a program that computes loan payments. The loan can be a car loan, a student loan, or a home mortgage loan. For an introductory programming course, we focus on requirements specification, analysis, design, implementation, and testing.

### Step 1: Requirements Specification

The program must satisfy the following requirements:
* It must let the user enter the interest rate, the loan amount, and the number of years for which payments will be made.
* It must compute and display the monthly payment and total payment amounts.

### Step 2: System Analysis

The output is the monthly payment and total payment, which can be obtained using the following formulas:

\begin{equation}
E=m
\end{equation}