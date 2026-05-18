import java.util.Scanner;

public class NewPrimeNumber {
    public static void main(String[] args) {
        boolean primeNumber = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Number ");
        int num = sc.nextInt();

        for(int i = 2; i*i <= num; i++){
            if(num%i ==0){
                primeNumber = false;
                break;
            }
        }
        if(primeNumber){
            System.out.println("Your Number is Prime " + num );
        }else{
            System.out.println("Your Number is not Prime " + num);
        }
        sc.close();
    }
}
