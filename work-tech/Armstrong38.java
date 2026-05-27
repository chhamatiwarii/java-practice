import java.util.Scanner;

public class Armstrong38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your count = ");
        int count = sc.nextInt();

        for(int i = 0; i<count; i++){
            System.out.println("Enter your Digit = ");
            int digit = sc.nextInt();
            int original = digit;
            int arm = 0;
            while(digit>0){
                int rem = digit%10;
                arm += (rem*rem*rem);
                digit = digit/10;
            }
            System.out.println("Original = " + original + " Digit = " + digit + " Arm = " + arm);
            if(original == arm){
                System.out.println("Number is ArmStrong ");
            }else{
                System.out.println("Number is not Armstrong");
            }
        }
    }
}
