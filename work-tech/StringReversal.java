import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name = ");
        String name = sc.nextLine();
        String reversedString = "";

        for(int i = name.length()-1; i >=0; i--){
            reversedString += name.charAt(i);
        }
        System.out.println(reversedString);
        sc.close();
    }
}
