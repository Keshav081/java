import java.util.Scanner;
public class prime {
    
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any digit");
            int dig=sc.nextInt();
            int count=0;
            for(int i=2;i<=dig;i++){
                if(dig%i==0){
                    count++;  
                   break;
                 }
               }
                if(count!=0){
                 System.out.println("PRIME NUMBER: ");
                 }
                 else{
                    System.out.println("IT IS NOT PRIME: ");
                 }
            }
    } 