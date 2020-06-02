# Methods

## Defining a Method

A method definition consists of method name, parameters, return value type, and body.

> ` modifier returnValueType methodName(list of parameters) {
       // Method body;
   }`

The *method header* specifies the *modifiers*, *return value type*, *method name*, and *parameters* of the method.

A method may return a value. The returnValueType is the data type of the value the method returns. Some methods perform desired operations without returning a value. In this case, the returnValueType is the keyword void. If a method returns a value, it is called a *value-returning method*; otherwise, it is called a *void method*.

The variables defined in the method header are known as *formal parameters* or simply *parameters*. A parameter is like a placeholder: when a method is invoked, you pass a value to the parameter. This value is referred to as an actual parameter or argument. The parameter list refers to the method’s type, order, and the number of parameters. The method name and the parameter list together constitute the method signature. Parameters are optional; that is, a method may contain no parameters. 

In order for a value-returning method to return a result, a return statement using the keyword return is *required*. The method terminates when a return statement is executed.

## Calling a Method

Calling a method executes the code in the method.

In a method definition, you define what the method is to do. To execute the method, you have to *call* or *invoke* it. The program that calls the function is called a *caller*. There are two ways to call a method, depending on whether the method returns a value or not. If a method returns a value, a call to the method is usually treated as a value. 

When a program calls a method, program control is transferred to the called method. A called method returns control to the caller when its return statement is executed or when its method- ending closing brace is reached.

Each time a method is invoked, the system creates an *activation record* (also called an activation frame) that stores parameters and variables for the method and places the activation record in an area of memory known as a *call stack*. A call stack is also known as an *execution stack*, *runtime stack*, or *machine stack* and it is often shortened to just “the stack.” When a method calls another method, the caller’s activation record is kept intact and a new activation record is created for the new method called. When a method finishes its work and returns to its caller, its activation record is removed from the call stack.

## void vs. Value-Returning Methods

 A void method does not return a value.
 
 The preceding section gives an example of a value-returning method. This section shows how to define and invoke a void method. A program that defines a method named printGrade and invokes it to print the grade for a given score.
 
 To see the differences between a void and value-returning method, let’s redesign the printGrade method to return a value. The new method, which we call getGrade, returns the grade.
 
 ## Passing Parameters by Values
 
 The arguments are passed by value to parameters when invoking a method.
 
 The power of a method is its ability to work with parameters. You can use println to print any string, and max to find the maximum of any two int values. When calling a method, you need to provide arguments, which must be given in the same order as their respective parameters in the method signature. This is known as *parameter order association*.
 
 When you invoke a method with an argument, the value of the argument is passed to the parameter. This is referred to as pass-by-value. If the argument is a variable rather than a literal value, the value of the variable is passed to the parameter. The variable is not affected, regardless of the changes made to the parameter inside the method. 
 
## Modularizing Code

Modularizing makes the code easy to maintain and debug and enables the code to be reused. Methods can be used to reduce redundant code and enable code reuse. Methods can also be used to modularize code and improve the quality of the program.

By encapsulating the code for obtaining the gcd in a method, this program has several advantages:
1. It isolates the problem for computing the gcd from the rest of the code in the main method. Thus, the logic becomes clear, and the program is easier to read.
2. The errors on computing the gcd are confined in the gcd method, which narrows the scope of debugging.
3. The gcd method now can be reused by other programs.

## Overloading Methods

Overloading methods enable you to define the methods with the same name as long as their parameter lists are different.

The max method used earlier works only with the int data type. But what if you need to determine which of the two floating-point numbers has the maximum value? The solution is to create another method with the same name but different parameters, as shown in the following code:

> `public static double max(double num1, double num2) {` 
>>  `if (num1 > num2)`
>>>        `return num1;` 
>>   `else`
>>>    `return num2;` 
> `}`

If you call max with int parameters, the max method that expects int parameters will be invoked; and if you call max with double parameters, the max method that expects double parameters will be invoked. This is referred to as method overloading; that is, two methods have the same name but different parameter lists within one class. The Java compiler determines which method to use based on the method signature.

Can you invoke the max method with an int value and a double value, such as max(2, 2.5)? If so, which of the max methods is invoked? The answer to the first question is yes. The answer to the second question is that the max method for finding the maximum of two double values is invoked. The argument value 2 is automatically converted into a double value and passed to this method.

You may be wondering why the method max(double, double) is not invoked for the call max(3, 4). Both max(double, double) and max(int, int) are possible matches for max(3, 4). The Java compiler finds the method that best matches a method invocation. Since the method max(int, int) is a better match for max(3, 4) than max(double, double), max(int, int) is used to invoke max(3, 4).

## The Scope of Variables

The scope of a variable is the part of the program where the variable can be referenced.

A variable defined inside a method is referred to as a local variable. The scope of a local variable starts from its declaration and continues to the end of the block that contains the variable. A local variable must be declared and assigned a value before it can be used.

A parameter is actually a local variable. The scope of a method parameter covers the entire method. A variable declared in the initial-action part of a for-loop header has its scope in the entire loop. However, a variable declared inside a for-loop body has its scope limited in the loop body from its declaration to the end of the block that contains the variable.

## Method Abstraction and Stepwise Refinement

*Method abstraction* is achieved by separating the use of a method from its implementation. The client can use a method without knowing how it is implemented. The details of the implementation are encapsulated in the method and hidden from the client who invokes the method. This is also known as *information hiding* or *encapsulation*. If you decide to change the implementation, the client program will not be affected, provided that you do not change the method signature. The implementation of the method is hidden from the client in a “black box,”.

The concept of method abstraction can be applied to the process of developing programs. When writing a large program, you can use the *divide-and-conquer* strategy, also known as *stepwise refinement*, to decompose it into subproblems. The subproblems can be further decomposed into smaller, more manageable problems.

### Top-Down Design

Begin- ning programmers often start by trying to work out the solution to every detail. Although details are important in the final program, concern for detail in the early stages may block the problem-solving process. To make problem solving flow as smoothly as possible, this example begins by using method abstraction to isolate details from design and only later implements the details.
For this example, the problem is first broken into two subproblems: get input from the user, and print the calendar for the month. At this stage, you should be concerned with what the subproblems will achieve, not with how to get input and print the calendar for the month. You can draw a structure chart to help visualize the decomposition of the problem.

### Top-Down and/or Bottom-Up Implementation

Now we turn our attention to implementation. In general, a subproblem corresponds to a method in the implementation, although some are so simple that this is unnecessary. You would need to decide which modules to implement as methods and which to combine with other methods. Decisions of this kind should be based on whether the overall program will be easier to read as a result of your choice. In this example, the subproblem readInput can be simply implemented in the main method.

You can use either a “top-down” or a “bottom-up” approach. The top-down approach implements one method in the structure chart at a time from the top to the bottom. *Stubs*—a simple but incomplete version of a method—can be used for the methods waiting to be implemented. The use of stubs enables you to quickly build the framework of the program. Implement the main method first then use a stub for the printMonth method. For example, let printMonth display the year and the month in the stub. 

Compile and test the program, and fix any errors. You can now implement the printMonth method. For methods invoked from the printMonth method, you can again use stubs.

The bottom-up approach implements one method in the structure chart at a time from the bottom to the top. For each method implemented, write a test program, known as the *driver*, to test it. The top-down and bottom-up approaches are equally good: Both approaches implement methods incrementally, help to isolate programming errors, and make debugging easy. They can be used together.

### Benefits of Stepwise Refinement

Stepwise refinement breaks a large problem into smaller manageable subproblems. Each sub- problem can be implemented using a method. This approach makes the program easier to write, reuse, debug, test, modify, and maintain.
#### Simpler Program
The print calendar program is long. Rather than writing a long sequence of statements in one method, stepwise refinement breaks it into smaller methods. This simplifies the program and makes the whole program easier to read and understand.
#### Reusing Methods
Stepwise refinement promotes code reuse within a program. The isLeapYear method is defined once and invoked from the getTotalNumberOfDays and getNumberOfDaysInMonth methods. This reduces redundant code.
#### Easier Developing, Debugging, and Testing
Since each subproblem is solved in a method, a method can be developed, debugged, and tested individually. This isolates the errors and makes developing, debugging, and testing easier.
When implementing a large program, use the top-down and/or bottom-up approach. Do not write the entire program at once. Using these approaches seems to take more development time (because you repeatedly compile and run the program), but it actually saves time and makes debugging easier.
#### Better Facilitating Teamwork
When a large problem is divided into subprograms, subproblems can be assigned to different programmers. This makes it easier for programmers to work in teams.