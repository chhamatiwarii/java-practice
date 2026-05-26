import java.util.Scanner;

public class Square31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your count = ");
        int count = sc.nextInt();

        for(int i = 0; i<count; i++){
            System.out.print("Enter Digit = ");
            int digit = sc.nextInt();
            int square = digit*digit;
            System.out.println(square);

        }
        sc.close();
    }
}
