import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count = ");
        int count = sc.nextInt();

        for(int i = 0; i<count; i++){
            System.out.print("Enter your Number = ");
            int number = sc.nextInt();

            int n = 10;
            for(int j = 1; j <= 10; j++){
                System.out.println(number*j);
            }

        }

        sc.close();
    }
}
