/*
Demonstration - 2.2
Tittle - Veriables in Detail
File Name - Variable.java
class Name - Variable

variables:
1) Name of data 
2) Work like a container 
3) Used to store the data 
4) Having a datatype 

variable Related to these things:
 1. Declare a Variable : 
 Use the appropriate data type and provide a valid name.
 Syntax:
 dataType variableName;
 Example:
 int age;

 2. Initialize the Variable :
 Assign a value to the variable.
 Syntax:
 variableName = value;
 Syntax:
 variableName = value;
 
 3. Combine Declaration and Initialization (Optional)
 Declare and initialize the variable in a single step.
 Syntax:
 dataType variableName = value;
 Example:
 int age = 25;
 
 4. Use the Variable
 se the variable in your code (e.g., for calculations or printing).
 Example:
 System.out.println("Age: " + age);
 
 5. Choose the Correct Scope
 Local Variables: Inside methods or blocks.
 Instance Variables: Inside a class but outside methods.
 Static Variables: Declared with the static keyword for shared values
 
 6. Follow Naming Conventions
 Use meaningful names.
 Start with a letter or _.
 Avoid keywords (e.g., int, public).
 
*/
import java.lang.*;
class Variable
{
	public static void main( String agr[] )
	{
		int a ; // Declaration
		a = 5;  // Initialization
		System.out.print("a = "+a); // use
	}
}