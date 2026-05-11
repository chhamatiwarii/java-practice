import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the L1 = ");
        int l1 = sc.nextInt();
        System.out.println("Enter the L2 = ");
        int l2 = sc.nextInt();
        System.out.println("Enter the L3 = ");
        int l3 = sc.nextInt();

        int x = Math.max(l1, Math.max(l2, l3));
        System.out.println(x);

        sc.close();
    }
}
