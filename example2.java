public class  Example2
{
    public static void main(String[] args) 
{
    int x = 20;  // Initial value
    int y = 5;   // Value to operate with

    System.out.println("Initial Value of x: " + x);
    System.out.println("Initial Value of y: " + y);
	
	
	x %= y; // x = x % y
    System.out.println("After x %= y: " + x);
    }
}
