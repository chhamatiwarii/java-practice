import java.util.Scanner;

public class NotDivisible33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Count = ");
        int count = sc.nextInt();

        for(int i = 0; i<count; i++){
            System.out.print("Enter your digit = ");
            int digit = sc.nextInt();
            for(int j = 1; j<=digit; j++){
                if(j%3 != 0){
                    System.out.println(j);
                }
            }
        }
        sc.close();
    }
}
