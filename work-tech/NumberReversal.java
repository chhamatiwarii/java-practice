import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number = ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        System.out.println(s);


        int num2 = Integer.parseInt(s);
        System.out.println(num2);
        
        sc.close();
    }
}
