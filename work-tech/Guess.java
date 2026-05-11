import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.MAX_VALUE;

        for(int i = 0; i <= n; i++){
            System.out.print("Please guess my birth date = ");
            int d = sc.nextInt();

            if(d > 0 && d <= 31){
                if(d == 1){
                    System.out.println("Correct! you guessed it right ");
                    break;
                }else{
                    System.out.println("Incorrect guess ");
                }
            }else{
                System.out.println("Invalid date");
            }
        }sc.close();
    }
}
