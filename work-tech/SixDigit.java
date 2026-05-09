import java.util.Scanner;

public class SixDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Number");
        int n = sc.nextInt();

        for(int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            if(a%6 == 0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        sc.close();

    }

}
