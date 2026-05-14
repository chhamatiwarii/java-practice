import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100 + 1);
        // System.out.println(randomNumber);
        Scanner sc = new Scanner(System.in);
        // int i = 0;
        boolean isWon = false;
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Your number = ");
            int c = sc.nextInt();

            if (randomNumber < c) {
                System.out.println("Too High");
            } else if (randomNumber > c) {
                System.out.println("Too less");
            } else if (randomNumber == c) {
                System.out.println("You Guessed it right");
                isWon = true;
                break;
            }
        }

        if(isWon == false){
            System.out.println("You lost" + " Correct Number is = " + randomNumber);
        }

        sc.close();
        System.out.println("Program Ended");
    }
}
