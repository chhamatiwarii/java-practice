import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        // You need to take a user input
        // if user input lies in range 0-20 then print "Very Low"
        // if user input lies in range 21-40 then print "Low"
        // if user input lies in range 41-60 then print "Medium"
        // if user input lies in range 60-80 then print "High"
        // if user input lies in range >80 then print "Highest"

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number = ");
        int a = sc.nextInt();
        if(a>=0 && a<=20){
            System.out.println("Very Low");
        }
        if(a>=21 && a<=40){
            System.out.println("Low");
        }
        if(a>=41 && a<=60){
            System.out.println("Medium");
        }
        if(a>=81){
            System.out.println("Highest");
        }

    }
}