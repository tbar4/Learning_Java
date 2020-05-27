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

## Switch Statements

A switch statement executes statements based on the value of a variable or an expression.

The if statement makes selections based on a single true or false condition. There are four cases for computing taxes, which depend on the value of status. To fully account for all the cases, nested if statements were used. Overuse of nested if statements makes a program difficult to read. Java provides a switch statement to sim- plify coding for multiple conditions. You can write the following switch statement to replace the nested if statement in ComputeTax.java.

<pre><code>
switch (status) {
case 0: compute tax for single filers;
        break;
case 1: compute tax for married jointly or qualifying widow(er);
        break;
case 2: compute tax for married filing separately;
        break;
case 3: compute tax for head of household;
        break;
default: System.out.println("Error: invalid status");
        System.exit(1);
}
</code></pre>

This statement checks to see whether the status matches the value 0, 1, 2, or 3, in that order. If matched, the corresponding tax is computed; if not matched, a message is displayed. Here is the full syntax for the switch statement:

<pre><code>
switch (switch-expression) { 
    case value1: statement(s)1;
        break;
    case value2: statement(s)2; 
        break;
    ...
    case valueN: statement(s)N; 
        break;
    default: statement(s)-for-default; 
}
</code></pre>


The switch statement observes the following rules:
* The switch-expression must yield a value of char, byte, short, int, or String type and must always be enclosed in parentheses. 
* The value1, . . ., and valueN must have the same data type as the value of the switch- expression. Note that value1, . . ., and valueN are constant expressions, meaning that they cannot contain variables, such as 1 + x.
* When the value in a case statement matches the value of the switch-expression, the statements starting from this case are executed until either a break statement or the end of the switch statement is reached.
* The default case, which is optional, can be used to perform actions when none of the specified cases matches the switch-expression.
* The keyword break is optional. The break statement immediately ends the switch statement.

## Conditional Expressions

A conditional expression evaluates an expression based on a condition.

You might want to assign a value to a variable that is restricted by certain conditions. For example, the following statement assigns 1 to y if x is greater than 0, and -1 to y if x is less than or equal to 0.

<pre><code>
if (x > 0) 
    y = 1;
else
    y = -1;
</code></pre>

Alternatively, as in the following example, you can use a conditional expression to achieve
the same result.

<pre><code>
y = (x > 0) ? 1 : -1;
</code></pre>

Conditional expressions are in a completely different style, with no explicit if in the state-
ment. The syntax is:

<pre><code>
boolean-expression ? expression1 : expression2;
</code></pre>

## Operator Precedence and Associativity

Operator precedence and associativity determine the order in which operators are evaluated.

The expression within parentheses is evaluated first. (Parentheses can be nested, in which case the expression within the inner parentheses is executed first.) When evaluating an expres- sion without parentheses, the operators are applied according to the precedence rule and the associativity rule.

The precedence rule defines precedence for operators which contains the operators you have learned so far. Operators are listed in decreasing order of precedence from top to bottom. The logical operators have lower precedence than the relational operators and the relational operators have lower precedence than the arithmetic operators. Operators with the same precedence appear in the same group. 

## Debugging

Debugging is the process of finding and fixing errors in a program.

syntax errors are easy to find and easy to correct because the compiler gives indications as to where the errors came from and why they are there. Runtime errors are not difficult to find either, because the Java interpreter displays them on the console when the program aborts. Finding logic errors, on the other hand, can be very challenging.

Logic errors are called bugs. The process of finding and correcting errors is called debugging. A common approach to debugging is to use a combination of methods to help pinpoint the part of the program where the bug is located. You can hand-trace the program (i.e., catch errors by reading the program), or you can insert print statements in order to show the values of the variables or the execution flow of the program. These approaches might work for debugging a short, simple program, but for a large, complex program, the most effective approach is to use a debugger utility.

JDK includes a command-line debugger, jdb, which is invoked with a class name. jdb is itself a Java program, running its own copy of Java interpreter. All the Java IDE tools, such as Eclipse and NetBeans, include integrated debuggers. The debugger utilities let you follow the execution of a program. They vary from one system to another, but they all support most of the following helpful features.