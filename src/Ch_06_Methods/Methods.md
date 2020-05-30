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