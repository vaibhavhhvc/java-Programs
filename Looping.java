
package looping;
import java.util.*;

public class Looping 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("(N):");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) 
        {
            sum=sum+i;
     
        }
        System.out.print(sum);
}
}