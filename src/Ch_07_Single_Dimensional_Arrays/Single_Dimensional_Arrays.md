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

## Copying Arrays

To copy the contents of one array into another, you have to copy the array’s individ- ual elements into the other array.

> `list1 = list2;`

However, this statement does not copy the contents of the array referenced by list1 to list2, but instead merely copies the reference value from list1 to list2. After this statement, list1 and list2 reference the same array. The array previously referenced by list2 is no longer referenced; it becomes garbage, which will be automatically collected by the Java Virtual Machine. This process is called *garbage collection*.

In Java, you can use assignment statements to copy primitive data type variables, but not arrays. Assigning one array variable to another array variable actually copies one reference to another and makes both variables point to the same memory location.

There are three ways to copy arrays:

1. Use a loop to copy individual elements one by one.
2. Use the static `arraycopy` method in the `System` class.
3. Use the `clone` method to copy arrays.

You can write a loop to copy every element from the source array to the corresponding element in the target array. The following code, for instance, copies sourceArray to targetArray using a for loop:

<pre><code>
int[] sourceArray = {2, 3, 1, 5, 10};
int[] targetArray = new int[sourceArray.length]; 
for (int i = 0; i < sourceArray.length; i++) {
       targetArray[i] = sourceArray[i];
}
</code></pre>

Another approach is to use the arraycopy method in the java.lang.System class to copy arrays instead of using a loop. The syntax for arraycopy is:

> `arraycopy(sourceArray, srcPos, targetArray, tarPos, length);`

The parameters srcPos and tarPos indicate the starting positions in sourceArray and targetArray, respectively. The number of elements copied from sourceArray to targetArray is indicated by length. For example, you can rewrite the loop using the following statement:

> `System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);`

The arraycopy method does not allocate memory space for the target array. The target array must have already been created with its memory space allocated. After the copying takes place, targetArray and sourceArray have the same content but independent memory locations.

## Passing Arrays to Methods

When passing an array to a method, the reference of the array is passed to the method.

Just as you can pass primitive type values to methods, you can also pass arrays to methods. For example, the following method displays the elements in an int array:

<pre><code>
public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
</code></pre>

You can invoke it by passing an array. For example, the following statement invokes the printArray method to display 3, 1, 2, 6, 4, and 2.

> `printArray(new int[]{3, 1, 2, 6, 4});`

Java uses *pass-by-value* to pass arguments to a method. There are important differences between passing the values of variables of primitive data types and passing arrays.

* For an argument of a primitive type, the argument’s value is passed.
* For an argument of an array type, the value of the argument is a reference to an array; this reference value is passed to the method. Semantically, it can be best described as *pass-by-sharing*, that is, the array in the method is the same as the array being passed. Thus, if you change the array in the method, you will see the change outside the method.

<pre><code>
public class TestArrayArguments {
    public static void main(String[] args) {
        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values
        
        m(x, y); // Invoke m with arguments x and y
        
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]); 
    }

    public static void m(int number, int[] numbers) {
        number = 1001; // Assign a new value to number 
        numbers[0] = 5555; // Assign a new value to numbers[0]
    } 
}

/**********************************
************ OUTPUT ***************
**********************************/

x is 1
y[0] is 5555
</code></pre>

You may wonder why after m is invoked, x remains 1, but y[0] becomes 5555. This is because y and numbers, although they are independent variables, reference the same array. When m(x, y) is invoked,the values of x and y are passed to number and numbers. Since y contains the reference value to the array, numbers now contains the same reference value to the same array.

--- Reference TestPassArray.java ---
The two elements are not swapped using the swap method. However, they are swapped using the swapFirstTwoInArray method. Since the parameters in the swap method are primitive type, the values of a[0] and a[1] are passed to n1 and n2 inside the method when invoking swap(a[0], a[1]). The memory locations for n1 and n2 are independent of the ones for a[0] and a[1]. The contents of the array are not affected by this call.

The parameter in the swapFirstTwoInArray method is an array. The reference of the array is passed to the method. Thus, the variables a (outside the method) and array (inside the method) both refer to the same array in the same memory location. Therefore, swapping array[0] with array[1] inside the method swapFirstTwoInArray is the same as swapping a[0] with a[1] outside of the method.

## Returning an Array from a Method

When a method returns an array, the reference of the array is returned.

You can pass arrays when invoking a method. A method may also return an array. For example, the following method returns an array that is the reversal of another array.

<pre><code>
public static int[] reverse(int[] list) {
    int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
    return result; 
}
</code></pre>

The createArray method (lines 21–32) generates an array of 100 random lowercase letters. Line 5 invokes the method and assigns the array to chars. What would be wrong if you rewrote the code as follows?

<pre><code>
char[] chars = new char[100]; 
chars = createArray();
</code></pre>

You would be creating two arrays. The first line would create an array by using new char[100]. The second line would create an array by invoking createArray() and assign the reference of the array to chars. The array created in the first line would be garbage because it is no longer referenced, and as mentioned earlier, Java automatically collects garbage behind the scenes. Your program would compile and run correctly, but it would create an array unnecessarily.

## Variable-Length Argument Lists
A variable number of arguments of the same type can be passed to a method and treated as an array.

You can pass a variable number of arguments of the same type to a method. The parameter in the method is declared as follows:

> typeName... parameterName

In the method declaration, you specify the type followed by an ellipsis (...). Only one variable-length parameter may be specified in a method, and this parameter must be the last parameter. Any regular parameters must precede it.

Java treats a variable-length parameter as an array. You can pass an array or a variable number of arguments to a variable-length parameter. When invoking a method with a variable number of arguments, Java creates an array and passes the arguments to it. 

## Searching Arrays

If an array is sorted, binary search is more efficient than linear search for finding an element in the array.

*Searching* is the process of looking for a specific element in an array—for example, discover- ing whether a certain score is included in a list of scores. Searching is a common task in com- puter programming. Many algorithms and data structures are devoted to searching. This section discusses two commonly used approaches, *linear search* and *binary search*.

### The Linear Search Approach

The linear search approach compares the key element key sequentially with each element in the array. It continues to do so until the key matches an element in the array, or the array is exhausted without a match being found. If a match is made, the linear search returns the index of the element in the array that matches the key. If no match is found, the search returns −1.

### The Binary Search Approach

Binary search is the other common search approach for a list of values. For binary search to work, the elements in the array must already be ordered. Assume that the array is in ascending order. The binary search first compares the key with the element in the middle of the array. Consider the following three cases:

1. If the key is less than the middle element, you need to continue to search for the key only in the first half of the array.
2. If the key is equal to the middle element, the search ends with a match.
3. If the key is greater than the middle element, you need to continue to search for the key only in the second half of the array.

Clearly, the binary search method eliminates at least half of the array after each comparison. Sometimes you eliminate half of the elements, and sometimes you eliminate half plus one. Suppose the array has n elements. For convenience, let n be a power of 2. After the first com- parison, n/2 elements are left for further search; after the second comparison, (n/2)/2 ele- ments are left. After the kth comparison, n/2k elements are left for further search. When k = log2n, only one element is left in the array, and you need only one more comparison. There- fore, in the worst case when using the binary search approach, you need log2n+1 comparisons to find an element in the sorted array. In the worst case for a list of 1024 (210) elements, binary search requires only 11 comparisons, whereas a linear search requires 1023 comparisons in the worst case.

The portion of the array being searched shrinks by half after each comparison. Let low and high denote, respectively, the first index and last index of the array that is currently being searched.Initially,lowis0andhighislist.length − 1.Letmiddenotetheindexofthe middle element, so mid is (low + high)/2. 

## Sorting Arrays

Sorting, like searching, is a common task in computer programming. Many different algorithms have been developed for sorting. This section introduces an intuitive sorting algorithm: selection sort.

You know how the selection-sort approach works. The task now is to implement it in Java. Beginners find it difficult to develop a complete solution on the first attempt. Start by writing the code for the first iteration to find the smallest element in the list and swap it with the first element, then observe what would be different for the second iteration, the third, and so on. The insight this gives will enable you to write a loop that generalizes all the iterations.

## The Arrays Class

The `java.util.Arrays` class contains useful methods for common array operations such as sorting and searching.

The `java.util.Arrays` class contains various static methods for sorting and searching arrays, comparing arrays, filling array elements, and returning a string representation of the array. These methods are overloaded for all primitive types.

## Command-Line Arguments

The main method can receive string arguments from the command line. 

Perhaps you have already noticed the unusual header for the `main` method, which has the parameter `args` of the `String[]` type. It is clear that args is an array of strings. The main method is just like a regular method with a parameter. You can call a regular method by passing actual parameters. 

A main method is just like a regular method. Furthermore, you can pass arguments to a main method from the command line.

### Passing Strings to the main Method

You can pass strings to a main method from the command line when you run the program. The following command line, for example, starts the program TestMain with three strings: arg0, arg1, and arg2:

> `java TestMain arg0 arg1 arg2`

arg0, arg1, and arg2 are strings, but they don’t have to appear in double quotes on the com- mand line. The strings are separated by a space. A string that contains a space must be enclosed in double quotes. Consider the following command line:

> `java TestMain "First num" alpha 53`

It starts the program with three strings: First num, alpha, and 53. Since First num is a string, it is enclosed in double quotes. Note 53 is actually treated as a string. You can use "53" instead of 53 in the command line.

 When the main method is invoked, the Java interpreter creates an array to hold the com- mand-line arguments and pass the array reference to args. 