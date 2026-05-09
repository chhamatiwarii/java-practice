import java.util.Scanner;

public class SumUptoTen {
    public static void main(String[] args) {
        // int n =10;
        // int sum = 0;
        // for(int i=1 ; i<=n ; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        System.out.println(sum);
        sc.close();
    }
}
