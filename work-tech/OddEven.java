import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number = ");
        int n = sc.nextInt();
        boolean flag = false;

        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                //System.out.println("Even");
                flag = true; 
                
            }if(flag){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }
        }
        sc.close();

    }
}
