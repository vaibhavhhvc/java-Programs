/*
Demonstration No - 2.0
Tittle - Data Type and variable
File Name - DataType.java

"Data types in Java define what kind of value a variable can hold."

Primitive Data Types:
Java has 8 primitive data types, each with a specific size and range of values.

Integral-
--byte: 1 byte, range: -128 to 127.
--short: 2 bytes, range: -32,768 to 32,767.
--int: 4 bytes, range: -2^31 to 2^31-1 (about -2 billion to 2 billion).
--long: 8 bytes, range: -2^63 to 2^63-1.

Floating Point-
--float: 4 bytes, used for single-precision floating-point numbers.
--double: 8 bytes, used for double-precision floating-point numbers.

Char-
--char: 2 bytes, used for a single character (Unicode).

Boolean-
--boolean: 1 byte, used for true/false values.

*/
import java.lang.*;
import java.util.*;
class DataType
{
	public static void main( String arg[] )
	{
		Scanner s = new Scanner( System.in );
		int a,b,c;
		System.out.println("Enter the Value of a :");
		a = s.nextInt();
		System.out.println("Enter the Value of b :");
		b = s.nextInt();
		c = a + b;
		System.out.println("a+b :"+c);
	}
}
