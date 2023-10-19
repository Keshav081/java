import java.util.Scanner;

public class pattern9 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print("* ");
            for (int j = 0; j < i-1; j++)
            {
             if(i!=n-1)
                {
                    System.out.print("  ");}
                else{
                    System.out.print("* ");
                }
            }
            if(i!=0)
            {
                System.out.println("*");
            }
            else{
                System.out.println();}
            }
        }
}
    
