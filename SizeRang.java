/*
Demonstration - 2.1
Tittle - Check Size and Rang of data types
File Name - SizeRang.java
Class Name - SizeRang

In java to find the size and rang of data types, we have some classes which is uesd.
in java for each data type their is built in class available. that contains the rang and size.

step 1 : 
go to cmd, command - javap java.lang.data_type_name 
Eg - javap java.lang.Integer
Bcz every class present in the package, here lang is the package, which contains Integer(Class)

Problem may be ouccurs - 
F:\Programming\java>javap java.lang.Integer
'javap' is not recognized as an internal or external command,
operable program or batch file. 
Environment variable path problem.

*/
import java.lang.*;
class SizeRang
{
	public static void main( String arg[] )
	{
		System.out.println(Integer.SIZE);		
	}
}

 