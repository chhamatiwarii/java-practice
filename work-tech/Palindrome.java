import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word = ");
        String palindrome = sc.nextLine();

        String palindromeReverse = "";
        for(int i = palindrome.length()-1; i >= 0; i--){
            palindromeReverse += palindrome.charAt(i);

        }if(palindrome.equals(palindromeReverse)){     //.equals operator use hoga
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
