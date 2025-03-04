/*

Demostration no - 1.2
In this demostration we will see if we changing the name of the class
then what is happend ?
file name - second.java
class name - First
it will gives the output "Hello Vaibhav!" there is not any problem, 
then what happend ?
when we are making class is public "public class First" then the 
comiler detect and error 
The error message means: 

- You made the class `First` **public**, so Java expects the file name to match 
  the class name.  
- However, the file is named `second.java`, not `First.java`.  

Java is telling you:  
"If a class is public, the file name must be the same as the class name (First.java). 
Since the names don’t match, I can’t compile your code."
To fix it, rename the file to `First.java`.
bcz - 
When a class is marked as public, it means the class can be accessed from anywhere 
in your program, 
even from other files or packages.
so that we are making a public class the file name and class name should be same.

*/
/*

file name - second.java
class name - First 
*/

 import java.lang.*;
 public class second 
  {
	  public static void main( String arg[])
	  {
		  System.out.println("Hello Vaibhav!");
	  }
  }