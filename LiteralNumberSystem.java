/* 
Demonstration no - 2.3(Part C)
Tittle - Literals in Number System in java 
File name - LiteralNumberSystem.java
Class name - LiteralNumberSystem
Note - You have to knowladge about number systems
*/
/* 
literals are fixed values you directly write in your 
code to represent data. When working with numbers, literals specify 
the values of variables in the number system you want 
(like decimal, binary, octal, or hexadecimal).

Why do we use literals in the number system?
1. To define values directly: They make it easy to assign 
specific numbers to variables.
2. To support different bases: Java supports multiple number 
systems (binary, octal, decimal, hexadecimal) to handle various 
programming needs.
3. To improve code readability: Using the right literal format helps 
developers understand the intent behind a number.

Literals can bs represented in various Number System
Eg: Decimal, Binary, Octal, Hexadecimal
byte b = 10; Decimal literal
byte b = 0b1010; Binary literal
byte b = 012; Octal literal 
byte b = 0xA; Hexadecimal Literal

Types of Number System Literals in Java
1. Decimal (Base 10): Regular numbers (0-9).
Example: int num = 25;
2. Binary (Base 2): Numbers represented with 0 and 1, prefixed with 
0b or 0B.
Example: int binaryNum = 0b1010; // equals 10 in decimal
3. Octal (Base 8): Numbers represented with 0-7, prefixed with 0.
Example: int octalNum = 012; // equals 10 in decimal
4. Hexadecimal (Base 16): Numbers represented with 0-9 and A-F, 
prefixed with 0x or 0X.
Example: int hexNum = 0xA; // equals 10 in decimal

Why Different Number Systems?
1. Binary: Used in low-level programming or working with bits.
2. Octal/Hexadecimal: Used in memory addresses, color codes, or compact
binary representation.

*/ 
import java.lang.*;
class LiteralNumberSystem
{
	public static void main( String arg[] )
	{
		byte a = 10;
		byte b2 = 0B1010;
		byte b3 = 012;
		byte b4 = 0XA;
		System.out.println(a);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}

