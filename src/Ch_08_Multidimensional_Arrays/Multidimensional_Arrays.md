# Multidimensional Arrays

## Introduction 

Data in a table or a matrix can be represented using a two-dimensional array.

You can use a two-dimensional array to store a matrix or a table.

## Two-Dimensional Array Basics

An element in a two-dimensional array is accessed through a row and a column index. 

### Declaring Variables of Two-Dimensional Arrays and Creating Two-Dimensional Arrays

The syntax for declaring a two-dimensional array is as follows:

> `elementType[][] arrayRefVar;`

or

> `elementType arrayRefVar[][];`

As an example, here is how you would declare a two-dimensional array variable `matrix` of `int` values:

> `int[][] matrix;`

or 

> `int matrix[][];`

You can create a two-dimensional array of 5-by-5 int values and assign it to matrix using this syntax:

> `matrix = new int[5][5];`

Two subscripts are used in a two-dimensional array: one for the row, and the other for the column. As in a one-dimensional array, the index for each subscript is of the int type and starts from 0.

To assign the value 7 to a specific element at row index 2 and column index 1:

> `matrix[2][1] = 7;`

### Obtaining the Lengths of Two-Dimensional Arrays

A two-dimensional array is actually an array in which each element is a one-dimensional array. The length of an array x is the number of elements in the array, which can be obtained using x. length. x[0], x[1], . . . , and x[x.length − 1] are arrays. Their lengths can be obtained using x[0].length, x[1].length, . . . , and x[x.length − 1].length.

For example, suppose that x = new int[3][4], x[0], x[1], and x[2] are one- dimensional arrays and each contains four elements, as shown in Figure 8.2. x.length is 3, and x[0].length, x[1].length, and x[2].length are 4.

### Ragged Arrays

Each row in a two-dimensional array is itself an array. Thus, the rows can have different lengths. An array of this kind is known as a `ragged array`. If you don’t know the values in a ragged array in advance, but do know the sizes—say, the same as in the preceding figure—you can create a ragged array using the following syntax:

> `int[][] triangleArray = new int[5][];`

## Processing Two-Dimensional Arrays

Nested for loops are often used to process a two-dimensional array. Suppose an array matrix is created as follows:

> `int[][] matrix = new int[10][10];`

The following are some examples of processing two-dimensional arrays.

1. *Initializing arrays with input values*. The following loop initializes the array with user input values:

<pre><code>
java.util.Scanner input = new java.util.Scanner(System.in); 
System.out.println("Enter " + matrix.length + " rows and " +
    matrix[0].length + " columns: ");
for (int row = 0; row < matrix.length; row++) {
    for (int column = 0; column < matrix[row].length; column++) { matrix[row][column] = input.nextInt();
    } 
}
</code></pre>

2. *Initializing arrays with random values*. The following loop initializes the array with random values between 0 and 99:

<pre><code>
for (int row = 0; row < matrix.length; row++) {
    for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = (int)(Math.random() * 100); 
    }
}
</code></pre>

3. *Printing arrays*. To print a two-dimensional array, you have to print each element in the array using a loop like the following loop:

<pre><code>
for (int row = 0; row < matrix.length; row++) {
    for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " "); 
    }
System.out.println(); 
}
</code></pre>

4. *Summing all elements*. Use a variable named total to store the sum. Initially total is 0. Add each element in the array to total using a loop like this:

<pre><code>
int total = 0;
for (int row = 0; row < matrix.length; row++) {
    for (int column = 0; column < matrix[row].length; column++) { 
        total += matrix[row][column];
    } 
}
</code></pre>

5. *Summing elements by column*. For each column, use a variable named total to store its sum. Add each element in the column to total using a loop like this:

<pre><code>
for (int column = 0; column < matrix[0].length; column++) { 
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
        total += matrix[row][column]; 
    System.out.println("Sum for column " + column + " is "
+ total); 
}
</code></pre>

6. *Which row has the largest sum*? Use variables `maxRow` and `indexOfMaxRow` to track the largest sum and index of the row. For each row, compute its sum and update maxRow and indexOfMaxRow if the new sum is greater.

<pre><code>
int maxRow = 0;
int indexOfMaxRow = 0;

// Get sum of the first row in maxRow
for (int column = 0; column < matrix[0].length; column++) { 
    maxRow += matrix[0][column];
}

for (int row = 1; row < matrix.length; row++) {
    int totalOfThisRow = 0;
    for (int column = 0; column < matrix[row].length; column++)
         totalOfThisRow += matrix[row][column];
    if (totalOfThisRow > maxRow) { maxRow = totalOfThisRow; indexOfMaxRow = row;
    } 
}

System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
</code></pre>

7. *Random shuffling*. Shuffling the elements in a one-dimensional array was introduced in Section 7.2.6. How do you shuffle all the elements in a two-dimensional array? To accomplish this, for each element matrix[i][j], randomly generate indices i1 and j1 and swap matrix[i][j] with matrix[i1][j1], as follows:

<pre><code>
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        int i1 = (int)(Math.random() * matrix.length); 
        int j1 = (int)(Math.random() * matrix[i].length);

        // Swap matrix[i][j] with matrix[i1][j1]
        int temp = matrix[i][j]; 
        matrix[i][j] = matrix[i1][j1]; 
        matrix[i1][j1] = temp;
    } 
}
</code></pre>

## Passing Two-Dimensional Arrays to Methods

When passing a two-dimensional array to a method, the reference of the array is passed to the method.

You can pass a two-dimensional array to a method just as you pass a one-dimensional array. You can also return an array from a method. The first method, `getArray()`, returns a two-dimensional array and the second method, `sum(int[][] m)`, returns the sum of all the elements in a matrix.

## Multidimensional Arrays

A two-dimensional array is an array of one-dimensional arrays, and a three-dimen- sional array is an array of two-dimensional arrays.

In the preceding section, you used a two-dimensional array to represent a matrix or a table. Occasionally, you will need to represent n-dimensional data structures. In Java, you can create n-dimensional arrays for any positive integer n.

The way to declare two-dimensional array variables and create two-dimensional arrays can be generalized to declare n-dimensional array variables and create n-dimensional arrays for n 7 = 3. For example, you may use a three-dimensional array to store exam scores for a class of six students with five exams, and each exam has two parts (multiple-choice and essay type questions). The following syntax declares a three-dimensional array variable scores, creates an array, and assigns its reference to scores.

> `double[][][] scores = new double[6][5][2];`

You can also use the array initializer to create and initialize the array as follows:

<pre><code>
double[][][] scores = {
{{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}}, 
{{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}}, 
{{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}}, 
{{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}}, 
{{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}}, 
{{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}};
</code></pre>

scores[0][1][0] refers to the multiple-choice score for the first student’s second exam, which is 9.0. scores[0][1][1] refers to the essay score for the first student’s second exam, which is 22.5. 

A multidimensional array is actually an array in which each element is another array. A three- dimensional array is an array of two-dimensional arrays. A two-dimensional array is an array of one-dimensional arrays. For example, suppose that x = new int[2][2][5] and x[0] and x[1] are two-dimensional arrays. x[0][0], x[0][1], x[1][0], and x[1][1] are one- dimensional arrays and each contains five elements. x.length is 2, x[0].length and x[1]. length are 2, and x[0][0].length, x[0][1].length, x[1][0].length, and x[1][1]. length are 5.