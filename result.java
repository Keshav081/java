  import java.util.*;

public class result {
    
   
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Name");
            String name=sc.nextLine();
            System.out.println("Name: "+name);
             System.out.println("Enter Your Section");
            String sec=sc.nextLine();
            System.out.println("Section: "+sec);
             System.out.println("Enter Your Roll number");
            int rollno=sc.nextInt();
            System.out.println("Roll Number: "+rollno);
             System.out.println("Enter Your Marks of Maths");
            int maths=sc.nextInt();
            System.out.println("Maths: "+maths);
             System.out.println("Enter Your Marks of Physics");
            int phy=sc.nextInt();
            System.out.println("Physics: "+phy);
             System.out.println("Enter Your Marks of Chemistry");
            int chem=sc.nextInt();
            System.out.println("Chemistry: "+chem);
             System.out.println("Enter Your Marks of Hindi");
            int hind=sc.nextInt();
            System.out.println("Hindi: "+hind);
             System.out.println("Enter Your Marks of Biology");
            int bio=sc.nextInt();
            System.out.println("Biology: "+bio);
            int tot_obt=bio+maths+chem+phy+hind;
            System.out.println("TOTAL OBTAIN: "+tot_obt);
            int avg=(bio+chem+phy+hind+maths)/5;
            System.out.println("AVERAGE: "+avg);
            float percent=(((tot_obt)/500)*(100));
            System.out.println("PERCENTAGE: "+ percent);
            
            
            
        }
    }