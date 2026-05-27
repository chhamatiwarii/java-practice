import java.util.Scanner;

public class Fibonacci39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your count = ");
        int count = sc.nextInt();
        for(int i = 0; i<count; i++){
            System.out.println("Enter Your Number = ");
            int num = sc.nextInt();

            int prevNumber = 0;
            int currNumber = 1;

            for(int j = 0; j<num; j++){
                System.out.println(prevNumber + " ");

                int nextNumber = prevNumber + currNumber;
                prevNumber = currNumber;
                currNumber = nextNumber;
            }
            System.out.println();
        }
    }
}
