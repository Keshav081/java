 import java.util.Scanner;
public class bmi {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Hieght in m");
        float h =sc.nextFloat();
        System.out.println("Height: "+h);
        System.out.println("Enter your WEIGHT in KG");
        float w =sc.nextFloat();
        System.out.println("Weight: "+w);
        float bmi=w/(h*h);
        System.out.println("BMI: "+bmi);
    }
}
    
