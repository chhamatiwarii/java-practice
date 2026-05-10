import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount = ");
        double  p = sc.nextDouble();
        System.out.print("Enter the rate = ");
        double  r = sc.nextDouble();
        System.out.print("Enter the year = ");
        double  t = sc.nextDouble();

        double inv =(p*r*t)/100;
        System.out.println(inv);

        sc.close();
        
    }   
}
