import java.util. Scanner;
public class evenodd
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n value");

        int n=input.nextInt();
        System.out.println("even number is the present is present in the range"+n+"are:");
        for(int i=2;i<=n;i++)
        {
            System.out.println(i+" ");

        }
        

    }
}