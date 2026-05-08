import java.util.Scanner;

/*
    You need to take an integer from the user and check 
    whether that number is prime or not, if the number is prime 
    then print "Prime" and if not then print "Not Prime".

    Make sure you write the most optimal solution.
    (Optimized trial division)

*/

public class PrimeCheck {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int a = sc.nextInt();
        if (a%a == 0 && a%1==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        //isse jada mai nii soch paayi i know this is wrong because every number is divisible by 1 and its own

    }

}
