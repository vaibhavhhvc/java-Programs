/* 

Demonstration No - 1.3
Tittle - Reading From Keyboard 
File - KeyRead.java

-- Reading from the keyboard in Java means taking input from the user while the 
program is running. 
In simple words, it’s how the program gets data (like numbers, words, or choices) directly 
from the user through the keyboard.

-- How to Read Input from the Keyboard?
Java provides several ways to read input from the keyboard. The most commonly used 
method is using the Scanner class.

-- Using the Scanner Class:
The Scanner class is part of the java.util package, and it makes it easy to read data 
from the keyboard.
-- Use the Scanner methods to read data:
1) nextInt() for integers.
2) nextDouble() for decimal numbers.
3) nextLine() for a whole line of text.
4) next() for a single word.
5) nextShort()
6) nextBoolean()
7) hasNextInt()
8) hasNextFloat()

-- The class (Scanner) is present in util pakage 
*/ 
import java.lang.*;
import java.util.*;
class KeyRead
{
	public static void main( String arg[] )
	{
		Scanner S = new Scanner( System.in );
		double a, b, c;
		System.out.println("Enter The Value of a and b : ");
		a = S.nextDouble();
		b = S.nextDouble();
		c = a + b;
		System.out.println( "a + b = "+ c );
	}
}

/*

Scanner S = new Scanner( System.in );
Breakdown of the Code:

Scanner:
This is the class name.
The Scanner class is part of the java.util package, and it provides methods to read different 
types of input (like integers, text, decimal numbers, etc.) from various sources such as the 
keyboard, files, or strings.

s:
This is the name of the object. You can name it anything (e.g., input, scanner, etc.).
In this case, s is a reference variable that allows you to use the Scanner object to access 
its methods (like nextInt(), nextLine(), etc.).

=:
This is the assignment operator. It assigns the Scanner object (created on the right) to 
the reference variable s.

new:
This is the keyword used to create a new object in Java. It tells the program to allocate memory 
for the Scanner object.

Scanner(System.in):
Scanner():
This is the constructor of the Scanner class. It initializes the Scanner object.

System.in:
This represents the standard input stream (the keyboard).
It tells the Scanner object to read input from the keyboard.

In Simple Words:
Scanner sc = new Scanner(System.in);
Creates a Scanner object (sc).
Connects the Scanner object to the keyboard (System.in) so it can read user input.

Other Ways to Read Input:
1) BufferedReader
2) Console Class

*/