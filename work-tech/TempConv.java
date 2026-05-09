import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number = ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            double t = sc.nextDouble();
            double f = (9*t/5) + 32;
            System.out.println(f);

        }sc.close();
        
    }
}
