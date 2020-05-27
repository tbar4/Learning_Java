# Selections

## Introduction

The program can decide which statements to execute based on a condition. Like all high-level programming languages, Java provides *selection statements*: statements that let you choose actions with alternative courses. 

<pre><code>
if (radius < 0) { 
    System.out.println("Incorrect input");
}
else {
    area = radius * radius * 3.14159;
    System.out.println("Area is " + area); 
}
</code></pre>

Selection statements use conditions that are Boolean expressions. A *Boolean expression* is an expression that evaluates to a Boolean value: true or false. We now introduce Boolean types and relational operators.

## boolean Data Type

The boolean data type declares a variable with the value either true or false.

Java provides six relational operators (also known as comparison operators): 
* <
* <=
* \>
* \>=
* ==
* !=

Suppose you want to develop a program to let a first-grader practice addition. The program randomly generates two single-digit integers, number1 and number2, and displays to the student a question such as “What is 1 + 7?,”. After the student types the answer, the program displays a message to indicate whether it is true or false.

## if Statements

An if statement is a construct that enables a program to specify alternative paths of execution.

Java has several types of selection statements: one-way if statements, two-way if-else statements, nested if statements, multi-way if-else statements, switch statements, and conditional expressions.

A one-way if statement executes an action if and only if the condition is true. The syntax for a one-way if statement is:

A flowchart is a diagram that describes an algorithm or process, showing the steps as boxes of various kinds, and their order by connecting these with arrows. Process operations are represented in these boxes, and arrows connecting them represent the flow of control. A diamond box denotes a Boolean condition and a rectangle box represents statements.

If the boolean-expression evaluates to true, the statements in the block are executed.

## Two-Way if-else Statements
 
 An if-else statement decides the execution path based on whether the condition is true or false.
 
 A one-way if statement performs an action if the specified condition is true. If the condition is false, nothing is done. But what if you want to take alternative actions when the condition is false? You can use a two-way if-else statement. The actions that a two-way if-else statement specifies differ based on whether the condition is true or false.
 
 ## Nested if and Multi-Way if-else Statements
 
 An if statement can be inside another if statement to form a nested if statement.
 
 The statement in an if or if-else statement can be any legal Java statement, including another if or if-else statement. The inner if statement is said to be nested inside the outer if statement. The inner if statement can contain another if statement; in fact, there is no limit to the depth of the nesting.
 
 ## Common Errors and Pitfalls
 
 Forgetting necessary braces, ending an if statement in the wrong place, mistaking == for =, and dangling else clauses are common errors in selection statements. Duplicated statements in if-else statements and testing equality of double values are common pitfalls.

## Generating Random Numbers

You can use `Math.random()` to obtain a random double value between 0.0 and 1.0, excluding 1.0.

## Logical Operators

The logical operators `!`, `&&`, `||`, and `^` can be used to create a compound Boolean expression.

Sometimes, whether a statement is executed is determined by a combination of several conditions. You can use logical operators to combine these conditions to form a compound Boolean expression. Logical operators, also known as Boolean operators, operate on Boolean values to create a new Boolean value.

The not (`!`) operator, which negates `true` to `false` and `false` to `true`. The and (`&&`) of two Boolean operands is `true` if and only if both operands are `true`. The or (`||`) of two Boolean operands is `true` if at least one of the operands is `true`. The exclusive or (^) of two Boolean operands is `true` if and only if the two operands have different Boolean values. Note that p1 ^ p2 is the same as p1 != p2.