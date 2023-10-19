import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
     int  i,n,fact=1;
     System.out.println("enter the any number");
     Scanner r=new Scanner(System.in);
     n=r.nextInt();
     for( i=1; i<=n; i++)
     {
       fact=fact * i;
     }
        System.out.println("factorial of"+fact);
     

    }
}