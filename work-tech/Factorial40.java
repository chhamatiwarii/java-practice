import java.util.Scanner;

public class Factorial40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Count = ");
        int count = sc.nextInt();

        for(int i = 0; i<count; i++){
            System.out.println("Enter Your Number = ");
            int num = sc.nextInt();
            int prevNumber = 1;
            //nt nextNumber = 1;
            for(int j = 1; j<=num; j++){
                prevNumber = prevNumber*j;
            }
            System.out.println(prevNumber + " ");
            
        }
        System.out.println();
    }
}
