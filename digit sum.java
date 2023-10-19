import java.util.scannner;
public class digit sum{
    public static void main(string[] args)
    {
      int number,digit,sum=0;
      Scanner sc= new Scanner(system.in);
      System.out.print("enter the number:");
      number=sc.nextInt();
      while(number>0)
      { 
        digit=number%d10;
        sum=sum+digit;
        number=number/10;
      }
        System.out.println("sum of digit"+sum);
    }

}
