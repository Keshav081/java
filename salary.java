  import java.util.Scanner;
public class salary {
    
   
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the basic salary");
            int bs=sc.nextInt();
            int hra=(bs*30)/100;
            System.out.println("hra: "+hra);
            int ta=(bs*20)/100;
            System.out.println("ta: "+ta);
            int da=(bs*10)/100;
            System.out.println("Da: "+da);
            int net=(hra+bs+ta+da)-1500;
            System.out.println("Net salary: "+net);
        }
    }