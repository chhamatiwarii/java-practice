import java.util.Scanner;

public class SquareSum37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Count = ");
        int count = sc.nextInt();
        for(int i = 0; i<count; i++){
            System.out.print("Enter Your Number = ");
            int num = sc.nextInt();
            int square = 0;
            while(num>0){
                int rem = num%10;
                square += (rem*rem);
                num = num/10;
            }
            System.out.println(square);
        }
    }
}
