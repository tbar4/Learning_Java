# Mathematical Characters, Functions, and Strings

## Common Mathematical Functions

Java provides many useful methods in the Math class for performing common mathematical functions.

They can be categorized as trigonometric methods, exponent methods, and service methods. Service methods include the rounding, min, max, absolute, and random methods. In addition to methods, the Math class provides two useful double constants, PI and E (the base of natural logarithms). You can use these constants as Math.PI and Math.E in any program.

### Trigonometric Methods

The parameter for sin, cos, and tan is an angle in radians. The return value for asin, acos, and atan is a degree in radians in the range between -p/2 and p/2. One degree is equal to p/180 in radians, 90 degrees is equal to p/2 in radians, and 30 degrees is equal to p/6 in radians.

|Method|Description|
|------|------|
|sin(radians)|Returns the trigonometric sine of an angle in radians.|
|cos(radians|Returns the trigonometric cosine of an angle in radians.|
|tan(radians|Returns the trigonometric tangent of an angle in radians.|
|toRadians(degree)|Returns the angle in radians for the angle in degree.|
|toDegree(radians)|Returns the angle in degrees for the angle in radians.|
|asin(a)|Returns the angle in radians for the inverse of sine.|
|acos(a)|Returns the angle in radians for the inverse of cosine.|
|atan(a)|Returns the angle in radians for the inverse of tangent.|

### Exponent Methods

There are five methods related to exponents in the Math class.

|Method|Description|
|------|------|
|exp(x)|Returns e raised to power of x (e<sup>x</sup>).|
|log(X)|Returns the natural logarithm of x (ln(x) = log<sub>e</sub>(x)).|
|log10(x)|Returns the base 10 logarithm of x (log<sub>10</sub>(x)).|
|pow(a, b)|Returns a raised to the power of b (a<sup>b</sup>).|
|sqrt(x)|Returns the square root of x, (sqrt(x)) for x >= 0.|

### The Rounding Methods

The Math class contains five rounding methods.

|Method|Description|
|------|------|
|ceil(x)|x is rounded up to its nearest integer. This integer is returned as a double value.|
|floor(x)|x is rounded down to its nearest integer. This integer is returned as a double value.|
|rint(x)|x is rounded up to its nearest integer. If x is equally close to two integers, the even one is returned as a double value.|
|round(x)|Returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) if x is a double.|

### The minx, max, and abs Methods

The min and max methods return the minimum and maximum numbers of two numbers (int, long, float, or double). For example, `max(4.4, 5.0)` returns `5.0`, and `min(3, 2)` returns `2`.

The abs method returns the absolute value of the number (int, long, float, or double).

### The random Method

You have used the `random()` method in the preceding chapter. This method generates a random double value greater than or equal to 0.0 and less than 1.0 (`0 <= Math.random() < 1.0`). You can use it to write a simple expression to generate random numbers in any range.

## Character Data Type and Operations

A character data type represents a single character.

n addition to processing numeric values, you can process characters in Java. The character data type, char, is used to represent a single character. A character literal is enclosed in single quotation marks. Consider the following code:
<pre><code>
char letter = 'A'; 
char numChar = '4';
</code></pre>

The first statement assigns character `A` to the `char` variable `letter`. The second statement assigns digit character 4 to the `char` variable `numChar`.

### Unicode and ASCII code

Computers use binary numbers internally. A character is stored in a computer as a sequence of 0s and 1s. Mapping a character to its binary representation is called *encoding*. There are different ways to encode a character. How characters are encoded is defined by an *encoding scheme*.

Java supports Unicode, an encoding scheme established by the Unicode Consortium to support the interchange, processing, and display of written texts in the world’s diverse languages. Unicode was originally designed as a 16-bit character encoding. The primitive data type char was intended to take advantage of this design by providing a simple data type that could hold any character. However, it turned out that the 65,536 characters possible in a 16-bit encoding are not sufficient to represent all the characters in the world. The Unicode standard therefore has been extended to allow up to 1,112,064 characters. Those characters that go beyond the original 16-bit limit are called supplementary characters. Java supports the supplementary characters. The processing and representing of supplementary characters are beyond the scope of this book. For simplicity, this book considers only the original 16-bit Unicode characters. These characters can be stored in a char type variable.

### Escape Sequences for Special Characters

To overcome this problem, Java uses a special notation to represent special characters, as shown in Table 4.5. This special notation, called an *escape sequence*, consists of a backslash (\) followed by a character or a combination of digits. For example, \t is an escape sequence for the Tab character and an escape sequence such as \u03b1 is used to represent a Unicode. The symbols in an escape sequence are interpreted as a whole rather than individually. An escape sequence is considered as a single character.

### Casting between char and Numeric Types

A char can be cast into any numeric type, and vice versa. When an integer is cast into a char, only its lower 16 bits of data are used; the other part is ignored. 

### Comparing and Testing Characters

Two characters can be compared using the relational operators just like comparing two numbers. This is done by comparing the Unicodes of the two characters. 

Often in the program, you need to test whether a character is a number, a letter, an uppercase letter, or a lowercase letter. As shown in Appendix B, the ASCII character set, that the Unicodes for lowercase letters are consecutive integers starting from the Unicode for 'a', then for 'b', 'c', . . ., and 'z'. The same is true for the uppercase letters and for numeric characters. This property can be used to write the code to test characters. For example, the following code tests whether a character ch is an uppercase letter, a lowercase letter, or a digital character.

## The String Type

A string is a sequence of characters.

The `char` type represents only one character. To represent a string of characters, use the data type called `String`. For example, the following code declares `message` to be a string with the value `"Welcome to Java"`.

`String` is a predefined class in the Java library, just like the classes `System` and `Scanner`. The `String` type is not a primitive type. It is known as a *reference type*. Any Java class can be used as a reference type for a variable. The variable declared by a reference type is known as a reference variable that references an object. Here, `message` is a reference variable that references a string object with contents `Welcome to Java`.

Strings are objects in Java. The methods can only be invoked from a specific string instance. For this reason, these methods are called *instance methods*. A non-instance method is called a *static method*. A static method can be invoked without using an object. All the methods defined in the `Math` class are static methods. They are not tied to a specific object instance. The syntax to invoke an instance method is `reference-Variable.methodName(arguments)`. A method may have many arguments or no arguments. For example, the `charAt(index)` method has one argument, but the `length()` method has no arguments. Recall that the syntax to invoke a static method is `ClassName.methodName(arguments)`. For example, the `pow` method in the `Math` class can be invoked using `Math.pow(2, 2.5)`.

### Getting String Length

You can use the length() method to return the number of characters in a string.

### Getting Characters from a String

The `s.charAt(index)` method can be used to retrieve a specific character in a string `s`, where the index is between `0` and `s.length()–1`. For example, `message.charAt(0)` returns the character `W`.

### Concatenating Strings

You can use the concat method to concatenate two strings. Because string concatenation is heavily used in programming, Java provides a convenient way to accomplish it. You can use the plus (+) operator to concatenate two strings.

Recall that the + operator can also concatenate a number with a string. In this case, the number is converted into a string and then concatenated. Note that at least one of the operands must be a string in order for concatenation to take place. If one of the operands is a nonstring (e.g., a number), the nonstring value is converted into a string and concatenated with the other string. 

### Converting Strings

The `toLowerCase()` method returns a new string with all lowercase letters and the `toUpperCase()` method returns a new string with all uppercase letters. 

The `trim()` method returns a new string by eliminating whitespace characters from both ends of the string. The characters `' ', \t, \f, \r, or \n` are known as whitespace characters.

### Reading a String from the Console

To read a string from the console, invoke the `next()` method on a Scanner object.

The `next()` method reads a string that ends with a whitespace character. You can use the `nextLine()` method to read an entire line of text. The `nextLine()` method reads a string that ends with the Enter key pressed. For example, the following statements read a line of text.

### Reading a Character from the Console

To read a character from the console, use the `nextLine()` method to read a string and then invoke the `charAt(0)` method on the string to return a character. 

### Comparing Strings

The String class contains the methods for comparing two strings.

However, the `==` operator checks only whether `string1` and `string2` refer to the same object; it does not tell you whether they have the same contents. Therefore, you cannot use the `==` operator to find out whether two string variables have the same contents. Instead, you should use the equals method. 

### Obtaining Substrings

You can obtain a single character from a string using the `charAt` method. You can also obtain a substring from a string using the `substring` method in the `String` class.

### Finding a Character or a Substring in a String

The String class provides several versions of `indexOf` and `lastIndexOf` methods to find a character or a substring in a string.

### Conversion between Strings and Numbers

You can convert a numeric string into a number. To convert a string into an `int` value, use the `Integer.parseInt` method. To convert a string into a double value, use the `Double.parseDouble` method.

If the string is not a numeric string, the conversion would cause a runtime error. The Integer and Double classes are both included in the java.lang package, and thus they are automatically imported.