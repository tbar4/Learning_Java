# Single-Dimensional Arrays

A single array variable can reference a large collection of data. Java and most other high-level languages pro- vide a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. In the present case, you can store all 100 numbers into an array and access them through a single array variable.

## Array Basics

Once an array is created, its size is fixed. An array reference variable is used to access the elements in an array using an index.

An array is used to store a collection of data, but often we find it more useful to think of an array as a collection of variables of the same type. Instead of declaring individual variables, such as number0, number1, . . . , and number99, you declare one array variable such as numbers and use numbers[0], numbers[1], . . . , and numbers[99] to represent individual variables. This section introduces how to declare array variables, create arrays, and process arrays using indexes.

### Declaring Array Variables

To use an array in a program, you must declare a variable to reference the array and specify the array’s *element type*. Here is the syntax for declaring an array variable:

> `elementType[] arrayRefVar;`

The elementType can be any data type, and all elements in the array will have the same data type. For example, the following code declares a variable myList that references an array of double elements.

> `double[] myList;`

### Creating Arrays

Unlike declarations for primitive data type variables, the declaration of an array variable does not allocate any space in memory for the array. It creates only a storage location for the refer- ence to an array. If a variable does not contain a reference to an array, the value of the variable is null. You cannot assign elements to an array unless it has already been created. After an array variable is declared, you can create an array by using the new operator and assign its reference to the variable with the following syntax:

> `arrayRefVar = new elementType[arraySize];`

This statement does two things:(1)it creates an array using `new elementType[arraySize]` and (2) it assigns the reference of the newly created array to the variable `arrayRefVar`.
Declaring an array variable, creating an array, and assigning the reference of the array to the variable can be combined in one statement as

> `elementType[] arrayRefVar = new elementType[arraySize];`

### Array Size and Default Values

When space for an array is allocated, the array size must be given, specifying the number of ele- ments that can be stored in it. The size of an array cannot be changed after the array is created. Size can be obtained using `arrayRefVar.length`. For example, `myList.length` is 10.
When an array is created, its elements are assigned the default value of 0 for the numeric primitive data types, \u0000 for char types, and false for boolean types.

### Accessing Array Elements

The array elements are accessed through the index. Array indices are 0 based; that is, they range from 0 to `arrayRefVar.length − 1`. `myList` holds 10 double values, and the indices are from 0 to 9.

Each element in the array is represented using the following syntax, known as an `indexed variable`:

> `arrayRefVar[index];`

### Array Initializers

Java has a shorthand notation, known as the *array initializer*, which combines the declaration, creation, and initialization of an array in one statement using the following syntax:

> `double myList[] = {1.9, 2.9, 3.4, 3.5};`

declares, creates, and initializes the array myList with four elements, which is equivalent to
the following statements:

> `double[] myList = new double[4];` 

> `myList[0] = 1.9;`

> `myList[1] = 2.9;`

> `myList[2] = 3.4;`
 
> `myList[3] = 3.5;`

### Processing Arrays

When processing array elements, you will often use a for loop for one of two reasons:
1. All of the elements in an array are of the same type. They are evenly processed in the
same fashion repeatedly using a loop.
2. Since the size of the array is known, it is natural to use a for loop.
Assume that the array is created as follows:

> `double[] myList = new double[10];`

The following are some examples of processing arrays:
1. Initializing arrays with input values: The following loop initializes the array myList with user input values:

> `java.util.Scanner input = new java.util.Scanner(System.in);` 

> `System.out.print("Enter " + myList.length + " values: ");` 

> `for (int i = 0; i < myList.length; i++)`
>> `myList[i] = input.nextDouble();`

Initializing arrays with random values: The following loop initializes the array myList with random values between 0.0 and 100.0, but less than 100.0:

> `for (int i = 0; i < myList.length; i++) { myList[i] = Math.random() * 100;
   }`

Displaying arrays: To print an array, you have to print each element in the array using a loop such as the following:

> `for (int i = 0; i < myList.length; i++) { System.out.print(myList[i] + " ");
   }`

Summing all elements: Use a variable named total to store the sum. Initially total is 0. Add each element in the array to total using a loop such as the following:

> `double total = 0;
   for (int i = 0; i < myList.length; i++) {
            total += myList[i];
          }`

Finding the largest element: Use a variable named max to store the largest element. Initially max is myList[0]. To find the largest element in the array myList, compare each element with max, and update max if the element is greater than max.

>`double max = myList[0];    
 for (int i = 1; i < myList.length; i++) {
 if (myList[i] > max) max = myList[i]; }`

Finding the smallest index of the largest element: Often you need to locate the largest element in an array. If an array has multiple elements with the same largest value, find the smallest index of such an element. Suppose that the array myList is {1, 5, 3, 4, 5, 5}. The largest element is 5, and the smallest index for 5 is 1. Use a variable named max to store the largest element, and a variable named indexOfMax to denote the index of the largest element. Initially max is myList[0] and indexOfMax is 0. Compare each element in myList with max and update max and indexOfMax if the element is greater than max.

> `double max = myList[0];
int indexOfMax = 0;
for (int i = 1; i < myList.length; i++) {
if (myList[i] > max) { max = myList[i]; indexOfMax = i;
} }`

Random shuffling: In many applications, you need to randomly reorder the elements in an array. This is called shuffling. To accomplish this, for each element myList[i], randomly generate an index j and swap myList[i] with myList[j], as follows:

> `for (int i = 0; i < myList.length – 1; i++) { // Generate an index j randomly
   int j = (int)(Math.random()
   myList
    * myList.length);
     // Swap myList[i] with myList[j]
   double temp = myList[i]; myList[i] = myList[j]; myList[j] = temp;
   }`

Shifting elements: Sometimes you need to shift the elements left or right. Here is an example of shifting the elements one position to the left and filling the last element with the first element:

> `double temp = myList[0]; // Retain the first element
   // Shift elements left
   for (int i = 1; i < myList.length; i++) {
   myList[i - 1] = myList[i]; }
   myList
   i [0] [1]
   .
   A random index [j]
   swap
     // Move the first element to fill in the last position
   myList[myList.length - 1] = temp;`

Simplifying coding: Arrays can be used to greatly simplify coding for certain tasks. For example, suppose you wish to obtain the English name of a given month by its number. If the month names are stored in an array, the month name for a given month can be accessed simply via the index. The following code prompts the user to enter a month number and displays its month name:

> `String[] months = {"January", "February",..., "December"}; System.out.print("Enter a month number (1 to 12): ");
   int monthNumber = input.nextInt();
   System.out.println("The month is " + months[monthNumber − 1]);`

### Foreach

Java supports a convenient for loop, known as a foreach loop, which enables you to traverse the array sequentially without using an index variable. For example, the following code dis- plays all the elements in the array myList:

> `for (double e: myList) { System.out.println(e);
   }`

You can read the code as “for each element e in myList, do the following.” Note that the variable, e, must be declared as the same type as the elements in myList.

> `for (elementType element: arrayRefVar) { // Process the element
}`