import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cousins Number = ");
        int a = sc.nextInt();
        System.out.print("Enter the candies Number = ");
        int b = sc.nextInt();

        if(b%a == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
        //Single line m kaise user input krana h

    }
}
