# Loops
Java provides a powerful construct called a loop that controls how many times an operation
or a sequence of operations is performed in succession. Loops are constructs that control repeated executions of a block of statements. The concept of looping is fundamental to programming. Java provides three types of loop statements: `while` loops, `do-while` loops, and `for` loops.

## The while Loop

A `while` loop executes statements repeatedly while the condition is true.

The part of the loop that contains the statements to be repeated is called the *loop body*. A one-time execution of a loop body is referred to as an *iteration* (or *repetition*) of the loop. Each loop contains a *loop-continuation-condition*, a Boolean expression that controls the execution of the body. It is evaluated each time to determine if the loop body is executed. If its evaluation is `true`, the loop body is executed; if its evaluation is `false`, the entire loop terminates and the program control turns to the statement that follows the `while` loop. 

### Controlling a Loop with a Sentinel Value

Another common technique for controlling a loop is to designate a special value when reading and processing a set of values. This special input value, known as a *sentinel value*, signifies the end of the input. A loop that uses a sentinel value to control its execution is called a *sentinel-controlled loop*.

### Input and Output Redirections

In the `SentinelValue.java`, if you have a large number of data to enter, it would be cumbersome to type from the keyboard. You can store the data separated by whitespaces in a text file, say `input.txt`, and run the program using the following command:

> java SentinelValue < input.txt

This command is called *input redirection*. The program takes the input from the file input .txt rather than having the user type the data from the keyboard at runtime. Suppose the con- tents of the file are:

> 2 3 4 5 6 7 8 9 12 23 32
  23 45 67 89 92 12 34 35 3 1 2 4 0

Similarly, there is *output redirection*, which sends the output to a file rather than displaying it on the console. The command for output redirection is:

> java ClassName > output.txt

Input and output redirection can be used in the same command. For example, the following command gets input from input.txt and sends output to output.txt:

> java SentinelValue output.txt

 ## The do-while Loop
 
 A `do-while` loop is the same as a `while` loop except that it executes the loop body first and then checks the loop continuation condition.
 
 The loop body is executed first, and then the `loop-continuation-condition` is evaluated. If the evaluation is `true`, the loop body is executed again; if it is `false`, the `do-while` loop terminates. The difference between a `while` loop and a `do-while` loop is the order in which the `loop-continuation-condition` is evaluated and the loop body executed. You can write a loop using either the `while` loop or the `do-while` loop. Sometimes one is a more convenient choice than the other. 
 
 
 ## The for Loop
 
 A for loop has a concise syntax for writing loops.
 
 The for loop statement starts with the keyword for, followed by a pair of parentheses enclosing the control structure of the loop. This structure consists of initial-action, loop-continuation-condition, and action-after-each-iteration. The control structure is followed by the loop body enclosed inside braces. The initial-action, loop- continuation-condition, and action-after-each-iteration are separated by semicolons.
 
 A for loop generally uses a variable to control how many times the loop body is executed and when the loop terminates. This variable is referred to as a *control variable*. The initial-action often initializes a control variable, the action-after-each-iteration usually increments or decrements the control variable, and the loop-continuation-condition tests whether the control variable has reached a termination value.
 
 ## Which Loop to Use?
 
 You can use a for loop, a while loop, or a do-while loop, whichever is convenient.
 
 The `while` loop and `for` loop are called *pretest* loops because the continuation condition is checked before the loop body is executed. The `do-while` loop is called a *posttest* loop because the condition is checked after the loop body is executed. The three forms of loop statements—while, do-while, and for—are expressively equivalent; that is, you can write a loop in any of these three forms. For example, a while loop in (a) in the following figure can always be converted into the for loop in (b).
 
 Use the loop statement that is most intuitive and comfortable for you. In general, a for loop may be used if the number of repetitions is known in advance, as, for example, when you need to display a message a hundred times. A while loop may be used if the number of repetitions is not fixed, as in the case of reading the numbers until the input is 0. A do-while loop can be used to replace a while loop if the loop body has to be executed before the con- tinuation condition is tested.
 
 ## Nested Loops
A loop can be nested inside another loop.

Nested loops consist of an outer loop and one or more inner loops. Each time the outer loop is repeated, the inner loops are reentered, and started anew.

## Minimizing Numeric Errors

Using floating-point numbers in the loop continuation condition may cause numeric errors.

## Case Studies

Loops are fundamental in programming. The ability to write loops is essential in learning Java programming.
If you can write programs using loops, you know how to program!

## Keywords break and continue

The break and continue keywords provide additional controls in a loop. You can also use break in a loop to immediately terminate the loop. 

You can also use the continue keyword in a loop. When it is encountered, it ends the cur- rent iteration and program control goes to the end of the loop body. In other words, continue breaks out of an iteration while the break keyword breaks out of a loop. 