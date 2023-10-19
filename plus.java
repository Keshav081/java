 import java.util.Scanner;
public class plus {
    
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            if(n%2==0)
           {
               n+=1;
           }
            for (int i = 1; i <=n; i++){
                for(int j=1;j<=n;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=1;k++){
                    System.out.print("*");
                }
                System.out.println();
              }
              for(int l=1;l<=n*2;l++)
              {
                System.out.print("* ");
              }
              System.out.println();
              for (int i = 1; i <=n; i++){
                for(int j=1;j<=n;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=1;k++){
                    System.out.print("*");
                }
                System.out.println();
              }
            }
    }