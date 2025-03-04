/* 
Demonstration no - 2.3(Part B)
Tittle - Literals Types in java 
File name - LiteralType.java
Class name - LiteralType
*/

/*
Types of Literals in Java
1) Integer Literals(byte, short, int)
Represent whole numbers. Examples: 10, 0, -20.

2) Floating-Point Literals
Represent decimal numbers. Examples: 3.14, -5.7.

3) Character Literals
Represent single characters enclosed in single quotes. Example: 'A', '9' .

4) String Literals
Represent sequences of characters enclosed in double quotes. Example: "Java", 
"Hello, World!".

5) Boolean Literals
Represent logical values. Values: true or false.

6) Null Literal
Represents a null reference. Example: null.
*/ 

/* 
Literals Symbol 
1) Data Type (byte, short, int) - int Literals
2) long - L or l Literals. Eg: 5L, 6l
3) float - F or f Literals. Eg: 2.5F, 7.8f
4) double - D or d Literals. Eg: 2.5D, 6.99d
5) boolean - true/false Literals. 
why we need symbols:
1) float f = 12.56;
   System.out.println(f);
   error
   Bcz by Default Decimal numbers is double
   Bcz by Default Interger numbers is int    
   float f = 12.56f;
   System.out.println(f);
 
2) int i = 125L;
   System.out.println(i);
   error
   Bcz lateral is L and data type is int and L is used for long 
   datatype
   int i = 125;
   System.out.println(i);
3) long l = 999999999999;
   beyond the size of long 
   System.out.println(l);
   error
   how can fix:
   long l = 999999999999L;
   beyond the size of long 
   System.out.println(l);
*/
import java.lang.*;
class LiteralType
{
	public static void main ( String arg[] )
	{
		float b = 15.56;
	    double s = 15.56;
	    System.out.println(b);
	    System.out.println(s);
	}
}

/*
if we have a large number or data so we can saprate it by using (_)
Eg: a = 99999999; a = 999_999_999;
Note: We can not use Underscore in end and before and after Decimal.
otherwise illegal underscore 
*/