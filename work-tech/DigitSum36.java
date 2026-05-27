import java.util.Scanner;

public class DigitSum36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Count = ");
        int count = sc.nextInt();

        for(int i = 0; i<count; i++){
            System.out.print("Enter Your digit = ");
            int digit = sc.nextInt();
            int sum = 0;
            while(digit>0){
                int rem = digit%10;
                sum += rem;
                digit = digit/10;
                
            }
            
            System.out.println(sum);
        }
    }
}
