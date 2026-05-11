import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Count ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print("Enter Your Number ");
            int m = sc.nextInt();
            int q = m/10;
            int r = m%10;
            System.out.println(q + " " + r);
        }sc.close();
    }
}
