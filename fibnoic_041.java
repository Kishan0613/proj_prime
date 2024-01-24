import java.util.*;
public class fibnoic_041 {
    int fib(int n)
        {
            if(n==0)
            {
                return 0;
            }
            else if(n==1)
            {
                return 1;
            }
            else
            {
                return fib(n-1) + fib(n-2);
            }
        }
    public static void main(String args[])
    {
        
        fibnoic_041 f =new fibnoic_041();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            System.out.println(f.fib(i));
        }
    } 
}
