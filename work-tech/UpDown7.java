import java.util.Scanner;

public class UpDown7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            if(a > 7){
                System.out.println("UP");
            }else if(a < 7){
                System.out.println("DOWN");
            }else{
                System.out.println("EQUAL");
            }
        }sc.close();
    }
}
